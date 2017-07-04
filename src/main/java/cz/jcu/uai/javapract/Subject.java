package cz.jcu.uai.javapract;

import java.util.Date;

public class Subject {

	private String name;
	private int subjectCode;
	private String subjectID;
	private String timeStart;
	private String timeEnd;
	private int day;
	private SubjectType type;
	private String building;
	private String room;
	private Date dateStartSubject;
	private Date dateEndSubject;
	private boolean act;

	public Subject(String typ,String name,int subjectCode,String subjectID, String timeStart, String timeEnd,int day,String building,String room ,Date dateStartSubject,Date dateEndSubject,boolean act) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.subjectID = subjectID;
		this.subjectCode = subjectCode;
		this.timeStart = timeStart;
		this.timeEnd = timeEnd;
		this.day = day;
		this.building = building;
		this.room = room;
		this.dateStartSubject = dateStartSubject;
		this.dateEndSubject = dateEndSubject;
		this.act = act;
		if (typ.equals("Cv"))
			type = SubjectType.CVICENI;
		else
			type = SubjectType.PREDNASKA;
	}

	public String getName()
	{
		return name;
	}

	public int getSubjectCode()
	{
		return subjectCode;
	}

	public String getSubjectID()
	{
		return subjectID;
	}

	public String getTimeStart()
	{
		return timeStart;
	}

	public String getTimeEnd()
	{
		return timeEnd;
	}

	public int getDay()
	{
		return day;
	}

	public SubjectType getType()
	{
		return type;
	}

	public String getBuilding()
	{
		return building;
	}

	public String getRoom()
	{
		return room;
	}

	public Date getDateStartSubject()
	{
		return dateStartSubject;
	}

	public Date getDateEndSubject()
	{
		return dateEndSubject;
	}

	public boolean isAct()
	{
		return act;
	}

}
