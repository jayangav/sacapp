package jay.first.sacbackend.dao;

import java.util.List;

import jay.first.sacbackend.dto.product;

public interface productDAO {
	
	List<product> list();

	 product get(String product_name);
	
	 
	product getn(int id);

}
