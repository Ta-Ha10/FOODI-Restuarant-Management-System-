package com.example.designpattern1;

import java.util.ArrayList;

class OrderCus {
    int VegatablesPrice = 0;
    int MeatPrice = 0;
    int BeardPrice = 0;
    int CheesePrice = 0;
    int totalPrice = 0;
    String MeatType = "";
    String VegatablesType = "";
    String BeardType ="";
    String CheeseType = "";
    String meatImageURL = "";
    String vegatablesimageURL = "";
    String cheeseimageURL = "";
    String beardimageURL = "";
    int meatCnt = 0;
    int vegatablesCnt = 0;
    int cheeseCnt = 0;
    int beardCnt = 0;

    public void clear() {
        this.MeatType = "";
        this.VegatablesType = "";
        this.CheeseType = "";
        this.BeardType = "";

        this.MeatPrice = 0;
        this.VegatablesPrice = 0;
        this.CheesePrice = 0;
        this.BeardPrice = 0;

        this.meatImageURL = "";
        this.vegatablesimageURL= "";
        this.cheeseimageURL = "";
        this.beardimageURL = "";

        this.meatCnt = 0;
        this.vegatablesCnt = 0;
        this.cheeseCnt = 0;
        this.beardCnt = 0;
    }


    public void setMeatImageURL(String imageURL) {
        this.meatImageURL = imageURL;
    }

    public void setVegatablesPrice(int vegatablesPrice) {
        VegatablesPrice = vegatablesPrice;
    }

    public void setMeatPrice(int meatPrice) {
        MeatPrice = meatPrice;
    }

    public void setBeardPrice(int beardPrice) {
        BeardPrice = beardPrice;
    }

