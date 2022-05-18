package Task_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CompareTwoString {
    
    void compareTwoFiles() throws Exception
    {
        FileReader fileReader1 = new FileReader("D:\\File1.txt");
        FileReader fileReader2 = new FileReader("D:\\File2.txt");
        
        BufferedReader bufferReader1 = new BufferedReader(fileReader1);
        BufferedReader bufferReader2 = new BufferedReader(fileReader2);
        
        String line1 = bufferReader1.readLine();
        String line2 = bufferReader2.readLine();
        boolean comparedValue = false;
        
        while(line1 != null && line2 !=null)
        {
            if(line1.equalsIgnoreCase(line2))
            {
                comparedValue = true;
            } else {
                comparedValue = false;
                break;
            }
            line1 = bufferReader1.readLine();
            line2 = bufferReader2.readLine();
        }
        if (comparedValue)
        {
            FileWriter fileWriter = new FileWriter("D:\\File3.txt");
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            
            String address ="D:\\File1.txt";              
            FileReader fileReader = new FileReader (address);
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String line;
            int lineCount = 0;
            int wordCount = 0;

            while ((line = bufferReader.readLine()) != null) {
                if (line.equals("")) {
                    break;
                }
                else {
                    
                    String words[] = line.split(" ");
                    wordCount += words.length;
                    
                    String word[] = line.split("[!?.:]+");
                    lineCount += word.length;
                    System.out.println(line);
                    bufferWriter.write(line);
                    bufferWriter.newLine();
                }
            }
            
            
            System.out.println("Total word count = "+ wordCount);
            System.out.println("No. of Lines :" + lineCount);
            bufferReader.close();
            
            bufferWriter.write("No of Words is :"+wordCount);
            bufferWriter.newLine();
            
            bufferWriter.write("No of lines is :" +lineCount);
            bufferWriter.newLine();
            
            bufferWriter.flush();
            bufferWriter.close();
          
        }
        
        else {
            System.out.println("Files are not equal.");
        }
        bufferReader1.close();
        bufferReader2.close();
    }
    

}