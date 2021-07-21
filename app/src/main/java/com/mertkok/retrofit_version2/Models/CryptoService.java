package com.mertkok.retrofit_version2.Models;

import java.util.List;

public class CryptoService {

	private List<DataItem> data;

	private Status status;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setStatus(Status status){
		this.status = status;
	}

	public Status getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"CryptoService{" +
			"data = '" + data + '\'' +
			",status = '" + status + '\'' +
			"}";
		}
}