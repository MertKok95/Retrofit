package com.mertkok.retrofit_version2.Models;

public class USD{
	private double percentChange30d;
	private double percentChange1h;
	private String lastUpdated;
	private double percentChange24h;
	private double marketCap;
	private double price;
	private double percentChange60d;
	private double volume24h;
	private double percentChange90d;
	private double percentChange7d;

	public void setPercentChange30d(double percentChange30d){
		this.percentChange30d = percentChange30d;
	}

	public double getPercentChange30d(){
		return percentChange30d;
	}

	public void setPercentChange1h(double percentChange1h){
		this.percentChange1h = percentChange1h;
	}

	public double getPercentChange1h(){
		return percentChange1h;
	}

	public void setLastUpdated(String lastUpdated){
		this.lastUpdated = lastUpdated;
	}

	public String getLastUpdated(){
		return lastUpdated;
	}

	public void setPercentChange24h(double percentChange24h){
		this.percentChange24h = percentChange24h;
	}

	public double getPercentChange24h(){
		return percentChange24h;
	}

	public void setMarketCap(double marketCap){
		this.marketCap = marketCap;
	}

	public double getMarketCap(){
		return marketCap;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public double getPrice(){
		return price;
	}

	public void setPercentChange60d(double percentChange60d){
		this.percentChange60d = percentChange60d;
	}

	public double getPercentChange60d(){
		return percentChange60d;
	}

	public void setVolume24h(double volume24h){
		this.volume24h = volume24h;
	}

	public double getVolume24h(){
		return volume24h;
	}

	public void setPercentChange90d(double percentChange90d){
		this.percentChange90d = percentChange90d;
	}

	public double getPercentChange90d(){
		return percentChange90d;
	}

	public void setPercentChange7d(double percentChange7d){
		this.percentChange7d = percentChange7d;
	}

	public double getPercentChange7d(){
		return percentChange7d;
	}

	@Override
 	public String toString(){
		return 
			"USD{" + 
			"percent_change_30d = '" + percentChange30d + '\'' + 
			",percent_change_1h = '" + percentChange1h + '\'' + 
			",last_updated = '" + lastUpdated + '\'' + 
			",percent_change_24h = '" + percentChange24h + '\'' + 
			",market_cap = '" + marketCap + '\'' + 
			",price = '" + price + '\'' + 
			",percent_change_60d = '" + percentChange60d + '\'' + 
			",volume_24h = '" + volume24h + '\'' + 
			",percent_change_90d = '" + percentChange90d + '\'' + 
			",percent_change_7d = '" + percentChange7d + '\'' + 
			"}";
		}
}
