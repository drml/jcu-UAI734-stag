package cz.jcu.uai.javapract;

public class Subject {

	private String name;
	private int subjectCode;
	private String subjectID;
	private String timeStart;
	private String timeEnd;
	private int day;
	//private boolean type;
	private String building;
	private String room;
	private Date dateStartSubject;
	private Date dateEndSubject;
	private boolean act;
	
	public Subject(String name,int subjectCode,String subjectID, String timeStart, String timeEnd,int day,String building,String room ,Date dateStartSubject,Date dateEndSubject,boolean act) {
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
	}

	public int getSubjectCode()
	{
		return subjectCode;
	}

	public String getSubjectID()
	{
		return subjectID;
	}


}
