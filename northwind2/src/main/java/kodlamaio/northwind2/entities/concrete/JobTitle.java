package kodlamaio.northwind2.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_titles")
public class JobTitle {
	

	@Id
	@GeneratedValue
	@Column(name="is_id")
	private int id;
	
	@Column(name="is_adi")
	private String title;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public JobTitle() {
		
	}

	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	
	
	
	

}
