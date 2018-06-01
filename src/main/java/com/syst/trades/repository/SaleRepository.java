package com.syst.trades.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syst.trades.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
