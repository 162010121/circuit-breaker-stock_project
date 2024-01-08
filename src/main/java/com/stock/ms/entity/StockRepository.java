package com.stock.ms.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<WareHouse, Long> {

	List<WareHouse> findByItem(String item);
}
