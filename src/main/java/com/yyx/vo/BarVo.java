package com.yyx.vo;

import lombok.Data;

import java.util.List;

@Data
public class BarVo {
    private List<String> names;
    private List<DataVo> values;
}
