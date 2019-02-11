
package online_grocery_shopping;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Fruits extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
       primaryStage.setTitle("Fruits");
        
        FlowPane fp = new FlowPane();
        Scene myScene = new Scene(fp,1000,600);
        fp.setStyle("-fx-background-color: #A9A9A9;");
        
        Image bananai = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/banana-shagor.jpg",160,130,true,true);
        ImageView bananaiv = new ImageView(bananai);
        CheckBox banana = new CheckBox("Banana Each 8 BDT");
        banana.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               if(banana.isSelected()){
                   
               }
           }
       });
       
        
        Image mangoi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/mango.jpg",160,130,true,true);
        ImageView mangoiv = new ImageView(mangoi);
        CheckBox mango = new CheckBox("Mango Each kg 100 BDT");
       
       
        Image applei = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/apple.jpg",160,130,true,true);
        ImageView appleiv = new ImageView(applei);
        CheckBox apple = new CheckBox("Apple  Each kg 170 BDT");
        
       
        fp.getChildren().addAll(bananaiv,banana,mangoiv,mango,appleiv,apple);
        
        
        Image lici = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/lichi.jpg",160,130,true,true);
        ImageView liciv = new ImageView(lici);
        CheckBox lic = new CheckBox("Lichi Each 4 BDT");
        fp.getChildren().addAll(liciv,lic);
        
        Image gvi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/Guava.jpeg",160,130,true,true);
        ImageView gviv = new ImageView(gvi);
        CheckBox gv = new CheckBox("Guava Each kg 50 BDT");
       
        
        HBox.setMargin(gviv, new Insets(2, 2, 2, 2));
        
        fp.getChildren().addAll(gviv,gv);
        
        Button back = new Button("<<Back");
        //fp.setAlignment(Pos.CENTER);
        fp.getChildren().add(back);
        
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
        
        primaryStage.setScene(myScene);
        
        
        primaryStage.show();
    }
    
}
