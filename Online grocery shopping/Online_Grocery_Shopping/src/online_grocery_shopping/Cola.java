
package online_grocery_shopping;


import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Cola extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Cola");
        
        FlowPane fp = new FlowPane(10,10);
        
        fp.setStyle("-fx-background-color: #336699;");
        
        

    
        Scene myScene = new Scene(fp,1000,600);
        Image fani = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/fanta.jpg",160,130,true,true);
        ImageView faniv = new ImageView(fani);
        CheckBox fan = new CheckBox("Fanta 250mL 65 BDT");
        fp.getChildren().addAll(faniv,fan);
       
    
        Image ppi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/pepsi.jpg",160,130,true,true);
        ImageView ppiv = new ImageView(ppi);
        CheckBox pp = new CheckBox("Pepsi 1L 65 BDT");
        fp.getChildren().addAll(ppiv,pp);
        
        Image spi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/sprite.jpg",160,130,true,true);
        ImageView spiv = new ImageView(spi);
        CheckBox sp = new CheckBox("Sprite 1L 65 BDT");
        fp.getChildren().addAll(spiv,sp);
        
        Image cci = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/coka cola.jpg",160,130,true,true);
        ImageView cciv = new ImageView(cci);
        CheckBox cc = new CheckBox("Coka Cola 1L 65 BDT");
        fp.getChildren().addAll(cciv,cc);
        
        Image miri = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/mirind250.jpg",160,130,true,true);
        ImageView miriv = new ImageView(miri);
        CheckBox mir = new CheckBox("Mirinda 1L 65 BDT");
        fp.getChildren().addAll(miriv,mir);
        
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
