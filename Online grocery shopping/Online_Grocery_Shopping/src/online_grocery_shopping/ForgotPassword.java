
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ForgotPassword extends Application{
    public static void main(String[] args) {
        launch(args);
    }

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
        hb.setStyle("-fx-background-color: #800000;");
        bp.setTop(hb);
        
        HBox hdb=new HBox();
        hdb.setPadding(new Insets(5,5,5,5));
        hdb.setSpacing(10);
        hdb.setStyle("-fx-background-color: #800000;");
        bp.setBottom(hdb);
        
        VBox vdl=new VBox();
        vdl.setPadding(new Insets(10,10,10,10));
        vdl.setSpacing(10);
        vdl.setStyle("-fx-background-color: #800000;");
        bp.setLeft(vdl);
        
        VBox vdr=new VBox();
        vdr.setPadding(new Insets(10,10,10,10));
        vdr.setSpacing(10);
        vdr.setStyle("-fx-background-color:  #800000;");
        bp.setRight(vdr);
        
        GridPane gdtop=new GridPane();
        gdtop.setPadding(new Insets(30,30,30,30));
        gdtop.setVgap(30);
        gdtop.setHgap(20);
        
        Label title=new Label("Forgot Password");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        Label id = new Label("Enter user ID");
        id.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(id, 3, 1);
        
        TextField idt=new TextField();
        gdtop.add(idt, 4, 1);
        
        Label address=new Label("Enter Email Address ");
        address.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(address, 3, 2);
        
        TextField addresst=new TextField();
        gdtop.add(addresst, 4, 2);
        
        Label contact=new Label("Enter contact number");
        contact.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(contact, 3, 3);
        
        TextField contactt=new TextField();
        gdtop.add(contactt, 4, 3);
        
        Button submit = new Button();
        submit.setText("Submit");
        submit.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        submit.setTextFill(Color.BROWN);
        gdtop.add(submit, 4, 5);
        
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try(FileWriter fw = new FileWriter("E:\\forgot.txt", true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter out = new PrintWriter(bw)){
                                     
                                      out.println(idt.getText());   
                                      out.println(addresst.getText());
    
                                      out.println(contactt.getText());
   
                   } catch (IOException e) {
    
                   }
                Label pwnew = new Label();
                pwnew.setText("Your new password will be given on your email");
                pwnew.setTextFill(Color.DARKRED);
                gdtop.add(pwnew,3,6);
            }
        });
        
        Button back = new Button();
        back.setText("Back");
        back.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        back.setTextFill(Color.BROWN);
        gdtop.add(back, 5, 5);
        
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Login log = new Login();
                try {
                       log.start(primaryStage);
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
    
}
