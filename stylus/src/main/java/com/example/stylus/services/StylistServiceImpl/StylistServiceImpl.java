package com.example.stylus.services.StylistServiceImpl;

import java.util.List;

import com.example.stylus.dto.LoginRequest;
import com.example.stylus.dto.StylistCreateAccountDto;
import com.example.stylus.model.Stylist;
import com.example.stylus.repository.StylistRepository;
import com.example.stylus.services.StylistService;
import com.example.stylus.utils.BaseConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class StylistServiceImpl implements StylistService {

    private StylistRepository repository;

    @Autowired
    public StylistServiceImpl(StylistRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean createStylist(Stylist stylist) {
        try {
            this.repository.save(stylist);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public List<Stylist> getAllStylist() {
        return this.repository.findAllStylist();
    }

    @Override
    public Stylist getStylistByUsername(String username) {
        return this.repository.findByUsername(username);
    }

    @Override
    public boolean updateStylist(Stylist stylist, int id) {
        return false;
    }

    @Override
    public boolean deleteStylist(int id) {
        return false;
    }

    @Override
    public Stylist checkLogin(LoginRequest request) {
        Stylist result = this.repository.findByUsername(request.getUsername());
        if (result == null) {
            return null;
        }
        if (!result.getPassword().equals(request.getPassword())) {
            return null;
        }
        return result;
    }

    @Override
    public int getStylistIdByUsername(String username) {
        Stylist stylist = this.repository.findByUsername(username);
        return stylist.getStylistId();
    }

    @Override
    public Boolean updateImage(MultipartFile image, String username) {
        try {
            Stylist stylist = this.repository.findByUsername(username);
            BaseConverter converter = new BaseConverter();
            stylist.setImage(converter.convertToBase64(image));
            this.repository.save(stylist);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public Stylist getStylistById(int id) {
        return this.repository.findById(id).get();
    }

    @Override
    public Stylist createStylistAccount(StylistCreateAccountDto dto) {
        Stylist stylist = new Stylist();
        stylist.setName(dto.getName());
        stylist.setUsername(dto.getName());
        stylist.setPassword(dto.getPassword());
        try {
           
            return  this.repository.save(stylist);
        } catch (Exception e) {
            return null;
        }
    }

}
