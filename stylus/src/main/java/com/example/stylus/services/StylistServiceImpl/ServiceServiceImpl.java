package com.example.stylus.services.StylistServiceImpl;

import java.util.ArrayList;
import java.util.List;

import com.example.stylus.dto.ServiceDto;
import com.example.stylus.dto.SuggestServiceDto;
import com.example.stylus.model.MyService;
import com.example.stylus.repository.ServiceRepository;
import com.example.stylus.repository.StylistRepository;
import com.example.stylus.services.ServiceService;
import com.example.stylus.utils.BaseConverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceServiceImpl implements ServiceService {

    private ServiceRepository repository;
    private StylistRepository stylistRepository;

    @Autowired
    public ServiceServiceImpl(ServiceRepository repository, StylistRepository stylistRepository) {
        this.repository = repository;
        this.stylistRepository = stylistRepository;
    }

    @Override
    public boolean createService(ServiceDto serviceDto) {
        MyService myService = new MyService();
        binding(myService, serviceDto);
        try {
            this.repository.save(myService);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean updateService(ServiceDto serviceDto, int id) {
        MyService myService = this.getService(id);
        this.binding(myService, serviceDto);
        try {
            this.repository.save(myService);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteService(int id) {
        try {
            MyService myService = this.getService(id);
            this.repository.delete(myService);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public MyService getService(int id) {
        try {
            return this.repository.findById(id).get();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public List<MyService> getServices() {
        return this.repository.findAll();
    }

    private MyService binding(MyService myService, ServiceDto serviceDto) {
        BaseConverter converter = new BaseConverter();
        myService.setImage(converter.convertToBase64(serviceDto.getImage()));
        myService.setName(serviceDto.getName());
        myService.setPrice(serviceDto.getPrice());
        myService.setSlotConsume(serviceDto.getSlotConsume());
        myService.setStylistId(serviceDto.getStylistId());
        myService.setCategoryId(serviceDto.getCategoryId());

        return myService;
    }

    @Override
    public List<MyService> getServicesByStylistId(int stylistId) {
        return this.repository.findByStylistId(stylistId);
    }

    private List<SuggestServiceDto> bindingDtos(List<MyService> randList) {
        List<SuggestServiceDto> result = new ArrayList<>();
        for (MyService item : randList) {
            String stylistName = this.stylistRepository.findById(item.getStylistId()).get().getName();
            SuggestServiceDto dto = new SuggestServiceDto();
            dto.setId(item.getId());
            dto.setCategoryId(item.getCategoryId());
            dto.setFeedback(item.getFeedback());
            dto.setImage(item.getImage());
            dto.setLiked(item.getLiked());
            dto.setName(item.getName());
            dto.setPrice(item.getPrice());
            dto.setSlotConsume(item.getSlotConsume());
            dto.setStylistName(stylistName);
            dto.setVote(item.getVote());
            dto.setStylistId(item.getStylistId());
            result.add(dto);
        }
        return result;
    }

    @Override
    public List<SuggestServiceDto> getRandomService() {
        List<MyService> randList = this.repository.getRandomService();
        List<SuggestServiceDto> result = this.bindingDtos(randList);
        return result;
    }

    @Override
    public List<SuggestServiceDto> getMostLikedServices() {
        List<MyService> mostLikedList = this.repository.getMostLikedService();
        List<SuggestServiceDto> result = this.bindingDtos(mostLikedList);
        return result;
    }

    @Override
    public List<SuggestServiceDto> getServicesByCategory(int categoryId) {
        List<MyService> specifiedList = this.repository.findByCategoryId(categoryId);
        List<SuggestServiceDto> result = this.bindingDtos(specifiedList);
        return result;
    }

    @Override
    public List<SuggestServiceDto> getServiceByStylistId(int stylistId) {
        List<MyService> specifiedList = this.repository.findByStylistId(stylistId);
        List<SuggestServiceDto> result = this.bindingDtos(specifiedList);
        return result;
    }

}
