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
public class OutcomingQuery {
	//QUERY TABLE OUTCOMING
	public String outcoming = "INSERT INTO outcoming (name, product_id"
			+", address, total, outcoming) VALUES (?,?,?"
			+ ",?,?)";
	public String getOutcoming = "SELECT * FROM outcoming"; //KARENA TIDAK MEMAKAI SOFT DELETE
	public String showByIdOutcoming = "SELECT * FROM outcoming WHERE id = ?";
	public String showByNameOutcoming = "SELECT * FROM outcoming WHERE product_id LIKE ?";
	public String updateOutcoming = "UPDATE outcoming SET name = ?, product_id = ?"
			+", address = ?, total = ?, outcoming = ?, income = ? WHERE id = ?";
}
