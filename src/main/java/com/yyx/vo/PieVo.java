package com.yyx.vo;

import lombok.Data;

import java.util.Map;
@Data
public class PieVo {
    private Integer value;
    private Map<String,String> itemStyle;
    private String name;
}
