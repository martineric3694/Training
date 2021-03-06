package model;

// Generated Apr 1, 2016 2:21:00 PM by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * TblContract generated by hbm2java
 */
public class TblContract implements java.io.Serializable {

	private BigDecimal contractId;
	private TblCustomer tblCustomer;
	private String contractNo;
	private Set<TblAngsuran> tblAngsurans = new HashSet<TblAngsuran>(0);

	public TblContract() {
	}

	public TblContract(BigDecimal contractId, TblCustomer tblCustomer) {
		this.contractId = contractId;
		this.tblCustomer = tblCustomer;
	}

	public TblContract(BigDecimal contractId, TblCustomer tblCustomer,
			String contractNo, Set<TblAngsuran> tblAngsurans) {
		this.contractId = contractId;
		this.tblCustomer = tblCustomer;
		this.contractNo = contractNo;
		this.tblAngsurans = tblAngsurans;
	}

	public BigDecimal getContractId() {
		return this.contractId;
	}

	public void setContractId(BigDecimal contractId) {
		this.contractId = contractId;
	}

	public TblCustomer getTblCustomer() {
		return this.tblCustomer;
	}

	public void setTblCustomer(TblCustomer tblCustomer) {
		this.tblCustomer = tblCustomer;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public Set<TblAngsuran> getTblAngsurans() {
		return this.tblAngsurans;
	}

	public void setTblAngsurans(Set<TblAngsuran> tblAngsurans) {
		this.tblAngsurans = tblAngsurans;
	}

}
