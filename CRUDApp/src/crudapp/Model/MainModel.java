/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp.Model;

import java.util.Date;

/**
 *
 * @author user
 */
public class MainModel {
	public String income_name;
	public String goods_name;
	public String category;
	public Date incoming;
	public String stock;
	public String price;
	public String delete_income;
	
	public String outcome_name;
	public String product_id;
	public String address;
	public String total;
	public Date outcoming;
	public String income;

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getProduct_id() {
		return product_id;
	}
	
	public void setIncome_name(String income_name) {
		this.income_name = income_name;
	}

	public String getIncome_name() {
		return income_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setIncoming(Date incoming) {
		this.incoming = incoming;
	}

	public Date getIncoming() {
		return incoming;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getStock() {
		return stock;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPrice() {
		return price;
	}

	public void setDelete_income(String delete_income) {
		this.delete_income = delete_income;
	}

	public String getDelete_income() {
		return delete_income;
	}

	public void setOutcome_name(String outcome_name) {
		this.outcome_name = outcome_name;
	}

	public String getOutcome_name() {
		return outcome_name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getTotal() {
		return total;
	}

	public void setOutcoming(Date outcoming) {
		this.outcoming = outcoming;
	}

	public Date getOutcoming() {
		return outcoming;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public String getIncome() {
		return income;
	}
}
