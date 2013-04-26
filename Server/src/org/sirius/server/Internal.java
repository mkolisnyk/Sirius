/**
 * 
 */
package org.sirius.server;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @author KaNoN
 *
 */
@WebService
public class Internal {

	
	public void stop(){
		for(Endpoint endpoint:Starter.getEndpoints()){
			endpoint.stop();			
		}
		Starter.getEndpoints().removeAll(Starter.getEndpoints());
	}
}
