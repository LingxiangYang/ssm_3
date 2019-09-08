package com.ylx.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
@RequestMapping("/FileUploadController_1")
public class FileDownloadController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(
            HttpServletRequest request,
            @RequestParam("fileName") String fileName,
            Model model)throws Exception{
        String path = request.getServletContext().getRealPath("/images/");
        System.out.println("path2:"+path);
        System.out.println("filename:"+fileName);
        File file = new File(path+File.separator+fileName);
        System.out.println(file.toPath());
        System.out.println(file);
        HttpHeaders headers = new HttpHeaders();
        //下载显示的中文名，解决中文名乱码问题
        String downloadFileName = new String(fileName.getBytes("utf-8"),"iso-8859-1");
        System.out.println("downloadFileName:"+downloadFileName);
        //通知浏览器以attachment(下载方式)打开图片
        headers.setContentDispositionFormData("attachment",downloadFileName);
        //application/octet-stream:二进制流数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //201 HttpStatus.CREATED
        System.out.println("end");
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.CREATED);
    }
}
