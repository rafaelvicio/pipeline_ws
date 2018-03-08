package br.com.rafaelvicio.webservice;

import br.com.rafaelvicio.dao.PipelineDAO;

@WebService
public class PipelineWS {
	
	private PipelineDAO pipelineDAO = new PipelineDAO();
	
	public List<Pipeline> getPipelines(){
		System.out.println("Chamando getPipeline");
		
	}

}
