package com.mycompany.hr.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.soap.server.endpoint.annotation.SoapAction;

import com.mycompany.hr.jaxb2.HolidayRequest;

@Endpoint
public class HolidayEndpoint {

	private HumanResourceService humanResourceService;

	@Autowired
	public HolidayEndpoint(final HumanResourceService humanResourceService) {
		this.humanResourceService = humanResourceService;
	}

	@SoapAction("http://mycompany.com/hr/holidayRequest/Create")
	public void handleHolidayRequest(@RequestPayload final HolidayRequest holidayRequest) throws Exception {

		humanResourceService.bookHoliday(holidayRequest);
	}
}
