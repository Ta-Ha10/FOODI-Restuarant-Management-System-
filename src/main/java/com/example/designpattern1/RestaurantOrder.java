package com.example.designpattern1;

import java.util.ArrayList;

interface Product {
    String name = "";
    int price = 100;
    String imageURL = "path";
    String getName();
    int getPrice();
    String getImageURL();
}

// Product Implementations
class CheeseBeard implements Product {
    public String name = "Cheese Beard";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\cheeseBeard.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class GrilledMeat implements Product {
    public String name = "Grilled Meat";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\GrilledMeat.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class Salad implements Product {
    private String name = "Salad";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Salad.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class CheeseCake implements Product {
    private String name = "Cheese Cake";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\CheeseCake.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class PlainBeard implements Product {
    private String name = "Plain Beard";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\PlainBeard.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class Shrimp implements Product {
    private String name = "Shrimp";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Shrimp.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class VegatablesSpagetti implements Product {
    private String name = "Vegatables Spagetti";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\VegatableSpagetti.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class Sapagetti implements Product {
    private String name = "Spagetti";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Spagetti.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class dish1 implements Product {
    private String name = "dish1";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\dish1.png";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getImageURL() {
        return imageURL;
    }
}

class ProductOrder {
    String name;
    int price;
    String imageURL;

    public ProductOrder(String name, int price, String imageURL) {
        this.name = name;
        this.price = price;
        this.imageURL = imageURL;
    }

    // Getters
    public String getNameOrder() {
        return name;
    }

    public int getPriceOrder() {
        return price;
    }

    public String getImageURLOrder() {
        return imageURL;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: " + price + ", Image URL: " + imageURL;
    }
}

abstract class Order {
    public abstract Product addProduct(String name);

    public abstract  void storeOrder(String productName);

    public abstract void displayOrders() ;

        public void placeOrder(String name) {

        Product product = addProduct(name);

        // you can log or process the product if needed
    }
}

// Concrete Factory
public class RestaurantOrder extends Order {
    private ArrayList<ProductOrder> orderList = new ArrayList<>();



    public void storeOrder(String productName) {
        Product product = addProduct(productName); // Create product
        ProductOrder order = new ProductOrder(
                product.getName(),
                product.getPrice(),
                product.getImageURL()
        );
        orderList.add(order);
    }

    public void displayOrders() {
        for (ProductOrder order : orderList) {
            System.out.println(order);
        }
    }

    @Override
    public Product addProduct(String name) {
        switch (name.toLowerCase()) {
            case "cheese beard":
                return new CheeseBeard();
            case "salad":
                return new Salad();
            case "plain beard":
                return new PlainBeard();
            case "shrimp":
                return new Shrimp();
            case "cheese cake":
                return new CheeseCake();
            case "grilled meat":
                return new GrilledMeat();
            case "spagetti":
                return new Sapagetti();
            case "vegatables spagetti":
                return new VegatablesSpagetti();
            case "dish1":
                return new dish1();
            default:
                throw new IllegalArgumentException("Invalid product name");
        }
    }

}

