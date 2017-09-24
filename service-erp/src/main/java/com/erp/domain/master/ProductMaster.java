package com.erp.domain.master;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;


/**
 * The persistent class for the product_master database table.
 * 
 */
@Entity
@Table(name="product_master")
public class ProductMaster extends ERPMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "erp_id")
	private ERPMaster erpMaster;
	
	@Column(name="category_id")
	private Long categoryId;

	@Column(name="company_id")
	private Long companyId;

	@Column(name="product_code")
	private String productCode;

	@Column(name="product_description")
	private String productDescription;

	@Column(name="product_name")
	private String productName;

	@Column(name="purchase_price")
	private BigDecimal purchasePrice;

	@Column(name="unit_quantity")
	private Long unitQuantity;
	
	public ProductMaster() {
		super();
	}

	public ERPMaster getErpMaster() {
		return erpMaster;
	}

	public void setErpMaster(ERPMaster erpMaster) {
		this.erpMaster = erpMaster;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public Long getUnitQuantity() {
		return unitQuantity;
	}

	public void setUnitQuantity(Long unitQuantity) {
		this.unitQuantity = unitQuantity;
	}
	
	@Override
	public String toString() {
		return "ProductMaster [getId()=" + getId() + "]";
	}
	
}