/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp.Helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;

/**
 *
 * @author user
 */
public class Helper {
	public String getValueRows(JTable table, int index){
		return table.getValueAt(table.getSelectedRow(), index).toString();
	}
	
	public String parseLikeQuery(String query){
		return "%" + query + "%";
	}
	
	public Date	parseStringToDatePickerFormat(String _date)
			throws ParseException {
		Date date = new SimpleDateFormat("yyyy-mm-dd").parse(_date);
		String formatted = new SimpleDateFormat("mm/dd/yy").format(date);
		return new SimpleDateFormat("dd-MM-yyyy").parse(_date);
	}
	
	public String parseDateToString(Date _date) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		return dateFormat.format(_date);
	}
}
