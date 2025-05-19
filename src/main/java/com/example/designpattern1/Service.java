package com.example.designpattern1;

public interface Service {

    double getFess();
}
class IndoorTables implements Service{
    public double fess = 0.15;

   public double getFess(){
        return fess;
    }

}
class OutdoorTables implements Service{
    public double fess = 0.12;
    public double getFess(){
        return fess;
    }



}
class VIPTables implements Service{
    public double fess = 0.18;

    public double getFess(){
        return fess;
    }

}
class deliveryService implements Service{
    public double fess = 1;

    public double getFess(){
        return fess;
    }
}
class takeAwayService implements Service{
    public double fess = 1;

    public double getFess(){
        return fess;
    }
}


class serviceFactory{
    public static Service getService(String type){
        return switch (type) {
            case "Indoor" -> new IndoorTables();
            case "Outdoor" -> new OutdoorTables();
            case "VIP" -> new VIPTables();
            case "Delivery" -> new deliveryService();
            case "TakeAway" -> new takeAwayService();
            default -> throw new IllegalArgumentException("Unknown choices are: Indoor, Outdoor, VIP, Delivery, TakeAway ");
        };

    }
}
