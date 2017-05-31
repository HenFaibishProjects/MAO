package businessObjects.additionalData.otherContents;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity (name = "MaTypeEntity") // the name of the Entity
@Table  (name = "MaTypeTable") // the name of the table from the DB
public class MaTypenew {
	
	@Id // Primary key
	
	@Column (name="id_MA_type")
	private int id;
	
	@Column (name="name_MA_type")
	private String type;
	
	@Transient  // the varible will not be part of the table
	private  String addForTestOne;
	
	@Temporal (TemporalType.DATE) // will appear only the date from the time stamp
	private Date dateForTest;
	
	@Lob     // This is a large object 
	private String description;
	
	//****** Constructor ******************
	
	public MaTypenew(int id, String type , Date dateForTest , String description) {
		super();
		this.id = id;
		this.type = type;
		this.setDateForTest(dateForTest);
		this.description = description;
	}
	
	public MaTypenew() {
		super();
	}

	
	//****** Getters and Setters ******************
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateForTest() {
		return dateForTest;
	}

	public void setDateForTest(Date dateForTest) {
		this.dateForTest = dateForTest;
	}


	
	
	
	
}
