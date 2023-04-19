package com.BikkadIT.SpringPractice.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class OracleReportDaoImpl implements ReportDao{

	@Override
	public String generateReport() {
		String s="oracle report generated";
		return s;
	}

}
