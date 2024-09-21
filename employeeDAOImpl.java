package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.EmployeeDAO;
import com.model.Employee;
import com.util.DbConnection;

public class EmployeeDaoImpl implements EmployeeDAO{
	public void createEmployee(Employee employee){
		Connection con= DbConnection.connectWithDb();
		String sql = "insert into employees(employee_name,email,salary,doj,bonus)values(?,?,?,?,?)";
		try {
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, employee.getEmp_name());
		pst.setString(2, employee.getEmail());
		pst.setDouble(3, employee.getSalary());
		pst.setString(4,employee.getDoj());
		pst.setInt(5, employee.getBonus());
		int ans=pst.executeUpdate();
		if(ans!=0)
			System.out.println("created");
		else
			System.out.println(" not created");
		
		
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public List<Employee> getAllEmployeeInfo()
	{
		List<Employee> emplist = new ArrayList<>();
		Connection con=DbConnection.connectWithDb();
		String sql="select * from employees";
		try {
			PreparedStatement pst =con.prepareStatement(sql);
			 ResultSet rs=pst.executeQuery();
			 
			 while(rs.next())
				{
				 Employee e1=new Employee();
					int empid=rs.getInt("employee_id");
					String empname=rs.getString("employee_name");
					String email=rs.getString("email");
					int salary=rs.getInt("salary");
					String doj=rs.getString("doj");
					int bonus=rs.getInt("bonus");
					
					e1.setEmp_id(empid);
					e1.setEmp_name(empname);
					e1.setEmail(email);
					e1.setSalary(salary);
					e1.setDoj(doj);
					e1.setBonus(bonus);
					
					emplist.add(e1);
				}
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		return emplist;
	}
	public Employee getEmployeeById(int employeeId)
	{
		Employee e1=new Employee();
		Connection con=DbConnection.connectWithDb();
		String sql="select * from employees where employee_id=?";
		try {
			PreparedStatement pst =con.prepareStatement(sql);
			pst.setInt(1,employeeId);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				
				int empid=rs.getInt("employee_id");
				String empname=rs.getString("employee_name");
				String email=rs.getString("email");
				int salary=rs.getInt("salary");
				String doj=rs.getString("doj");
				int bonus=rs.getInt("bonus");
				
				e1.setEmp_id(empid);
				e1.setEmp_name(empname);
				e1.setEmail(email);
				e1.setSalary(salary);
				e1.setDoj(doj);
				e1.setBonus(bonus);
				
				
			}
		}
	 catch (SQLException e) {
		System.out.println(e);
	}
		return e1;
	}
	public void updateEmployeeEmailById(String newmail,int employeeId)
	{
		Connection con=DbConnection.connectWithDb();
		String sql="update employees set email=? where employee_id=?";
		try
		{
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,newmail);
			pst.setInt(2,employeeId);
			int result=pst.executeUpdate();
			if(result==1)
				System.out.println("updated");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
	
	public void deleteEmployeeById(int employeeId)
	{
		Connection con=DbConnection.connectWithDb();
		String sql="delete from employees where employee_id=?";
		try
		{
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1,employeeId);
			int result=pst.executeUpdate();
			if(result==1)
				System.out.println("deleted");
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		
	}
	
	

	
	

}

