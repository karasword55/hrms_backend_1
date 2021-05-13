package kodlamaio.northwind2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind2.business.abstracts.JobTitleService;
import kodlamaio.northwind2.entities.concrete.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {
	
	private JobTitleService jobtitleservice;

	@Autowired
	public JobTitlesController(JobTitleService jobtitleservice) {
		super();
		this.jobtitleservice = jobtitleservice;
	}
	
	
	@GetMapping("/getall")
	public List<JobTitle> getAll(){
		return this.jobtitleservice.getAll();
		
	}
	
	
	
	

}
