package jay.first.sacbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jay.first.sacbackend.dao.productDAO;
import jay.first.sacbackend.dto.product;

@Repository("productdao")
@Transactional
public class productDAOIMPL implements productDAO {

	@Autowired
	private SessionFactory sessionFactory;
//	private static List<product> products = new ArrayList<>();
//
//	static {
//
//		product product = new product();
//		product.setId(1);
//		product.setProduct_name("badge");
//		product.setDescription("school badge");
//		product.setImage_url("p1.png");
//		product.setProduct_price(200.00);
//
//		products.add(product);
//
//		product = new product();
//		product.setId(2);
//		product.setProduct_name("car badge");
//		product.setDescription("car badge");
//		product.setImage_url("p1.png");
//		product.setProduct_price(200.00);
//
//		products.add(product);
//
//		product = new product();
//		product.setId(3);
//		product.setProduct_name("uniform");
//		product.setDescription("school badge");
//		product.setImage_url("p1.png");
//		product.setProduct_price(200.00);
//
//		products.add(product);
//
//		product = new product();
//		product.setId(4);
//		product.setProduct_name("cap");
//		product.setDescription("school badge");
//		product.setImage_url("p1.png");
//		product.setProduct_price(200.00);
//
//		products.add(product);
//
//	}

	@Override
	public List<product> list() {
		// TODO Auto-generated method stub
		
		
		String select_active_products = "from product where is_active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(select_active_products);getClass();
		query.setParameter("active", true);
		
		
		return query.getResultList();
	}

	@Override
	public product get(String product_name) {
		// TODO Auto-generated method stub

//		for (product product : products) {
//
//			if (product.getProduct_name() == product_name) {
//				return product;
//			}
//
//		}
		return null;
	}

	@Override
	public product getn(int id) {
		
		//edit for testcase
		
		return sessionFactory.getCurrentSession().get(product.class,Integer.valueOf(id));
		
		
//		for (product product : products) {
//
//			if (product.getId() == id) {
//				return product;
//			}
//
//		}
		//return null;
	}

	@Override
	
	public boolean add(product product) {
		try {
			sessionFactory.getCurrentSession().persist(product);
			
			return true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
		
		
		
	}

	@Override
	public boolean update(product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			
			return true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(product product) {
		product.setIs_active(false);
		
		try {
			sessionFactory.getCurrentSession().update(product);
			
			return true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
	}

}
