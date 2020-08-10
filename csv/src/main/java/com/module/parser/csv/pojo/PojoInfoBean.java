package com.module.parser.csv.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PojoInfoBean {
    private String ziDuanMing;    //字段名
    private String ziDuanLeiXing; //字段类型
    private String shiFouWeiKong; //是否为空
    private String beiZhuShuoMing;//备注说明
}
