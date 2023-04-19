package com.BikkadIT.SpringPractice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringPractice.Dao.MySqlReportDaoImpl;
import com.BikkadIT.SpringPractice.Dao.ReportDao;

@Service
public class ReportService {
	@Autowired
	@Qualifier("mySqlReportDaoImpl")
	private ReportDao rd;
	public String generateReport() {
		String report = rd.generateReport();
		return report;
	}
}
