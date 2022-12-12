package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Clothe;
import com.example.demo.service.ClotheService;




	
@Controller
public class ClotheController {
@Autowired
	  private ClotheService service;
	 
	  @GetMapping("/")
	  public String viewHomePage(Model model) {
	      List<Clothe> listclothe = service.listAll();
	      model.addAttribute("listclothe", listclothe);
	      System.out.print("Get / ");
	      return "index";
	  }
	 
	  @GetMapping("/new")
	  public String add(Model model) {
	      model.addAttribute("clothe", new Clothe());
	      return "new";
	  }
	 
	  @RequestMapping(value = "/save", method = RequestMethod.POST)
	  public String saveClothe(@ModelAttribute("clothe") Clothe clo) {
	      service.save(clo);
	      return "redirect:/";
	  }
	 
	  @RequestMapping("/edit/{id}")
	  public ModelAndView showEditClothePage(@PathVariable(name = "id") int id) {
	      ModelAndView mav = new ModelAndView("new");
	      Clothe clo = service.get(id);
	      mav.addObject("clothe", clo);
	      return mav;
	        
	  }
	  @RequestMapping("/delete/{id}")
	  public String deleteClothePage(@PathVariable(name = "id") int id) {
	      service.delete(id);
	      return "redirect:/";
	  }

}
