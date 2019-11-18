package com.xb.controller;

import com.xb.model.Employees;
import com.xb.model.Users;
import com.xb.service.EmployeesService;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    public void test(){
    }

    //spring自动注入
    @Autowired
    private UserService userService;

    //登录验证
    @RequestMapping("login")
    public String login(Users u, ModelMap map,HttpServletRequest req){

        Users login = userService.login(u);
        if (login!=null){

            req.getSession().setAttribute("user",login);

            return "redirect:/empList.do";
        }

        else{

            map.addAttribute("msg","用户名或密码错误");

            return "login";
        }
    }

    @Autowired
    private EmployeesService employeesService;


    //员工集合
    @RequestMapping("empList")
    public String empList(ModelMap map){

        List<Employees> employees = employeesService.empList();
        map.addAttribute("empList",employees);


        return "index";
    }


    @RequestMapping("addORupdata")
    public String addORupdata(Integer is,ModelMap map,Integer empId){
        String msg="";
        if (is==0){
            msg="添加员工";
        }else{
            msg="修改员工";
            Employees empById = employeesService.getEmpById(empId);
            map.addAttribute("emp",empById);
        }
        map.addAttribute("msg",msg);
        return "addORupdata";
    }

    //添加员工
    @RequestMapping("addEmp")
    public String addEmp(Employees employees){
        System.out.println(employees);
        Integer integer = employeesService.addEmp(employees);
        return "redirect:/empList.do";
    }

    //修改员工
    @RequestMapping("updateEmp")
    public String updateEmp(Employees employees){
        System.out.println(employees);
        Integer integer = employeesService.updateEmp(employees);
        return "redirect:/empList.do";
    }

    //删除员工
    @RequestMapping("deleteEmp")
    public String deleteEmp(Integer empId){

        employeesService.deleteEmp(empId);

        return "redirect:/empList.do";
    }


}
