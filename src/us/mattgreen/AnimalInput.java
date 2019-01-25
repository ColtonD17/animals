
package us.mattgreen;

import java.util.Scanner;


public class AnimalInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the type of animal");
        System.out.println("1 for cat, 2 for dog, 3 for student");
        String animal=keyboard.nextLine();
        int an= Integer.parseInt(animal);
        if (an==1){
            System.out.println("Enter the cat's name:");
            String name=keyboard.nextLine();
            System.out.println("Enter the number of mice it has killed: ");
            String mice=keyboard.nextLine();
            int mices=Integer.parseInt(mice);
            System.out.println("Your cat's name is " + name + " and has killed" + mices + "mice.");
            System.out.println("Meow");
           // Cat();
        }else if(an==2){
            System.out.println("Enter the dogs's name:");
            String name=keyboard.nextLine();
            System.out.println("Is your dog friendly?");
            System.out.println("1 for Yes or 0 for No");
            String friendly=keyboard.nextLine();
            int friend = Integer.parseInt(friendly);
            while (friend !=1 && friend !=0){
            System.out.println("Is your dog friendly?");
            System.out.println("1 for Yes or 0 for No");
            friendly=keyboard.nextLine();
            friend = Integer.parseInt(friendly);
            }
            if (friend ==1){
            System.out.println("Your dog's name is " + name + " and is friendly");
            System.out.println("Woof");}
            else{
            System.out.println("Your dog's name is " + name + " and isn't friendly");
            System.out.println("Growl");}
            //Dog();
        }else if (an==3){
            System.out.println("Enter the student's name: ");
            String name=keyboard.nextLine();
            System.out.println("Enter the student's age: ");
            String age=keyboard.nextLine();
            int years=Integer.parseInt(age);
            System.out.println("Enter what they would like to talk about: ");
            String question=keyboard.nextLine();
            System.out.println("The student's name is "+ name + " and they are "+ years + " years old.");
            System.out.println("And they would like to talk about " + question);
            //Student();
        }else{
            System.out.println("Invalid Number");
        }
        
    }
            
    
    
    
}
