package businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Currency")
public class Currency {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CurencyID")
	public int curencyID;
	@Column(name="suppliyerID")
	public int suppliyerID;
	@Column(name="USDollars")
	public short usDollars;
	@Column(name="Nis")
	public short nis;
	@Column(name="Euro")
	public short euro;
	@Column(name="AUDollars")
	public short auDollars;



	public Currency(int suppliyerID, short usDollars, short nis, short euro, short auDollars) {
		this.suppliyerID = suppliyerID;
		this.usDollars = usDollars;
		this.nis = nis;
		this.euro = euro;
		this.auDollars = auDollars;
	}



	public short getUsDollars() {
		return usDollars;
	}



	public void setUsDollars(short usDollars) {
		this.usDollars = usDollars;
	}



	public short getNis() {
		return nis;
	}



	public void setNis(short nis) {
		this.nis = nis;
	}



	public short getEuro() {
		return euro;
	}



	public void setEuro(short euro) {
		this.euro = euro;
	}



	public short getAuDollars() {
		return auDollars;
	}



	public void setAuDollars(short auDollars) {
		this.auDollars = auDollars;
	}



	public int getCurencyID() {
		return curencyID;
	}



	public int getSuppliyerID() {
		return suppliyerID;
	}





}
