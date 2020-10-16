import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // User can input their city's population and number of cases they have 
      Scanner sc = new Scanner(System.in); 
      int population = sc.nextInt(); 
      int numberOfCases = sc.nextInt(); 
    
    // Next, the program find ths average number of cases the city has
    double averageOfCases = numberOfCases / population;

    //Then, the if else statement will determine how many experts need to be sent out to the city. 

    if (averageOfCases >= 1000)&&(population >= 5000); {

        System.out.println("Send 10 experts"); 

      } else if (averageOfCases >= 3000)&&(population >= 1000); {

        System.out.println("Send 30 experts"); 

      } else (averageOfCases >= population)||(averageOfCases <= population); {

        System.out.println("Contact the main of office of Pandemic Relations");
      }

    // Fianlly a loop is created that counts up from the intial population to determine the spread of the disease/virus. 
      
      while (averageOfCases >= population); 
      {
        System.out.println( "The number of cases will increase by " + averageOfCases);

        averageOfCases++; 
      
      }
    }
  }
}