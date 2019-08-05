package co.grandcircus.HotelSearch.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.grandcircus.HotelSearch.entity.Hotel;

public interface HotelSearchDao extends JpaRepository<Hotel, Long>{
	
	List<Hotel> findAllByCityOrderByPricePerNightDesc(String city);
}
