package com.bridgelabz.jdbc;

public class Employee {
	int ID, employee_ID, phone_number, DEPARTMENT_ID;
	double basic_pay, deductions, taxable_pay, tax, net_pay, SALARY;
	String GENDER;
	String department, address, NAME, START_DATE;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getEmployee_ID() {
		return employee_ID;
	}

	public void setEmployee_ID(int employee_ID) {
		this.employee_ID = employee_ID;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getDepartment_ID() {
		return DEPARTMENT_ID;
	}

	public void setDepartment_ID(int i) {
		this.DEPARTMENT_ID = i;
	}

	public double getBasic_pay() {
		return basic_pay;
	}

	public void setBasic_pay(double basic_pay) {
		this.basic_pay = basic_pay;
	}

	public double getDeductions() {
		return deductions;
	}

	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}

	public double getTaxable_pay() {
		return taxable_pay;
	}

	public void setTaxable_pay(double taxable_pay) {
		this.taxable_pay = taxable_pay;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getNet_pay() {
		return net_pay;
	}

	public void setNet_pay(double net_pay) {
		this.net_pay = net_pay;
	}

	public double getSALARY() {
		return SALARY;
	}

	public void setSALARY(double string) {
		SALARY = string;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String string) {
		GENDER = string;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", employee_ID=" + employee_ID + ", phone_number=" + phone_number
				+ ", department_ID=" + DEPARTMENT_ID + ", basic_pay=" + basic_pay + ", deductions=" + deductions
				+ ", taxable_pay=" + taxable_pay + ", tax=" + tax + ", net_pay=" + net_pay + ", SALARY=" + SALARY
				+ ", GENDER=" + GENDER + ", department=" + department + ", address=" + address + ", NAME=" + NAME
				+ ", START_DATE=" + START_DATE + "]";
	}
}