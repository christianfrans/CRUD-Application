/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudapp.Controller;

import crudapp.Helper.Helper;
import crudapp.Model.MainModel;
import crudapp.Query.IncomingQuery;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author user
 */
public class IncomingController extends BaseController{
	Helper helper = new Helper();
	IncomingQuery query = new IncomingQuery();
	
	public Boolean input(MainModel model) throws ParseException{
		String date = helper.parseDateToString(model.getIncoming());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getIncome_name());
		map.put(2, model.getGoods_name());
		map.put(3, model.getCategory());
		map.put(4, date);
		map.put(5, model.getStock());
		map.put(6, model.getPrice());
		
		String sql = this.query.goods;
		
		return this.preparedStatement(map, sql);
	}
	
	public Boolean update(String id, MainModel model) throws ParseException{
		String date = helper.parseDateToString(model.getIncoming());
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getIncome_name());
		map.put(2, model.getGoods_name());
		map.put(3, model.getCategory());
		map.put(4, date);
		map.put(5, model.getStock());
		map.put(6, model.getPrice());
		map.put(7, id);
		
		String sql = this.query.updateGoods;
		
		return this.preparedStatement(map, sql);
	}
	
	public Boolean delete(String id, MainModel model) throws ParseException{
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, model.getDelete_income());
		map.put(2, id);
		
		String sql = this.query.deleteGoods;
		
		return this.preparedStatement(map, sql);
	}
	
	public ResultSet get(){
		String sql = this.query.getGoods;
		return this.get(sql);
	}
	
	public ResultSet showById(String id){
		String sql = this.query.showByIdGoods;
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, id);
		
		return this.getWithParameter(map, sql);
	}
	
	public ResultSet showByName(String goods_name){
		String sql = this.query.showByNameGoods;
		
		Map<Integer, Object> map = new HashMap<>();
		map.put(1, helper.parseLikeQuery(goods_name));
		
		return this.getWithParameter(map, sql);
	}
}
