package com.example.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.bean.Binglis;
import com.example.bean.Doctor;
import com.example.bean.Patient;
import com.example.mapper.BingliMapper;
import com.example.mapper.PatientMapper;

@RunWith(SpringJUnit4ClassRunner.class)

@ContextConfiguration("/Config/beans.xml")
public class test {
	@Autowired
	private BingliMapper bingliMapper;
	@Test
	public void getBingli(){
		Binglis binglis = bingliMapper.selectBingliById(1);
		int age = binglis.getAge();
		System.out.println(binglis.toString());
	}
}
