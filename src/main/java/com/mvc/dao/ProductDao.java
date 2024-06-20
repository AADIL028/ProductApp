package com.mvc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.mvc.models.Product;

import javax.transaction.Transactional;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void insertProduct(Product product) {
		//if exist then update otherwise create...
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	public List<Product> selectAllProduct() {
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	public Product selectSingleProduct(int pid) {
		return this.hibernateTemplate.get(Product.class, pid);
	}
	
	@Transactional
	public void deleteProduct(int pid) {
		Product product = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(product);
	}
	
	
}
