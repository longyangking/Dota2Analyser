package server;
import java.io.IOException;
import com.sun.net.httpserver.*;

import model.Model;

/**
 * Page class will generate html page to show information
 * 
 * @author longyang
 *
 */
public class Page implements HttpHandler{
	private Connection connection;
	public Page(Model model){
		this.connection = new Connection(model);
	}
	public void handle(HttpExchange he) throws IOException{
		// TODO Generate Pages!
	}
}
