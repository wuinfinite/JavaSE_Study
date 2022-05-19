package com.myproject03.team.domain;

/**
 * @auter zipeng
 * @create &{YEAR}-05-02-14:06
 */
public class PC implements Equipment{

    private String model;//机器的型号
    private String display;//显示器名称

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public PC() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
