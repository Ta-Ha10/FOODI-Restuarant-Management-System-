package com.example.designpattern1;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.awt.*;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.ResourceBundle;

import static com.example.designpattern1.orderCloned.storeOrderbuilder;

public class DashboardController implements Initializable {

    @FXML
    private Button Add1Btn;

    @FXML
    private Button Burger2Btn;

    @FXML
    private Button BurgerBtn;

    @FXML
    private Button ChikernBtn;

    @FXML
    private Button DeliveryBtn;

    @FXML
    private FontAwesomeIcon FdCusBtn;

    @FXML
    private ImageView ImageView2;

    @FXML
    private Button IndoorBtn;

    @FXML
    private Label Name1;

    @FXML
    private AnchorPane ServiceForm;

    @FXML
    private Label TableNum;

    @FXML
    private Label TableType1;

    @FXML
    private Button VIPBtn;

    @FXML
    private Button b1Btn;

    @FXML
    private Button b2Btn;

    @FXML
    private Button b3Btn;

    @FXML
    private Button b4Btn;

    @FXML
    private Label beardSelect;

    @FXML
    private ImageView breadimg;

    @FXML
    private Button cancelCusBtn;

    @FXML
    private Button ch1Btn;

    @FXML
    private Button ch2Btn;

    @FXML
    private Button ch3Btn;

    @FXML
    private Button ch4Btn;

    @FXML
    private ImageView cheeseImg;

    @FXML
    private Label cheeseSelect;

    @FXML
    private Button crispyBtn;

    @FXML
    private Button cuBtn;

    @FXML
    private Button dish1;

    @FXML
    private Button dish10;

    @FXML
    private Button dish1111;

    @FXML
    private ImageView dish11111;

    @FXML
    private Button dish12;

    @FXML
    private Button dish2;

    @FXML
    private Button dish3;

    @FXML
    private Button dish4;

    @FXML
    private Button dish5;

    @FXML
    private Button dish6;

    @FXML
    private Button dish7;

    @FXML
    private Button dish8;

    @FXML
    private Button dish9;

    @FXML
    private ImageView homeActive1;

    @FXML
    private ImageView homeIcon1;

    @FXML
    private ImageView imageVIew4;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView10;

    @FXML
    private ImageView imageView11;

    @FXML
    private ImageView imageView12;

    @FXML
    private ImageView imageView3;

    @FXML
    private ImageView imageView5;

    @FXML
    private ImageView imageView6;

    @FXML
    private ImageView imageView7;

    @FXML
    private ImageView imageView8;

    @FXML
    private ImageView imageView9;

    @FXML
    private AnchorPane ingedForm;

    @FXML
    private Button lettuceBtn;

    @FXML
    private ImageView meatImg;

    @FXML
    private Label meatSelect;

    @FXML
    private ImageView menuActive1;

    @FXML
    private Button menuCusBtn;

    @FXML
    private AnchorPane menuForm;

    @FXML
    private AnchorPane menuFrame;

    @FXML
    private ImageView menuIcon1;

    @FXML
    private Label name2;

    @FXML
    private Label name3;

    @FXML
    private Label name4;

    @FXML
    private Label name5;

    @FXML
    private Label name6;

    @FXML
    private Label name7;

    @FXML
    private Label name8;

    @FXML
    private Button ndCusBtnB;

    @FXML
    private Button ndCusBtnF;

    @FXML
    private AnchorPane ndCusFrame;

    @FXML
    private Button onionBtn;

    @FXML
    private Label orderPrice;

    @FXML
    private Button outDoorBtn;

    @FXML
    private Button payCusBtn;

    @FXML
    private ImageView paymentIcon1;

    @FXML
    private Label price1;

    @FXML
    private Label price2;

    @FXML
    private Label price3;

    @FXML
    private Label price4;

    @FXML
    private Label price5;

    @FXML
    private Label price6;

    @FXML
    private Label price7;

    @FXML
    private Label price8;

    @FXML
    private Button rdBtnCusB;

    @FXML
    private Button rdBtnCusF;

    @FXML
    private AnchorPane rdCusFrame;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private ScrollPane scrollPane2;

    @FXML
    private Button stBtCus;

    @FXML
    private AnchorPane stCusFrame;

    @FXML
    private Button stFdCus;

    @FXML
    private Button t1Btn;

    @FXML
    private FontAwesomeIcon t1Selected;

    @FXML
    private Button t2Btn;

    @FXML
    private FontAwesomeIcon t2Selected;

    @FXML
    private Button t3Btn;

    @FXML
    private FontAwesomeIcon t3Selected;

    @FXML
    private Button t4Btn;

    @FXML
    private FontAwesomeIcon t4Selected;

    @FXML
    private Button t5Btn;
    @FXML
    private Button homeBtn;

    @FXML
    private FontAwesomeIcon t5Selected;

    @FXML
    private AnchorPane tableForm;

    @FXML
    private Button tableFormBtn;

    @FXML
    private Button takeAwayBtn;

