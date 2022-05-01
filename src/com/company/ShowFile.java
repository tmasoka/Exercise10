package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        int bajt;

        try{
            fis = new FileInputStream("test123.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            return;
        }

        try{
            do{
                bajt = fis.read();
                if(bajt != -1) System.out.println((char) bajt);
            }while (bajt != -1);
        }catch(IOException e){
            System.out.println("Error Reading The File");
        }
        finally {
            try{
                fis.close();
                System.out.println("File Has been closed");
            }
            catch(IOException e){
                System.out.println("Error Closing The File");
            }
        }

    }
}