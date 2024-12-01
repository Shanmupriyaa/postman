package com.example.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myproject.entity.Details;

public interface DetailsRepository extends JpaRepository<Details,Integer>{

}
