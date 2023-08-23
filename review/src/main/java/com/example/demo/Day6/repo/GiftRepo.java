package com.example.demo.Day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Day6.model.GiftModel;


public interface GiftRepo extends JpaRepository<GiftModel, Integer>{

}