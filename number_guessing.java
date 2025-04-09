import java.util.Scanner;

public class number_guessing{
    public static void main(String[] args) {

        int randomNum=(int)((Math.random()*9)+1);
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the number (between 1 to 9) : ");
        int userNum;
        userNum=sc.nextInt();
        sc.nextLine();

            while(randomNum != userNum){

                System.out.print("\nWrong guess another number (between 1 to 9) : ");
                userNum=sc.nextInt();
                sc.nextLine();
            }
                System.out.println("\nCongrats !!! you guess it correct." +"\n" +"Computer chooses " + randomNum +"\n");
            sc.close();
    }
}