package com.module.parser.entity;

import com.module.parser.reflect.FieldReflect2;
import lombok.Data;

import java.util.List;

@Data
public class VueFieldEntity {
    private String className;
    private List<FieldReflect2.Format2> formats;
}
