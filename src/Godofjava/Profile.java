package Godofjava;

public class Profile {
	String name;
	int age;
	
	public void printName() {
		System.out.println("My name is" + name);
	}
	public void printAge() {
		System.out.println("My age is " + age);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String name() {
		return this.name;
	}
	
	public static void main(String[] args) {
		Profile p = new Profile();
		StringBuilder sb = new StringBuilder();
		p.setAge(98);
		p.setName("ºñ¹Ð");
		
		/*
		sb.append("My name is ")
		.append(p.getName())
		.append(System.lineSeparator())
		.append("My age is ")
		.append(p.getAge());
		
		System.out.println(sb);
		*/
		p.printName();
		p.printAge();
	}

}
