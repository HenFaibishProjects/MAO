package com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv;



import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Mao.BackEndDev.datalayer.DbConnections.JdbcDbData;


public class DropTables extends JdbcDbData {

	public DropTables() throws ClassNotFoundException, SQLException {
		super();

	}

	public static String dropEmployees = "DROP TABLE employee";
	public static String dropArivedFrom = "DROP TABLE arivedFrom";
	public static String dropSalaryType = "DROP TABLE salaryType";
	public static String dropClassLevel = "DROP TABLE classLevel";
	public static String dropDegrees = "DROP TABLE degree";
	public static String dropmatype = "DROP TABLE maTypeTable";
	public static String dropMemberType = "DROP TABLE memberType";                
	public static String dropDiploma = "DROP TABLE diploma";                
	public static String dropdefaultaddress = "DROP TABLE defaultaddress";               
	public static String dropMaTypeTable = "DROP TABLE maTypeTable";               
	public static String dropSalType = "DROP TABLE salType";                
	public static String dropSalary = "DROP TABLE salary";               
	public static String dropSupplier = "DROP TABLE supplier";               
	public static String dropdaysoftheweek = "DROP TABLE daysoftheweek";               
	public static String dropcurency = "DROP TABLE currency";               
	public static String droplevel = "DROP TABLE level";               
	public static String dropCustomers = "DROP TABLE customers";
	public static String dropPayment = "DROP TABLE PaymentMembership";
	public static String dropInsurance = "DROP TABLE insurance";
	public static String dropindices = "DROP TABLE indices";
	public static String dropItemsColors = "DROP TABLE itemtscolors ";
	public static String dropLenthsize = "DROP TABLE lenthsize ";
	public static String droSsizeItems = "DROP TABLE  sizesitems";
	public static String dropItems = "DROP TABLE Items";




	public static void doit() throws Exception {

		if (checkifTableExists("employee")==1)  {
			executeTheQuerty(dropEmployees).executeUpdate();
			System.out.println("employees deleted"); }

		if (checkifTableExists("supplier")==1)  {
			executeTheQuerty(dropSupplier).executeUpdate();
			System.out.println("supplier deleted"); }

		if (checkifTableExists("customers")==1)  {
			executeTheQuerty(dropCustomers).executeUpdate();
			System.out.println("customers deleted"); }

		if (checkifTableExists("arivedFrom")==1)  {
			executeTheQuerty(dropArivedFrom).executeUpdate();
			System.out.println("arivedFrom deleted"); }

		if (checkifTableExists("salaryType")==1)  {
			executeTheQuerty(dropSalaryType).executeUpdate();
			System.out.println("salaryType deleted"); }

		if (checkifTableExists("classLevel")==1)  {
			executeTheQuerty(dropClassLevel).executeUpdate();
			System.out.println("classLevel deleted"); }

		if (checkifTableExists("degree")==1)  {
			executeTheQuerty(dropDegrees).executeUpdate();
			System.out.println("degrees deleted"); }

		if (checkifTableExists("maTypeTable")==1)  {
			executeTheQuerty(dropmatype).executeUpdate();
			System.out.println("maTypeTable deleted"); }

		if (checkifTableExists("diploma")==1)  {
			executeTheQuerty(dropDiploma).executeUpdate();
			System.out.println("diploma deleted"); }

		if (checkifTableExists("defaultaddress")==1)  {
			executeTheQuerty(dropdefaultaddress).executeUpdate();
			System.out.println("defaultaddress deleted"); }

		if (checkifTableExists("salType")==1)  {
			executeTheQuerty(dropSalType).executeUpdate();
			System.out.println("salType deleted"); }

		if (checkifTableExists("salary")==1)  {
			executeTheQuerty(dropSalary).executeUpdate();
			System.out.println("salary deleted"); }

		if (checkifTableExists("daysoftheweek")==1)  {
			executeTheQuerty(dropdaysoftheweek).executeUpdate();
			System.out.println("daysoftheweek deleted"); }

		if (checkifTableExists("currency")==1)  {
			executeTheQuerty(dropcurency).executeUpdate();
			System.out.println("curency deleted"); }

		if (checkifTableExists("memberType")==1)  {
			executeTheQuerty(dropMemberType).executeUpdate();
			System.out.println("memberType deleted"); }

		if (checkifTableExists("PaymentMembership")==1)  {
			executeTheQuerty(dropPayment).executeUpdate();
			System.out.println("payment deleted"); }

		if (checkifTableExists("insurance")==1)  {
			executeTheQuerty(dropInsurance).executeUpdate();
			System.out.println("insurance deleted"); }


		if (checkifTableExists("indices")==1)  {
			executeTheQuerty(dropindices).executeUpdate();
			System.out.println("indices deleted"); }

		if (checkifTableExists("itemtscolors")==1)  {
			executeTheQuerty(dropItemsColors).executeUpdate();
			System.out.println("ItemsColors deleted"); }


		if (checkifTableExists("lenthsize")==1)  {
			executeTheQuerty(dropLenthsize).executeUpdate();
			System.out.println("lenthsize deleted"); }



		if (checkifTableExists("sizesitems")==1)  {
			executeTheQuerty(droSsizeItems).executeUpdate();
			System.out.println("sizeItems deleted"); }

		if (checkifTableExists("Items")==1)  {
			executeTheQuerty(dropItems).executeUpdate();
			System.out.println("Items deleted"); }

	}
}
