package com.module.parser.xml;

import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.jibx.runtime.IUnmarshallingContext;
import org.jibx.runtime.impl.BindingFactoryBase;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@Component
public class TypeConverter<T> {
    public Class targetClass;
    public static final String XML_FILE_FROM_PATH = "C://";
    public static final String XML_FILE_GENERATE_PATH = "D://";

    public TypeConverter<T> setTargetClass(Class targetClass){
        this.targetClass = targetClass;
        return this;
    }

    public T transferToObject(){
        T result = null;
        try {
            IBindingFactory bindFactory = BindingDirectory.getFactory(targetClass);
            IUnmarshallingContext uctx = bindFactory.createUnmarshallingContext();
            FileInputStream inputFile = new FileInputStream(XML_FILE_FROM_PATH);
            result = (T) uctx.unmarshalDocument(inputFile, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public void generateFromObject(T object){
        FileOutputStream outputFileStream = null;
        try{
            IBindingFactory bindFactory = BindingDirectory.getFactory(targetClass);
            IMarshallingContext mctx = bindFactory.createMarshallingContext();
            mctx.setIndent(2);
            outputFileStream = new FileOutputStream(XML_FILE_GENERATE_PATH);
            mctx.setOutput(outputFileStream, null);
            mctx.marshalDocument(object);

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
