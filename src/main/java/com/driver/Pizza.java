package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        //set the price
        if(isVeg)
        {
            //veg
            this.price=300;
            this.bill="";
            this.bill+="Base Price Of The Pizza: 300\n";
        }
        else
        {
            //non-veg
            this.price=400;
            this.bill="";
            this.bill+="Base Price Of The Pizza: 400\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese()
    {
        // your code goes here
        this.price+=80;
        this.bill+="Extra Cheese Added: 80\n";
    }

    public void addExtraToppings()
    {

        // your code goes here
        if(this.isVeg)
        {
            //veg
            this.price+=70;
            this.bill+="Extra Toppings Added: 70\n";
        }
        else
        {
            //non-veg
            this.price+=120;
            this.bill+="Extra Toppings Added: 120\n";
        }
    }

    public void addTakeaway()
    {
        // your code goes here
        this.price+=20;
        this.bill+="Paperbag Added: 20\n";
    }

    public String getBill(){
        // your code goes here
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
