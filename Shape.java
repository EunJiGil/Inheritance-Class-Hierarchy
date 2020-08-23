package javapro;

public class Shape{
	private String Name;
	private String Class_Name;
	public Shape(String name, String Classname) {
		Name = name;
		Class_Name = Classname; 
		//I need Name and Class_Name in Shape Class, because it's the most general class
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
		public String getClass_Name() {
		return Class_Name;
	}
	public void setClass_Name(String class_Name) {
		Class_Name = class_Name;
	}//get + set methods
	}

