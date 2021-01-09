package org.testing.Trigger;

import java.io.IOException;

import org.testing.TestScripts.TC01_Post_TestCase;
import org.testing.TestScripts.TC02_Get_AllData_TestCase;
import org.testing.TestScripts.TC03_Get_WithEndpoints_TestCase;
import org.testing.TestScripts.TC04_Put_TestCase;
import org.testing.TestScripts.TC06_Delete_TestCase;


public class Trigger {

	public static void main(String[] args) throws IOException 
	{
		TC01_Post_TestCase tc1 = new TC01_Post_TestCase();
		tc1.testCase1();
//		TC03_Get_WithEndpoints_TestCase tc3 = new TC03_Get_WithEndpoints_TestCase();
//		tc3.testCase3();
		TC02_Get_AllData_TestCase tc2 = new TC02_Get_AllData_TestCase();
		tc2.testCase2();
//		TC04_Put_TestCase tc4 = new TC04_Put_TestCase();
//		tc4.testCase4();
		TC06_Delete_TestCase tc06= new TC06_Delete_TestCase();
		tc06.testCase6();


	}

}
