package com.selenium.testcases.portfoliosuite;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;
import com.selenium.base.BaseTest;
import com.selenium.util.Constants;
import com.selenium.util.DataUtil;

public class LoginTest extends BaseTest {

	public String s = "Test String for debugging";

	@Test(dataProvider = "getData")
	public void loginTest(Hashtable<String, String> data) throws Exception {
		test.log(Status.INFO, "Starting " + testName);
		if (DataUtil.isSkip(testName, xls)
				|| data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO)) {
			test.log(Status.SKIP, "Runmode is set to NO");
			throw new SkipException("Runmode is set to NO");
		}
		ds.executeKeywords(testName, xls, data);
	}
}
