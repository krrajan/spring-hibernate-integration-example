package com.spring.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.StockDAO;
import com.spring.entity.Stock;

@Service("stockBOImpl")
public class StockBOImpl implements StockBO {

	@Autowired
	private StockDAO dao;

	public void save(Stock stock) {
		dao.save(stock);
	}

	public void update(Stock stock) {
		dao.update(stock);
	}

	public void delete(Stock stock) {
		dao.delete(stock);
	}

	public Stock findByStockCode(Integer stockCode) {
		return dao.findByStockCode(stockCode);
	}

}
