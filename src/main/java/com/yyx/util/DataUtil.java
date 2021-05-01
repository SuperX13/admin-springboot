package com.yyx.util;

import java.util.HashMap;
import java.util.Map;

public class DataUtil {
    public static Map<String,String> createItemStyle(Integer sales){
        String color="";
        if (sales<=60){
            color="#96dee8";
        }
        if (sales>60&&sales<160){
            color="#c4ebad";
        }
        if (sales>=160&&sales<300){
            color="#6be6c1";
        }
        if (sales>300){
            color="#3fb1e3";
        }
        Map<String, String> map = new HashMap<>();
        map.put("color",color);
        return map;
    }
}
