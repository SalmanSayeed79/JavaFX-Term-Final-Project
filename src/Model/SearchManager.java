package Model;

import java.util.ArrayList;
import java.util.Locale;

public class SearchManager {
    public static Player searchName(ArrayList<Player> players,String ...v){
        for(Player a : players){
            for(String name:v){
                if(a.getName().equalsIgnoreCase(name)){
                    return a;
                }
            }
        }
        return null;

    }
    public static ArrayList<Player> searchCountry(ArrayList<Player> players,String country){
        ArrayList<Player> matchedPlayers=new ArrayList<Player>();
        for(Player a : players){
            if(a.getCountry().equalsIgnoreCase(country.toLowerCase())){
                matchedPlayers.add(a);
            }
        }
        return matchedPlayers;

    }
    public static ArrayList<Player> searchClub(ArrayList<Player> players,String club){
        ArrayList<Player> matchedPlayers=new ArrayList<Player>();
        for(Player a : players){
            if(a.getClub().equalsIgnoreCase(club)){
                matchedPlayers.add(a);
            }
        }
        return matchedPlayers;

    }
    public static ArrayList<Player> searchPosition(ArrayList<Player> players,String position){
        ArrayList<Player> matchedPlayers=new ArrayList<Player>();
        for(Player a : players){
            if(a.getPosition().equalsIgnoreCase(position.toLowerCase())){
                matchedPlayers.add(a);

            }
        }
        return matchedPlayers;
    }
    public static ArrayList<Player> searchSalary(ArrayList<Player> players,double lower,double upper){
        ArrayList<Player> matchedPlayers=new ArrayList<Player>();
        for(Player a : players){
            if(a.getSalary()<=upper &&a.getSalary()>=lower){
                matchedPlayers.add(a);
            }
        }
        return matchedPlayers;

    }
    static void searchCountryPlayerCount(ArrayList<Player> players,String country){
        boolean foundMatch=false;
        int count=0;
        for(Player a : players){
            if(a.getCountry().equals(country)){
                count++;
                foundMatch=true;
            }
        }
        System.out.println(count);
        if(!foundMatch) {
            System.out.println("No player found!");
        };

    }


    static void searchClubMaxSalary(ArrayList<Player> players,String club){
        boolean foundMatch=false;
        ArrayList<Player> playersInClubs=new ArrayList<Player>();
        int count=0;
        for(Player a : players){
            if(a.getClub().equals(club.toLowerCase())){
                playersInClubs.add(a);
                foundMatch=true;
            }
        }

        if(!foundMatch) {
            System.out.println("No player found!");
        }
        else{
            ArrayList<Player> maxSalaryPlayer=new ArrayList<>();
            double maxSalary=playersInClubs.get(0).getSalary();
            for(Player a:playersInClubs){
                if(a.getSalary()>maxSalary){
                    maxSalary=a.getSalary();
                }
            }
            for(Player a:playersInClubs){
                if(a.getSalary()==maxSalary){
                    maxSalaryPlayer.add(a);
                    System.out.println(a);
                }
            }
        }

    }

    static void searchClubMaxAge(ArrayList<Player> players,String club){
        boolean foundMatch=false;
        ArrayList<Player> playersInClubs=new ArrayList<Player>();
        int count=0;
        for(Player a : players){
            if(a.getClub().equals(club.toLowerCase())){
                playersInClubs.add(a);
                foundMatch=true;
            }
        }

        if(!foundMatch) {
            System.out.println("No player found!");
        }
        else{
            ArrayList<Player> maxAgePlayer=new ArrayList<>();
            double maxAge=playersInClubs.get(0).getAge();
            for(Player a:playersInClubs){
                if(a.getAge()>maxAge){
                    maxAge=a.getAge();
                }
            }
            for(Player a:playersInClubs){
                if(a.getAge()==maxAge){
                    maxAgePlayer.add(a);
                    System.out.println(a);
                }
            }
        }

    }
    static void searchClubMaxHeight(ArrayList<Player> players,String club){
        boolean foundMatch=false;
        ArrayList<Player> playersInClubs=new ArrayList<Player>();
        int count=0;
        for(Player a : players){
            if(a.getClub().equals(club.toLowerCase())){
                playersInClubs.add(a);
                foundMatch=true;
            }
        }

        if(!foundMatch) {
            System.out.println("No player found!");
        }
        else{
            ArrayList<Player> maxHeightPlayer=new ArrayList<>();
            double maxHeight=playersInClubs.get(0).getHeight();
            for(Player a:playersInClubs){
                if(a.getHeight()>maxHeight){
                    maxHeight=a.getHeight();
                }
            }
            for(Player a:playersInClubs){
                if(a.getHeight()==maxHeight){
                    maxHeightPlayer.add(a);
                    System.out.println(a);
                }
            }
        }

    }

    static void getTotalSalary(ArrayList<Player> players,String club){
        boolean foundMatch=false;
        ArrayList<Player> playersInClubs=new ArrayList<Player>();
        int count=0;
        for(Player a : players){
            if(a.getClub().equals(club.toLowerCase())){
                playersInClubs.add(a);
                foundMatch=true;
            }
        }

        if(!foundMatch) {
            System.out.println("No player found!");
        }
        else{
            double totalSalary=0;
            for(Player a : playersInClubs){
                totalSalary+=a.getSalary();
            }
            String paddedSalary=String.format("%15s",(totalSalary*52));
            //System.out.println("Total yearly salary of club : "+paddedSalary);
            System.out.printf("%25f\n",totalSalary*52);
        }

    }


    //use this to check if club has more than 5 players
    static int getClubTotalPlayers(ArrayList<Player> players,String club){
        int count=0;
        for(Player a : players){
            if(a.getClub().equals(club.toLowerCase())){
                count++;
            }
        }
        return count;
    }

    //new function
    static void sortWithCountry(ArrayList<Player> players,String country){
        ArrayList<Object> clubs=new ArrayList<>();
        String[] allClubs=new String[60];
        for(Player a:players){
            if(!clubs.contains(a.getClub())){
                clubs.add(a.getClub());
            }

        }
        for(int i=0;i<clubs.size();i++){
            System.out.println(clubs.get(i));
        }
//      
    }
}
