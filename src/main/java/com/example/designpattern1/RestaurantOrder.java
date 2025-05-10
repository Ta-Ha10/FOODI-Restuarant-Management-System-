package com.example.designpattern1;

import java.util.ArrayList;

interface Product {
    String name = "";
    int price = 100;
    String imageURL = "path";
    String getName();
    int getPrice();
    String getImageURL();
    int tableNum = 0 ;
    void setTableNum(int tableNum);
    int getTableNum();
    String getServiceType();
    void setServiceType(String serviceType);
    String serviceType = "";
}

// Product Implementations
class CheeseBeard implements Product {
    public String name = "Cheese Beard";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\cheeseBeard.png";
    private int tableNum;
    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

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

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }

}

class GrilledMeat implements Product {
    public String name = "Grilled Meat";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\GrilledMeat.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }
}

class Salad implements Product {
    private String name = "Salad";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Salad.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }
}

class CheeseCake implements Product {
    private String name = "Cheese Cake";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\CheeseCake.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }

}

class PlainBeard implements Product {
    private String name = "Plain Beard";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\PlainBeard.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }
}

class Shrimp implements Product {
    private String name = "Shrimp";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Shrimp.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }
}

class VegatablesSpagetti implements Product {
    private String name = "Vegatables Spagetti";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\VegatableSpagetti.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }
}

class Sapagetti implements Product {
    private String name = "Spagetti";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Spagetti.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }
}

class dish1 implements Product {
    private String name = "dish1";
    private int price = 100;
    private String imageURL = "C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\dish1.png";
    int tableNum;

    private String serviceType;

    @Override
    public String getServiceType() {
        return serviceType;
    }

    @Override
    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
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
    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }
    @Override
    public int getTableNum() {
        return tableNum;
    }

}

class ProductOrder {
    String name;
    int price;
    String imageURL;
    int tableNum;
    String serviceType;

    public ProductOrder(String name, int price, String imageURL , int tableNum , String serviceType) {
        this.name = name;
        this.price = price;
        this.imageURL = imageURL;
        this.tableNum = tableNum;
        this.serviceType = serviceType;
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

    public int getTableNumOrder() {
        return tableNum;
    }

    public String getServiceType() {
        return serviceType;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", imageURL='" + imageURL + '\'' +
                ", tableNum=" + tableNum +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }
}

abstract class Order {
    public abstract Product addProduct(String name);

    public abstract  void storeOrder(String productName , int tableNumber , String serviceType);

    public abstract void displayOrders() ;

        public void placeOrder(String name) {

        Product product = addProduct(name);

    }
}

public class RestaurantOrder extends Order {
    public static ArrayList<ProductOrder> orderList = new ArrayList<>();

    public void storeOrder(String productName, int tableNumber , String serviceType) {
        Product product = addProduct(productName); // Create product
        product.setServiceType(serviceType);
        product.setTableNum(tableNumber);

        System.out.println("Debug - Product table number set to: " + product.getTableNum());

        ProductOrder order = new ProductOrder(
                product.getName(),
                product.getPrice(),
                product.getImageURL(),
                product.getTableNum() ,
                product.getServiceType()
        );

        // Debug print
        System.out.println("Debug - Order created with table number: " + order.getTableNumOrder());

        orderList.add(order);
    }


    public void displayOrders() {
        if (orderList.isEmpty()) {
            System.out.println("No orders to display.");
            return;
        }

        System.out.println("Current Orders:");
        for (ProductOrder order : orderList) {
            // Debug print the order details explicitly
            System.out.println("Order: " + order.getNameOrder() +
                    "Image: " + order.getImageURLOrder() +
                    ", Price: " + order.getPriceOrder() +
                    ", Table Number: " + order.getTableNumOrder() +
                    ", Service Type: " + order.getServiceType());
        }

    }

    @Override
    public Product addProduct(String name) {
        Product product;
        switch (name.toLowerCase()) {
            case "cheese beard":
                product = new CheeseBeard();
                break;
            case "salad":
                product = new Salad();
                break;
            case "plain beard":
                product = new PlainBeard();
                break;
            case "shrimp":
                product = new Shrimp();
                break;
            case "cheese cake":
                product = new CheeseCake();
                break;
            case "grilled meat":
                product = new GrilledMeat();
                break;
            case "spagetti":
                product = new Sapagetti();
                break;
            case "vegatables spagetti":
                product = new VegatablesSpagetti();
                break;
            case "dish1":
                product = new dish1();
                break;
            default:
                throw new IllegalArgumentException("Invalid product name: " + name);
        }

        return product;
    }
}