    @FXML
    private Label taxPrice;

    @FXML
    private Button thBtnCusB;

    @FXML
    private Button thBtnCusF;

    @FXML
    private AnchorPane thCusFrame;

    @FXML
    private Label time;

    @FXML
    private Button tomatoBtn;

    @FXML
    private Label totalPrice;

    @FXML
    private VBox vboxContent;

    @FXML
    private ImageView vegatablesImg;

    @FXML
    private Label vegatablesSelect;



    static  double fees = 0.0;
    int tableNumber= 0;
    String tableTyp;


    orderCloned cloneOrder = new orderCloned();
    orderBuilder builder = new orderBuilder();
    int meatCnt= 0;
    int vegatablesCnt = 0;
    int cheeseCnt = 0;
    int beardCnt = 0;
    String currentMeat = "";
    String currentVegatables = "";
    String currentCheese = "";
    String currentBeard = "";

    public void MeatAction(){
        BurgerBtn.setOnAction(event -> {
            String selected = "Burger 250";
            if (!selected.equals(currentMeat)) {
                meatCnt = 0;
                currentMeat = selected;
            }
            meatCnt++;
            System.out.println("Burger Button Pressed");
            builder.setMeatType("Burger 250");
            builder.setMeatPrice(15);
            builder.setMeatImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Burger.jpg");
            System.out.println(builder.getMeatPrice());
            System.out.println(builder.getMeatType());
            meatSelect.textAlignmentProperty().setValue(javafx.scene.text.TextAlignment.CENTER);
            meatSelect.setText(builder.getMeatType() + (meatCnt > 1 ? " (" + meatCnt + ")" : ""));
            meatImg.setImage(new Image(builder.getMeatImageURL()));
        });

        meatCnt=0;
        ChikernBtn.setOnAction(event -> {
            String selected = "Grilled Chicken";
            if (!selected.equals(currentMeat)) {
                meatCnt = 0;
                currentMeat = selected;
            }
            meatCnt++;
            System.out.println("Chicken Button Pressed");
            builder.setMeatType("Grilled Chicken");
            builder.setMeatPrice(25);
            builder.setMeatImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Chicken.jpg");
            meatSelect.setText(builder.getMeatType() +(meatCnt > 1 ? " (" + meatCnt + ")" : ""));
            meatImg.setImage(new Image(builder.getMeatImageURL()));

        });

        meatCnt=0;
        crispyBtn.setOnAction(event -> {
            String selected = "Crispy";
            if (!selected.equals(currentMeat)) {
                meatCnt = 0;
                currentMeat = selected;
            }
            meatCnt++;
            System.out.println("Crispy Button Pressed");
            builder.setMeatType("Crispy");
            builder.setMeatPrice(14);
            builder.setMeatImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Crispy.jpg");
            meatSelect.setText(builder.getMeatType() +(meatCnt > 1 ? " (" + meatCnt + ")" : ""));
            meatImg.setImage(new Image(builder.getMeatImageURL()));
        });

        meatCnt=0;
        Burger2Btn.setOnAction(event -> {
            String selected = "Burger 150g";
            if (!selected.equals(currentMeat)) {
                meatCnt = 0;
                currentMeat = selected;
            }
            meatCnt++;
            System.out.println("Burger 2 Button Pressed");
            builder.setMeatType("Burger 150g");
            builder.setMeatImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Burger2.jpg");
            builder.setMeatPrice(20);
            meatSelect.setText(builder.getMeatType() + (meatCnt > 1 ? " (" + meatCnt + ")" : ""));
            meatImg.setImage(new Image(builder.getMeatImageURL()));
        });

    }

