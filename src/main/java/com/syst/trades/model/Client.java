package com.syst.trades.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "last_address_requested_id")
	private Long lastAddressRequestedId;
	
	@Column(name = "last_product_requested_id")
	private Long lastProductRequestedId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "in_debit_with_me")
	private Boolean inDebitWithMe;
	
	@Column(name = "in_debit_with_other")
	private Boolean inDebitWithOther;
	
	@Column(name = "creation_User")
	private String creationUser;
	
	@Column(name = "update_user")
	private String updateUser;
	
	@Column(name = "creation_date")
	private Date creationDate;
	
	@Column(name = "update_date")
	private Date updateDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getLastAddressRequestedId() {
		return lastAddressRequestedId;
	}

	public void setLastAddressRequestedId(Long lastAddressRequestedId) {
		this.lastAddressRequestedId = lastAddressRequestedId;
	}

	public Long getLastProductRequested() {
		return lastProductRequestedId;
	}

	public void setLastProductRequested(Long lastProductRequestedId) {
		this.lastProductRequestedId = lastProductRequestedId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getInDebitWithMe() {
		return inDebitWithMe;
	}

	public void setInDebitWithMe(Boolean inDebitWithMe) {
		this.inDebitWithMe = inDebitWithMe;
	}

	public Boolean getInDebitWithOther() {
		return inDebitWithOther;
	}

	public void setInDebitWithOther(Boolean inDebitWithOther) {
		this.inDebitWithOther = inDebitWithOther;
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