    public void setCheesePrice(int cheesePrice) {
        CheesePrice = cheesePrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setMeatType(String meatType) {
        MeatType = meatType;
    }

    public void setVegatablesType(String vegatablesType) {
        VegatablesType = vegatablesType;
    }

    public void setBeardType(String beardType) {
        BeardType = beardType;
    }

    public void setCheeseType(String cheeseType) {
        CheeseType = cheeseType;
    }

    public void setVegatablesimageURL(String vegatablesimageURL) {
        this.vegatablesimageURL = vegatablesimageURL;
    }

    public void setBeardimageURL(String beardimageURL) {
        this.beardimageURL = beardimageURL;
    }

    public void setCheeseimageURL(String cheeseimageURL) {
        this.cheeseimageURL = cheeseimageURL;
    }

    public String getVegatablesimageURL() {
        return vegatablesimageURL;
    }

    public String getCheeseimageURL() {
        return cheeseimageURL;
    }

    public String getBeardimageURL() {
        return beardimageURL;
    }


    @Override
    public String toString() {
        return "order{" +
                "VegatablesPrice=" + VegatablesPrice +
                ", MeatPrice=" + MeatPrice +
                ", BeardPrice=" + BeardPrice +
                ", CheesePrice=" + CheesePrice +
                ", totalPrice=" + totalPrice +
                ", MeatType='" + MeatType + '\'' +
                ", VegatablesType='" + VegatablesType + '\'' +
                ", BeardType='" + BeardType + '\'' +
                ", CheeseType='" + CheeseType + '\'' +
                '}';
    }

    public int getVegatablesPrice() {
        return VegatablesPrice;
    }

    public int getMeatPrice() {
        return MeatPrice;
    }

    public int getBeardPrice() {
        return BeardPrice;
    }

    public int getCheesePrice() {
        return CheesePrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public String getMeatType() {
        return MeatType;
    }

    public String getVegatablesType() {
        return VegatablesType;
    }

    public String getBeardType() {
        return BeardType;
    }

    public String getCheeseType() {
        return CheeseType;
    }

    public String getMeatImageURL(){
        return meatImageURL;
    }
}
interface BuilderFactory {
    void reset();
    void setVegatablesPrice(int vegatablesPrice);
    void setMeatPrice(int meatPrice);
    void setBeardPrice(int beardPrice);
    void setCheesePrice(int cheesePrice);
    void setTotalPrice(int totalPrice);
    void setMeatType(String meatType);
    void setVegatablesType(String vegatablesType);
    void setBeardType(String beardType);
    void setMeatImageURL(String imageURL);
    void setVegatablesImageURL(String imageURL);
    void setCheeseImageURL(String imageURL);
    void setBeardImageURL(String imageURL);
    void setCheeseType(String cheeseType);
    String getMeatType();
    String getVegatablesType();
    String getBeardType();
    String getCheeseType();
    int getVegatablesPrice();
    int getMeatPrice();
    int getBeardPrice();
    int getCheesePrice();
    String getMeatImageURL();
    String getVegatablesImageURL();
    String getCheeseImageURL();
    String getBeardImageURL();
  //  public void displayOrders() ;

//    int getTotalPrice();
//    OrderCus getOrder();
//    void setOrder(OrderCus order);
//    void setOrder(orderBuilder orderBuilder);
//    void setOrder(BuilderFactory builderFactory);

}




class orderBuilder implements BuilderFactory {
    public OrderCus order;
    public orderBuilder() {
        reset();
    }
    @Override
    public void reset() {
        order = new OrderCus();
    }

    public void setMeatImageURL(String imageURL){
        order.setMeatImageURL(imageURL);
    }

    @Override
    public void setVegatablesImageURL(String imageURL) {
        order.setVegatablesimageURL(imageURL);
    }

    @Override
    public void setCheeseImageURL(String imageURL) {
        order.setCheeseimageURL(imageURL);
    }

    @Override
    public void setBeardImageURL(String imageURL) {
        order.setBeardimageURL(imageURL);
    }

    @Override
    public void setVegatablesPrice(int vegatablesPrice) {
        order.setVegatablesPrice(vegatablesPrice);
    }
    @Override
    public void setMeatPrice(int meatPrice) {
        order.setMeatPrice(meatPrice);
    }
    @Override
    public void setBeardPrice(int beardPrice) {
        order.setBeardPrice(beardPrice);
    }
    @Override
    public void setCheesePrice(int cheesePrice) {
        order.setCheesePrice(cheesePrice);
    }
    @Override
    public void setTotalPrice(int totalPrice) {
        order.setTotalPrice(totalPrice);
    }
    @Override
    public void setMeatType(String meatType) {
        order.setMeatType(meatType);
    }
    @Override
    public void setVegatablesType(String vegatablesType) {
        order.setVegatablesType(vegatablesType);
    }
    @Override
    public void setBeardType(String beardType) {
        order.setBeardType(beardType);
    }
    @Override
    public void setCheeseType(String cheeseType) {
        order.setCheeseType(cheeseType);
    }
    public String getMeatType(){
        return order.getMeatType();
    }
    public int getMeatPrice(){
        return order.getMeatPrice();
    }
    public int getVegatablesPrice(){
        return order.getVegatablesPrice();
    }
    public String getVegatablesType(){
        return order.getVegatablesType();
    }
    public String getCheeseType(){
        return order.getCheeseType();
    }
    public int getCheesePrice(){
        return order.getCheesePrice();
    }

    public String getMeatImageURL() {
        return order.getMeatImageURL();
    }

    @Override
    public String getVegatablesImageURL() {
        return order.getVegatablesimageURL();
    }

    @Override
    public String getCheeseImageURL() {
        return order.getCheeseimageURL();
    }

    @Override
    public String getBeardImageURL() {
        return order.getBeardimageURL();
    }

    public int getBeardPrice(){
        return order.getBeardPrice();
    }
    public String getBeardType(){
        return order.getBeardType();
    }

    public void clear(){
        order.clear();}



    public OrderCus getOrder() {
        OrderCus finalOrder = this.order;
        reset();
        return order;
    }


}