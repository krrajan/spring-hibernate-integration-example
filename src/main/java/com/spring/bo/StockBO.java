package com.spring.bo;

import com.spring.entity.Stock;

public interface StockBO {

	void save(Stock stock);
	void update(Stock stock);
	void delete(Stock stock);
	Stock findByStockCode(Integer stockCode);
}
