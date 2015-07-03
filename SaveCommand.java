import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class SaveCommand 
{
	public void save(String path,String filename)
	{
	try 
	{
		BufferedReader br2 = new BufferedReader(new FileReader(path+"/"+filename));
		System.out.println(br2);
		System.out.println("File is Saved "+filename);
		
	} 

	catch (FileNotFoundException e) 
	{
		e.printStackTrace();
	}
		
	}
}
