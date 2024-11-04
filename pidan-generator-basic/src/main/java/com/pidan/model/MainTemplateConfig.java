package com.pidan.model;

import lombok.Data;

@Data
public class MainTemplateConfig {

    private String author= "皮蛋";

    private String outputText= "sum = ";

    /**
     * 是否循环
     */
    private boolean loop;
}
