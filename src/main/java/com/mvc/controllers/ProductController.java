package com.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.mvc.dao.ProductDao;
import com.mvc.models.Product;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m) {
		List<Product> products = productDao.selectAllProduct();
		m.addAttribute("products",products);
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product Page");
		return "add_product_page";
	}
	
	@RequestMapping(path = "/add-process",method=RequestMethod.POST)
	public RedirectView addProcess(@ModelAttribute Product product,HttpServletRequest request) {
		System.out.println(product);
		this.productDao.insertProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/delete-product/{pid}")
	public RedirectView deleteProduct(@PathVariable("pid") int pid,HttpServletRequest request) {
		
		this.productDao.deleteProduct(pid);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/");
		return redirectView;
	}
	
	@RequestMapping("/update/{pid}")
	public String updateProduct(@PathVariable("pid") int pid,Model m) {
		Product product = this.productDao.selectSingleProduct(pid);
		m.addAttribute("title","Update Product Page");
		m.addAttribute("product",product);
		return "update_product_page";
	}
	
	//handle both add and update on same mapping /add-process.
	//if id not come in product it creates new product.
	//if id come in product it update existing product.
	//because we use saveOrUpdate method in ProductDao's insertProduct method.
}
