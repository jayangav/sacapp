package jay.first.allsacapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jay.first.sacbackend.dao.Sports_DAO;
import jay.first.sacbackend.dao.productDAO;
import jay.first.sacbackend.dto.product;

@Controller

public class pagecontroller {
	
	
	@Autowired
	private productDAO productdao;
	
	@Autowired
	private Sports_DAO sportdao;
	
	@RequestMapping(value = {"/","/home","/index"})
	
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","home");
		
		mv.addObject("products", productdao.list());
		mv.addObject("sports", sportdao.list());
		
		mv.addObject("userClickHome","true");
		return mv;
		
	}
	
//	@RequestMapping(value ="/test")
//public ModelAndView test(@RequestParam("greeting")String greeting ) {
//		
//		ModelAndView mv = new ModelAndView("page");
//		mv.addObject("greeting",greeting);
//		return mv;
//		
//	}
	
@RequestMapping(value = {"/gallery"})
	
	public ModelAndView gallery() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Gallery");
		mv.addObject("products", productdao.list());
		mv.addObject("userClickgallery",true);
		return mv;
		
		
}	


@RequestMapping(value = {"/live_update"})

public ModelAndView live_update() {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","LIVE");
	mv.addObject("sports", sportdao.list());
	
	mv.addObject("userClickliveupdate",true);
	return mv;
	
	
}	


@RequestMapping(value = {"/videos"})

public ModelAndView videos() {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","VIDEO");
	mv.addObject("userClickvideos",true);
	return mv;
	
	
}


@RequestMapping(value = {"/content1"})

public ModelAndView content1() {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","Home");
	mv.addObject("userClickcontent1",true);
	return mv;

}

// method to load all the products

@RequestMapping(value = {"/all/products"})

public ModelAndView show_products() {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","All Products");
	mv.addObject("products", productdao.list());
	
	mv.addObject("userClickallproducts",true);
	return mv;
	
	
}	


@RequestMapping(value = {"/viewproducts"})

public ModelAndView viewproduct() {
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","All Products");
	mv.addObject("products", productdao.list());
	mv.addObject("userClickviewproducts",true);
	return mv;
	
	
}	

//
//@RequestMapping(value = "/{product_name}")
//
//public ModelAndView show_spec_product(@PathVariable("product_name") String product_name) {
//	
//	product product = null;
//	product = productdao.get(product_name);
//	
//	ModelAndView mv = new ModelAndView("page");
//	//mv.addObject("title",product.getProduct_name());
//	mv.addObject("products", productdao.list());
//	mv.addObject("product", product);
//	mv.addObject("userClickviewspecproducts",true);
//	return mv;
//	
//	
//}	



@RequestMapping(value = "/{id}")

public ModelAndView show_spec_product(@PathVariable("id") int id) {
	
	product product = null;
	product = productdao.getn(id);
	
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title",product.getProduct_name());
	mv.addObject("products", productdao.list());
	mv.addObject("product", product);
	mv.addObject("userClickviewspecproducts",true);
	return mv;
	
	
}	


}

