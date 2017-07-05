package cz.jcu.uai.javapract;

import java.io.Serializable;
import java.util.Date;

public class Subject implements Serializable {

	private String name;
	private int subjectCode;
	private String subjectID;
	private String timeStart;
	private String timeEnd;
	private int day;
	private SubjectType type;
	private String building;
	private String room;
	private String dateStartSubject;
	private String dateEndSubject;
	private boolean act;

	private String id;

	public Subject()
	{
	}

	public Subject(String typ, String name, int subjectCode, String subjectID, String timeStart, String timeEnd, int day, String building, String room , String dateStartSubject, String dateEndSubject, boolean act) {
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

		this.id = subjectID + subjectCode + typ;

	}

	public void ResetSubject(){
		this.name = null;
		this.subjectID = null;
		this.subjectCode = 0;
		this.timeStart = null;
		this.timeEnd = null;
		this.day = 8;
		this.building = null;
		this.room = null;
		this.dateStartSubject = null;
		this.dateEndSubject = null;
		this.act = true;
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

	public String getDateStartSubject()
	{
		return dateStartSubject;
	}

	public String getDateEndSubject()
	{
		return dateEndSubject;
	}

	public boolean isAct()
	{
		return act;
	}

	public String getId()
	{
		return id;
	}

	@Override
	public String toString()
	{
		return this.id;
	}


	public void setName(String name)
	{
		this.name = name;
	}

	public void setSubjectCode(int subjectCode)
	{
		this.subjectCode = subjectCode;
	}

	public void setSubjectID(String subjectID)
	{
		this.subjectID = subjectID;
	}

	public void setTimeStart(String timeStart)
	{
		this.timeStart = timeStart;
	}

	public void setTimeEnd(String timeEnd)
	{
		this.timeEnd = timeEnd;
	}

	public void setDay(int day)
	{
		this.day = day;
	}

	public void setType(SubjectType type)
	{
		this.type = type;
	}

	public void setBuilding(String building)
	{
		this.building = building;
	}

	public void setRoom(String room)
	{
		this.room = room;
	}

	public void setDateStartSubject(String dateStartSubject)
	{
		this.dateStartSubject = dateStartSubject;
	}

	public void setDateEndSubject(String dateEndSubject)
	{
		this.dateEndSubject = dateEndSubject;
	}

	public void setAct(boolean act)
	{
		this.act = act;
	}

	public void setId(String id)
	{
		this.id = id;
	}
}
