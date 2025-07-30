package com.springboot.fund.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.fund.entity.Fund;
import com.springboot.fund.service.FundService;

@RestController
@RequestMapping("/fund")
public class FundController {
	
	@Autowired
	FundService fundser;
	
	@PostMapping("/createFund")
	public ResponseEntity<?> createFund(@RequestBody Fund fund)
	{
		Fund fund1= fundser.createFund(fund);
		return new ResponseEntity<>(fund, HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getFundbyId/{fundId}")
	public ResponseEntity<?> getFundName(@PathVariable String fundId)
	{
		Fund fund1= fundser.getFundById(fundId);
		return new ResponseEntity<>(fund1, HttpStatus.OK);
	}
	

}
