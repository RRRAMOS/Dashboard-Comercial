package com.rrramos.controlevendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rrramos.controlevendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
