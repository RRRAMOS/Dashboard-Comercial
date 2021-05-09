package com.rrramos.controlevendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rrramos.controlevendas.dto.SaleDTO;
import com.rrramos.controlevendas.entities.Sale;
import com.rrramos.controlevendas.repositories.SaleRepository;
import com.rrramos.controlevendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable){
		sellerRepository.findAll();
		Page<Sale> result= repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
