package oops;

class Pizza{
    boolean isVeg;
    boolean isToppingAdded;
    boolean isCheeseAdded;
    boolean isBagAdded;
    String billStatement;
    private int vegBasePrice = 300;
    private int nonVegBasePrice = 400;
    int currentBasePrice;
    int totalBillAmount = 0;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        if(this.isVeg == true){ //veg
            currentBasePrice = this.vegBasePrice;
        } else{
           currentBasePrice = this.nonVegBasePrice; //non-veg
        }
        String pizzaType = this.isVeg ? "veg" : "nonveg";
        billStatement += "bsae price of pizza:" + currentBasePrice + "\n";
    }
    public void addExtraCheese(){
        if(this.isCheeseAdded == false){
            billStatement += "extra cheese added : 100";
            totalBillAmount += 100;
        }
        this.isCheeseAdded = true;
    }
    public void addExtraToppings(){
        if(this.isToppingAdded == false){
            billStatement += "extra toppings added: 70\n";
            totalBillAmount += 70;
        } else{
            billStatement += "extra toppings added: 100\n";
            totalBillAmount += 100;
        }
        this.isToppingAdded = true;
    }
    public void addTakeaway(){
        if(isBagAdded == false){
            billStatement += "bag added: 20\n";
            totalBillAmount += 20;
        }
        isBagAdded = true;
    }
    public String getBill(){
        this.billStatement = "total bill is" + totalBillAmount;
        return "total bill is :" + this.totalBillAmount;
    }
}

class DeluxePizza extends Pizza{
    public DeluxePizza(boolean isVeg){
        super(isVeg);
        super.addExtraToppings();
        super.addExtraCheese();
    }
}


public class Project {
    public static void main(String[] args) {
        Pizza p = new Pizza(true); //true -> veg, false -> non-veg
        p.addExtraToppings();
        p.addExtraCheese();
        p.addTakeaway();

        System.out.println(p.getBill());

        DeluxePizza dp = new DeluxePizza(false);
        dp.addExtraCheese();
        dp.addExtraToppings();
        dp.addTakeaway();
    }
}
