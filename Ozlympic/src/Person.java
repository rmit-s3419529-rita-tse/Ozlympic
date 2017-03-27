
public abstract class Person {
	
	private String ID;
    private String name;
    private int age;
    private String state;
	
  	public Person (String ID, String name, int age, String state ) 
  	{
  		this.ID = ID;
  		this.name = name;
  		this.age = age;
  		this.state = state;  		
  	}
  	
  	public void getAll(){
		System.out.println(ID+name+age+state);
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getState() {
		return state;
	}
	
	
	public void setID(String Id) {
		this.ID=Id;
	}

	

	public void setName(String name) {
		this.name = name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}

	

	public void setState(String state) {
		this.state = state;
		
		
	
	}
}
