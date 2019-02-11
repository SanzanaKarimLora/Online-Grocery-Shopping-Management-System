
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

public class Fish extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public double fish[] = {1000,500,400,700};
    public double priceA = 0;
    public double priceT = 0;
    public double priceF = 0;
    public double priceP = 0; 
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
        
        Label title=new Label("Fish");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        Image hili = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/hilsha.jpg",160,130,true,true);
        ImageView hiliv = new ImageView(hili);
        CheckBox hil = new CheckBox("Hilsha 1000/kg BDT");
        gdtop.add(hiliv,0,1);
        gdtop.add(hil,1,1);
        
        
        Label quantityhil=new Label("Enter quantity");
        quantityhil.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityhil, 2, 1);
        
         TextField hilt=new TextField();
         hilt.setPromptText("Quantity");
         gdtop.add(hilt, 3, 1);
        
         quantityhil.setVisible(false);
         hilt.setVisible(false);
         hil.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(hil.isSelected()){
                    quantityhil.setVisible(true);
                    hilt.setVisible(true);
                }
                else{
                    quantityhil.setVisible(false);
                    hilt.setVisible(false);
                }
            }
        });
         
        Image ruhii = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/ruhi.jpg",160,130,true,true);
        ImageView ruhiiv = new ImageView(ruhii);
        CheckBox ruhi = new CheckBox("Ruhi 500/kg BDT");
        gdtop.add(ruhiiv,0,2);
        gdtop.add(ruhi,1,2);
        
        
        Label quantityr=new Label("Enter quantity");
        quantityr.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityr, 2, 2);
        
         TextField rt=new TextField();
         rt.setPromptText("Quantity");
         gdtop.add(rt, 3, 2);
        
         quantityr.setVisible(false);
         rt.setVisible(false);
         ruhi.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(ruhi.isSelected()){
                    quantityr.setVisible(true);
                    rt.setVisible(true);
                }
                else{
                    quantityr.setVisible(false);
                    rt.setVisible(false);
                }
            }
        });
         
        Image ki = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/Katla.jpg",160,130,true,true);
        ImageView kiv = new ImageView(ki);
        CheckBox kat = new CheckBox("Katla 400/kg BDT");
        gdtop.add(kiv,0,3);
        gdtop.add(kat,1,3);
        
        
        Label quantityk=new Label("Enter quantity");
        quantityk.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityk, 2, 3);
        
         TextField kt=new TextField();
         kt.setPromptText("Quantity");
         gdtop.add(kt, 3, 3);
        
         quantityk.setVisible(false);
         kt.setVisible(false);
         kat.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(kat.isSelected()){
                    quantityk.setVisible(true);
                    kt.setVisible(true);
                    
                }
                else{
                    quantityk.setVisible(false);
                    kt.setVisible(false);
                }
            }
        });
         
        Image pi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/prone.jpg",160,130,true,true);
        ImageView piv = new ImageView(pi);
        CheckBox pr = new CheckBox("Prawn 700/kg BDT");
        gdtop.add(piv,0,4);
        gdtop.add(pr,1,4);
        
        
        Label quantityp=new Label("Enter quantity");
        quantityp.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(quantityp, 2, 4);
        
         TextField pt=new TextField();
         pt.setPromptText("Quantity");
         gdtop.add(pt, 3, 4);
        
         quantityp.setVisible(false);
         pt.setVisible(false);
         pr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(pr.isSelected()){
                    quantityp.setVisible(true);
                    pt.setVisible(true);
                    
                }
                else{
                    quantityp.setVisible(false);
                    pt.setVisible(false);
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
                Label lbl = new Label("Add");
                gdtop.add(lbl,3,6);
                try{
                if(hil.isSelected())
                    qa = Double.parseDouble(hilt.getText());
                priceA = fish[0]*qa;
                
                if(ruhi.isSelected())
                    qf = Double.parseDouble(rt.getText());
                priceF = fish[1]*qf;
                
                if(kat.isSelected())
                     qt = Double.parseDouble(kt.getText());
                priceT = fish[2]*qt;
                
                if(pr.isSelected())
                     qt = Double.parseDouble(pt.getText());
                priceP = fish[3]*qt;
                
                totalPrice = priceA+priceF+priceT+priceP;
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

