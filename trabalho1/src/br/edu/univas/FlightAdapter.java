package br.edu.univas;

import java.time.ZonedDateTime;
import java.util.List;

public interface FlightAdapter {
	
	public List<Flight> getAll();

	void readFlightInformation(List<Flight> flights);

	ZonedDateTime stringToZonedDateTime(String date);


}
