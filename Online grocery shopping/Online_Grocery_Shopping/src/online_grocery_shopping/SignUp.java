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
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class SignUp extends Application 
{

    @Override
    public void start(Stage arg0) throws Exception 
    {
    
        
        BorderPane bp=new BorderPane();
        bp.setPadding(new Insets(30,30,30,30));
        HBox hbtit=new HBox();
        hbtit.setPadding(new Insets(30,30,30,30));
        hbtit.setSpacing(20);
        
        //HBOX TOP
        HBox hb=new HBox();
        hb.setPadding(new Insets(20,20,20,20));
        hb.setSpacing(20);
        hb.getChildren().addAll(hbtit);
        hb.setStyle("-fx-background-color: #3FF4CB;");
        bp.setTop(hb);
        //HBOX BOTTOM
        HBox hdb=new HBox();
        hdb.setPadding(new Insets(5,5,5,5));
        hdb.setSpacing(20);
        hdb.setStyle("-fx-background-color: #3FF4CB;");
        bp.setBottom(hdb);
        //VBOX LEFT
        VBox vdl=new VBox();
        vdl.setPadding(new Insets(50,50,50,50));
        vdl.setSpacing(20);
        vdl.setStyle("-fx-background-color: #3FF4CB;");
        bp.setLeft(vdl);
        //VBOX RIGHT
        VBox vdr=new VBox();
        vdr.setPadding(new Insets(50,50,50,50));
        vdr.setSpacing(20);
        vdr.setStyle("-fx-background-color: #3FF4CB;");
        bp.setRight(vdr);
        
        //CENTER GRID
        //GridPane gd=new GridPane();
        //gd.add(child, columnIndex, rowIndex);
        GridPane gdtop=new GridPane();
        gdtop.setPadding(new Insets(30,30,30,30));
        gdtop.setVgap(30);
        gdtop.setHgap(20);
        
        
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
        
        Label title=new Label("SIGN UP");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 30));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
         //NAME LABEL
         Label name=new Label("NAME");
         name.setFont(Font.font("Arial",FontWeight.BOLD, 20));
         gdtop.add(name, 0, 1);
         //NAME TEXT BOX
         TextField namet=new TextField();
         namet.setPromptText("Name");
         gdtop.add(namet, 1, 1);
        
         //MOBILE NUMBER LABEL
         Label mobnol=new Label("MOBILE NUMBER");
         mobnol.setFont(Font.font("Arial",FontWeight.BOLD, 20));
         gdtop.add(mobnol, 0, 2);
         //MOBILE NUMBER TEXT FIELD
         TextField mobnot=new TextField();
         mobnot.setPromptText("Phone/Mobile No");
         gdtop.add(mobnot, 1, 2);
         //PASSWORD LABEL 
         Label pwd=new Label("PASSWORD");
         pwd.setFont(Font.font("Arial",FontWeight.BOLD, 20));
         gdtop.add(pwd, 0, 3);
         //PASSWORD TEXTFIELD
         TextField pwdt=new TextField();
         pwdt.setPromptText("Password");
         gdtop.add(pwdt, 1, 3);
         //CONFIRM PASSWORD LABEL
         Label cpwd=new Label("CONFIRM PASSWORD..");
         cpwd.setFont(Font.font("Arial",FontWeight.BOLD, 20));
         gdtop.add(cpwd, 0, 4);
         //CONFIRM PASSWORD TEXTFIELD
         TextField pwdc=new TextField();
         pwdc.setPromptText("Confirm Password");
         gdtop.add(pwdc, 1, 4);
         //SUBMIT BUTTON HBOX
         HBox subh=new HBox();
         subh.setPadding(new Insets(50,50,50,50));
         subh.setSpacing(20);
         subh.setAlignment(Pos.CENTER_RIGHT);
        
         //SUBMIT BUTTON
         HBox canch=new HBox();
        
         canch.setPadding(new Insets(10,10,10,10));
         canch.setSpacing(20);
         canch.setAlignment(Pos.CENTER_LEFT);
         Button submit=new Button("Submit");
         submit.setFont(Font.font("Arial",FontWeight.BOLD, 20));
         submit.setStyle("-fx-background-color: #3FF4CB;");
         
         submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                if((!(pwdt.equals(pwdc)))){
                    try(FileWriter fw = new FileWriter("E:\\log.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter out = new PrintWriter(bw)){
                                      out.println(namet.getText());
    
                                      out.println(pwdc.getText());
                   
                   } catch (IOException e) {
    
                   }
                   
                    
                }
                else{
                    Label notMatch = new Label();
                    notMatch.setText("Passwords don't match");
                    notMatch.setFont(Font.font("Courier New", FontWeight.BOLD, 18));
                    gdtop.add(notMatch, 0, 6);
                }
                
                
            }
        });
       
         subh.getChildren().addAll(submit);
         gdtop.add(subh, 0, 5);
         
         //CANCEL BUTTON
         Button cancel=new Button("Cancel");
         cancel.setCursor(Cursor.HAND);
         cancel.setFont(Font.font("Arial",FontWeight.BOLD, 20));
         cancel.setStyle("-fx-background-color: #3FF4CB;");
         canch.getChildren().addAll(cancel);
        
         gdtop.add(canch,1,5);
         bp.setCenter(gdtop);
         
         cancel.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                Login lg = new Login();
                try {
                    lg.start(arg0);
                } catch (Exception ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
         
         
        Scene scene =new Scene(bp);
        arg0.setTitle("ACCOUNT SIGN UP");
        arg0.setScene(scene);
        arg0.show();
        
        
    }
    public static void main(String[] args)
    {
        launch(args);
        
    }

}
