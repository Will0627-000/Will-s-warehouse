package com.project.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class StudentAction {
    @RequestMapping("te=7st")
    public String test(){
        System.out.println("执行test方法");
        return "/index.jsp";
    }
}
