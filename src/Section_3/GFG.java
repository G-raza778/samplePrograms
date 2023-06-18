package Section_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GFG {
public static void main(String[] args) throws FileNotFoundException
{
    FileInputStream GFG = null;
    try
    {
	 GFG = new FileInputStream("/home/mayur/GFG.txt");
    }
    catch(Exception e)
    {
    	System.out.println(e.getMessage());
    }
	
}
}
