package Model;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Model {
    public static ArrayList<Player>players;
    public static ArrayList<Club>clubs;
    private static ArrayList<String> getAllClubNames(ArrayList<Player>players){
        ArrayList<String> clubNames=new ArrayList<String>();
        for(int i=0;i<players.size();i++){
            if(!clubNames.contains(players.get(i).getClub())){
                clubNames.add(players.get(i).getClub());
            }
        }
        return clubNames;
    }
    private static ArrayList<Club> sortPlayersToClubs(ArrayList<Player>players){
        ArrayList<String> clubNames=getAllClubNames(players);
        ArrayList<Club>clubs =new ArrayList<Club>();
        for(int i=0;i<clubNames.size();i++){
            clubs.add(new Club(clubNames.get(i)));
            for(int j=0;j<players.size();j++){
                if(players.get(j).getClub().equalsIgnoreCase(clubNames.get(i))){
                    clubs.get(i).addPlayer(players.get(j));
                    clubs.get(i).addSalary(players.get(j).getSalary());
                    if(players.get(j).getPosition().equalsIgnoreCase("Goalkeeper")){
                        clubs.get(i).addGoalkeepers();
                    }
                    if(players.get(j).getPosition().equalsIgnoreCase("Defender")){
                        clubs.get(i).addDefenders();
                    }
                    if(players.get(j).getPosition().equalsIgnoreCase("Midfielder")){
                        clubs.get(i).addMidfielders();
                    }
                    if(players.get(j).getPosition().equalsIgnoreCase("Attacker")){
                        clubs.get(i).addAttackers();
                    }

                }
            }
        }
        return clubs;

    }
    public static void main(String[] args) {
        players=new ArrayList<Player>();
        FileManager.readFile(players);
        clubs =sortPlayersToClubs(players);

    }

    public static void main() {
        players=new ArrayList<Player>();
        FileManager.readFile(players);
        clubs =sortPlayersToClubs(players);
    }
}
