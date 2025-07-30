package com.springboot.fund.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Fund {
	
	public Fund()
	{
		
	}
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int fundId;
	private String fundName;
	private String description;
	private String Assettype;
	private String AssetTypeSubCategory;
	private double expenseRatio;
	private double nav;
	public Fund(int fundId, String fundName, String description, String assettype, String assetTypeSubCategory,
			double expenseRatio, double nav) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
		this.description = description;
		Assettype = assettype;
		AssetTypeSubCategory = assetTypeSubCategory;
		this.expenseRatio = expenseRatio;
		this.nav = nav;
	}
	@Override
	public String toString() {
		return "Fund [fundId=" + fundId + ", fundName=" + fundName + ", description=" + description + ", Assettype="
				+ Assettype + ", AssetTypeSubCategory=" + AssetTypeSubCategory + ", expenseRatio=" + expenseRatio
				+ ", nav=" + nav + "]";
	}
	public int getFundId() {
		return fundId;
	}
	public void setFundId(int fundId) {
		this.fundId = fundId;
	}
	public String getFundName() {
		return fundName;
	}
	public void setFundName(String fundName) {
		this.fundName = fundName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAssettype() {
		return Assettype;
	}
	public void setAssettype(String assettype) {
		Assettype = assettype;
	}
	public String getAssetTypeSubCategory() {
		return AssetTypeSubCategory;
	}
	public void setAssetTypeSubCategory(String assetTypeSubCategory) {
		AssetTypeSubCategory = assetTypeSubCategory;
	}
	public double getExpenseRatio() {
		return expenseRatio;
	}
	public void setExpenseRatio(double expenseRatio) {
		this.expenseRatio = expenseRatio;
	}
	public double getNav() {
		return nav;
	}
	public void setNav(double nav) {
		this.nav = nav;
	}
	

}