    public void VegatablesAction(){
        vegatablesCnt=0;
        onionBtn.setOnAction(event -> {
            String selected = "Onion";
            if (!selected.equals(currentVegatables)) {
                vegatablesCnt = 0;
                currentVegatables = selected;
            }
            vegatablesCnt++;
            System.out.println("Onion Button Pressed");
            builder.setVegatablesType("Onion");
            builder.setVegatablesPrice(1);
            builder.setVegatablesImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Onion.jpg");
            System.out.println(builder.getVegatablesType());
            System.out.println(builder.getVegatablesPrice());
            vegatablesSelect.setText(builder.getVegatablesType() + (vegatablesCnt > 1 ? " (" + vegatablesCnt + ")" : ""));
            vegatablesImg.setImage(new Image(builder.getVegatablesImageURL()));


        });

        vegatablesCnt=0;
        cuBtn.setOnAction(event -> {
                String selected = "cucumber";
                if (!selected.equals(currentVegatables)) {
                    vegatablesCnt = 0;
                    currentVegatables = selected;
                }
            vegatablesCnt++;
            System.out.println("Cucumber Button Pressed");
            builder.setVegatablesType("cucumber");
            builder.setVegatablesPrice(1);
            builder.setVegatablesImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Cucombar.jpg");
            System.out.println(builder.getVegatablesType());
            System.out.println(builder.getVegatablesPrice());
            vegatablesSelect.setText(builder.getVegatablesType() + (vegatablesCnt > 1 ? " (" + vegatablesCnt + ")" : ""));
            vegatablesImg.setImage(new Image(builder.getVegatablesImageURL()));
        });

        lettuceBtn.setOnAction(event -> {
            String selected = "lettuce";
            if (!selected.equals(currentVegatables)) {
                vegatablesCnt = 0;
                currentVegatables = selected;

            }
            vegatablesCnt++;
            System.out.println("Lettuce Button Pressed");
            builder.setVegatablesType("lettuce");
            builder.setVegatablesPrice(1);
            builder.setVegatablesImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\lettuce.jpeg");
            System.out.println(builder.getVegatablesType());
            System.out.println(builder.getVegatablesPrice());
            vegatablesSelect.setText(builder.getVegatablesType() +(vegatablesCnt > 1 ? " (" + vegatablesCnt + ")" : ""));
            vegatablesImg.setImage(new Image(builder.getVegatablesImageURL()));
        });

        vegatablesCnt=0;
        tomatoBtn.setOnAction(event -> {
            String selected = "tomato";
            if (!selected.equals(currentVegatables)) {
                vegatablesCnt = 0;
                currentVegatables = selected;
            }
            vegatablesCnt++;
            System.out.println("Tomato Button Pressed");
            builder.setVegatablesType("Tomato");
            builder.setVegatablesPrice(1);
            builder.setVegatablesImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Tomato.jpg");
            System.out.println(builder.getVegatablesType());
            System.out.println(builder.getVegatablesPrice());
            vegatablesSelect.setText(builder.getVegatablesType() + (vegatablesCnt > 1 ? " (" + vegatablesCnt + ")" : ""));
            vegatablesImg.setImage(new Image(builder.getVegatablesImageURL()));
        });
    }

    public void CheeseAction(){

        cheeseCnt = 0;
        ch1Btn.setOnAction(event -> {
            String selected = "Blue Cheese";
            if (!selected.equals(currentCheese)) {
                cheeseCnt = 0;
                currentCheese = selected;
            }
            cheeseCnt++;
            System.out.println("ch1 Button Pressed");
            builder.setCheeseType("Blue Cheese");
            builder.setCheesePrice(2);
            builder.setCheeseImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\ch2.jpg");
            System.out.println(builder.getCheeseType());
            System.out.println(builder.getCheesePrice());
            cheeseSelect.setText(builder.getCheeseType() + (cheeseCnt > 1 ? " (" + cheeseCnt + ")" : ""));
            cheeseImg.setImage(new Image(builder.getCheeseImageURL()));

        });

        cheeseCnt = 0;
        ch2Btn.setOnAction(event -> {
            String selected = "Manchego";
            if (!selected.equals(currentCheese)) {
                cheeseCnt = 0;
                currentCheese = selected;
            }
            cheeseCnt++;
            System.out.println("ch2 Button Pressed");
            builder.setCheeseType("Manchego");
            builder.setCheesePrice(2);
            builder.setCheeseImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\ch1.jpg");
            System.out.println(builder.getCheeseType());
            System.out.println(builder.getCheesePrice());
            cheeseSelect.setText(builder.getCheeseType() +(cheeseCnt > 1 ? " (" + cheeseCnt + ")" : ""));
            cheeseImg.setImage(new Image(builder.getCheeseImageURL()));

        });

        cheeseCnt = 0;
        ch3Btn.setOnAction(event -> {
            String selected = "Cheeder";
            if (!selected.equals(currentCheese)) {
                cheeseCnt = 0;
                currentCheese = selected;
            }
            cheeseCnt++;
            System.out.println("ch3 Button Pressed");
            builder.setCheeseType("Cheeder");
            builder.setCheesePrice(2);
            builder.setCheeseImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\ch4.jpg");
            System.out.println(builder.getCheeseType());
            System.out.println(builder.getCheesePrice());
            cheeseSelect.setText(builder.getCheeseType() + (cheeseCnt> 1 ? " (" + cheeseCnt + ")" : ""));
            cheeseImg.setImage(new Image(builder.getCheeseImageURL()));

        });

        cheeseCnt = 0;
        ch4Btn.setOnAction(event -> {
            String selected = "Fontina";
            if (!selected.equals(currentCheese)) {
                cheeseCnt = 0;
                currentCheese = selected;
            }
            cheeseCnt++;
            System.out.println("ch4 Button Pressed");
            builder.setCheeseType("Fontina");
            builder.setCheesePrice(2);
            builder.setCheeseImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\ch3.jpg");
            System.out.println(builder.getCheeseType());
            System.out.println(builder.getCheesePrice());
            cheeseSelect.setText(builder.getCheeseType() + (cheeseCnt > 1 ? " (" + cheeseCnt + ")" : ""));
            cheeseImg.setImage(new Image(builder.getCheeseImageURL()));

        });
    }

