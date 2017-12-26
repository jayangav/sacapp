package jay.first.sacbackend.dao;

import java.util.List;

import jay.first.sacbackend.dto.product;

public interface productDAO {
	
	
	//
	boolean add(product product);
	boolean update(product product);
	boolean delete(product product);
	
	List<product> list();

	product get(String product_name);

	product getn(int id);

}
