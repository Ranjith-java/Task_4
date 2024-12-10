package Task_4;

public class Voter {
    public static int voterid;
    public static String votername;
    public static int voterage;

    public Voter(){ //deafult constructor

    }
    public Voter(int vid,String name,int age){ // parameterised constructor
        voterid=vid;
        votername=name;
        voterage =age;
        //try and catch used here to check age
        try{
            if(voterage<18){
                throw new Exception("invalid age for voter");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public String toString(){
        return "ID: "+voterid+" Name: "+votername+" Age:"+voterage;
    }
}
