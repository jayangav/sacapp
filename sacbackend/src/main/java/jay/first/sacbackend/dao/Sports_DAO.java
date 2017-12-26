package jay.first.sacbackend.dao;

import java.util.List;

import jay.first.sacbackend.dto.Sports;
public interface Sports_DAO {
	
	boolean add(Sports sport);
	boolean update(Sports sport);
	boolean delete(Sports sport);
	
	List<Sports> list();

	Sports get(String sport_name);

	Sports getn(int id);

}
