package com.erp.domain.master;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the account_master database table.
 * 
 */
@Entity
@Table(name = "account_master")
public class AccountMaster extends ERPMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "erp_id")
	private ERPMaster erpMaster;

	@Column(name = "account_name")
	private String accountName;

	@Column(name = "alias_name")
	private String aliasName;

	@Column(name = "balance_type")
	private Integer balanceType;

	@Column(name = "contact_person_name")
	private String contactPersonName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "fax_number")
	private String faxNumber;

	@Column(name = "gst_number")
	private String gstNumber;

	@Column(name = "mobile_number")
	private String mobileNumber;

	@Column(name = "opening_balance")
	private BigDecimal openingBalance;

	@Column(name = "pan_number")
	private String panNumber;

	@Column(name = "phone_number")
	private String phoneNumber;

	public AccountMaster() {
		super();
	}
	
	public ERPMaster getErpMaster() {
		return erpMaster;
	}

	public void setErpMaster(ERPMaster erpMaster) {
		this.erpMaster = erpMaster;
	}



	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public Integer getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(Integer balanceType) {
		this.balanceType = balanceType;
	}

	public String getContactPersonName() {
		return contactPersonName;
	}

	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public BigDecimal getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(BigDecimal openingBalance) {
		this.openingBalance = openingBalance;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "AccountMaster [getId()=" + getId() + "]";
	}
}