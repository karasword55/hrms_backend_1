package kodlamaio.northwind2.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind2.entities.concrete.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer>{
	
	

}
