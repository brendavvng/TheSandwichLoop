# TheSandwichLoop

![Class Diagram](sandwich_app_class_diagram.png)
## The Sandwich Loop is a Java-based point-of-sale (POS) application designed for a sandwich shop. It provides a user-friendly interface for customers and staff to create, customize, and manage sandwich orders seamlessly.

###  Features

- Customizable Sandwich Orders: Choose bread type, sandwich size (4", 8", 12"), meats, cheeses, toppings, sauces, chips, and drinks.
- Dynamic Pricing: Prices adjust based on sandwich size and selected ingredients, including extras.
- Order Summary & Receipt Generation: Generates detailed receipts with timestamped files saved for record-keeping.
- Modular Design: Clear separation of concerns using classes like Sandwich, Toppings, Chips, Drinks, ReceiptWriter, and a user interface abstraction.
- User Interface: Themed, interactive prompts for easy navigation through the ordering process.
- Easter Eggs & Fun Features: Hidden surprise messages triggered by special inputs to enhance user engagement.


### Technologies Used

- Java (core language)
- File I/O for receipt generation
- Object-Oriented Design principles


## How to Use

Run the application, 
follow the prompts to build your custom sandwich order, 
add sides and drinks, 
and receive your order summary and receipt.



                    +--------------------+
                    |    UserInterface   |
                    +--------------------+
                    | + displayMenu()    |
                    | + getOrderDetails()|
                    | + showReceipt()    |
                    +--------------------+
                             ^
                             |
                             |
                  +-----------------------+
                  |       App             |
                  +-----------------------+
                  | - ui: UserInterface   |
                  | - sandwich: Sandwich  |
                  | - chips: Chips        |
                  | - drink: Drinks       |
                  | - receiptWriter       |
                  +-----------------------+
                  | + run()               |
                  +-----------------------+

    +----------------+        +----------------+        +----------------+
    |   Sandwich     |        |     Chips      |        |     Drinks     |
    +----------------+        +----------------+        +----------------+
    | - bread         |       | - chipType     |        | - drinkType    |
    | - size          |       |                |        | - drinkSize    |
    | - toppings      |       +----------------+        +----------------+
    | - price         |       | + getPrice()   |        | + getPrice()   |
    +----------------+                                  
    | + getPrice()    |                                    
    | + getName()     |                                    
    +----------------+                                    

                          +--------------------------+
                          |      Toppings            |
                          +--------------------------+
                          | - meats                  |
                          | - cheese                 |
                          | - regularToppings        |
                          | - sauces                 |
                          +--------------------------+
                          | + calculateToppingPrice()|
                          +--------------------------+

                          +--------------------------+
                          |      ReceiptWriter       |
                          +--------------------------+
                          |                          |
                          +--------------------------+
                          | + writeReceipt(          |
                          |   sandwich: Sandwich,    |
                          |   chips: Chips,          |
                          |   drink: Drinks)         |
                          +--------------------------+

## Home Screen

<img src="images/Capstone_2_HomeScreen.png" alt="Home Screen Menu" width="650"/>

## Sandwich Building:

<table align="center">
<tr>
  <td><img src="images/Capstone_2_BreadSize.png" alt="BreadSize Screenshot" width="400" /></td>
  <td><img src="images/Capstone_2_BreadType.png" alt="BreadType Screenshot" width="400" /></td>
</tr>
</table>


<table align="center">
<tr>
  <td><img src="images/Capstone_2_BreadSize.png" alt="BreadSize Screenshot" width="400" /></td>
  <td><img src="images/Capstone_2_BreadType.png" alt="BreadType Screenshot" width="400" /></td>
</tr>
</table>

                          
<table align="center">
<tr>
  <td><img src="images/Capstone_2_ChipsMenu.png" alt="ChipsMenu Screenshot" width="400" /></td>
  <td><img src="images/Capstone_2_DrinkMenu.png" alt="DrinkMenu Screenshot" width="400" /></td>
</tr>
</table>
                  
