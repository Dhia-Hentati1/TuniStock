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

import com.example.demo.model.Produit;
import com.example.demo.service.ProduitService;

@Controller
public class ProduitController {
	@Autowired
	private ProduitService service;
	 
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Produit> listproduit = service.listAll();
        model.addAttribute("listproduit", listproduit);
        System.out.print("Get / ");
        return "index";
    }
 
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("produit", new Produit());
        return "new";
    }
 
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveProduit(@ModelAttribute("produit") Produit prod) {
        service.save(prod);
        return "redirect:/";
    }
 
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditProduitPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("new");
        Produit prod = service.get(id);
        mav.addObject("produit", prod);
        return mav;
        
    }
    @RequestMapping("/delete/{id}")
    public String deleteProduitPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/";
    }

}
