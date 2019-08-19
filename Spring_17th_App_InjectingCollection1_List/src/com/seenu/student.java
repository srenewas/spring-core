package com.seenu;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class student {
	public student(List courses) {
		System.out.println(courses);
	}
	
	public student(Set courses) {
		System.out.println(courses);
	}
	public student(Map courses) {
		System.out.println(courses);
	}
	public student(Properties pros) {
		System.out.println(pros);
	}
}
