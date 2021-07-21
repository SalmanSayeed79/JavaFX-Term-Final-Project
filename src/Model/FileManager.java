package Model;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class FileManager {
    public static void readFile(ArrayList players){
        File playerFile=new File("players.txt");
        if(playerFile.exists()){
            try {
                Scanner textScn=new Scanner(playerFile);
                while(textScn.hasNextLine()){
                    String line=textScn.nextLine();
                    String[] lineArray=line.split(",");
                    String name=lineArray[0].trim();
                    String country=lineArray[1].trim();
                    int age=Integer.parseInt(lineArray[2]);
                    double height=Double.parseDouble(lineArray[3]);
                    String club=lineArray[4].trim();
                    String pos=lineArray[5].trim();
                    int num=Integer.parseInt(lineArray[6]);
                    double salary=Double.parseDouble(lineArray[7]);
                    Player temp=new Player(name,country,age,height,club,pos,num,salary);
                    players.add(temp);
                    // System.out.println(temp);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            //Printing the players
//           for(Object a:players){
//               System.out.println(a);
//           }
        }
        else {
            System.out.println("File not found");
        }
    }

    public static void writeFile(ArrayList<Player> players){

        try {
            FileWriter myWriter = new FileWriter("players.txt");
            for(Player a:players){
                myWriter.write(a.getName()+","+a.getCountry()+","+a.getAge()+","+a.getHeight()+","+a.getClub()+","+a.getPosition()+","+a.getNumber()+","+a.getSalary()+"\n");

            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
