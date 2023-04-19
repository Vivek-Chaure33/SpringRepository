package com.BikkadIT.SpringPractice.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlReportDaoImpl implements ReportDao{

	@Override
	public String generateReport() {
		String s="MySql Report Generated";
		return s;
		
	}

}
