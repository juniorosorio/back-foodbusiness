package com.syst.trades.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "trade_id")
	private Integer tradeId; // aqui deve ser alterado para entity, o tipo não será mais Integer e sim Trade

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Double price;

	@Column(name = "control_quantity")
	private Boolean controlQuantity;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "quantity_reserved")
	private Integer quantityReserved;

	@Column(name = "last_price")
	private Double lastPrice;

	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "product_image")
	private String productImage;

	@Column(name = "creation_user")
	private String creationUser;

	@Column(name = "update_user")
	private String updateUser;

	@Column(name = "creation_date", updatable=false)
	private Date creationDate;

	@Column(name = "update_date")
	private Date updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTradeId() {
		return tradeId;
	}

	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getControlQuantity() {
		return controlQuantity;
	}

	public void setControlQuantity(Boolean controlQuantity) {
		this.controlQuantity = controlQuantity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getQuantityReserved() {
		return quantityReserved;
	}

	public void setQuantityReserved(Integer quantityReserved) {
		this.quantityReserved = quantityReserved;
	}

	public Double getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(Double lastPrice) {
		this.lastPrice = lastPrice;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getProductImage() {
		return productImage;
	}
	
	public void setProductImage(String productImage) {
		this.productImage = productImage;
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

	public String getCreationDate() {
		String strCreationDate = "";
		if (null != this.creationDate) {
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			strCreationDate = fmt.format(creationDate);
		}
		return strCreationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getUpdateDate() {
		String strUpdatenDate = "";
		if (null != this.updateDate) {
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			strUpdatenDate = fmt.format(updateDate);
		}
		return strUpdatenDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	@PrePersist
	public void prePersist() {
		this.creationDate = new Date();
//		this.creationUser = Ruller...
	}
	
	@PreUpdate
	public void preUpdate() {
		this.updateDate = new Date();
//		this.updateUser = Ruller...
	}

}
