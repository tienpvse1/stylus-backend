package com.example.stylus.repository;

import java.util.List;

import com.example.stylus.model.MyService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ServiceRepository extends JpaRepository<MyService, Integer> {
    List<MyService> findByStylistId(int stylistId);

    @Query(value = "SELECT * FROM my_service ORDER BY RAND() LIMIT 10", nativeQuery = true)
    List<MyService> getRandomService();

    @Query(value = "SELECT * FROM my_service ORDER BY liked DESC LIMIT 10", nativeQuery = true)
    List<MyService> getMostLikedService();

    List<MyService> findByCategoryId(int categoryId);

}
