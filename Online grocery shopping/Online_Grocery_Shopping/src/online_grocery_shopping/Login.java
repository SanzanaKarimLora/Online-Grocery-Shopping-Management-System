
package online_grocery_shopping;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 

public class Login extends Application {
 
        String user = "";
        String pw = "";
        String checkUser, checkPw;
       
    public static void main(String[] args) {
        launch(args);
    }
     
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login");
        
        FlowPane rootNode = new FlowPane();
        BorderPane bp = new BorderPane();
        bp.setStyle("-fx-background-color: #D8BFD8;");
        bp.setPadding(new Insets(255,255,155,255));
          
       
       
        HBox hb = new HBox();
        hb.setPadding(new Insets(25,25,25,35));
       
        
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(25,25,25,25));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
       
      
        Label lblUserName = new Label("Username");
        final TextField txtUserName = new TextField();
        Label lblPassword = new Label("Password");
        final PasswordField pf = new PasswordField();
        Button btnLogin = new Button("Login");
        final Label lblMessage = new Label();
        
        Button btnSignup = new Button("SignUp");
        gridPane.add(btnSignup, 2, 2);
       
        
        gridPane.add(lblUserName, 0, 0);
        gridPane.add(txtUserName, 1, 0);
        gridPane.add(lblPassword, 0, 1);
        gridPane.add(pf, 1, 1);
        gridPane.add(btnLogin, 1, 2);
        gridPane.add(lblMessage, 1, 3);
       
               
       
        Reflection r = new Reflection();
        r.setFraction(0.7f);
        gridPane.setEffect(r);
       
        Button pw = new Button();
        pw.setText("Forgot password?");
        pw.setTextFill(Color.RED);
        gridPane.add(pw,7,7);
        pw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ForgotPassword fp = new ForgotPassword();
                try {
                    fp.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        DropShadow dropShadow = new DropShadow();
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
      
        Text text = new Text("Login");
        text.setFont(Font.font("Courier New", FontWeight.BOLD, 28));
        text.setEffect(dropShadow);
       
       
       // hb.getChildren().add(text);
                         
        
        //bp.setId("bp");
        //gridPane.setId("root");
        //btnLogin.setId("btnLogin");
        //text.setId("text");
               
        
        btnLogin.setOnAction(new EventHandler<ActionEvent>() {
                public void handle(ActionEvent event) {
                    Scanner s1 = null;
                     try {
                         FileInputStream ob= new FileInputStream("e:\\log.txt");
                         s1=new Scanner(ob);
           
                    } catch (FileNotFoundException ex) {
                          System.out.print(ex);
                    }
                     String name = null,pword = null,n,p;
       
                        n = txtUserName.getText().trim();
                        p = pf.getText().trim();
                        while(s1.hasNext()){
                            name=s1.next();
                            pword=s1.next();
                        }
                        if(n.equals(name) && p.equals(pword)){
                                
                                Scene welcome = new Scene(rootNode,1000, 600);
                                primaryStage.setScene(welcome);
                                Label lblW = new Label();
                                Button next = new Button("Next>>");
                                next.setOnAction(new EventHandler<ActionEvent>() {
                                    @Override
                                    public void handle(ActionEvent event) {
                                        Categories cat = new Categories();
                                        try{
                                            cat.start(primaryStage);
                                        }
                                        catch(Exception ex){
                                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                });
                                lblW.setText("WELCOME TO ONLINE GROCERY SHOP");
                                rootNode.setAlignment(Pos.CENTER);
                                lblW.setTextFill(Color.GREEN);
                                lblW.setFont(Font.font("Courier New", FontWeight.SEMI_BOLD, 20));
                                lblW.setEffect(dropShadow);
                                Image imgWelcome = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/online_grocery_retail-trend.jpg",550,300,true,true);
                                ImageView ivWelcome = new ImageView(imgWelcome);
                                rootNode.getChildren().addAll(lblW,ivWelcome, next);
                                
                        }
                        else{
                                lblMessage.setText("Incorrect user or password.");
                                lblMessage.setTextFill(Color.RED);
                        }
                        txtUserName.setText("");
                        pf.setText("");
                }
                });
       
        bp.setTop(hb);
        bp.setCenter(gridPane); 
        
        
        btnSignup.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SignUp su = new SignUp();
                try {
                    su.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
       
        Scene scene = new Scene(bp,1000,600);
        primaryStage.setScene(scene);
        
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}