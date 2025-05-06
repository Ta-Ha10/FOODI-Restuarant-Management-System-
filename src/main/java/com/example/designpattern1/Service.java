package com.example.designpattern1;

interface Service {
    double fess = 0.0;

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
    public Service getService(String type){
        return switch (type.toLowerCase()) {
            case "Indoor" -> new IndoorTables();
            case "Outdoor" -> new OutdoorTables();
            case "VIP" -> new VIPTables();
            case "Delivery" -> new deliveryService();
            case "TakeAway" -> new takeAwayService();
            default -> throw new IllegalArgumentException("Invalid com.example.designpattern1.Service Type");
        };

    }
}
