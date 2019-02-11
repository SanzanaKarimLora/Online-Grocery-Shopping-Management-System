
package online_grocery_shopping;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;



public class Oil extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public double qTeer, qRup,qOlive, qVeg, qMas;
    public double priceTeer=0, priceRup=0,priceOlive=0, priceVeg=0, priceMas=0, totalPrice=0;
    public double oil[] = {110,550,200,900,60};
    @Override
    public void start(Stage primaryStage) throws Exception {
       BorderPane bp=new BorderPane();
        bp.setPadding(new Insets(30,30,30,30));
        
        
        HBox hbtit=new HBox();
        hbtit.setPadding(new Insets(10,10,10,10));
        hbtit.setSpacing(10);
        
        HBox hb=new HBox();
        hb.setPadding(new Insets(10,10,10,10));
        hb.setSpacing(10);
        hb.getChildren().addAll(hbtit);
        hb.setStyle("-fx-background-color: #4AA7AD;");
        bp.setTop(hb);
        
        HBox hdb=new HBox();
        hdb.setPadding(new Insets(5,5,5,5));
        hdb.setSpacing(10);
        hdb.setStyle("-fx-background-color: #4AA7AD;");
        bp.setBottom(hdb);
        
        VBox vdl=new VBox();
        vdl.setPadding(new Insets(10,10,10,10));
        vdl.setSpacing(10);
        vdl.setStyle("-fx-background-color: #4AA7AD;");
        bp.setLeft(vdl);
        
        VBox vdr=new VBox();
        vdr.setPadding(new Insets(10,10,10,10));
        vdr.setSpacing(10);
        vdr.setStyle("-fx-background-color: #4AA7AD;");
        bp.setRight(vdr);
        
        GridPane gdtop=new GridPane();
        gdtop.setPadding(new Insets(30,30,30,30));
        gdtop.setVgap(30);
        gdtop.setHgap(20);
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
        
        Label title=new Label("Oil");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        Image teeri = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/teer.jpg",160,130,true,true);
        ImageView teeriv = new ImageView(teeri);
        CheckBox teer = new CheckBox("Teer Soyabean Oil 1L 110 BDT");
        gdtop.add(teeriv,0,1);
        gdtop.add(teer,1,1);
        
        
        Label quantityteer=new Label("Enter quantity");
        quantityteer.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityteer, 2, 1);
        
         TextField teert=new TextField();
         teert.setPromptText("Quantity");
         gdtop.add(teert, 3, 1);
        
         quantityteer.setVisible(false);
         teert.setVisible(false);
         teer.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(teer.isSelected()){
                    quantityteer.setVisible(true);
                    teert.setVisible(true);
                }
                else{
                    quantityteer.setVisible(false);
                    teert.setVisible(false);
                }
            }
        });
         
        
        Image rupchadai = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/rupchada.jpg",160,130,true,true);
        ImageView rupchadaiv = new ImageView(rupchadai);
        CheckBox rupchada = new CheckBox("Rupchada Soyabean Oil 5L 550 BDT");
        gdtop.add(rupchadaiv,0,2);
        gdtop.add(rupchada,1,2);
        
        
        Label quantityrup=new Label("Enter quantity");
        quantityrup.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityrup, 2, 2);
        
         TextField rupt=new TextField();
         rupt.setPromptText("Quantity");
         gdtop.add(rupt, 3, 2);
        
         quantityrup.setVisible(false);
         rupt.setVisible(false);
         rupchada.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(rupchada.isSelected()){
                    quantityrup.setVisible(true);
                    rupt.setVisible(true);
                }
                else{
                    quantityrup.setVisible(false);
                    rupt.setVisible(false);
                }
            }
        });
         
        
        Image oli = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/olive.jpg",160,130,true,true);
        ImageView oliv = new ImageView(oli);
        CheckBox ol = new CheckBox("Olive Oil 200 BDT");
        gdtop.add(oliv,0,3);
        gdtop.add(ol,1,3);
        
        
        Label quantityol=new Label("Enter quantity");
        quantityol.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityol, 2, 3);
        
         TextField olt = new TextField();
         olt.setPromptText("Quantity");
         gdtop.add(olt, 3, 3);
        
         quantityol.setVisible(false);
         olt.setVisible(false);
         ol.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(ol.isSelected()){
                    quantityol.setVisible(true);
                    olt.setVisible(true);
                    
                }
                else{
                    quantityol.setVisible(false);
                    olt.setVisible(false);
                }
            }
        });
         
        
        Image vegi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/veg oil.jpg",160,130,true,true);
        ImageView vegiv = new ImageView(vegi);
        CheckBox veg = new CheckBox("Vegetable Oil 5L 900 BDT");
        gdtop.add(vegiv,0,4);
        gdtop.add(veg,1,4);
        
        
        Label quantityveg=new Label("Enter quantity");
        quantityveg.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityveg, 2, 4);
        
         TextField vegt = new TextField();
         vegt.setPromptText("Quantity");
         gdtop.add(vegt, 3, 4);
        
         quantityveg.setVisible(false);
         vegt.setVisible(false);
         veg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(veg.isSelected()){
                    quantityveg.setVisible(true);
                    vegt.setVisible(true);
                    
                }
                else{
                    quantityveg.setVisible(false);
                    vegt.setVisible(false);
                }
            }
        });
        
        
        Image masi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/raduni mas.jpg",160,130,true,true);
        ImageView masiv = new ImageView(masi);
        CheckBox mas = new CheckBox("Radhuni Musterd Oil 250mL 60 BDT");
        gdtop.add(masiv,0,5);
        gdtop.add(mas,1,5);
        
        
        Label quantitymas=new Label("Enter quantity");
        quantitymas.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantitymas, 2, 5);
        
         TextField mast = new TextField();
         mast.setPromptText("Quantity");
         gdtop.add(mast, 3, 5);
        
         quantitymas.setVisible(false);
         mast.setVisible(false);
         mas.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(mas.isSelected()){
                    quantitymas.setVisible(true);
                    mast.setVisible(true);
                    
                }
                else{
                    quantitymas.setVisible(false);
                    mast.setVisible(false);
                }
            }
        });
        
        Button back = new Button("<<Back");
        
        gdtop.add(back,3,6);
        
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Categories ca = new Categories();
                try {
                       ca.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
        
        Button addBtn = new Button("Add");
        
        gdtop.add(addBtn,4,6);
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label lbl = new Label("Add");
                gdtop.add(lbl,3,7);
                if(teer.isSelected())
                    qTeer = Double.parseDouble(teert.getText());
                priceTeer = oil[0]*qTeer;
                
                if(rupchada.isSelected())
                    qRup = Double.parseDouble(rupt.getText());
                priceRup = oil[1]*qRup;
                
                if(ol.isSelected())
                     qOlive = Double.parseDouble(olt.getText());
                priceOlive = oil[2]*qOlive;
                
                if(veg.isSelected())
                     qVeg = Double.parseDouble(vegt.getText());
                priceVeg = oil[3]*qVeg;
                
                if(mas.isSelected())
                     qMas = Double.parseDouble(mast.getText());
                priceMas = oil[3]*qMas;
                
                totalPrice = priceTeer+priceRup + priceOlive+priceVeg+priceMas;
                lbl.setText("Price in this item " + totalPrice);
                try(FileWriter fw = new FileWriter("E:\\price.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter out = new PrintWriter(bw)){
                                      out.println(totalPrice);
    
                                      
   
                  } catch (IOException e) {
    
                   }
            }
        }); 
        
        ScrollPane sc= new ScrollPane();
        sc.setContent(gdtop);
        bp.setCenter(sc);
         
        Scene myScene = new Scene(bp,1000,600);
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
    
}

