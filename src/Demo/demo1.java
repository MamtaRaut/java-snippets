package Demo;

//import Demo1.student;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		place x = new place();
		 x.setName("ram");
		 System.out.println(x.getName());
		 x.setId(05);
		 System.out.println(x.getId());
	}
	 protected void display() {
		System.out.println("Hello world");
	}
	 

}
class place{
	private String name;
	private int id;
	private int marks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
	