    public void beardAction(){

        b1Btn.setOnAction(event -> {
            String selected = "Multigrain";
            if (!selected.equals(currentBeard)) {
                beardCnt = 0;
                currentBeard = selected;
            }
            beardCnt++;
            System.out.println("b1 Button Pressed");
            builder.setBeardType("Multigrain");
            builder.setBeardPrice(2);
            builder.setBeardImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Multigrain.jpg");
            System.out.println(builder.getBeardType());
            System.out.println(builder.getBeardPrice());
            beardSelect.setText(builder.getBeardType() + (beardCnt > 1 ? " (" + beardCnt + ")" : ""));
            breadimg.setImage(new Image(builder.getBeardImageURL()));

        });
        beardCnt= 0;
        b2Btn.setOnAction(event -> {
            String selected = "Focaccia";
            if (!selected.equals(currentBeard)) {
                beardCnt = 0;
                currentBeard = selected;
            }
            beardCnt++;
            System.out.println("ch2 Button Pressed");
            builder.setBeardType("Focaccia");
            builder.setBeardPrice(2);
            builder.setBeardImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Focaccia.jpg");
            System.out.println(builder.getBeardType());
            System.out.println(builder.getBeardPrice());
            beardSelect.setText(builder.getBeardType() + (beardCnt > 1 ? " (" + beardCnt + ")" : ""));
            breadimg.setImage(new Image(builder.getBeardImageURL()));

        });

        b3Btn.setOnAction(event -> {
            String selected = "Sour Dough";

            if (!selected.equals(currentBeard)) {
                beardCnt = 0;
                currentBeard = selected;
            }
            beardCnt++;
            System.out.println("ch3 Button Pressed");
            builder.setBeardType("Sour Dough");
            builder.setBeardPrice(2);
            builder.setBeardImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Sourdough.jpg");
            System.out.println(builder.getBeardType());
            System.out.println(builder.getBeardPrice());
            beardSelect.setText(builder.getBeardType() + (beardCnt > 1 ? " (" + beardCnt + ")" : ""));
            breadimg.setImage(new Image(builder.getBeardImageURL()));
        });

        b4Btn.setOnAction(event -> {
            String selected = "French Kizar";
            if (!selected.equals(currentBeard)) {
                beardCnt = 0;
                currentBeard = selected;
            }
            beardCnt++;
            System.out.println("ch4 Button Pressed");
            builder.setBeardType("French Kizar");
            builder.setBeardPrice(2);
            builder.setBeardImageURL("C:\\Users\\Taham\\IdeaProjects\\DesignPattern1\\src\\main\\resources\\com\\example\\designpattern1\\Photoes\\Kizar.jpg");
            System.out.println(builder.getBeardType());
            System.out.println(builder.getBeardPrice());
            beardSelect.setText(builder.getBeardType()+ (beardCnt > 1 ? " (" + beardCnt + ")" : ""));
            breadimg.setImage(new Image(builder.getBeardImageURL()));

        });
    }

    private void updateTotalPriceDisplay() {
        double totalPriceFromCustom = cloneOrder.getTotalPrice();
        double totalPriceFromDishes = totalPriceDishes;

        double total = totalPriceFromCustom + totalPriceFromDishes;
        double tax = total * fees;
        double totalWithTax = total + tax;

        orderPrice.setText(String.format("%.2f $", total));
        taxPrice.setText(String.format("%.2f $", tax));
        totalPrice.setText(String.format("%.2f $", totalWithTax));

        System.out.println("Updated Total: " + total);
    }

