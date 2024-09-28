package restaurant.project;

import java.util.ArrayList;
import java.util.List;

public class Receipt {

    private final int recieptId;
    private List<Mains> mainsSelected;
    private List<Sides> sidesSelected;
    private List<Drinks> drikesSelected;
    private int feesTotal;

    public Receipt(int recieptId) {
         this.recieptId = recieptId;
         this.feesTotal = 0;
         this.mainsSelected = new ArrayList<Mains>();
         this.sidesSelected = new ArrayList<Sides>();
         this.drikesSelected = new ArrayList<Drinks>();

    }

    public void addToReciept(int itemCost){
        this.feesTotal += itemCost;
    }

    public int getRecieptCost(){
        return this.feesTotal;
    }

    public void addMainsToReceipt(Mains mainsMenuItem){
        this.mainsSelected.add(mainsMenuItem);
    }

    public void addSidesToReceipt(Sides sidesMenuItem){
        this.sidesSelected.add(sidesMenuItem);
    }

    public void addDrinksToReceipt(Drinks drinksMenuItem){
        this.drikesSelected.add(drinksMenuItem);
    }

    public List<Mains> getSelectedMains(){
        return this.mainsSelected;
    }

    public List<Sides> getSelectedSides(){
        return this.sidesSelected;
    }

    public List<Drinks> getSelectedDrinks(){
        return this.drikesSelected;
    }

    public void printAllSelectedItems(){
        System.out.println("For mains you have selected: ");
        if (this.mainsSelected.isEmpty()){
            System.out.println("No mains selected");
        }else{
            for (Mains item : this.mainsSelected){
                System.out.println(item);            }
        }

        System.out.println("For sides you have selected: ");
        if (this.sidesSelected.isEmpty()){
            System.out.println("No sides selected");
        }else {
            for (Sides item : this.sidesSelected){
                System.out.println(item);
            }
        }

        System.out.println("For drikes you have selected: ");
        if (this.drikesSelected.isEmpty()){
            System.out.println("No drikes selected");
        }
        else {
            for (Drinks item : this.drikesSelected){
                System.out.println(item);
            }
        }

    }
}
