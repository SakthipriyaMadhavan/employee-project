package client;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.util.DbConnection;

import daoImpl.EmployeeDaoImpl;

public class ClientTest {

	
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			EmployeeDAO employee = new EmployeeDaoImpl();
			int c=1;
			while(c!=0)
			{
			System.out.println("1.insert 2.delete 3.update 4.getparticular_employee 5.employee_list");
			System.out.println("enter the choice:");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
			System.out.println("Enter the Emp name");
			 String name=sc.nextLine();
			 sc.nextLine();
			 System.out.println("Enter the Emp email");
			 String email=sc.nextLine();
			 System.out.println("Enter the Emp salary");
			double salary=sc.nextDouble();
			sc.nextLine();
			 System.out.println("Enter the Emp DOJ DD/MM/YYYY");
			 String doj=sc.nextLine();
			  System.out.println("Enter the Emp bonus");
			 int bonus=sc.nextInt();
			 Employee e = new Employee(name, email, salary, doj, bonus);
			 employee.createEmployee(e);
			 break;
			 
			case 2:
				System.out.println("enter the id for deletion");
				int employeeId=sc.nextInt();
				employee.deleteEmployeeById(employeeId);
				break;
				
			case 3:	
				System.out.println("enter the updated email");
				String newmail=sc.nextLine();
				sc.nextLine();
				System.out.println("enter the id for update");
				int employeeid=sc.nextInt();
				employee.updateEmployeeEmailById(newmail,employeeid);
				break;
				
			case 4:	
			 System.out.println("Enter the emp_id");
			 int emp_id=sc.nextInt();
			System.out.println(employee.getEmployeeById(emp_id));
			break;
			
			case 5:
			List<Employee> emplist=employee.getAllEmployeeInfo();
			for(Employee emp1 : emplist)
			{
				System.out.println(emp1);
			} 
			break;
		
			
			}
			System.out.println("if you want to edit enter 1 or to exit 0:");
			c=sc.nextInt();
			}
		}
	}


