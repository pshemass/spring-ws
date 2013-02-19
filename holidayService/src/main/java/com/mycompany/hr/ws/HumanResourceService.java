package com.mycompany.hr.ws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mycompany.hr.jaxb2.HolidayRequest;

@Service
public class HumanResourceService {
	
	public static Logger logger = LoggerFactory.getLogger(HumanResourceService.class);

	public void bookHoliday(final HolidayRequest holidayRequest) {
		
		logger.info(String.format("Holiday has been booked. <%s>", holidayRequest));
	}

}
