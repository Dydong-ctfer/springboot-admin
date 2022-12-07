package com.dydong.springadmin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//员工表
@Data
@NoArgsConstructor
public class Employee {
    private int id;
    private String lastName;
    private String email;
    private int gender;
    private int did;
    private Department department;

}
