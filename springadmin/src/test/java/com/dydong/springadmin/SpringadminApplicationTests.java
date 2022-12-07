package com.dydong.springadmin;

import com.dydong.springadmin.mapper.EmployeeMapper;
import com.dydong.springadmin.pojo.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class SpringadminApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        Employee employee = new Employee();
        employee.setId(6);
        employee.setLastName("FF");
        employee.setEmail("24735@qq.com");
        employee.setGender(1);
        employee.setDid(103);
        employeeMapper.save(employee);
    }

}