    public void payAction() {
        payCusBtn.setOnAction(event -> {
            // Check if any item is selected before proceeding
            if (builder.getMeatType() == "" && builder.getVegatablesType() == "" && builder.getBeardType() == "" && builder.getCheeseType() == "" ) {
                System.out.println("No items selected. Cannot proceed with payment.");
                return;
            }

            // Clone the order from builder
            cloneOrder = cloneOrder.cloneObject(
                    builder.getVegatablesPrice(), builder.getMeatPrice(), builder.getBeardPrice(), builder.getCheesePrice(),
                    builder.getMeatType(), builder.getVegatablesType(), builder.getBeardType(), builder.getCheeseType(),
                    builder.getMeatImageURL(), builder.getVegatablesImageURL(), builder.getCheeseImageURL(), builder.getBeardImageURL(),
                    meatCnt, vegatablesCnt, cheeseCnt, beardCnt
            );

            // Debugging: Print cloned items
            System.out.println(cloneOrder.getBeardType() + " Cloned");
            System.out.println(cloneOrder.getMeatType() + " Cloned");
            System.out.println(cloneOrder.getVegatablesType() + " Cloned");
            System.out.println(cloneOrder.getCheeseType() + " Cloned");

            addHorizontalSection(cloneOrder.getMeatImageURL(), cloneOrder.getMeatType() + "( " + meatCnt + " )", cloneOrder.getMeatPrice() + " $");
            addHorizontalSection(cloneOrder.getVegatablesImageURL(), cloneOrder.getVegatablesType() + "( " + vegatablesCnt + " )", cloneOrder.getVegatablesPrice() + " $");
            addHorizontalSection(cloneOrder.getCheeseImageURL(), cloneOrder.getCheeseType() + "( " + cheeseCnt + " )", cloneOrder.getCheesePrice() + " $");
            addHorizontalSection(cloneOrder.getBeardImageURL(), cloneOrder.getBeardType() + "( " + beardCnt + " )", cloneOrder.getBeardPrice() + " $");

            updateTotalPriceDisplay();

            ingedForm.setVisible(false);
            cancelCusBtn.setVisible(true);
            payCusBtn.setVisible(false);
            stCusFrame.setVisible(false);
            ndCusFrame.setVisible(false);
            rdCusFrame.setVisible(false);
            thCusFrame.setVisible(false);
            menuFrame.setVisible(true);

            builder.reset();
            meatSelect.setText("");
            vegatablesSelect.setText("");
            cheeseSelect.setText("");
            beardSelect.setText("");
            meatImg.setImage(null);
            vegatablesImg.setImage(null);
            cheeseImg.setImage(null);
            breadimg.setImage(null);
            meatCnt = 0;
            vegatablesCnt = 0;
            cheeseCnt = 0;
            beardCnt = 0;
         //   totalPriceDishes();
            storeOrderbuilder(cloneOrder.getMeatType() , cloneOrder.getMeatPrice() , cloneOrder.getMeatImageURL()
            , cloneOrder.getVegatablesType(), cloneOrder.getVegatablesPrice(), cloneOrder.getVegatablesImageURL(),
            cloneOrder.getCheeseType(), cloneOrder.getCheesePrice(), cloneOrder.getCheeseImageURL(),
            cloneOrder.getBeardType() , cloneOrder.getBeardPrice() , cloneOrder.getBeardImageURL());

            cloneOrder.displayOrders();
            System.out.println("totalPriceDishes: " + totalPriceDishes);

        });
    }

    public void addHorizontalSection(String imagePath, String title, String description) {
        // ImageView
        Image image = new Image(imagePath);
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(80);
        imageView.setFitHeight(80);
        imageView.setPreserveRatio(true);

        // Labels
        Label titleLabel = new Label(title);
        titleLabel.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");

        Label descriptionLabel = new Label(description);
        descriptionLabel.setStyle("-fx-font-size: 12px;");

        // VBox for the two labels
        VBox labelBox = new VBox(5, titleLabel, descriptionLabel);
        labelBox.setAlignment(Pos.CENTER_LEFT);

        // HBox for the whole section
        HBox section = new HBox(10, imageView, labelBox);
        section.setAlignment(Pos.CENTER_LEFT);
        section.setStyle("-fx-background-color: #f2f2f2; -fx-border-color: #cccccc; -fx-border-width: 1px;");

        // Add the HBox to the VBox (vertical stacking)
        vboxContent.getChildren().add(section);

    }

    Order order = new RestaurantOrder();
    int totalPriceDishes = 0;

