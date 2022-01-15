import java.util.Scanner;


public class Game {

    private static Scanner in = new Scanner(System.in);
    private static int ans;
    private static boolean status = false;
    private static String error = "Error, read the message again then respond";
    private static int level = 0;
    private static int complete = 0;

    public static int RandomizeInt(){
        int result = (int)(Math.random() * 1000 + 1);
        return result;
    }

    public static void stage0(){
        System.out.println("Welcome! This is a math game with a few stages(haven't finished yet) where you have to memorize the answer of the previous question to pass later stages! Have fun!");
        System.out.println("\nYour starting number is " + Game.RandomizeInt() + " and will be identified by X" + "\n");
        System.out.println("Type an integer to start!");
        Game.ans = in.nextInt();
        Integer result = Game.ans;
        while(Game.status != true){
            if(result.toString().length() != 0){
                Game.status = true;
            }
            else{
                System.out.println(error);
                Game.ans = in.nextInt();
            }
        }
    }

    public static void stageE(){
        System.out.println("\nGame Over! You completed " + complete + " stages!");
    }

    public static void stage1(){
        int a = RandomizeInt();
        int b = RandomizeInt();
        int key = 0;
        System.out.println("Stage 1 \n Q:what is the answer to X PLUS " + a + " and DIVIDED by " + b + "?");
        key = Game.ans + a / b;
        System.out.println("anwser is " + key); //delete this
        System.out.println("State your answer:");
        Game.ans = in.nextInt();
        while(Game.level == 1){
            if(Game.ans == key){
                System.out.println("CORRECT! The answer is " + key);
                Game.complete++;
                Game.level = 0;
            }
            if(Game.ans != key){
                Game.level = 0;
                System.out.println("Wrong!");
                Game.status = false;
            }
        }
    }

    public static void main(String[]args){
        Game.stage0();
        while(status != false){
            Game.level = 1; //change to randomizer * max number of stages
            if(Game.level == 1){
                Game.stage1();
            }
            // add more if-stages
        }
        Game.stageE();
    }
}
