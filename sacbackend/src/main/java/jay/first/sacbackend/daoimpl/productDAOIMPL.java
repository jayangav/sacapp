package jay.first.sacbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jay.first.sacbackend.dao.productDAO;
import jay.first.sacbackend.dto.product;

@Repository("prdao")
public class productDAOIMPL implements productDAO {

	private static List<product> products = new ArrayList<>();

	static {

		product product = new product();
		product.setId(1);
		product.setProduct_name("badge");
		product.setDescription("school badge");
		product.setImage_url("p1.png");
		product.setProduct_price(200.00);

		products.add(product);

		product = new product();
		product.setId(2);
		product.setProduct_name("car badge");
		product.setDescription("car badge");
		product.setImage_url("p1.png");
		product.setProduct_price(200.00);

		products.add(product);

		product = new product();
		product.setId(3);
		product.setProduct_name("uniform");
		product.setDescription("school badge");
		product.setImage_url("p1.png");
		product.setProduct_price(200.00);

		products.add(product);

		product = new product();
		product.setId(4);
		product.setProduct_name("cap");
		product.setDescription("school badge");
		product.setImage_url("p1.png");
		product.setProduct_price(200.00);

		products.add(product);

	}

	@Override
	public List<product> list() {
		// TODO Auto-generated method stub
		return products;
	}

	@Override
	public product get(String product_name) {
		// TODO Auto-generated method stub

		for (product product : products) {

			if (product.getProduct_name() == product_name) {
				return product;
			}

		}
		return null;
	}

	@Override
	public product getn(int id) {
		for (product product : products) {

			if (product.getId() == id) {
				return product;
			}

		}
		return null;
	}

}