    public void addDataMenu(){
        Product product = order.addProduct("Cheese Beard");
        Name1.setText(product.getName());
        price1.setText(product.getPrice() + " $");
        Image image = new Image(product.getImageURL());
        imageView1.setImage(image);
        imageView1.setFitWidth(150);
        imageView1.setPreserveRatio(true);
        dish1.setOnAction(event -> {
            addHorizontalSection(product.getImageURL(), product.getName(), product.getPrice() + " $");
            totalPriceDishes += product.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("Cheese Beard");
            updateTotalPriceDisplay();
           // order.displayOrders();

        });

        Product product2 = order.addProduct("Shrimp");
        name2.setText(product2.getName());
        price2.setText(product2.getPrice() + " $");
        Image image2 = new Image(product2.getImageURL());
        ImageView2.setImage(image2);
        ImageView2.setFitWidth(150);
        ImageView2.setPreserveRatio(true);
        dish2.setOnAction(event -> {
            addHorizontalSection(product2.getImageURL(), product2.getName(), product2.getPrice() + " $");
            totalPriceDishes += product2.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("Shrimp");
            updateTotalPriceDisplay();
          //  order.displayOrders();

        });

        Product product3 = order.addProduct("salad");
        name3.setText(product3.getName());
        price3.setText(product3.getPrice() + " $");
        Image image3 = new Image(product3.getImageURL());
        imageView3.setImage(image3);
        imageView3.setFitWidth(158);
        imageView3.setFitHeight(145);
        imageView3.setPreserveRatio(true);
        dish3.setOnAction(event -> {
            addHorizontalSection(product3.getImageURL(), product3.getName(), product3.getPrice() + " $");
            totalPriceDishes += product3.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("salad");
        //    order.displayOrders();
            updateTotalPriceDisplay();
        });
        Product product4 = order.addProduct("plain beard");
        name4.setText(product4.getName());
        price4.setText(product4.getPrice() + " $");
        Image image4 = new Image(product4.getImageURL());
        imageVIew4.setImage(image4);
        imageVIew4.setFitWidth(150);
        imageVIew4.setPreserveRatio(true);
        dish4.setOnAction(event -> {
            addHorizontalSection(product4.getImageURL(), product4.getName(), product4.getPrice() + " $");
            totalPriceDishes += product4.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("plain beard");
           // order.displayOrders();
            updateTotalPriceDisplay();
        });

        Product product5 = order.addProduct("cheese cake");
        name5.setText(product5.getName());
        price5.setText(product5.getPrice() + " $");
        Image image5 = new Image(product5.getImageURL());
        imageView5.setImage(image5);
        imageView5.setFitWidth(158);
        imageView5.setPreserveRatio(true);
        dish5.setOnAction(event -> {
            addHorizontalSection(product5.getImageURL(), product5.getName(), product5.getPrice() + " $");
            totalPriceDishes += product5.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("cheese cake");
        //    order.displayOrders();
            updateTotalPriceDisplay();
        });

        Product product6 = order.addProduct("grilled meat");
        name6.setText(product6.getName());
        price6.setText(product6.getPrice() + " $");
        Image image6 = new Image(product6.getImageURL());
        imageView6.setImage(image6);
        imageView6.setFitWidth(158);
        imageView6.setPreserveRatio(true);
        dish6.setOnAction(event -> {
            addHorizontalSection(product6.getImageURL(), product6.getName(), product6.getPrice() + " $");
            totalPriceDishes += product6.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("grilled meat");
         //   order.displayOrders();
            updateTotalPriceDisplay();
        });

        Product product7 = order.addProduct("spagetti");
        name7.setText(product7.getName());
        price7.setText(product7.getPrice() + " $");
        Image image7 = new Image(product7.getImageURL());
        imageView7.setImage(image7);
        imageView7.setFitWidth(200);
        imageView7.setFitHeight(145);
        imageView7.setPreserveRatio(true);
        dish7.setOnAction(event -> {
           addHorizontalSection(product7.getImageURL(), product7.getName(), product7.getPrice() + " $");
           totalPriceDishes += product7.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("spagetti");
         //   order.displayOrders();
            updateTotalPriceDisplay();
        });

        Product product8 = order.addProduct("vegatables spagetti");
        name8.setText(product8.getName());
        price8.setText(product8.getPrice() + " $");
        Image image8 = new Image(product8.getImageURL());
        imageView8.setImage(image8);
        imageView8.setFitWidth(160);
        imageView8.setFitHeight(185);
        imageView8.setPreserveRatio(true);
        dish8.setOnAction(event -> {
            addHorizontalSection(product8.getImageURL(), product8.getName(), product8.getPrice() + " $");
            totalPriceDishes += product8.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("vegatables spagetti");
         //   order.displayOrders();
            updateTotalPriceDisplay();


        });

        Product product9 = order.addProduct("dish1");
        name8.setText(product9.getName());
        price8.setText(product9.getPrice() + " $");
        Image image9 = new Image(product9.getImageURL());
        imageView9.setImage(image9);
        imageView9.setFitWidth(160);
        imageView9.setFitHeight(185);
        imageView9.setPreserveRatio(true);
        dish9.setOnAction(event -> {
            addHorizontalSection(product9.getImageURL(), product9.getName(), product9.getPrice() + " $");
            totalPriceDishes += product9.getPrice();
            System.out.println("totalPriceDishes: " + totalPriceDishes);
            double totalTaxOrders =  totalPriceDishes*fees;
            double totalPriceOrdersWithTax = totalPriceDishes + totalTaxOrders;
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(totalPriceOrdersWithTax + " $");
            order.storeOrder("dish1");
       //     System.out.println("totalPriceDishes: " + totalPriceDishes);
         //   order.displayOrders();
            updateTotalPriceDisplay();
        });
        System.out.println("totalPriceDishes: " + totalPriceDishes);

    }

    private void showCustomerStep(
            boolean menuVisible,
            boolean stVisible,
            boolean ndVisible,
            boolean rdVisible,
            boolean thVisible,
            boolean ingredientsVisible,
            boolean cancelVisible,
            boolean payVisible
    ) {
        menuFrame.setVisible(menuVisible);
        stCusFrame.setVisible(stVisible);
        ndCusFrame.setVisible(ndVisible);
        rdCusFrame.setVisible(rdVisible);
        thCusFrame.setVisible(thVisible);
        ingedForm.setVisible(ingredientsVisible);
        cancelCusBtn.setVisible(cancelVisible);
        payCusBtn.setVisible(payVisible);
    }

    Service tableType;

