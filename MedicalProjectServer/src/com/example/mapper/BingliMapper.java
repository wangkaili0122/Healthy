package com.example.mapper;

import java.util.List;

import com.example.bean.Binglis;
import com.example.bean.Patient;

public interface BingliMapper {
	
	int insertBatchBingli(List<Binglis> bingliList);

	List<Binglis> getBingliList(int id);
	Binglis selectBingliById(int id);
	void updateBingliSetRead(List<Integer> ids);
}
