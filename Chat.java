import java.util.Scanner;

public class Chat {

    Scanner in = new Scanner(System.in);
    
    //Instance Variables:

    int HP = 10;
    int XP = 0;
    int ATK = 1;
    String fullStatus = "\nHP = " + HP + "\n" + "XP = " + XP + "\n" + "ATK = " + ATK + "\n";

    String wrong = "\nPlease try again!\n";
    

    //testing a new potential method; think there is a problem with while loops and scan.nextLine() methods.
     String Answer;

     public void Choice1(){
    String response = in.nextLine();
    String left = "Left";
    String right = "Right";
    Answer = "Left";
        while(!(Answer.equals(left) || Answer.equals(right))){
        System.out.println(wrong);
        response = in.nextLine();
        }
        if(response.equals("Left")){
            Answer = "Left";
        }
        else{
            if(response.equals("Right")){
                Answer = "Right";
            }
            }
        }
      
     

    //Actual Code Continuation:
    public void checkActive(){
    System.out.println("\nWelcome to my Game! Type something to start!");
    String response = in.nextLine();
        while(response.length() == 0){
            System.out.println("please type something :3");
            response = in.nextLine();
        }
        System.out.println("\n" + "great! lets get started!\n");
        }




    public void phaseOne(){

    System.out.println("Narrator: you have been isekaied to a dungeon world as a player. Your goal for now is to find a way to escape the first floor of the dungeon! In order to do so, you must survive the upcoming challenges!");
    System.out.println("GLHF! type \"ok\" to continue.\n");
    String response = in.nextLine();
    String ok = "ok";
    while(!response.equals(ok)){
        System.out.println(wrong);
        response = in.nextLine();
    }
        System.out.print("\nYour Status is the Following:\n" + fullStatus + "continue by pressing \"alright\" \n");
        response = in.nextLine();
        String alright = "alright";
        while(!response.equals(alright)){
            System.out.println(wrong);
            response = in.nextLine();
        }
            System.out.println("Narrator: you walk for a period of time, nothing special seems to occur. After a while you arrive at a cross road. There are two doors you can go through. Beware! Once you pick a choice, you cannot turn back! What is your choice, player?");
            System.out.println("\ntype \"Left\" for the left door, \"Right\" for the right door\n");
                
        }
      
              
        

    public void phaseTwoR(){
    System.out.println("You walk down a dark pathway...");
    }

    public void phaseTwoL(){
    System.out.println("\nYou get hit by a poisonous arrow!\n");
    HP--;
    System.out.println(fullStatus);
    System.out.println("\nmake a choice:");
    System.out.println("Use 1 XP to recover your lost HP: type \"cure\" \nTIS BUT A SCRATCH(ignore): type \"ignore\"");

    }

    public void Choice2(){
    String response = in.nextLine();
        while(Answer != "cure" && Answer != "ignore"){
            if(response.equals("cure")){
                Answer = "cure";
            }
            else{
                if(response.equals("ignore")){
                    Answer = "ignore";
                }
                else{
                    System.out.println(wrong);
                    response = in.nextLine();
                }
            }
        }
    }

    public void heal(){
        XP--;
        HP++;
        System.out.println("\n" + fullStatus);
    }

    public void ignore(){
        System.out.println("\nYou continue with caution. Just as you approach a barred gate, your vision blurs, the world around you seems to be swirling\n");
        System.out.println("YOU DIED");
    }

    public static void main(String[]args){
        Chat chat = new Chat();
        chat.checkActive();
        chat.phaseOne();
        chat.Choice1();
        if(chat.Answer.equals("Left")){
            chat.phaseTwoL();
        }
        if(chat.Answer.equals("Right")){
            chat.phaseTwoR();
        }
        chat.Choice2();
        if(chat.Answer.equals("cure")){
            chat.heal();
        }
        if(chat.Answer.equals("ignore")){
            chat.ignore();
        }
    }
 }