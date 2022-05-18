package Task_FileHandling;

import java.io.BufferedWriter; 
import java.io.FileWriter;
import java.io.IOException; 
import java.util.InputMismatchException;
import java.util.Scanner;

public class  FileWriterEg {
    Scanner scan = new Scanner(System.in);
    
    void getNumberOfLines() throws IOException    
    {
        Integer numberOfLines = 0;
        String sentences;
        System.out.println("Enter the number of lines needed :");
        try {
            numberOfLines = scan.nextInt();
            scan.nextLine();
        }
         catch(InputMismatchException inputmismatchexception) {
            System.out.println("Enter Integer values");
        }         
         
        FileWriter  fileWriter = new FileWriter("D:\\fileWriter.txt");
        BufferedWriter bufferWriter = new BufferedWriter(fileWriter); 
        System.out.println("Enter the content");
        for(int line = 0; line < numberOfLines; line++)
        {
            sentences = scan.nextLine();
            bufferWriter.write(sentences);
            bufferWriter.newLine();
        }
        //to get instance memory
        bufferWriter.flush();
        bufferWriter.close();        
    }
}