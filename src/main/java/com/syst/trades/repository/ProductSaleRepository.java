package com.syst.trades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syst.trades.model.ProductSale;

public interface ProductSaleRepository extends JpaRepository<ProductSale, Long> {

}
