package com.alpha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //代表自动接管到spring
public class Controller2 {
    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/t1")

    public String say0(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello");
        //web-inf/jsp/hello.jsp
        return "test";
    }
    @RequestMapping("/t2")

    public String say1(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","SpringMVC");
        //web-inf/jsp/hello.jsp
        return "test";
    }



}
