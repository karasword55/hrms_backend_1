package kodlamaio.northwind2.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind2.business.abstracts.JobTitleService;
import kodlamaio.northwind2.dataAccess.abstracts.JobTitleDao;
import kodlamaio.northwind2.entities.concrete.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobtitledao;

	@Autowired
	public JobTitleManager(JobTitleDao jobtitledao) {
		super();
		this.jobtitledao = jobtitledao;
	}
	
	

	@Override
	public List<JobTitle> getAll() {
		// TODO Auto-generated method stub
		return this.jobtitledao.findAll();
	}
	
	

}
