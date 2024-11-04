package com.pidan.maker.model;

import lombok.Data;

/**
 * @author 赵永乐
 */
@Data
public class DataModel {

    private String author= "皮蛋";

    private String outputText= "sum = ";

    /**
     * 是否循环
     */
    private boolean loop;
}
