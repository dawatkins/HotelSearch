package co.grandcircus.HotelSearch;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.HotelSearch.dao.HotelDao;
import co.grandcircus.HotelSearch.dao.HotelSearchDao;
import co.grandcircus.HotelSearch.entity.Hotel;

@Controller
public class HotelController {
	
	@Autowired
	private HotelDao dao;
	
	@Autowired
	private HotelSearchDao cityDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		List<Hotel> hotels = dao.findAll();
		Set<String> cities = new HashSet<>();
		for(Hotel hotel : hotels) {
			cities.add(hotel.getCity());
		}
		return new ModelAndView("index", "cities", cities);
	}
	
	@RequestMapping("/hotels")
	public ModelAndView ShowHotels( 
		@RequestParam("city") String cityName) {
		List<Hotel> hotels = cityDao.findAllByCityOrderByPricePerNightDesc(cityName);
		ModelAndView mv = new ModelAndView();
		mv.addObject("hotels", hotels);
		mv.addObject("city", cityName);
		return mv;
	}
}
