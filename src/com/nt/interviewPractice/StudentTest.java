package com.nt.interviewPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Stud implements Comparable<Stud>{
	int roll;
	float marks;
	public Stud(int roll,float marks) {
		this.roll=roll;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return " [ "+roll+"---->"+marks+"]";
	}

	@Override
	public int compareTo(Stud o) {
		System.out.println("In compareTo method.");
		int diff=(int) (this.marks-o.marks);
//If diff==0, both are equal,if<0,ist is smaller etc.		
		return diff;
	}
	

	
}
public class StudentTest {

	public static void main(String[] args) {
	Stud kunal=new Stud(1,90.0f);
	Stud rahul=new Stud(2,87.7f);
	Stud arpit=new Stud(3,98.0f);
	Stud karan=new Stud(4,99.0f);
	Stud[] sa= {kunal,rahul,arpit,karan};
	
	/* u can use below logic or Lamda expression  as per ur choice
	Arrays.sort(sa,new Comparator<Stud>() {

		@Override
		public int compare(Stud o1, Stud o2) {
		
			return -(int)(o1.marks-o2.marks);//- sign for descending order sorting
		}
		
	});
	*/
	Arrays.sort(sa,(o1,o2)->(int)(o1.marks-o2.marks));
	
	System.out.println(Arrays.toString(sa));
	
	if(rahul.compareTo(rahul)<0) {
		System.out.println("Rahul has more marks than that of kunal.");
	}else {
		System.out.println("kunal has more marks.");
	}
	
	

	}

}
