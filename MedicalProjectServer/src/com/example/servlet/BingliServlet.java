package com.example.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONObject;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import com.example.service.BingliService;

public class BingliServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BingliService bingliService = null;

	@Override
	public void init() throws ServletException {
		ServletContext servletContext = this.getServletContext();
		WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
		bingliService = webApplicationContext.getBean(BingliService.class);
	}   

    public BingliServlet() {
        super();
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
		//String binglioperation = new String(request.getParameter("binglioperation").getBytes("iso-8859-1"),"utf-8");
		//System.out.println("operation: "+binglioperation);
		JSONObject params;
		
		try{
			params = new JSONObject(new String(request.getParameter("params").getBytes("iso-8859-1"), "utf-8"));
			JSONObject result = new JSONObject();
		
			bingliService.getBingli(params, result, writer);
		} catch (Exception e) {
		}
	}
    }

