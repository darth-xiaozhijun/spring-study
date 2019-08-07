package com.service.impl;

import java.util.List;

import com.mapper.AirportMapper;
import com.pojo.Airport;
import com.service.AirportService;

public class AirportServiceImpl implements AirportService {
	private AirportMapper airportMapper;
	
	
	public AirportMapper getAirportMapper() {
		return airportMapper;
	}

	public void setAirportMapper(AirportMapper airportMapper) {
		this.airportMapper = airportMapper;
	}

	@Override
	public List<Airport> show() {
		return airportMapper.selAll();
	}
}
