package jay.first.sacbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jay.first.sacbackend.dao.Sports_DAO;
import jay.first.sacbackend.dto.Sports;

public class Sport_test_case {

	private static AnnotationConfigApplicationContext context;
	private static Sports_DAO sportdao;
	private Sports sport;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("jay.first.sacbackend");
		context.refresh();
		sportdao = (Sports_DAO) context.getBean("sportdao");

	}

	
	@Test
	public void test_crud_product() {

		sport = new Sports();
		sport.setSport_name("car badge");
		sport.setImage_url("p11.png");
		sport.setDescription("new");
		assertEquals("sport added", true, sportdao.add(sport));

		sport = new Sports();
		sport.setSport_name("car badge2");		
		sport.setImage_url("p11.png");
		sport.setDescription("old");
		assertEquals("sport added", true, sportdao.add(sport));

		sport = new Sports();
		sport.setSport_name("school badge");
		sport.setImage_url("p11.png");
		sport.setDescription("new");
		assertEquals("product added", true, sportdao.add(sport));

		// fetching and updating

		sport = sportdao.getn(2);
		sport.setSport_name("car logo");
		assertEquals("product updated", true, sportdao.update(sport));

		// deleting product

		sport = sportdao.getn(1);
		assertEquals("sport deleted", true, sportdao.delete(sport));
		
		//fetching a single list
		assertEquals("sport get the list",2,sportdao.list().size());

	}
	
}
