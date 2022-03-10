package com.example.stylus.services;

import java.util.List;

import com.example.stylus.dto.LoginRequest;
import com.example.stylus.dto.StylistCreateAccountDto;
import com.example.stylus.model.Stylist;

import org.springframework.web.multipart.MultipartFile;

public interface StylistService {
    boolean createStylist(Stylist stylist);

    List<Stylist> getAllStylist();
    int getStylistIdByUsername(String id);
    Stylist getStylistByUsername(String username);
    boolean updateStylist(Stylist stylist , int id);
    boolean deleteStylist(int id);
    Stylist checkLogin(LoginRequest request);
    Boolean updateImage(MultipartFile image, String username );
    Stylist getStylistById(int id);

    Stylist createStylistAccount(StylistCreateAccountDto dto);
}
