package com.myhb.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bo.StockBO;
import com.spring.bo.StockBOImpl;
import com.spring.entity.Stock;

public class SpringHibernateTest {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"spring/spring-config.xml");

		StockBO stockBo = (StockBOImpl) appContext.getBean("stockBOImpl" );

		System.out.println(stockBo);

		/** insert **/
		
		  Stock stock = new Stock(222, "Pen"); stockBo.save(stock);
		 /** select **/
		
		 Stock stock2 = stockBo.findByStockCode(5);
		 System.out.println(stock2);
		 /** update **/
		
		  stock2.setStockName("HAIO-1"); 
		  stockBo.update(stock2);
		  
		 /** delete **/
		
		 stockBo.delete(stock2);
		 
		System.out.println("Done");
	}
}
