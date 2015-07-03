import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ListCommand
{
	public void openFile(String path,String filename) throws IOException
	{
		try
		{
	    String line ;
	    BufferedReader br2 = new BufferedReader(new FileReader(path+"/"+filename));
	   
	    while ((line = br2.readLine()) != null) 
	    {
  	     	System.out.println(line);
	    }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 }
}
