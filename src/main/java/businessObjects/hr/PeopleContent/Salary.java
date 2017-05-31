package businessObjects.hr.PeopleContent;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "Salary")
public class Salary {
@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int salCode;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "salID")
	protected SalType type;
	protected int empId;
	protected float amount;
	protected DateTime  givenDate;
	
	
		public Salary(SalType type, int empId, float amount, DateTime  givenDate) {
			this.type = type;
			this.empId= empId;
			this.amount = amount;
			this.givenDate = givenDate;
		}


		public int getSalCode() {
			return salCode;
		}


		public void setSalCode(int salCode) {
			this.salCode = salCode;
		}


		public SalType getType() {
			return type;
		}


		public void setType(SalType type) {
			this.type = type;
		}


		public int getEmpId() {
			return empId;
		}


		public void setEmpId(int empId) {
			this.empId = empId;
		}


		public float getAmount() {
			return amount;
		}


		public void setAmount(float amount) {
			this.amount = amount;
		}


		public DateTime getGivenDate() {
			return givenDate;
		}


		public void setGivenDate(DateTime givenDate) {
			this.givenDate = givenDate;
		}
		
		
		
		
}
