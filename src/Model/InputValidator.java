package Model;

import java.util.ArrayList;

public class InputValidator {
    static boolean validateName(ArrayList<Player> players, String name){
        //No two players can have the same name
        for(Player a: players){
            if(a.getName()==name){
                return false;
            }
        }
        return true;
    }
    static boolean validateNumber(ArrayList<Player> players, int number, String club){
        //checking for negative number
        if(number<0){
            return false;
        }
        //checking for number in the same club
        for(Player a: players){
            //club same and number same
            if(a.getClub().equals(club.toLowerCase()) && a.getNumber()==number){
                return false;
            }
        }
        return true;
    }
    static boolean validatePosition(String position){
        //Checking for position
        String[] possiblePosition={"goalkeeper","defender","midfielder","forward"};
        boolean matched=false;
        //checking for number in the same club
        for(String a: possiblePosition){
            //club same and number same
            if(a.equalsIgnoreCase(position)){
                matched=true;
            }
        }
        if(!matched) {
            return false;
        }
        else {
            return true;
        }
    }
}
