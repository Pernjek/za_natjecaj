import java.util.Scanner;
 
class isPalindrome
{
   public static void main(String args[])
   {
      String input;
      Scanner sc = new Scanner(System.in);
        
      System.out.println("Enter text here\nto check if palindrome:");
      input = sc.nextLine();

      if (checkIfPalindrome(input))
      {
        System.out.println("\nIs palindrome.\n");
      }
      else {
          System.out.println("\nNot palindrome.\n");
      }
      if ( sc != null ) {
          sc.close ();
      }
      
    }
    public static boolean checkIfPalindrome (String input ) 
    {
        input=input.replaceAll("[^a-zA-Z]", "").toLowerCase();  
        int length = input.length();
    
        for ( int i = 0; i < length; i++ )            
        {
          if (input.charAt(i) != input.charAt(length - i - 1))
          {
              return false;
          }
          
        }
        return true;
   }
}