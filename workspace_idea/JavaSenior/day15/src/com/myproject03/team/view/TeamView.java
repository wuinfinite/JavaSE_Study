package com.myproject03.team.view;

import com.myproject03.team.domain.Employee;
import com.myproject03.team.domain.Programmer;
import com.myproject03.team.service.NameListService;
import com.myproject03.team.service.TeamException;
import com.myproject03.team.service.TeamService;

/**
 * @auter zipeng
 * @create &{YEAR}-05-03-10:39
 */
public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    public void enterMainMenu() {
        boolean loopFlag = true;
        char menu = 0;
        while (loopFlag) {
            if (menu != '1') {
                listAllEmployees();
            }
            System.out.println("1- 团队成员 2- 添加团队成员 3-删除团队成员 4-退出  请选择( 1 - 4 )：");
            menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();

                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("确认是否退出(Y/N)：");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        loopFlag = false;
                    }
                    break;
            }
        }
    }

    /**
     * 显示所有员工信息
      */
    public void listAllEmployees() {
        System.out.println("显示公司所有的员工信息");
        System.out.println("--------------------开发团队调度软件-------------------\n");

        Employee[] employees = listSvc.getAllEmployees();
        if ( employees.length == 0) {//employees == null在这里可有可无
            System.out.println("公司没有任何员工信息！");
        } else {
            System.out.println("ID\t 姓名  年龄\t工资\t职位\t状态\t奖金\t \t股票\t领用设备");

            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }
        System.out.println("-----------------------------------------------------\n");
    }

    public void getTeam() {
        //System.out.println("查看开发团队情况");
        System.out.println("---------------------团队成员列表----------------------\n");

        Programmer[] team = teamSvc.getTeam();
        if (team.length == 0) {
            System.out.println("开发团队目前没有成员");
        } else {
            System.out.println("TID/ID 姓名 年龄 工资 \t职位\t奖金\t股票\t领用设备\n");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
        }
        System.out.println("-----------------------------------------------------\n");
    }

    public void addMember() {
        //System.out.println("添加团队成员");
        System.out.println("---------------------添加成员-------------------------\n");
        System.out.println("请输入你要添加员工的ID：");
        int id = TSUtility.readInt();

        try {
            Employee emp = listSvc.getEmployee(id);
            teamSvc.addMember(emp);
            System.out.println("添加成功");

        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        TSUtility.readReturn();//回车继续
    }

    public void deleteMember() {
        //System.out.println("删除团队人员");
        System.out.println("---------------------删除成员-------------------------\n");
        System.out.println("请输入你要删除员工的TID：");
        int memberId = TSUtility.readInt();

        System.out.print("确认是否删除Y/N：");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N') {
            return;
        }

        try {
            teamSvc.removeMember(memberId);
            System.out.println("删除成功");
        } catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }

        TSUtility.readReturn();//回车继续
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }
}
