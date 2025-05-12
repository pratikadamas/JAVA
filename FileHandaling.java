import  java.io.File;
import  java.io.FileReader;
import  java.io.FileWriter;
import  java.io.IOException;
//import java.io.*;
import  java.util.Scanner;

public class FileHandaling {
    public static void main(String[] args) {
        System.out.println("CREATE A FILE----\n FILE NAME : ");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        try {
            File myfile = new File(fileName);
            if(myfile.createNewFile()){
                System.out.println("File created");
            }
            else {
                System.out.println("File already exists");
            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println("WRITE A FILE----");
        try {
            FileWriter writer = new FileWriter(fileName, true);
            System.out.println("write something ");
            String str = sc.nextLine();
            writer.write(str);
            writer.close();


        }
        catch (IOException e){
            System.out.println("an error occured");
            System.out.println(e.getMessage());
        }

        System.out.println("READ A FILE----");
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println("an error occured");
            System.out.println(e.getMessage());
        }

    }

}
