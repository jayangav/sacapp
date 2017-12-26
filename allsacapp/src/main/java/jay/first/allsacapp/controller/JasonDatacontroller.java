package jay.first.allsacapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jay.first.sacbackend.dao.productDAO;
import jay.first.sacbackend.dto.product;

@Controller
@RequestMapping("/json/data")
public class JasonDatacontroller {
	
	@Autowired
	private productDAO productdao;
	
	@RequestMapping("/all/products")
	@ResponseBody
	public List<product> getAllproducts(){
		
		return productdao.list();
		
	}

}
