
package online_grocery_shopping;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Calculation extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    double pr1=0,pr2=0,pr3=0,pr4=0,pr5=0,pr6=0,pr7=0,pr8=0,pr9=0,pr10=0,pr11=0,sum=0;
    

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
        
        Label title=new Label("....Calculation....");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        
        
        Label price=new Label("Total Price ");
        price.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(price, 2, 2);
        
        Scanner s1=null;
        try {
            FileInputStream ob= new FileInputStream("E:\\price.txt");
            s1=new Scanner(ob);
            
        } catch (FileNotFoundException ex) {
           System.out.print(ex);
        }
       
      try{
          
          while(s1.hasNext()) {
            
            String p1=s1.next();
            pr1 = Double.parseDouble(p1);
            String p2=s1.next();
            pr2 = Double.parseDouble(p2);
            String p3=s1.next();
            pr3 = Double.parseDouble(p2);
            sum = pr1+pr2+pr3;
            
       }
          
      }catch(Exception ex){
                  
      }
     
        
        Label total=new Label();
        total.setText(sum + " BDT ");
        total.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        clearTheFile();
        
        gdtop.add(total, 3, 3);
        
        Button order = new Button();
        order.setText("Confirm Order");
        order.setFont(Font.font("Arial",FontWeight.BOLD, 20));
        order.setStyle("-fx-background-color: #3FF4CB;");
        gdtop.add(order,4,5);
        
        order.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                HomeDelivery hd = new HomeDelivery();
                try {
                       hd.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
            }
            
        });
        
        bp.setCenter(gdtop);
         
        Scene myScene = new Scene(bp,1000,600);
        primaryStage.setScene(myScene);
        primaryStage.show();
        
    }
    
    public void clearTheFile() throws IOException {
        FileWriter fwOb = new FileWriter("E:\\price.txt", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }
}
