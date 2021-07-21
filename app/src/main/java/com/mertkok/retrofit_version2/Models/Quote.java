package com.mertkok.retrofit_version2.Models;

import com.google.gson.annotations.SerializedName;

public class Quote{

	@SerializedName("USD")
	private USD uSD;

	public void setUSD(USD uSD){
		this.uSD = uSD;
	}

	public USD getUSD(){
		return uSD;
	}

	@Override
 	public String toString(){
		return 
			"Quote{" + 
			"uSD = '" + uSD + '\'' + 
			"}";
		}
}
