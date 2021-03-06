package cn.zj.cq;

import java.util.Comparator;

public class Demo11ConnectorPerson {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false; 
		if (getClass() != obj.getClass())
			return false;
		Demo11ConnectorPerson other = (Demo11ConnectorPerson) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/**
	 * 
	 */
	public Demo11ConnectorPerson() {
		
	}
	/**
	 * @param name
	 * @param age
	 */
	public Demo11ConnectorPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Demo11ConnectorPerson [name=" + name + ", age=" + age + "]";
	}


	
}
