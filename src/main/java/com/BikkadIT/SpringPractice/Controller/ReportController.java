package com.BikkadIT.SpringPractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.SpringPractice.Service.ReportService;
@Controller
public class ReportController {
	@Autowired
	private ReportService rs;
	public String generateReport() {
		
		String s = rs.generateReport();
		
		return s;
	}
	
}
