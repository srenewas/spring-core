package com.seenu;
public class Bean {
	
	// ATTRIBUTES.................
	int id;
	String name;
	char gender;
	
     // WE MUST DECLARE DEFAULT CONSTRUCTOR (R) PARAMETERIZED CONSTRUCTOR AND TOSTRING METHOD TO DISPLAY THE DETAILS...(as per app requirement)
	// DEFAULT CONSTRUCTORS..............
	public Bean() {	
	}
	
	public Bean(int id, String name, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
    // SETTERS AND GETTERS METHODS..............
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// TOSTRING() METHOD FOR DISPLAY THE DETAILS...................
	@Override
	public String toString() {
		return "Bean [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
	
}
