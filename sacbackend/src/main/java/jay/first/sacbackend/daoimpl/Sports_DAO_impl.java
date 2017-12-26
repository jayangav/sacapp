package jay.first.sacbackend.daoimpl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jay.first.sacbackend.dao.Sports_DAO;
import jay.first.sacbackend.dto.Sports;


@Repository("sportdao")
@Transactional
public class Sports_DAO_impl implements Sports_DAO {
	
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Sports> list() {
		String select_active_sports = "from Sports where is_active = :active";

		Query query = sessionFactory.getCurrentSession().createQuery(select_active_sports);getClass();
		query.setParameter("active", true);

		return query.getResultList();
	}

	@Override
	public boolean add(Sports sport) {
		try {
			sessionFactory.getCurrentSession().persist(sport);
			
			return true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(Sports sport) {
		try {
			sessionFactory.getCurrentSession().update(sport);
			
			return true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Sports sport) {
		sport.setIs_active(false);
		try {
			sessionFactory.getCurrentSession().update(sport);
			
			return true;
			
		} catch (Exception ex) {
			// TODO: handle exception
			ex.printStackTrace();
			return false;
		}
	}

	

	@Override
	public Sports get(String sport_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sports getn(int id) {
		return sessionFactory.getCurrentSession().get(Sports.class,Integer.valueOf(id));
	}

}
