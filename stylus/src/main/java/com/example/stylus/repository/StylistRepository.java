package com.example.stylus.repository;

import java.util.List;

import com.example.stylus.model.Stylist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StylistRepository extends JpaRepository<Stylist , Integer> {
    Stylist findByUsername(String username);

    @Query(value = "SELECT * FROM stylist LIMIT 10", nativeQuery = true)
    List<Stylist> findAllStylist();
}
