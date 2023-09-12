package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.dao.CarCRUD;
import com.org.dto.Car;
@Controller
public class CarController {
	@RequestMapping("/df")
	public String saveBike(@ModelAttribute Car c) {
		CarCRUD.saveCar(c);
		return "Car.jsp";
	}
	
}
