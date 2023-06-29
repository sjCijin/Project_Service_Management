package dataproviderutility;

import org.testng.annotations.DataProvider;

public class DataProviderUtility {
	@DataProvider(name="getdataFromDataProvider")
	
	public Object[][] getdataFromDataProvider()
	{
		return new Object[][] {{"test 1","test 2","test 3"}};
	}

}
