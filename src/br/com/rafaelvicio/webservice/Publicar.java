package br.com.rafaelvicio.webservice;

import javax.xml.ws.Endpoint;

public class Publicar {
	
	public static void main(String[] args) {
		PipelineWS service = new PipelineWS();
		String url = "http://locahlhost:8080/pipelinews";
		
		Endpoint.publish(url, service);
		
	}

}
