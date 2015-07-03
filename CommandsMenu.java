import java.io.IOException;
import java.util.Scanner;

public class CommandsMenu 
{
	public static void main(String[] args) throws IOException
    {		
		System.out.println("Enter the commands :help,use,save,list to see their functionality");
        Scanner in=new Scanner(System.in);
      	String commands=in.next();
      	
		switch (commands)
		{
		
		
		//help command shows the command available
		case "help":
			
			HelpCommand h1=new HelpCommand();
			System.out.println(h1.help());
			System.out.println();
			break;
		
		//use command reads the CSV File into memory	
		case "use":
			
			UseCommand u1=new UseCommand();
			System.out.println("Enter the path");
			String path=in.next();
			System.out.println("Enter file name");
			String filename = in.next();
			u1.use(path,filename);
			System.out.println();
			break;
			
		//save command saves the file 
		case "save":
			 
			SaveCommand s1=new SaveCommand();
			System.out.println("Enter the path");
			String path1=in.next();
			System.out.println("Enter file name");
			String filename1 = in.next();
			s1.save(path1, filename1);
			System.out.println();
			break;
					
		//lists the records available in CSV File	
		case "list":
			
			System.out.flush();
			ListCommand l1=new ListCommand();
			System.out.println("Enter the path");
			String path2=in.next();
			System.out.println("Enter file name");
			String filename2 = in.next();
			//String filename = "SortedData2.csv";
			l1.openFile(path2,filename2);
			System.out.println();
			break;
		
			
		default:
				
				System.out.println("Wrong Option entered.Please enter correct option");
				break;
		}
    }
}