    public Service IndoorAction() {
        ServiceForm.setVisible(false);
        menuFrame.setVisible(false);
        tableForm.setVisible(true);
        stCusFrame.setVisible(false);
        ndCusFrame.setVisible(false);
        rdCusFrame.setVisible(false);
        thCusFrame.setVisible(false);
        ingedForm.setVisible(false);
        cancelCusBtn.setVisible(false);
        payCusBtn.setVisible(false);
        tableTyp ="Indoor";
        tableType = serviceFactory.getService(tableTyp);
        System.out.println(tableType.getFess());
        TableType1.setText(tableTyp);

        return tableType;
    }

    public Service OutdoorAction() {
        ServiceForm.setVisible(false);
        menuFrame.setVisible(false);
        tableForm.setVisible(true);
        stCusFrame.setVisible(false);
        ndCusFrame.setVisible(false);
        rdCusFrame.setVisible(false);
        thCusFrame.setVisible(false);
        ingedForm.setVisible(false);
        cancelCusBtn.setVisible(false);
        payCusBtn.setVisible(false);
        tableTyp ="Outdoor";
        tableType = serviceFactory.getService(tableTyp);
        System.out.println(tableType.getFess());
        TableType1.setText(tableTyp);

        return tableType;
    }

    public Service VIPAction() {
        ServiceForm.setVisible(false);
        menuFrame.setVisible(false);
        tableForm.setVisible(true);
        stCusFrame.setVisible(false);
        ndCusFrame.setVisible(false);
        rdCusFrame.setVisible(false);
        thCusFrame.setVisible(false);
        ingedForm.setVisible(false);
        cancelCusBtn.setVisible(false);
        payCusBtn.setVisible(false);
        tableTyp ="VIP";
        tableType = serviceFactory.getService(tableTyp);
        System.out.println(tableType.getFess());
        TableType1.setText(tableTyp);

        return tableType;
    }

    public Service DeliveryAction() {
        ServiceForm.setVisible(false);
        menuFrame.setVisible(true);
        tableForm.setVisible(false);
        stCusFrame.setVisible(false);
        ndCusFrame.setVisible(false);
        rdCusFrame.setVisible(false);
        thCusFrame.setVisible(false);
        ingedForm.setVisible(false);
        cancelCusBtn.setVisible(false);
        payCusBtn.setVisible(false);
        tableTyp ="delivery";
//        tableType = serviceFactory.getService(tableTyp);
//        System.out.println(tableType.getFess());
//        TableType1.setText(tableTyp);

        return tableType;
    }

    public Service takeAwayAction() {
        ServiceForm.setVisible(false);
        menuFrame.setVisible(true);
        tableForm.setVisible(false);
        stCusFrame.setVisible(false);
        ndCusFrame.setVisible(false);
        rdCusFrame.setVisible(false);
        thCusFrame.setVisible(false);
        ingedForm.setVisible(false);
        cancelCusBtn.setVisible(false);
        payCusBtn.setVisible(false);
        tableTyp ="TakeAway";

        return tableType;
    }

    public void t1Action(){
        t1Selected.setVisible(true);
        t2Selected.setVisible(false);
        t3Selected.setVisible(false);
        t4Selected.setVisible(false);
        t5Selected.setVisible(false);

        if (tableTyp == null) {
            System.err.println("tableType is not initialized. Please call IndoorAction() first.TTT");
            return ;
        }
        System.out.println("Table Type: " + tableTyp);

        if (tableType != null) {
            fees= tableType.getFess();
        }
        System.out.println("Fees: ddd" + fees);
        tableNumber = 1;
        System.out.println("Table Number: " + tableNumber);
        TableNum.setText("T" + tableNumber);
    }

    public void t2Action(){
        t1Selected.setVisible(false);
        t2Selected.setVisible(true);
        t3Selected.setVisible(false);
        t4Selected.setVisible(false);
        t5Selected.setVisible(false);

        if (tableTyp == null) {
            System.err.println("tableType is not initialized. Please call IndoorAction() first.TTT");
            return ;
        }
        System.out.println("Table Type: " + tableTyp);

        if (tableType != null) {
            fees= tableType.getFess();
        }
        System.out.println("Fees: ddd" + fees);
        tableNumber = 2;
        System.out.println("Table Number: " + tableNumber);
        TableNum.setText("T" + tableNumber);
    }

    public void t3Action(){
        t1Selected.setVisible(false);
        t3Selected.setVisible(true);
        t2Selected.setVisible(false);
        t4Selected.setVisible(false);
        t5Selected.setVisible(false);

        if (tableTyp == null) {
            System.err.println("tableType is not initialized. Please call IndoorAction() first.TTT");
            return ;
        }
        System.out.println("Table Type: " + tableTyp);

        if (tableType != null) {
            fees= tableType.getFess();
        }
        System.out.println("Fees: ddd" + fees);
        tableNumber = 3;
        System.out.println("Table Number: " + tableNumber);
        TableNum.setText("T" + tableNumber);
    }

