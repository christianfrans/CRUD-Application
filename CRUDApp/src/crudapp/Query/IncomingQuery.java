/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp.Query;

/**
 *
 * @author user
 */
public class IncomingQuery {
	//QUERY TABLE GOODS
	public String goods = "INSERT INTO goods (name, goods_name"
			+", category, incoming, stock, price) VALUES (?,?,?"
			+ ",?,?,?)";
	public String getGoods = "SELECT * FROM goods WHERE status = 1"; //KARENA MEMAKAI SOFT DELETE
	public String showByIdGoods = "SELECT * FROM goods WHERE id = ?";
	public String showByNameGoods = "SELECT * FROM goods WHERE goods_name LIKE ?";
	public String updateGoods = "UPDATE goods SET name = ?, goods_name = ?"
			+", category = ?, incoming = ?, stock = ?, price = ? WHERE id = ?";
	public String deleteGoods = "UPDATE goods SET status = ? WHERE id = ?";
}
