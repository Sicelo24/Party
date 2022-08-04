
package program6;

/**
 * Sicelo
 */
public class ChildrenParty extends Party{
    private String theme;
    private String supervisor;
    
    public ChildrenParty() {

    }

    public ChildrenParty(String theme, String supervisor, int guest, double cost, String address){
        super(guest,cost,address);
        this.theme = theme;
        this.supervisor = supervisor;
    }
    public double calculateCost(){
        return super.calculateCost() + 200; 
    }

    @Override
    public String displayInvitation(){
        String invite = "";
        invite += "Good day, You have been invited to a party for children\n";
        invite += "There will be "+super.getGuest()+" guest invited\n";
        invite += "Cost per head will be "+super.getCostPerHead()+"\n";
        invite += "This will be held at "+super.getAddress()+"\n";
        invite += "The theme will be "+theme+"\n";
        invite += "and this will be supervised by "+supervisor+"\n";
        return invite;
    }

    public String toString(){
        String str = "";
        str += "Guests = "+super.getGuest()+"\n";
        str += "Cost perhead = "+super.getCostPerHead()+"\n";
        str += "Address = "+super.getAddress()+"\n";
        str += "theme = "+theme+"\n";
        str += "supervisor = "+supervisor+"\n";
        return str;
        }
    }
