package server;
import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.*;

import model.Model;

public class Server implements Runnable{
	private int port;
	private Model model;
	public Server(int port, Model model){
		this.port = port; this.model = model;
	}
	@Override
	public void run(){
		try{
			HttpServer hs = HttpServer.create(new InetSocketAddress(this.port),100);
			hs.createContext(Config.ServerPath,new Page(this.model));
			hs.setExecutor(null);
			hs.start();
		}catch(IOException e){
			// TODO To define private Exception for these
		}
	}
}