package Model;

import java.util.Locale;

public class Player {
    private String name;
    private String country;
    private int age;
    private double height;
    private String club;
    private String position;
    private int number;
    private double salary;

    public Player(String name, String country,int age ,double height, String club, String pos,int number , double salary){
        this.name=name;
        this.country=country;
        this.age=age;
        this.height=height;
        this.club=club;
        this.position=pos;
        this.number=number;
        this.salary=salary;
    }
    public String toString(){
        String paddedName=String.format("%30s",this.name);
        String paddedCountry=String.format("%10s",this.country);
        String paddedClub=String.format("%10s",this.club);
        String paddedAge=String.format("%5s",this.age);
        String paddedHeight=String.format("%5s",this.height);
        String paddedPosition=String.format("%10s",this.position);
        String paddedNumber=String.format("%5s",this.number);
        String paddedSalary=String.format("%10s+ $",this.salary);

        return (paddedName+" "+paddedCountry+" "+paddedAge+" "+paddedHeight+" "+paddedClub+" "+paddedPosition+" "+paddedNumber+" "+paddedSalary);
        //return "Player name : "+this.name+"\n"+"Player country :"+this.country+"\n"+"Player age : "+this.age+"\n"+"Player height : "+this.height+"\n"+"Player club : "+this.club+"\n"+"Player position : "+this.position+"\n"+"Player number : "+this.number+"\n"+"Player salary : "+this.salary;
    }

    public String getName(){
        return this.name;
    }
    public String getCountry(){
        return this.country;
    }
    public int  getAge(){
        return this.age;
    }
    public double getHeight(){
        return this.height;
    }
    public String getClub(){
        return this.club;
    }
    public String getPosition(){
        return this.position;
    }
    public int getNumber(){
        return this.number;
    }
    public double getSalary(){
        return this.salary;
    }


}
