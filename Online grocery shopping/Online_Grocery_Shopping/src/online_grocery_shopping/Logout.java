
package online_grocery_shopping;

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
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Logout extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Logout");
       
        BorderPane bp = new BorderPane();
        
        bp.setStyle("-fx-background-color: #A8BFA8;");
        
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
        Scene sc = new Scene(bp,1000,600);
        primaryStage.setScene(sc);
        
        Label successOrder = new Label();
        successOrder.setText("Your order has taken successfully");
        successOrder.setTextFill(Color.GREEN);
        successOrder.setFont(Font.font("Courier New",FontWeight.BOLD, 30));
        GridPane.setHalignment(successOrder, HPos.CENTER);
        gdtop.add(successOrder, 0, 2);
        
        Label thank = new Label();
        thank.setText("Thanks to being with us");
        thank.setFont(Font.font("Courier New",FontWeight.BOLD, 30));
        thank.setTextFill(Color.ROYALBLUE);
        gdtop.add(thank, 0, 4);
        
        Button logout = new Button("Logout");
        gdtop.add(logout, 6, 10);
        
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 Login log = new Login();
                 try{
                    log.start(primaryStage);
                }
                catch(Exception ex){
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
                                        
            }
        });
        
        bp.setCenter(gdtop);
        primaryStage.show();
      
    }
}
