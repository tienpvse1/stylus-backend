package com.example.stylus.services;

import java.util.List;

import com.example.stylus.dto.ServiceDto;
import com.example.stylus.dto.SuggestServiceDto;
import com.example.stylus.model.MyService;

public interface ServiceService {
    boolean createService(ServiceDto service);

    boolean updateService(ServiceDto service, int id);

    boolean deleteService(int id);

    MyService getService(int id);

    List<MyService> getServices();

    List<MyService> getServicesByStylistId(int stylistId);

    List<SuggestServiceDto> getRandomService();

    List<SuggestServiceDto> getMostLikedServices();

    List<SuggestServiceDto> getServicesByCategory(int categoryId);

    List<SuggestServiceDto> getServiceByStylistId(int stylistId);
}
