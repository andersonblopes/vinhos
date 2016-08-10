package com.spring.vinhos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.vinhos.model.Vinho;

public interface Vinhos extends JpaRepository<Vinho, Long> {

}
