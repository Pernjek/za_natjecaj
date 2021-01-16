import java.util.Random;
import java.util.Scanner;


public class KamenSkarePapir {    
    
    public static String generateRandomChoice ( Random random ) {
        int wordNumber;
        wordNumber = random.nextInt ( 3 ) + 1 ;
        String computerRandomChoice = "";

        if( wordNumber == 1 ) {
            computerRandomChoice = "kamen";
        }   else if ( wordNumber == 2 ) {
            computerRandomChoice = "skare";
        }   else if ( wordNumber == 3 ) {
            computerRandomChoice = "papir";
        }
        System.out.println( "Kompjuter je odabrao svoj izbor." );
        return computerRandomChoice;
    }

    public static void showMenu (  ) {
        System.out.println( "Izaberite:\n1. kamen\n2. skare\n3. papir\nZa izlazak iz igre upisite: kraj" );
    }

    public static String getUserChoice( Scanner scanner ) {
        String userChoice;
        
        System.out.println( "Vas izbor?" );
        userChoice = scanner.nextLine();
        return userChoice;
    }

    public static String chooseWinner( String computerRandomChoice, String userChoice ) {
        String winner = "Nema pobjednika";
        String finalMessage;
        

        if ( computerRandomChoice.equals( "kamen" ) && userChoice.equalsIgnoreCase( "skare" ) ) {
            winner = "Bod za kompjuter";
        } else if ( userChoice.equalsIgnoreCase( "kamen" ) && computerRandomChoice.equals( "skare" ) ){
            winner = "Bod za Vas!";
        }
        if ( computerRandomChoice.equals( "skare" ) && userChoice.equalsIgnoreCase( "papir" ) ) {
            winner = "Bod za kompjuter";
        } else if ( userChoice.equalsIgnoreCase( "skare" ) && computerRandomChoice.equals( "papir" ) ){
            winner = "Bod za Vas!";
        }
        if ( computerRandomChoice.equals( "papir" ) && userChoice.equalsIgnoreCase( "kamen" ) ) {
            winner = "Bod za kompjuter";
        } else if ( userChoice.equalsIgnoreCase( "papir" ) && computerRandomChoice.equals( "kamen" ) ){
            winner = "Bod za Vas!";

        }

        finalMessage = winner;
        
        
        if ( finalMessage.equals( "Nema pobjednika\n()" ) ){
            finalMessage = "Nema pobjednika";
            return finalMessage;
        }else {
            return finalMessage;
        
        
        }

    }
    public static void main ( String [ ] args ) {
        
        Random random = new Random( );
        Scanner scanner = new Scanner( System.in );
        String computerRandomChoice;
        String userChoice = "";
        String winner;

        int userScore = 0;
        int computerScore = 0;

        
        while ( true ) 
        {
            showMenu();
            computerRandomChoice = generateRandomChoice ( random );
            userChoice = getUserChoice ( scanner );
            winner = chooseWinner(computerRandomChoice, userChoice);
            
            if (userChoice.equals("kraj")) {
                System.out.println("\nVi:" + userScore );
                System.out.println("Kompjuter:" + computerScore + "\n" );
                System.exit(0);
            }
            
            System.out.println("Odabrali ste " + userChoice + "\nKompjuter je odabrao " + computerRandomChoice );
            System.out.println( winner + "\n" );

            if( winner.equals( "Bod za kompjuter" ) ) {
                computerScore = computerScore + 1;
            } else if( winner.equals( "Bod za Vas!" ) ) {
                userScore = userScore + 1;
            }
            
            
            System.out.println("Vi:" + userScore );
            System.out.println("Kompjuter:" + computerScore + "\n" );

        }


        
        
    }

}  