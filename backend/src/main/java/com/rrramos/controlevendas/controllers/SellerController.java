package com.rrramos.controlevendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rrramos.controlevendas.dto.SellerDTO;
import com.rrramos.controlevendas.service.SellerService;

@RestController
@RequestMapping(value= "/sellers")


public class SellerController {

	@Autowired
	public SellerService service;
	
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
