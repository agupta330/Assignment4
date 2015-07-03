import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class UseCommand
{
	public void use(String path,String filename)
	{
	try 
	{
		BufferedReader br2 = new BufferedReader(new FileReader(path+"/"+filename));
		System.out.println("Address of file is "+br2);
		System.out.println("Using the File "+filename);

	} 

	catch (Exception e) 
	{
		e.printStackTrace();
	}
	}	
}
