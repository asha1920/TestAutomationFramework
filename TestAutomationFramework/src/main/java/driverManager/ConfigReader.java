package driverManager;

public class ConfigReader {
	private static String testURL;
	public static String getTestURL() 
	{
		return testURL;
	}
	public static void setTestURL(String testURL) 
	{
		ConfigReader.testURL = testURL;
	}

}
