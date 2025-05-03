package com.example.designpattern1;

interface Invoice {
    orderCloned cloneObject(int vegatablesPrice, int meatPrice, int beardPrice, int cheesePrice,
                            String meatType, String vegatablesType, String beardType, String cheeseType, String meatImageURL,
                            String vegatablesimageURL, String cheeseimageURL, String beardimageURL,
                            int meatCnt ,int vegatablesCnt , int cheeseCnt ,int beardCnt);  // Prototype method
}

public class orderCloned implements Invoice {
    int vegatablesPrice = 0;
    int meatPrice = 0;
    int beardPrice = 0;
    int cheesePrice = 0;
    String meatType = "";
    String vegatablesType = "";
    String beardType = "";
    String cheeseType = "";
    String meatImageURL = "";
    String vegatablesImageURL = "";
    String cheeseImageURL = "";
    String beardImageURL = "";
    double totalPrice = 0;
    int orderPrice;
    double taxPrice;
    int meatCnt = 1;
    int vegatablesCnt = 1;
    int beardCnt = 1;
    int cheeseCnt = 1;



    public void setVegatablesPrice(int vegatablesPrice) { this.vegatablesPrice = vegatablesPrice; }
    public void setMeatPrice(int meatPrice) { this.meatPrice = meatPrice; }
    public void setBeardPrice(int beardPrice) { this.beardPrice = beardPrice; }
    public void setCheesePrice(int cheesePrice) { this.cheesePrice = cheesePrice; }
    public void setMeatType(String meatType) { this.meatType = meatType; }
    public void setVegatablesType(String vegatablesType) { this.vegatablesType = vegatablesType; }
    public void setBeardType(String beardType) { this.beardType = beardType; }
    public void setCheeseType(String cheeseType) { this.cheeseType = cheeseType; }
    public void setMeatImageURL(String meatImageURL) { this.meatImageURL = meatImageURL; }
    public void setVegatablesImageURL(String vegatablesImageURL) { this.vegatablesImageURL = vegatablesImageURL; }
    public void setCheeseImageURL(String cheeseImageURL) { this.cheeseImageURL = cheeseImageURL; }
    public void setBeardImageURL(String beardImageURL) { this.beardImageURL = beardImageURL; }

    public void setMeatCnt(int meatCnt) {
        this.meatCnt = meatCnt;
    }

    public void setVegatablesCnt(int vegatablesCnt) {
        this.vegatablesCnt = vegatablesCnt;
    }

    public void setBeardCnt(int beardCnt) {
        this.beardCnt = beardCnt;
    }

    public void setCheeseCnt(int cheeseCnt) {
        this.cheeseCnt = cheeseCnt;
    }

    public int getVegatablesPrice() { return vegatablesPrice; }
    public int getMeatPrice() { return meatPrice; }
    public int getBeardPrice() { return beardPrice; }
    public int getCheesePrice() { return cheesePrice; }
    public String getMeatType() { return meatType; }
    public String getVegatablesType() { return vegatablesType; }
    public String getBeardType() { return beardType; }
    public String getCheeseType() { return cheeseType; }
    public String getMeatImageURL() { return meatImageURL; }
    public String getVegatablesImageURL() { return vegatablesImageURL; }
    public String getCheeseImageURL() { return cheeseImageURL; }
    public int getMeatCnt() {
        return meatCnt;
    }
    public int getVegatablesCnt() {
        return vegatablesCnt;
    }
    public int getBeardCnt() {
        return beardCnt;
    }
    public int getCheeseCnt() {
        return cheeseCnt;
    }


    public String getBeardImageURL() { return beardImageURL; }

    public orderCloned cloneObject(int vegatablesPrice, int meatPrice, int beardPrice, int cheesePrice,
                                   String meatType, String vegatablesType, String beardType, String cheeseType, String meatImageURL,
                                   String vegatablesImageURL, String cheeseImageURL, String beardImageURL,
                                   int meatCnt ,int vegatablesCnt , int cheeseCnt ,int beardCnt) {
        orderCloned clonedOrder = new orderCloned();
        clonedOrder.setVegatablesPrice(vegatablesPrice);
        clonedOrder.setMeatPrice(meatPrice);
        clonedOrder.setBeardPrice(beardPrice);
        clonedOrder.setCheesePrice(cheesePrice);
        clonedOrder.setMeatType(meatType);
        clonedOrder.setVegatablesType(vegatablesType);
        clonedOrder.setBeardType(beardType);
        clonedOrder.setCheeseType(cheeseType);
        clonedOrder.setMeatImageURL(meatImageURL);
        clonedOrder.setVegatablesImageURL(vegatablesImageURL);
        clonedOrder.setCheeseImageURL(cheeseImageURL);
        clonedOrder.setBeardImageURL(beardImageURL);
        clonedOrder.setMeatCnt(meatCnt);
        clonedOrder.setVegatablesCnt(vegatablesCnt);
        clonedOrder.setBeardCnt(beardCnt);
        clonedOrder.setCheeseCnt(cheeseCnt);
        return clonedOrder;
    }
    public int getOrderPrice() {
        orderPrice = vegatablesCnt*vegatablesPrice + meatCnt*meatPrice + beardCnt*beardPrice + cheeseCnt*cheesePrice;
        return orderPrice;
    }

    public double getTaxPrice() {
        taxPrice = (int) (orderPrice * 0.10);
        return taxPrice;
    }

    public double getTotalPrice() {
        taxPrice = getTaxPrice();
        orderPrice = getOrderPrice();
        totalPrice=taxPrice+orderPrice;
        return totalPrice;
    }

    orderCloned clear(){
        this.vegatablesPrice = 0;
        this.meatPrice = 0;
        this.beardPrice = 0;
        this.cheesePrice = 0;
        this.meatType = "";
        this.vegatablesType = "";
        this.beardType = "";
        this.cheeseType = "";
        this.meatImageURL = "";
        this.vegatablesImageURL = "";
        this.cheeseImageURL = "";
        this.beardImageURL = "";
        this.totalPrice = 0;
        this.orderPrice = 0;
        this.taxPrice = 0;
        this.meatCnt = 1;
        this.vegatablesCnt = 1;
        this.beardCnt = 1;
        this.cheeseCnt = 1;
        return this;

    }


}

