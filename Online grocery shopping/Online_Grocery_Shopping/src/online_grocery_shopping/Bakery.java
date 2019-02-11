
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

public class Bakery extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public double bakery[] = {30,10,10};
    public double priceA = 0;
    public double priceT = 0;
    public double priceF = 0;
    public double totalPrice=0;
    public double qa,qt,qf;
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
        
        Label title=new Label("Bakery");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        Image allti = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/alltime.jpg",160,130,true,true);
        ImageView alltiv = new ImageView(allti);
        CheckBox allt = new CheckBox("Alltime cake 30/pcs BDT");
        gdtop.add(alltiv,0,1);
        gdtop.add(allt,1,1);
        
        
        Label quantityall=new Label("Enter quantity");
        quantityall.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityall, 2, 1);
        
         TextField alltt=new TextField();
         alltt.setPromptText("Quantity");
         gdtop.add(alltt, 3, 1);
        
         quantityall.setVisible(false);
         alltt.setVisible(false);
         allt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(allt.isSelected()){
                    quantityall.setVisible(true);
                    alltt.setVisible(true);
                }
                else{
                    quantityall.setVisible(false);
                    alltt.setVisible(false);
                }
            }
        });
         
        Image tiffini = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/tiffin.jpg",160,130,true,true);
        ImageView tiffiniv = new ImageView(tiffini);
        CheckBox tiffin = new CheckBox("Tiffin cake 10/pcs BDT");
        gdtop.add(tiffiniv,0,2);
        gdtop.add(tiffin,1,2);
        
        
        Label quantitytiffin=new Label("Enter quantity");
        quantitytiffin.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantitytiffin, 2, 2);
        
         TextField tiffint=new TextField();
         tiffint.setPromptText("Quantity");
         gdtop.add(tiffint, 3, 2);
        
         quantitytiffin.setVisible(false);
         tiffint.setVisible(false);
         tiffin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tiffin.isSelected()){
                    quantitytiffin.setVisible(true);
                    tiffint.setVisible(true);
                }
                else{
                    quantitytiffin.setVisible(false);
                    tiffint.setVisible(false);
                }
            }
        });
         
        Image funi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/fun.jpg",160,130,true,true);
        ImageView funiv = new ImageView(funi);
        CheckBox fun = new CheckBox("Funbite cake 10/pcs BDT");
        gdtop.add(funiv,0,3);
        gdtop.add(fun,1,3);
        
        
        Label quantityfun=new Label("Enter quantity");
        quantityfun.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityfun, 2, 3);
        
         TextField funt=new TextField();
         funt.setPromptText("Quantity");
         gdtop.add(funt, 3, 3);
        
         quantityfun.setVisible(false);
         funt.setVisible(false);
         fun.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(fun.isSelected()){
                    quantityfun.setVisible(true);
                    funt.setVisible(true);
                    
                }
                else{
                    quantityfun.setVisible(false);
                    funt.setVisible(false);
                }
            }
        });
         
        Button back = new Button("<<Back");
        
        gdtop.add(back,3,4);
        
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
        
        gdtop.add(addBtn,4,4);
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label lbl = new Label();
                gdtop.add(lbl,3,5);
                try{
                    if(allt.isSelected())
                    qa = Double.parseDouble(alltt.getText());
                priceA = bakery[0]*qa;
                
                if(fun.isSelected())
                    qf = Double.parseDouble(funt.getText());
                priceF = bakery[2]*qf;
                
                if(tiffin.isSelected())
                     qt = Double.parseDouble(tiffint.getText());
                priceT = bakery[1]*qt;
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
