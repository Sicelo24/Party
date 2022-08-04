
package program6;

/**
 * Sicelo
 */
import java.util.Scanner;

public class PartyUserControl {
    Scanner sc = new Scanner(System.in);
    Party parties[] = new Party[20];
    int numberOfParties = 0;
    int count =1;
    
    public PartyUserControl(){
        parties[0] = new DinnerParty("Pizza", 20, 40.0,"Romans Pizza") ;
        parties[1] = new DinnerParty("Picnic", 35, 50.0,"Milpark") ;
        parties[2] = new ChildrenParty("Halloween", "Sicelo", 10, 25.0, "Woodbridge") ;
        parties[3] = new ChildrenParty("Candy", "Rick", 30, 30.0, "Tygerhof") ;
        parties[4] = new DinnerParty("Braai", 30, 40.0, "Seamount") ;
        numberOfParties = 5;
    }
    
    private int menu(){
        int choice;
        System.out.println("1 : Add party");
        System.out.println("2 : Change cost per head for Dinner parties");
        System.out.println("3 : Display invitations");
        System.out.println("4 : Display all parties");
        System.out.println("5 : Exit");
        choice = sc.nextInt();
        return choice;
    }
    
    private void add(){   
        //int choice;
        System.out.println("Under Construction");
        System.out.println("To be completed with next iteration");
        System.out.println("------------------------");    
    }
        
    private void changeDinnerCostPerHead(){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the party?");
        String dinnerchoice = sc.nextLine();
        System.out.println("Enter new cost per head");
        double costperhead = sc.nextDouble();
            
        for (int i = 0; i <numberOfParties; i++) {
            if(parties[i] instanceof DinnerParty) {
                DinnerParty dinnerparty = (DinnerParty) parties[i];
                if (dinnerparty.getDinnerChoice().equals(dinnerchoice)){
                    dinnerparty.setCostPerHead(parties[i].getCostPerHead() + costperhead);
                    System.out.println("Cost per head increased.");
                }
            }
        }
    }
                
    private void displayInvites(){
        System.out.println("All invites");
        System.out.println("-----------------------");
        for (int i = 0; i < numberOfParties; i++){
            System.out.println(parties[i].displayInvitation());
        }
    }
        
    private void displayParty(){
        System.out.println("Parties");
        System.out.println("-----------------------");
        
        for (int i = 0; i < numberOfParties; i++){
            System.out.println(parties[i].toString());       
        }   
    }
    
    public int menuControl(){
        int select;
        do{
        select = menu();
            switch (select) {
               case 1:
                   add();
                   break;
               case 2:
                   changeDinnerCostPerHead();
                   break;
               case 3:
                   displayInvites();
                   break;
               case 4:
                   displayParty();
                   break;
               case 5:
                   System.out.println("Exit");
                   break;       
           }
       }while (select!=5);
        return 0;
    }                         
}
