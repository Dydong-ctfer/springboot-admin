package com.dydong.springadmin.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//部门表
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    public Integer id;
    public String departmentName;
}
