package com.dydong.springadmin.controller;

import com.dydong.springadmin.mapper.DepartmentMapper;
import com.dydong.springadmin.mapper.EmployeeMapper;
import com.dydong.springadmin.pojo.Department;
import com.dydong.springadmin.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/emps")
    public String list(Model model){
        List<Employee> employees = employeeMapper.getEmployees();
        model.addAttribute("emps",employees);
        return "emp/list";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        List<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/add";
    }

    @PostMapping("/emp")
    public String addEmp(Employee employee){
        System.out.println(employee);
        employeeMapper.save(employee);
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    public String toUpdateEmp(@PathVariable("id")Integer id,Model model){
        Employee employee = employeeMapper.getEmployeeById(id);
        model.addAttribute("emp",employee);
        List<Department> departments = departmentMapper.getDepartments();
        model.addAttribute("departments",departments);
        return "/emp/update";
    }

    @PostMapping("/updateEmp")
    public String updateEmp(Employee employee){
        System.out.println(employee);
        employeeMapper.edit(employee);
        return "redirect:/emps";
    }

    @GetMapping("/delemp/{id}")
    public String deleteEmp(@PathVariable("id")Integer id){
        employeeMapper.delete(id);
        return "redirect:/emps";
    }
}
