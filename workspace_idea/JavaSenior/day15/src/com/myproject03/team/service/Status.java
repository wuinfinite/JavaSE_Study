package com.myproject03.team.service;

/**
 * 表示员工的状态
 *
 * @auter zipeng
 * @create &{YEAR}-05-02-14:27
 */
public class Status {
    private final String NAME;
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");

    public String getNAMA() {
        return NAME;
    }

    public static final Status VOCATION = new Status("VOCATION");

    private Status(String name) {
        this.NAME = name;
    }

    @Override
    public String toString() {
        return NAME;
    }
}
