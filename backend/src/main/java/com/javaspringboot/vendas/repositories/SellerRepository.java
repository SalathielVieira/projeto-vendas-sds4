package com.javaspringboot.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaspringboot.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
