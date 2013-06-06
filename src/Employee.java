
public class Employee extends Customer{
	private int employId;
	
	public Employee(){
		this.employId = 1000;
	}

	public int getEmployId() {
		return employId;
	}

	public void setEmployId(int employId) {
		this.employId = employId;
	}
	
	public String toString(){
		return "[Employee]"+ super.toString();
	}
}
