package com.myproject03.team.domain;

import com.myproject03.team.service.Status;

/**
 *程序员
 * @auter zipeng
 * @create &{YEAR}-05-02-14:23
 */
public class Programmer extends Employee {
    private int memberId;//开发团中的id
    private Status status = Status.FREE;//状态
    private Equipment equipment;//该成员领用的设备

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Programmer(int id, String name, int age, double salary,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t\t" + equipment.getDescription();
    }

    public String getTeamBaseDetails() {
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() ;
    }

    public String getDetailsForTeam() {
        return  getTeamBaseDetails() + "\t程序员" ;
    }

    public Programmer() {

    }
}
