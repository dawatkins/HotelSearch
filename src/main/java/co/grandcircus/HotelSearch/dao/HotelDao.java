package co.grandcircus.HotelSearch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.HotelSearch.entity.Hotel;

@Repository
@Transactional
public class HotelDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Hotel> findAll(){
		return em.createQuery("FROM Hotel", Hotel.class).getResultList();
	}
	
//	public List<Hotel> findAllByCity(){
//		return em.createQuery("FROM Hotel WHERE city = city", Hotel.class).getResultList();
//	}
}
