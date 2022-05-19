package com.zipeng.exer1;

import java.util.List;

/**
 * @auter zipeng
 * @create &{YEAR}-05-06-16:26
 */
public class DAOTest {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("1001",new User(01,18,"啊明"));
        dao.save("1002",new User(02,20,"啊飞"));
        dao.save("1003",new User(03,22,"啊Q"));

        dao.delete("1002");
        dao.update("1003",new User(04,21,"啊M"));

        List<User> list = dao.list();
//        System.out.println(list);
        list.forEach(System.out::println);
    }
}
