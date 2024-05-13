package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class linktestresponsecode {
String s= "https://www.google.com";
@Test
public void testscript() throws IOException {
	URL ob=new URL(s);
	HttpURLConnection con=(HttpURLConnection)ob.openConnection();
	int responsecode=con.getResponseCode();
	System.out.println(responsecode);
	
}
}