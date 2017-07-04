package cz.jcu.uai.javapract;

public class Subject {

	private String name;
	private String time;
	
	public Subject(String name, String time) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.time = time;
	}
	
	/**
	 * *Getter for name
	 * @return name
	 */
	
	public String getName() {
		return name;
	}
	
	/**
	 * *Setter for name
	 * @param name
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * *
	 * @return
	 */
	
	public String getTime() {
		return time;
	}
	
	/**
	 * *
	 * @param time
	 */
	
	public void setTime(String time) {
		this.time = time;
	}

}
