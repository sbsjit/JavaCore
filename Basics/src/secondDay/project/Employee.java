package secondDay.project;

public class Employee {

	private String empName;
	private int grade;

	public int getGrade() {
		return grade;
	}

	public Employee(String empName, int grade) {
		this.empName = empName;
		this.grade = grade;
	}  
	
	/*public String getEmpInfo() {
		return empName + "(" + grade + ")";
	}*/

	//Object class has a toString() method,which is called whenever an onj is printed
	public String toString() {
		return empName + "(" + grade + ")";
	}

}
