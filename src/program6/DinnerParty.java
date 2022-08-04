
package program6;

/**
 * Sicelo
 */
public class DinnerParty extends Party {
    private String dinnerChoice;
       
    public DinnerParty(){
    }
    
    public DinnerParty(String dinner, int guest, double cost, String address){
        super (guest, cost, address);
        this.dinnerChoice = dinner;
    }

    public String getDinnerChoice() {
        return dinnerChoice;
    }
    
    public double calculateCost(){
        return super.calculateCost() + 100;
    }

    public String displayInvitation(){
        String invite = "";
        invite += "Hello, You have been invited to a party for children\n";
        invite += "There will be "+super.getGuest()+" guest invited\n";
        invite += "Cost per head will be "+super.getCostPerHead()+"\n";
        invite += "This will be held at "+super.getAddress()+"\n";
        invite += "We will be having your dinner choice "+dinnerChoice+"\n";
        return invite;
    }
    public String toString(){
        String str = "";
        str += "Guests = "+super.getGuest()+"\n";
        str += "Cost perhead = "+super.getCostPerHead()+"\n";
        str += "Address = "+super.getAddress()+"\n";
        str += "Dinner choice "+dinnerChoice+"\n";
        return str;
    }
}




