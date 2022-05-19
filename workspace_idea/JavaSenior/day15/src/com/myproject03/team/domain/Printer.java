package com.myproject03.team.domain;

/**
 * @auter zipeng
 * @create &{YEAR}-05-02-14:15
 */
public class Printer implements Equipment {

    private String name;//机器型号
    private String type;//机器类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public Printer() {
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
