package com.capgemini.lab8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; 
public class CopyDataThread extends Thread{


	public void run()
	{        

		try 
		{
			FileReader input=new FileReader("F:\\SourceFile");
			BufferedReader read=new BufferedReader(input);
			FileWriter output=new FileWriter("F:\\DestinationFile",true);
			int temp;
			while((temp=read.read()) != -1)
			{
				if(temp%10 ==0)
				{
					System.out.println("Copied 10 characters from source file to destination file");
					try
					{
						Thread.sleep(10*50);
					}catch(Exception e)
					{
						e.printStackTrace();
					}
				}
				output.write(temp);
			}
			read.close();
			output.close();
		} 
		catch (Exception e)
		{            
			e.printStackTrace();
		}


	}

}
