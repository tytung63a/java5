package io.spring.controller;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.spring.model.Cate;
import io.spring.model.Product;

@Controller
public class CateController {
	@GetMapping("/cate/create")
	public String viewCreate(Model model) {
		model.addAttribute("cateForm", new Cate());      
		return "admin/cates/create";
		
		
		
	}

	@PostMapping("/cate/create")
	public String saveCate(@ModelAttribute("cateForm") Cate cate, Model model) {
		model.addAttribute("message", "Save product is successfuly");
		return "admin/cates/list";

	}
}
