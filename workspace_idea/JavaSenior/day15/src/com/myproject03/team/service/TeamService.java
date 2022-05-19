package com.myproject03.team.service;

import com.myproject03.team.domain.Architect;
import com.myproject03.team.domain.Designer;
import com.myproject03.team.domain.Employee;
import com.myproject03.team.domain.Programmer;

/**
 * 关于开发团队成员的管理：添加、删除等。
 * @auter zipeng
 * @create &{YEAR}-05-02-16:59
 */
public class TeamService {
    private static int counter = 1;//给memberId赋值
    private final int MAX_MEMBER = 5;//限制开发团队的人数
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存开发团队成员
    private int total;//记录开发团队中实际人数

    public TeamService() {
    }

    /**
     * 获取开法团队中的所有成员
     * @return
     */
    public Programmer[] getTeam(){
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 添加团队成员，要求：至多一名构架师；至多两名设计师；至多三名程序员；
     * @param e
     */
    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开人员，无法添加");
        }

        if (isExist(e)) {
            throw new TeamException("该成员已在本开发团队中");
        }

        Programmer p = (Programmer)e;

        if ("BUSY".equalsIgnoreCase(p.getStatus().getNAMA())) {//if (p.getStatus().getNAMA().equals("BUSY"))此写法有风险
            throw new TeamException("该成员已是某团队的成员");
        }else if ("VOCATION".equalsIgnoreCase(p.getStatus().getNAMA())){
            throw new TeamException("该成员正在休假，无法添加");
        }

        //获取team已有的成员中架构师、设计师、程序员的人数
        int numOfArc=0,numOfDes=0,numOfPro=0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArc++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }

        if (p instanceof Architect) {
            if (numOfArc >= 1) {
                throw new TeamException("团队中至多一名构架师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多两名名设计师");
            }
        }else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多三名名程序员");
            }
        }

        //将p(e)添加到现有的team团队中
        team[total++] = p;
        //p的属性赋值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);



        
    }

    /**
     * 判断添加员工是否在团队里面
     * @param e
     * @return
     */
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            return team[i].getId() == e.getId();
        }
        return false;
    }

    /**
     * 删除团队成员
     * @param memberId
     */
    public void removeMember(int memberId ) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        if (i == total) {
            throw new TeamException("找不到指定member的员工，添加失败");
        }

        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        team[--total] = null;


    }
}
