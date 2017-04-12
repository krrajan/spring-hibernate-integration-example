package com.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Stock")
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	@Column(name="STOCK_NAME")
	private String stockName;

	
	
	
	public Stock(Integer id, String stockName) {
		this.id = id;
		this.stockName = stockName;
	}

	public Stock() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", stockName=" + stockName + "]";
	}
}
