package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) throws IOException{
      FileReader fr= new FileReader("List.txt");
      BufferedReader br= new BufferedReader(fr);

      String str;

      while((str = br.readLine()) != null)
      {
          System.out.println(str);
      }
        }
}

/*class Main{
    public static void main(String[] args) throws IOException{
    DataManagement dm = new DataManagement();
    dm.readData();
    dm.writeDataToFile();
    dm.readDataFromFile();*/

    //}
//}
