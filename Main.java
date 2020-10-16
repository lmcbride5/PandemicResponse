import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // User can input their cities population and number of cases they have 
      int population = sc.nextInt(); 
      int numberOfCases = sc.nextInt(); 
    
    // Next, the program find ths average number of cases the city has
    double averageOfCases = numberOfCases / population;

    //Then. 

    if (averageOfCases >= 1000);
      {
        System.out.println("Send 10 experts"); 
      }
    else (averageOfCases >= 3000);
      { 
        System.out.println("Send 30 experts"); 
      }
  }
}