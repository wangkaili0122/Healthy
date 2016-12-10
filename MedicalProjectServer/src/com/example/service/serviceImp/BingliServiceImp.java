package com.example.service.serviceImp;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bean.Binglis;
import com.example.mapper.BingliMapper;
import com.example.service.BingliService;

@Service
public class BingliServiceImp implements BingliService{
	
	
	@Autowired
	private 
BingliMapper bingliMapper;
	public void getBingli(JSONObject params, JSONObject result, PrintWriter writer) {
		try {
			int id = params.getInt("id");
			List<Binglis> bingliList = bingliMapper.getBingliList(id);
			if (bingliList!=null && !bingliList.isEmpty()) {
				result.put("result", "Success");
				JSONArray jsonArray = new JSONArray();
				Iterator<Binglis> iterator = bingliList.iterator();
				while(iterator.hasNext()){
					JSONObject jsonObject = new JSONObject(iterator.next());
					jsonArray.put(jsonObject);
				}
				result.put("content", jsonArray);
				System.out.println("getBingli:"+result.toString());
				writer.write(result.toString());
			} else {
				result.put("result", "Nothing");
				writer.write(result.toString());
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	
}
