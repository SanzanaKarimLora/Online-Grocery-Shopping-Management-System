
package online_grocery_shopping;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Meat extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public double meat[] = {250,500,800,230};
    public double priceA = 0;
    public double priceT = 0;
    public double priceF = 0;
     public double priceD = 0;
    public double totalPrice=0;
    public double qa,qt,qf,qd;
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
        
        Label title=new Label("Meat");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        Image chickeni = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/chicken.jpg",160,130,true,true);
        ImageView chickeniv = new ImageView(chickeni);
        CheckBox chicken = new CheckBox("Chicken 250/kg BDT");
        gdtop.add(chickeniv ,0,1);
        gdtop.add(chicken,1,1);
        
        
        Label quantityall=new Label("Enter quantity");
        quantityall.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityall, 2, 1);
        
         TextField alltt=new TextField();
         alltt.setPromptText("Quantity");
         gdtop.add(alltt, 3, 1);
        
         quantityall.setVisible(false);
         alltt.setVisible(false);
         chicken.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(chicken.isSelected()){
                    quantityall.setVisible(true);
                    alltt.setVisible(true);
                }
                else{
                    quantityall.setVisible(false);
                    alltt.setVisible(false);
                }
            }
        });
         
       Image beefi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/beef.jpg",160,130,true,true);
        ImageView beefiv = new ImageView(beefi);
        CheckBox beef = new CheckBox("Beef 500/kg BDT");
        gdtop.add(beefiv,0,2);
        gdtop.add(beef,1,2);
        
        
        Label quantitytiffin=new Label("Enter quantity");
        quantitytiffin.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantitytiffin, 2, 2);
        
         TextField tiffint=new TextField();
         tiffint.setPromptText("Quantity");
         gdtop.add(tiffint, 3, 2);
        
         quantitytiffin.setVisible(false);
         tiffint.setVisible(false);
         beef.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(beef.isSelected()){
                    quantitytiffin.setVisible(true);
                    tiffint.setVisible(true);
                }
                else{
                    quantitytiffin.setVisible(false);
                    tiffint.setVisible(false);
                }
            }
        });
         
        Image muttoni = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/mutton.jpg",160,130,true,true);
        ImageView muttoniv = new ImageView(muttoni);
        CheckBox mutton = new CheckBox("Mutton 800/kg BDT");
        gdtop.add(muttoniv,0,3);
        gdtop.add(mutton,1,3);
        
        
        Label quantityfun=new Label("Enter quantity");
        quantityfun.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityfun, 2, 3);
        
         TextField funt=new TextField();
         funt.setPromptText("Quantity");
         gdtop.add(funt, 3, 3);
        
         quantityfun.setVisible(false);
         funt.setVisible(false);
         mutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(mutton.isSelected()){
                    quantityfun.setVisible(true);
                    funt.setVisible(true);
                    
                }
                else{
                    quantityfun.setVisible(false);
                    funt.setVisible(false);
                }
            }
        });
         
        Image ducki = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/duck.jpg",160,130,true,true);
        ImageView duckiv = new ImageView(ducki);
        CheckBox duck = new CheckBox("Duck 230/kg BDT");
        gdtop.add(duckiv,0,4);
        gdtop.add(duck,1,4);
        
        Label quantityd=new Label("Enter quantity");
        quantityd.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityd, 2, 4);
        
         TextField dt=new TextField();
         dt.setPromptText("Quantity");
         gdtop.add(dt, 3, 4);
        
         quantityd.setVisible(false);
         dt.setVisible(false);
         duck.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(duck.isSelected()){
                    quantityd.setVisible(true);
                    dt.setVisible(true);
                    
                }
                else{
                    quantityd.setVisible(false);
                    dt.setVisible(false);
                }
            }
        });
        
        Button back = new Button("<<Back");
        
        gdtop.add(back,3,5);
        
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
        
        gdtop.add(addBtn,4,5);
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label lbl = new Label();
                gdtop.add(lbl,3,6);
                try{
                    if(chicken.isSelected())
                    qa = Double.parseDouble(alltt.getText());
                priceA = meat[0]*qa;
                
                if(beef.isSelected())
                    qf = Double.parseDouble(tiffint.getText());
                priceF = meat[1]*qf;
                
                if(mutton.isSelected())
                     qt = Double.parseDouble(funt.getText());
                priceT = meat[2]*qt;
                
                if(duck.isSelected())
                     qd = Double.parseDouble(dt.getText());
                priceD = meat[2]*qd;
                
                totalPrice = priceA+priceF+priceT;
                lbl.setText("Price in this item " + totalPrice);
                try(FileWriter fw = new FileWriter("E:\\price.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter out = new PrintWriter(bw)){
                                      out.println(totalPrice);
    
                                      
   
                  } catch (IOException e) {
    
                   }
                }catch(Exception ex){
                    lbl.setText("Please enter quantity");
                    lbl.setTextFill(Color.RED);
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
