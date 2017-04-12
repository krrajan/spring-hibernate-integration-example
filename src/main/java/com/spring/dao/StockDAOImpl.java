package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.entity.Stock;

@Repository("stockDAOImpl")
public class StockDAOImpl extends AbstractCustomHBDaoSupport implements StockDAO{

	
	
	public StockDAOImpl() {
	}

	public void save(Stock stock) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(stock);
	}

	public void update(Stock stock) {
		getHibernateTemplate().update(stock);
	}

	public void delete(Stock stock) {
		getHibernateTemplate().delete(stock);
	}

	public Stock findByStockCode(Integer stockCode) {
		List list=getHibernateTemplate().find("from Stock where id=?", stockCode);
		return (Stock)list.get(0);
	}

}
