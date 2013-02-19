package com.mycompany.hr.ws;

import javax.xml.transform.Source;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.xml.transform.StringSource;

import static org.springframework.ws.test.server.RequestCreators.*;                      
import static org.springframework.ws.test.server.ResponseMatchers.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-ws-servlet.xml")
public class HolidayEndpointIntegrationTest {

	@Autowired
	private ApplicationContext applicationContext;

	private MockWebServiceClient mockClient;

	@Before
	public void createClient() {
		mockClient = MockWebServiceClient.createClient(applicationContext);
	}

	@Test
	public void shouldSendRequest() {

		
		Source requestPayload = new StringSource("<HolidayRequest xmlns=\"http://mycompany.com/hr/schemas\">"
    +"<Holiday>"
     +   "<StartDate>2006-07-03</StartDate>"
      +  "<EndDate>2006-07-07</EndDate>"
    +"</Holiday>"
    +"<Employee>"
       + "<Number>42</Number>"
        + "<FirstName>Arjen</FirstName>"
        +"<LastName>Poutsma</LastName>"
    +"</Employee>"
+"</HolidayRequest>");
		
		mockClient.sendRequest(withPayload(requestPayload));
	}

}
