import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is Mr. Pickles.");

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
   while (((happiness < 15) && (hunger < 10)) && ((energy > 0) && (choice!= 5))) {
    
           
     
        // TODO 2:
         // Display happiness, hunger, and energy.
         System.out.println("happiness: " + happiness);
         System.out.println("hunger: " + hunger);
         System.out.println("energy: " + energy);
      

         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
          
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
         if (choice == 1) {
         hunger -= 6;
         happiness -= 3;
         energy -= 2;
         System.out.println("you fed the thing, awesome"); 
    } else if (choice == 2) {
         energy -= 10;
         happiness += 10;
         System.out.println("you both tried to invent a new shape. it tired the thing");
         } else if (choice == 3) {
         energy += 75;
         hunger += 2;
         System.out.println("zzzzzzzzzzzz");
         } else if (choice == 4) {
         energy -= 15;
         hunger += 2;
         System.out.println(" it hated it"); 
         }
         
          }
       
     
         


      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      if (happiness >= 15) {
      System.out.println("thing is sufficiently happy");
      } 
        else if (hunger >= 10){
      System.out.println("thing got too hungry");
      }
      else if (energy <= 0) {
      System.out.println("thing ran out of energy");
      }
      else if (choice == 5) {
      System.out.println("goodbye");
      }
      input.close();
   }
}