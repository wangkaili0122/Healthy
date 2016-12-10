package com.example.service;

import java.io.PrintWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public interface BingliService {
//	public boolean insertBatchData(JSONArray jsonArray);
	void getBingli(JSONObject params, JSONObject result, PrintWriter writer);
}
