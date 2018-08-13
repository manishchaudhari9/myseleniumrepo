package com.selenium.testcases.stocksuite;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.selenium.base.BaseTest;
import com.selenium.util.Constants;
import com.selenium.util.DataUtil;

public class BuySellStockTest extends BaseTest{

	@Test(dataProvider="getData",priority=1)
	public void buyOrSellStockTest(Hashtable<String,String> data) throws Exception{
		test.log(Status.INFO, "Starting "+ testName);

		if(DataUtil.isSkip(testName, xls) ||data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO)){
			test.log(Status.SKIP, "Runmode is set to NO");
			throw new SkipException("Runmode is set to NO");
		}		
	    ds.executeKeywords(testName, xls, data);
	}
	
	@Test(dataProvider="getData",dependsOnMethods={"buyOrSellStockTest"},priority=2)
	public void checkTransactionHistoryTest(Hashtable<String,String> data) throws Exception{
		test.log(Status.INFO, "Starting "+ testName);

		if(DataUtil.isSkip(testName, xls) ||data.get(Constants.RUNMODE_COL).equals(Constants.RUNMODE_NO)){
			test.log(Status.SKIP, "Runmode is set to NO");
			throw new SkipException("Runmode is set to NO");
		}		
	    ds.executeKeywords(testName, xls, data);
	}

	
	
	
}
