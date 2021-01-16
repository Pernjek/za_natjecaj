import java.util.Scanner;
 
class isPalindrome
{
   public static void main(String args[])
   {
      String input;
      Scanner sc = new Scanner(System.in);
        
      System.out.println("Enter text here:");
      input = sc.nextLine();

      if (isPalindrome(input))
      {
        System.out.println("\nIs palindrome.\n");
      }
      else {
          System.out.println("\nNot palindrome.\n");
      }
      
      
    }
    public static boolean isPalindrome (String input ) 
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