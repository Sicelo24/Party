
package program6;

/**
 * Sicelo
 */
public abstract class  Party {
    private int guest;
    private double costPerHead;
    private String address;
    
    public Party(){
    }

    public Party(int guest, double cost, String address){
        this.guest = guest;
        this.costPerHead = cost;
        this.address = address;
    }

    public int getGuest() {
        return guest;
    }

    public double getCostPerHead() {
        return costPerHead;
    }

    public String getAddress() {
        return address;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    public void setCostPerHead(double costPerHead) {
        this.costPerHead = costPerHead;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void show()
    {
        System.out.println("Guest :" +guest);
        System.out.println("Cost Per Head :"+costPerHead);
        System.out.println("Address : " +address);
    }

    @Override
    public String toString() {
        String b = " ";
        b = "Guest : " + guest + ", Cost Per Head : " + costPerHead + ", Address : " + address + '}';
        return b;
    }
    public double calculateCost(){
        return guest*costPerHead; 
    }
    public abstract String displayInvitation();

    }
