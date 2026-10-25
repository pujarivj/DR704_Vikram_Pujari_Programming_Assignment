package Test;

import java.util.HashMap;

public class Hashmapdemo {
	public static void main(String[] args) {
	 HashMap<Integer, String> students = new HashMap<>();

	 {
     students.put(101, "Rahul");
     students.put(102, "Amit");
     students.put(103, "Priya");
     students.put(104, "Sneha");
     students.put(105, "Vijay");

  
     System.out.println("Student Details: " + students);

     
     int id = 103;
     System.out.println("Student Name: " + students.get(id));

     
     System.out.println("Student Details Again: " + students);
 }
}
}
