package cz.jcu.uai.javapract;

import java.lang.reflect.Array;
import java.util.*;

public class TimeTable {

	private HashMap<Integer, HashMap<String,Subject>> content;
	private  Date update;
	
	public TimeTable() {
		// TODO Auto-generated constructor stub
		this.content= new HashMap<Integer, HashMap<String, Subject>>();
//		this.content.put(Calendar.MONDAY, new HashMap<String, Subject>());
//		this.content.put(Calendar.TUESDAY, new HashMap<String, Subject>());
	}

	/**
	 * Method for creating timetable
	 * @param date is value where is date of download timetable
	 * @param listSubject is list subjects from stag
	 */
	public void CreateTimeTable(Date date , ArrayList<Subject> listSubject){
		this.update = date;
		for (int i = 0 ; i<listSubject.size() ; i++){
			content.put(listSubject.get(i).getDay(),addSubject(listSubject.get(i).getDay(),listSubject.get(i)));
		}
	}

	/**
	 * Method for creating inner hash map
	 * @param day is key in content
	 * @param subject is data for inner map
	 * @return inner map
	 */
	private HashMap<String,Subject> addSubject(Integer day, Subject subject){
		HashMap<String,Subject> innerMap = content.get(day);
		if (innerMap == null) {
			innerMap = new HashMap<String, Subject>();
		}
		innerMap.put(subject.getId(), subject);
		return innerMap;
	}

	/**
	 * Getter for timetable
	 * @return content
	 */
	public HashMap<Integer, HashMap<String, Subject>> getContent()
	{
		return content;
	}

	public HashMap<String, Subject> getDay(int day)
	{

		return content.get(day);


	}

	/**
	 * Getter for date when the timetable change
	 * @return update
	 */

	public Date getUpdate()
	{
		return update;
	}








}
