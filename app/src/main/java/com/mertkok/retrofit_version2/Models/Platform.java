package com.mertkok.retrofit_version2.Models;

public class Platform{
	private String symbol;
	private String name;
	private String tokenAddress;
	private int id;
	private String slug;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setTokenAddress(String tokenAddress){
		this.tokenAddress = tokenAddress;
	}

	public String getTokenAddress(){
		return tokenAddress;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	@Override
 	public String toString(){
		return 
			"Platform{" + 
			"symbol = '" + symbol + '\'' + 
			",name = '" + name + '\'' + 
			",token_address = '" + tokenAddress + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			"}";
		}
}
