package Model;

import java.util.ArrayList;

public class Club {
    private String name;
    private double totalSalary;
    private int goalkeepers;
    private int defenders;
    private int midfielders;
    private int attackers;
    private ArrayList<Player> clubPlayers;

    public Club(String name){
        this.totalSalary=0;
        this.clubPlayers=new ArrayList<Player>();
        this.name=name;
    }

    public String getName(){return this.name;}

    public Club getClubFromName(String clubName){
        if(this.name.equalsIgnoreCase(clubName)){
            return this;
        }
        return null;
    }
    public int getGoalkeepers(){return this.goalkeepers;}
    public int getDefenders(){return this.defenders;}
    public int getMidfielders(){return this.midfielders;}
    public int getAttackers(){return this.attackers;}
    public int getTotalPlayers(){return this.attackers+this.midfielders+this.defenders+this.goalkeepers;}
    public Double getTotalSalary(){return this.totalSalary;}
    public ArrayList<Player> getClubPlayers(){return this.clubPlayers;}

    public void setName(String name){this.name=name;}
    public void addGoalkeepers(){ this.goalkeepers++; }
    public void addDefenders(){ this.defenders++; }
    public void addMidfielders(){this.midfielders++;}
    public void addAttackers(){this.attackers++;}
    public void addSalary(double salary){this.totalSalary+=salary;}
    public void addPlayer(Player player){this.clubPlayers.add(player);}

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", totalSalary=" + totalSalary +
                ", goalkeepers=" + goalkeepers +
                ", defenders=" + defenders +
                ", midfielders=" + midfielders +
                ", attackers=" + attackers +
                ", clubPlayers=" + clubPlayers +
                '}';
    }
}
