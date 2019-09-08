package com.ylx.controller;

import com.ylx.model.User_1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("FileUploadController_1")
public class FileUploadController_1 {

    @RequestMapping("registerForm_1")
    public String registerForm_1(){
        return "registerForm_1";
    }

    @RequestMapping("register_1")
    public String register(
            HttpServletRequest request,
            @ModelAttribute User_1 user_1,
            Model model)throws Exception{
        System.out.println(user_1.getUserName());
        if(!user_1.getImage().isEmpty()){
            //上传文件路径
            String path = request.getServletContext().getRealPath("/images/");
            System.out.println("path:"+path);
            //上传文件名
            String fileName = user_1.getImage().getOriginalFilename();
            System.out.println("fileName:"+fileName);
            File filepath = new File(path,fileName);
            //判断路径是否存在，如果不存在就创建一个
            if(!filepath.getParentFile().exists()){
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件中
            user_1.getImage().transferTo(new File(path+File.separator+fileName));
            model.addAttribute("user_1",user_1);
            return "userInfo_1";
        }else{
            return "error";
        }
    }
}
