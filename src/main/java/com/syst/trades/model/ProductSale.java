package com.syst.trades.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_sale")
public class ProductSale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "client_id")
	private Integer clientId;

	@Column(name = "sale_id")
	private Long saleId;

	// @OneToMany(mappedBy = "team", targetEntity = Player.class, fetch =
	// FetchType.LAZY, cascade = CascadeType.ALL)
	// private List<Player> players;

	@Column(name = "product_id")
	private Long productId;

	@Column(name = "quantity_sold")
	private Integer quantitySold;

	@Column(name = "price_unit_sold")
	private Double priceUnitSold;

	@Column(name = "sale_total")
	private Double saleTotal;

	@Column(name = "status_id")
	private Integer statusId;

	@Column(name = "creation_user")
	private String creationUser;

	@Column(name = "update_user")
	private String updateUser;

	@Column(name = "creation_date")
	private Date creationDate;

	@Column(name = "update_date")
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getClientId() {
		return clientId;
	}

	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public Long getProduct() {
		return productId;
	}

	public void setProduct(Long productId) {
		this.productId = productId;
	}

	public Integer getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}

	public Double getPriceUnitSold() {
		return priceUnitSold;
	}

	public void setPriceUnitSold(Double priceUnitSold) {
		this.priceUnitSold = priceUnitSold;
	}

	public Double getSaleTotal() {
		return saleTotal;
	}

	public void setSaleTotal(Double saleTotal) {
		this.saleTotal = saleTotal;
	}

	public Integer getStatusId() {
		return statusId;
	}

	public void setStatusId(Integer statusId) {
		this.statusId = statusId;
	}

	public String getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(String creationUser) {
		this.creationUser = creationUser;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
