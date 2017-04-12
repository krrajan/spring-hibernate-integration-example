package com.spring.dao;

import com.spring.entity.Stock;

public interface StockDAO {

	void save(Stock stock);

	void update(Stock stock);

	void delete(Stock stock);

	Stock findByStockCode(Integer stockCode);

}
