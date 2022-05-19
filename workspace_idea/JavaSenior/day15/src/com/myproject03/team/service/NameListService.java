package com.myproject03.team.service;

import com.myproject03.team.domain.PC;
import com.myproject03.team.domain.*;

import static com.myproject03.team.service.Data.*;

/**
 * 将Date中的数据封装到Empolyee[]数组中，同时提供相关操作Empolyee[]的方法
 *
 * @auter zipeng
 * @create &{YEAR}-05-02-14:48
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            //获取员工类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取employee的四个基本类型
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    /**
     * 获取指定index员工的设备
     *
     * @param index
     * @return
     */
    private Equipment createEquipment(int index) {
        int key = Integer.parseInt(EQIPMENTS[index][0]);
        String modelOrName = EQIPMENTS[index][1];
        switch (key) {
            case PC://21
                String display=EQIPMENTS[index][2];
                return new PC(modelOrName, display);
            case NOTEBOOK://22
                double price = Double.parseDouble(EQIPMENTS[index][2]);
                return new NoteBook(modelOrName, price);
            case PRINTER://23
                String type = EQIPMENTS[index][2];
                return new Printer(modelOrName, type);
        }
        return null;
    }

    /**
     * 获取当前所有员工
     * @return
     */
    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     *获取指定id的员工
      * @param id
     * @return
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定员工");
    }
}




