package com.pluralsight.models;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Topping {

    // meat, cheese, regular, sauce
    private int sandwichSize;
    private List<String> meats = new ArrayList<>();
    private List<String> extraMeat = new ArrayList<>();

    private List<String> cheeses = new ArrayList<>();
    private List<String> extraCheese = new ArrayList<>();


    private List<String> toppings = new ArrayList<>();
    private List<String> sauces = new ArrayList<>();

    private double meatCost = 0;
    private double cheeseCost = 0;


    // list of regular toppings
    public static final List<String> REGULARTOPPINGSLIST = Arrays.asList(
            "lettuce",
            "peppers",
            "onions",
            "tomatoes",
            "jalapenos",
            "cucumbers",
            "pickles",
            "guacamole",
            "mushrooms");

    public static final List<String> MEATTOPPINGS = Arrays.asList(
            "steak",
            "ham",
            "salami",
            "roast beef",
            "chicken",
            "bacon");

    public static final List<String> CHEESETOPPINGS = Arrays.asList(
            "american",
            "provolone",
            "cheddar",
            "swiss");

    public static final List<String> SAUCETOPPINGS = Arrays.asList(
            "mayo",
            "mustard",
            "ketchup",
            "ranch",
            "thousand islands",
            "vinaigrette");

    public static final List<String> SIDES = Arrays.asList(
            "au jus",
            "mayo",
            "mustard",
            "ketchup",
            "ranch",
            "thousand islands",
            "vinaigrette");


    public Topping(int sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public void addMeat(String meat, boolean extra) {
        meat = meat.toLowerCase().trim();
        meats.add(meat);
        if (!meat.equalsIgnoreCase("none")) {
            meatCost += getMeatPrice();
            if (extra) {
                extraMeat.add(meat);
                meatCost += getExtraMeatPrice();
            }
        }
    }

    public void addCheese(String cheese, boolean extra) {
        cheese = cheese.toLowerCase().trim();
        cheeses.add(cheese);
        if (!cheese.equalsIgnoreCase("none")) {
            cheeseCost += getCheeseCost();
            if (extra) {
                extraCheese.add(cheese);
                cheeseCost += getExtraCheeseCost();

            }
        }
    }

    public void addTopping (String topping) {
        topping = topping.toLowerCase().trim();
        if (!topping.equalsIgnoreCase("none") && REGULARTOPPINGSLIST.contains(topping.toLowerCase())) {
            toppings.add(topping);
        }
    }

    public void addSauce (String sauce) {
        sauce = sauce.toLowerCase().trim();
        if (!sauce.equalsIgnoreCase("none") && SAUCETOPPINGS.contains(sauce.toLowerCase())) {
            sauces.add(sauce);
        }
    }

    // formats the extra meats
    public String getFormattedMeats() {
        if (meats.size() == 1 && meats.get(0).equals("none")) {
            return "None";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < meats.size(); i++) {
            String meat = meats.get(i);
            // only charge if not "none"
            if (meat.equals("none")) continue;

            sb.append(meat);

            if (extraMeat.contains(meat)) {
                sb.append(" (extra)");
            }
            // adds comma - if its not the last line
            if (i < meats.size() - 1) {
                sb.append(", ");
            }
        }
        // handles empty list or "none"
        return sb.length() == 0 ? "None" : sb.toString();
    }

    // formats the extra cheeses
    public String getFormattedCheeses() {
        if (cheeses.size() == 1 && cheeses.get(0).equals("none")) {
            return "None";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cheeses.size(); i++) {
            String cheese = cheeses.get(i);
            if (cheese.equals("none")) continue;
            sb.append(cheese);

            if (extraCheese.contains(cheese)) {
                sb.append(" (extra)");
            }
            // adds comma - if its not the last line
            if (i < cheeses.size() - 1) {
                sb.append(", ");
            }
        }
        // handles empty list or "none"
        return sb.length() == 0 ? "None" : sb.toString();
    }

    public double calculateToppingCost() {
        // adding meat and cheese cost, other toppings are free
        return meatCost + cheeseCost;
    }



    private double getMeatPrice() {
        switch (sandwichSize){
            case 4:
                return 1.00;
            case 8:
                return 2.00;
            case 12:
                return 3.00;
            default:
                return 0;

        }
    }

    private double getExtraMeatPrice() {
        switch (sandwichSize) {
            case 4:
                return 0.50;
            case 8:
                return 1.00;
            case 12:
                return 1.50;
            default:
                return 0;
        }
    }

    private double getCheeseCost() {
        switch (sandwichSize){
            case 4:
                return 0.75;
            case 8:
                return 1.50;
            case 12:
                return 2.25;
            default:
                return 0;

        }
    }

    private double getExtraCheeseCost() {
        switch (sandwichSize) {
            case 4:
                return 0.30;
            case 8:
                return 0.60;
            case 12:
                return 0.90;
            default:
                return 0;
        }
    }


    // getters
    public List<String> getMeats() {
        return meats;
    }

    public List<String> getCheeses() {
        return cheeses;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public List<String> getToppings() {
        return toppings;
    }


}
