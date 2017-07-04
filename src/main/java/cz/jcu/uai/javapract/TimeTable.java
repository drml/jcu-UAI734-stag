package cz.jcu.uai.javapract;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class TimeTable {

	private HashMap<Integer, HashMap<String,Subject>> content;
	
	
	public TimeTable(Date date , List<Subject> listSubject) {
		// TODO Auto-generated constructor stub
		this.content= new HashMap<Integer, HashMap<String, Subject>>();

		this.date = date;
	}

}
