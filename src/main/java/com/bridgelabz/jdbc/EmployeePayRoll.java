package com.bridgelabz.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeePayRoll {
	public static void main(String[] args) {
        String FETCH = "SELECT * FROM payroll_service";
        ArrayList<Employee> empList = new ArrayList<Employee>();
        EmployeeConfig eConfig = new EmployeeConfig();
        
		PreparedStatement preparedStatement;
        try {
            preparedStatement = eConfig.getConfig().prepareStatement(FETCH);
			ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Employee employee = new Employee();

                employee.setID(resultSet.getInt("ID"));
                employee.setNAME(resultSet.getString("NAME"));
                employee.setEmployee_ID(resultSet.getInt("EMPLOYEE_ID"));
                employee.setPhone_number(resultSet.getInt("Phone_Number"));
                employee.setAddress(resultSet.getString("Address"));
                employee.setDepartment(resultSet.getString("Department"));
                employee.setDepartment_ID(resultSet.getInt("DEPARTMENT_ID"));
                employee.setGENDER(resultSet.getString("GENDER"));
                employee.setBasic_pay(resultSet.getDouble("Basic_Pay"));
                employee.setDeductions(resultSet.getDouble("Deductions"));
                employee.setTaxable_pay(resultSet.getDouble("TaxablePay"));
                employee.setTax(resultSet.getDouble("Tax"));
                employee.setNet_pay(resultSet.getDouble("Net_Pay"));
                employee.setSALARY(resultSet.getDouble("SALARY"));
                employee.setSTART_DATE(resultSet.getString("Start_DATE"));
                empList.add(employee);
            }
            for (Employee i : empList) {
                System.out.println(i.toString());
            }
        }
		catch (SQLException e) {
			System.out.println(e);
           // throw new EmployeeException("invalid column label");
        }
    }
}