package com.springboot.fund.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.fund.entity.Fund;
import com.springboot.fund.repository.FundRepository;

@Service
public class FundService {
	
	@Autowired
	FundRepository fundrepo;

	public Fund createFund(Fund fund)
	{
		Fund fund1= fundrepo.save(fund);
		return fund1;
	}

	public Fund getFundById(String fundId) {
		Fund fundinfo= fundrepo.getReferenceById(Integer.valueOf(fundId));
		return fundinfo;
	}
}
