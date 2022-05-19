package com.myproject03.team.domain;

/**
 * 架构师
 * @auter zipeng
 * @create &{YEAR}-05-02-14:44
 */
public class Architect extends Designer {
    private int stock;//股票

    public Architect() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public String getDetailsForTeam() {
        return getTeamBaseDetails() + "\t架构师" + "\t" +  getBonus() + "\t" + stock ;
    }

    @Override
    public String toString() {
        return  getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() + "\t\t" + stock + "\t" + getEquipment().getDescription();
    }
}

