package com.mertkok.retrofit_version2.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataItem{

	private String symbol;
	private int circulatingSupply;
	private String lastUpdated;
	private int totalSupply;
	private int cmcRank;
	private Object platform;
	private List<String> tags;
	private String dateAdded;
	private Quote quote;
	private int numMarketPairs;
	private String name;
	private int maxSupply;
	private int id;
	private String slug;

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setCirculatingSupply(int circulatingSupply){
		this.circulatingSupply = circulatingSupply;
	}

	public int getCirculatingSupply(){
		return circulatingSupply;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setTotalSupply(int totalSupply){
		this.totalSupply = totalSupply;
	}

	public int getTotalSupply(){
		return totalSupply;
	}

	public void setCmcRank(int cmcRank){
		this.cmcRank = cmcRank;
	}

	public int getCmcRank(){
		return cmcRank;
	}

	public void setPlatform(Object platform){
		this.platform = platform;
	}

	public Object getPlatform(){
		return platform;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setDateAdded(String dateAdded){
		this.dateAdded = dateAdded;
	}

	public String getDateAdded(){
		return dateAdded;
	}

	public void setQuote(Quote quote){
		this.quote = quote;
	}

	public Quote getQuote(){
		return quote;
	}

	public void setNumMarketPairs(int numMarketPairs){
		this.numMarketPairs = numMarketPairs;
	}

	public int getNumMarketPairs(){
		return numMarketPairs;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setMaxSupply(int maxSupply){
		this.maxSupply = maxSupply;
	}

	public int getMaxSupply(){
		return maxSupply;
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
			"DataItem{" + 
			"symbol = '" + symbol + '\'' + 
			",circulating_supply = '" + circulatingSupply + '\'' + 
			",last_updated = '" + lastUpdated + '\'' + 
			",total_supply = '" + totalSupply + '\'' + 
			",cmc_rank = '" + cmcRank + '\'' + 
			",platform = '" + platform + '\'' + 
			",tags = '" + tags + '\'' + 
			",date_added = '" + dateAdded + '\'' + 
			",quote = '" + quote + '\'' + 
			",num_market_pairs = '" + numMarketPairs + '\'' + 
			",name = '" + name + '\'' + 
			",max_supply = '" + maxSupply + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			"}";
		}
}