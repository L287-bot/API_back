package com.yupi.springbootinit.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 接口信息状态枚举
 */
public enum InterfaceInfoStatusEnum {


    OFFLINE("关闭",0),
    OLINE("上线",1);








    private  final  String text;
    private  final  int value;

    InterfaceInfoStatusEnum(String text,int value)
    {
        this.text=text;
        this.value=value;
    }

    public static List<Integer> getValues()
    {
        return Arrays.stream(values()).map(item->item.value).collect(Collectors.toList());
    }
    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }

}
