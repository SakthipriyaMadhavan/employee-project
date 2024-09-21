package com.model;

public class Employee {
	
		private int emp_id;
		private String emp_name;
		private String email;
		private double salary;
		private String doj;
		private int bonus;
		public int getEmp_id() {
			return emp_id;
		}
		public void setEmp_id(int emp_id) {
			this.emp_id = emp_id;
		}
		public String getEmp_name() {
			return emp_name;
		}
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDoj() {
			return doj;
		}
		public void setDoj(String doj) {
			this.doj = doj;
		}
		public int getBonus() {
			return bonus;
		}
		public void setBonus(int bonus) {
			this.bonus = bonus;
		}
		@Override
		public String toString() {
			return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", email=" + email + ", salary=" + salary
					+ ", doj=" + doj + ", bonus=" + bonus + ", getEmp_id()=" + getEmp_id() + ", getEmp_name()="
					+ getEmp_name() + ", getEmail()=" + getEmail() + ", getSalary()=" + getSalary() + ", getDoj()="
					+ getDoj() + ", getBonus()=" + getBonus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
		public Employee(String emp_name, String email, double salary, String doj, int bonus) {
			super();
			this.emp_name = emp_name;
			this.email = email;
			this.salary = salary;
			this.doj = doj;
			this.bonus = bonus;
		}
		public Employee()
		{
			
		}

		
		
	}

