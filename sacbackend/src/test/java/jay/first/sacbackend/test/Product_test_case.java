package jay.first.sacbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jay.first.sacbackend.dao.productDAO;
import jay.first.sacbackend.dto.product;

public class Product_test_case {

	private static AnnotationConfigApplicationContext context;
	private static productDAO productdao;
	private product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("jay.first.sacbackend");
		context.refresh();
		productdao = (productDAO) context.getBean("productdao");

	}

	// @Test
	// public void testAddproduct() {
	//
	// product = new product();
	// product.setProduct_name("car badge");
	// product.setProduct_price(200.00);
	// product.setImage_url("p11.png");
	// //product.setIs_active(true);
	//
	//
	//
	//
	// product.setDescription("school badge1");
	// assertEquals("product added",true,productdao.add(product));
	// }
	//

	// @Test
	// public void testgetproduct() {
	//
	// product = productdao.getn(1);
	// assertEquals("product fetched","badge1",product.getProduct_name());
	// }
	//

	// @Test
	// public void test_update_product() {
	//
	// product = productdao.getn(2);
	// product.setProduct_name("tv");
	// assertEquals("product updated",true,productdao.update(product));
	// }
	////

	//
	// @Test
	// public void test_deollete_product() {
	//
	// product = productdao.getn(1);
	// assertEquals("product deleted",true,productdao.delete(product));
	// }

	// @Test
	// public void test_listof_product() {
	//
	// //product = productdao.getn(1);
	// assertEquals("product get the list",1,productdao.list().size());
	// }
	//
	@Test
	public void test_crud_product() {

		product = new product();
		product.setProduct_name("car badge");
		product.setProduct_price(200.00);
		product.setImage_url("p11.png");
		// product.setIs_active(true);

		product.setDescription("new");
		assertEquals("product added", true, productdao.add(product));

		product = new product();
		product.setProduct_name("car badge2");
		product.setProduct_price(200.00);
		product.setImage_url("p11.png");
		// product.setIs_active(true);

		product.setDescription("old");
		assertEquals("product added", true, productdao.add(product));

		product = new product();
		product.setProduct_name("school badge");
		product.setProduct_price(200.00);
		product.setImage_url("p11.png");
		// product.setIs_active(true);

		product.setDescription("new");
		assertEquals("product added", true, productdao.add(product));

		// fetching and updating

		product = productdao.getn(2);
		product.setProduct_name("car logo");
		assertEquals("product updated", true, productdao.update(product));

		// deleting product

		product = productdao.getn(1);
		assertEquals("product deleted", true, productdao.delete(product));
		
		//fetching a single list
		assertEquals("product get the list",2,productdao.list().size());

	}

}