    public void t4Action(){
        t1Selected.setVisible(false);
        t2Selected.setVisible(false);
        t3Selected.setVisible(false);
        t4Selected.setVisible(true);
        t5Selected.setVisible(false);

        if (tableTyp == null) {
            System.err.println("tableType is not initialized. Please call IndoorAction() first.TTT");
            return ;
        }
        System.out.println("Table Type: " + tableTyp);

        if (tableType != null) {
            fees= tableType.getFess();
        }
        System.out.println("Fees: ddd" + fees);
        tableNumber = 4;
        System.out.println("Table Number: " + tableNumber);
        TableNum.setText("T" + tableNumber);
    }

    public void t5Action(){
        t1Selected.setVisible(false);
        t5Selected.setVisible(true);
        t3Selected.setVisible(false);
        t4Selected.setVisible(false);
        t2Selected.setVisible(false);

        if (tableTyp == null) {
            System.err.println("tableType is not initialized. Please call IndoorAction() first.TTT");
            return ;
        }
        System.out.println("Table Type: " + tableTyp);

        if (tableType != null) {
            fees= tableType.getFess();
        }
        System.out.println("Fees: ddd" + fees);
        tableNumber = 5;
        System.out.println("Table Number: " + tableNumber);
        TableNum.setText("T" + tableNumber);
    }

    public void tableFormBtnSelect(){
        tableForm.setVisible(false);
        menuFrame.setVisible(true);
        menuForm.setVisible(true);

    }

    public void totalPriceDishes() {
        if(cloneOrder.getTotalPrice() != 0) {
            totalPriceDishes += cloneOrder.getOrderPrice();
            double  totalTaxOrders = totalPriceDishes*fees;
            double  ttotalPrice = totalPriceDishes + totalTaxOrders;
            orderPrice.setText(totalPriceDishes + " $");
            taxPrice.setText(totalTaxOrders + " $");
            totalPrice.setText(ttotalPrice + " $");
            System.out.println("totalPriceDishes: " + totalPriceDishes);

        }
        else if(cloneOrder.getTotalPrice() == 0){
            orderPrice.setText(totalPriceDishes + " $");
            taxPrice.setText(totalPriceDishes*fees + " $");
            totalPrice.setText((totalPriceDishes*fees )+ totalPriceDishes  + " $");
        }
        else if(totalPriceDishes == 0){
            orderPrice.setText(cloneOrder.getOrderPrice() + " $");
            taxPrice.setText(cloneOrder.getOrderPrice()*fees + " $");
            totalPrice.setText(cloneOrder.getOrderPrice() + " $");
        }

    }

    public void SwitchForm(){
        homeBtn.setOnAction(event -> {
            homeIcon1.setVisible(false);
            homeActive1.setVisible(true);
        });

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(t2Btn);
        System.out.println(t2Selected);



        scrollPane.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);
        scrollPane2.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

      totalPriceDishes();


        payAction();

        VegatablesAction();

        MeatAction();

        startClockThread();

        addDataMenu();


        menuCusBtn.setOnAction(event ->
                showCustomerStep(false, true, false, false, false, true, false, false)
        );

        stBtCus.setOnAction(event ->
                showCustomerStep(true, false, false, false, false, false, false, false)
        );

        stFdCus.setOnAction(event ->
                showCustomerStep(false, false, true, false, false, true, false, false)
        );

        ndCusBtnB.setOnAction(event ->
                showCustomerStep(false, true, false, false, false, true, false, false)
        );

        ndCusBtnF.setOnAction(event ->
                showCustomerStep(false, false, false, true, false, true, false, false)
        );

        rdBtnCusB.setOnAction(event ->
                showCustomerStep(false, false, true, false, false, true, false, false)
        );

        rdBtnCusF.setOnAction(event ->
                showCustomerStep(false, false, false, false, true, true, true, true)
        );

        thBtnCusB.setOnAction(event ->
                showCustomerStep(false, false, false, true, false, true, false, false)
        );

        cancelCusBtn.setOnAction(event -> {
            meatSelect.setText("");
            vegatablesSelect.setText("");
            cheeseSelect.setText("");
            beardSelect.setText("");
            meatImg.setImage(null);
            vegatablesImg.setImage(null);
            cheeseImg.setImage(null);
            breadimg.setImage(null);
            vboxContent.getChildren().clear();
            cloneOrder.clear();
            builder.clear();
            orderPrice.setText("");
            taxPrice.setText("");
            totalPrice.setText("");
        });


    }

    private void startClockThread() {
        Thread timeThread = new Thread(() -> {
            while (true) {
                String formattedTime = getFormattedDateTime();
                Platform.runLater(() -> time.setText(formattedTime));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        timeThread.setDaemon(true);
        timeThread.start();
    }

    private String getFormattedDateTime() {
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        String suffix = getDaySuffix(day);
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy, h:mma");
        String formatted = formatter.format(now);
        return formatted.replaceFirst(String.valueOf(day), day + suffix);
    }

    private String getDaySuffix(int day) {
        if (day >= 11 && day <= 13) return "th";
        return switch (day % 10) {
            case 1 -> "st";
            case 2 -> "nd";
            case 3 -> "rd";
            default -> "th";
        };
    }
}
