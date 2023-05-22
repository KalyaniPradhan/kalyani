package com.nt.interviewPractice;

public class MaxSalaryTechWiseFromDept {
	class Org{
		int dId;
		String dName;
		String tech;
		double salary;
		public Org() {
			
		}
		public Org(int dId,String dName,String tech,double salary) {
			this.dId=dId;
			this.dName=dName;
			this.tech=tech;
			this.salary=salary;
		}
		
		
		public int getdId() {
			return dId;
		}
		public void setdId(int dId) {
			this.dId = dId;
		}
		public String getdName() {
			return dName;
		}
		public void setdName(String dName) {
			this.dName = dName;
		}
		public String getTech() {
			return tech;
		}
		public void setTech(String tech) {
			this.tech = tech;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Org [dId=" + dId + ", dName=" + dName + ", tech=" + tech + ", salary=" + salary + "]";
		}
		
		
	}

	public static void main(String[] args) {


	}

}
