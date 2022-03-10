package com.example.stylus.utils;

import java.util.Base64;

import org.springframework.web.multipart.MultipartFile;

public class BaseConverter {
    public String convertToBase64(MultipartFile image){

        String result = "";
        try {
            result = Base64.getEncoder().encodeToString(image.getBytes());
        } catch (Exception e) {
            System.out.println("can't not convert!!!");
        }

        return result;
    }
}
