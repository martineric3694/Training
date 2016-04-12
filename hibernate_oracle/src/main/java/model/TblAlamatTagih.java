package model;

// Generated Apr 1, 2016 2:21:00 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblAlamatTagih generated by hbm2java
 */
public class TblAlamatTagih implements java.io.Serializable {

	private BigDecimal alamatId;
	private String alamat;
	private Set<TblCustomerAlamat> tblCustomerAlamats = new HashSet<TblCustomerAlamat>(
			0);

	public TblAlamatTagih() {
	}

	public TblAlamatTagih(BigDecimal alamatId) {
		this.alamatId = alamatId;
	}

	public TblAlamatTagih(BigDecimal alamatId, String alamat,
			Set<TblCustomerAlamat> tblCustomerAlamats) {
		this.alamatId = alamatId;
		this.alamat = alamat;
		this.tblCustomerAlamats = tblCustomerAlamats;
	}

	public BigDecimal getAlamatId() {
		return this.alamatId;
	}

	public void setAlamatId(BigDecimal alamatId) {
		this.alamatId = alamatId;
	}

	public String getAlamat() {
		return this.alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public Set<TblCustomerAlamat> getTblCustomerAlamats() {
		return this.tblCustomerAlamats;
	}

	public void setTblCustomerAlamats(Set<TblCustomerAlamat> tblCustomerAlamats) {
		this.tblCustomerAlamats = tblCustomerAlamats;
	}

}