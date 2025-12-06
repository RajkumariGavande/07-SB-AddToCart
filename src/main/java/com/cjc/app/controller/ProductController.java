package com.cjc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.app.constants.Credentials;
import com.cjc.app.model.Product;
import com.cjc.app.service.ProductService;
import com.cjc.app.service.ProductServiceImpl;

@Controller
public class ProductController {	
	
	public String OddEven(int num) {
		return (num%2==0)?"Even":"Odd";
	}
	int x;
	
	
	
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = "/")
	public String handleFirstRequest() {
		return "index";
	}

	@RequestMapping(value = "/log")
	public String handleLogRequest() {
		return "login";
	}

	@RequestMapping(value = "/login")
	public String handleLoginRequest(@RequestParam String username, @RequestParam String password,Model model) {
		System.out.println("USERNAME:" + username);
		System.out.println("PASSWORD:" + password);
		if(username.equals(Credentials.USERNAME)&& password.equals(Credentials.PASSWORD)) {
			List<Product> prodList = productService.getAllProduct();
			model.addAttribute("data",prodList);
			return "success";
		}
		return "index";
	}

	@RequestMapping(value = "/addpro")
	public String handleRegRequest() {
		return "addtocart";
	}

	@RequestMapping(value = "/addtocart")

	public String handleRegisterRequest(@ModelAttribute Product product) {

		System.out.println("In Controller Layer:" + product);

		productService.saveProduct(product);
		return "index";
	}
	@RequestMapping(value = "/delete")
	public String handleDeleteRequest(@RequestParam int pid,Model  model) {
		System.out.println("In Controller Layer:"+pid);
		List<Product> prodList = productService.deleteProduct(pid);
		model.addAttribute("data",prodList);
		return "success";
	}
	
	
		
	
	

}
