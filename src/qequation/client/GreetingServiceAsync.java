package qequation.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input,String input2,String input3, AsyncCallback<String> callback)
			throws IllegalArgumentException;
}
