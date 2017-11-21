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
public class Student implements Comparable<Student> {
	
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
	 * Constructor with parameters
	 * @param id
	 * @param name
	 * @param major
	 * @throws Exception
	 */
	public Student(int id, String name, String major ) throws Exception {
		
		setStudentId(id);
		setStudentName(name);
		setStudentMajor(major);
	}
	
	/**
	 * Special constructor
	 * @param id
	 * @throws Exception
	 */
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
	
	/**
	 * getStudentName - 
	 * @return studName - Name of the student
	 */
	public String getStudentName() {
		return studName;
	}
	
	/**
	 * Set the Student's major with parameter
	 * @param major - Major of the Student
	 * @throws Exception
	 */
	public void setStudentMajor(String major) throws Exception {
		if(major.length() == 3)
			{ studMajor = major; }
		else
			{ throw new Exception("Invalid input! The Student's major  must be three case characters e.g: CIS or cis.");}
		
	}
	/**
	 * getStudentMajor -
	 * @return studMajor - Major of the student
	 */
	public String getStudentMajor() {
		return studMajor;
	}
	
	/**
	 * Implementation of compareTo for class Student
	 */
	public int compareTo(Student aStudent) {
		return (studId - aStudent.studId);
	}
	
	public String toString() {
		return String.format("\n Student Id: %d -- Name: %s -- Major: %s \n", studId, studName, studMajor );
	}
 	
	

}//End of class Student
