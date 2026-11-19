package Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Que2 {
    public static void main(String[] args) {
        try{
           FileReader fileReader = new FileReader("Volunteer.txt");
           fileReader.read();
           fileReader.close(); 
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }catch (IOException e){
            System.out.println("File Me Input Output Kuch Nahi Kar Sakte Hai");
        }
    }
}