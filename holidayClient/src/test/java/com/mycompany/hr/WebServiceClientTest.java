package com.mycompany.hr;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.mycompany.hr.jaxb2.HolidayRequest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/application-context.xml")
public class WebServiceClientTest {
	
	@Autowired
	private WebServiceTemplate serviceTemplate;
	
	@Test
	public void shouldSendWebserviceRequest() throws Exception {
		serviceTemplate.marshalSendAndReceive(new HolidayRequest(), new SoapActionCallback("http://mycompany.com/hr/holidayRequest/Create"));
	}

}
