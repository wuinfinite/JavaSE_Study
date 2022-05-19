package com.myproject03.team.service;

/**
 * 自定义异常类
 * @auter zipeng
 * @create &{YEAR}-05-02-15:47
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387514229948L;

    public TeamException() {
    }

    public TeamException(String msg){
    super(msg);
    }
}
