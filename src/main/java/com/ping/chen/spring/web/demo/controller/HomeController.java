package com.ping.chen.spring.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import java.io.File;
import java.io.IOException;

/**
 * @Author chenping
 * @Description home
 * @Date 2019/4/12
 **/
@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping("/index")
    public String index(Model model){
        System.out.println("test.....");
        model.addAttribute("message", "hello world");
        return "/home/index";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public void upload(MultipartRequest request) throws IOException {
        MultipartFile file = request.getFile("testFile");
        System.out.println(file.getBytes().length);
        System.out.println(file.getName());
    }
}
