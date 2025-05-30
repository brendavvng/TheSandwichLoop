# TheSandwichLoop

![Class Diagram](sandwich_app_class_diagram.png)

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
