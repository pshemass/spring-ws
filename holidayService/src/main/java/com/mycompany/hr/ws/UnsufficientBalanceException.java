package com.mycompany.hr.ws;

import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.SERVER)
public class UnsufficientBalanceException extends Exception {

	private static final long serialVersionUID = 695182652079355196L;

}
