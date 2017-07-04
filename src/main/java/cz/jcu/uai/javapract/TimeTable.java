package cz.jcu.uai.javapract;

import java.util.Date;
import java.util.HashMap;

public class TimeTable {

	private Subject subject;
	private Date date;
	private HashMap<Integer, HashMap<String,Subject>> content;
	
	
	public TimeTable(Subject subject,Date date) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.date = date;
	}

}
