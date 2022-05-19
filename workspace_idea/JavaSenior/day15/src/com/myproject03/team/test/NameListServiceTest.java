package com.myproject03.team.test;

import com.myproject03.team.domain.Employee;
import com.myproject03.team.service.NameListService;
import org.junit.Test;

/**
 * @auter zipeng
 * @create &{YEAR}-05-03-14:59
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
}
