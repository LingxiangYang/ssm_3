package com.ylx.model;

import org.springframework.web.multipart.MultipartFile;

public class User_1 {
    private String userName;
    private MultipartFile image;

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MultipartFile getImage() {
        return image;
    }

    public String getUserName() {
        return userName;
    }
}
