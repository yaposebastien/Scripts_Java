/**
 * 
 * @author Yankees
 * 
 * Purpose:
 * demonstrate ability to design simple Student class 
 * and store it in a Binary Search Tree (BST).
 * 
 * A Student class with sudentId, studentName, studentMajor as properties
 * A Student class with Methods: gets, sets, compareTo, 
 * 
 *
 */
public class Student {
	
	protected int studId;
	private String studName;
	private String studMajor;
	
	/**
	 * Default constructor of class Student
	 */
	
	public Student() throws Exception {

		studId = 0;
		studName = "";
		studMajor = "";
		
	}
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param major
	 * @throws Exception
	 */
	public Student(int id, String name, String major ) throws Exception {
		
		setStudentId(id);
	}
	
	public Student(int id) throws Exception {
		
		if(id > 0)
			{ setStudentId(id); }
		else
			{ throw new Exception("Invalid input! The Studend Id must be greater than zero(0).");}
		
		studName = "";
		studMajor = "";
	}
	
	//List of Getters and Setters of the class student 
	
	/**
	 * Set the Student Id number with parameter
	 * @param id - Identification number of Student must be greater than zero 
	 * @throws Exception
	 */
	public void setStudentId(int id) throws Exception {
		
		if(id > 0)
			{ studId = id ;}
		else 
			{ throw new Exception("Invalid input! The Studend Id must be greater than zero(0).");}
	}
	/**
	 * getSudentId - 
	 * @return studId - Student identification number
	 */
	public int getStudentId() {
		return studId;
	}
	
	/**
	 * Set the Student name with parameter
	 * @param name - Name of the student must not be an empty string
	 * @throws Exception
	 */
	public void  setStudentName(String name) throws Exception {
		
		if(name.length() > 0 )
			{ studName = name; }
		else
			{ throw new Exception("Invalid input! The Student's name must not be an empty string.");}
	}
	
	}

}//End of class Student
