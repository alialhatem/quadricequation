package qequation.server;

import javax.xml.bind.ParseConversionEvent;

import qequation.client.GreetingService;
import qequation.shared.FieldVerifier;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		GreetingService {
	String msg;
	public String greetServer(String input,String input2,String input3) throws IllegalArgumentException {
		
		double a=Double.parseDouble(input);
		double b=Double.parseDouble(input2);
		double c=Double.parseDouble(input3);
		double delta = Math.sqrt(b * b - 4 * a * c);
		if (delta>=0){
		double root1 = (-b +  delta) / (2*a) ;
		double root2 = (-b -  delta) / (2*a) ;
		 msg="sloution1="+root1+" solution2="+root2;
		}
		else msg="this equation has no solution";
return msg;	
	}

	/**
	 * Escape an html string. Escaping data received from the client helps to
	 * prevent cross-site script vulnerabilities.
	 * 
	 * @param html the html string to escape
	 * @return the escaped string
	 */
	private String escapeHtml(String html) {
		if (html == null) {
			return null;
		}
		return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;")
				.replaceAll(">", "&gt;");
	}
}
