
package online_grocery_shopping;


import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class Categories extends Application{
   
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Categories");
        
        BorderPane bp = new BorderPane();
        Scene myS = new Scene(bp, 1000, 600);
       
        
        primaryStage.setScene(myS);
        
        Image i = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/grocery.jpg", 750,600,true,true);
        ImageView iv = new ImageView(i);
        bp.getChildren().add(iv);
       
        
        MenuBar mb = new MenuBar();
        
        Menu grocery = new Menu("Food Cupboard");
        MenuItem rice = new MenuItem("Rice");
        MenuItem oil = new MenuItem("Oil");
        
       
           
        grocery.getItems().addAll(rice,oil);
        mb.getMenus().add(grocery);
        
        Menu freshItem = new Menu("Fresh Items");
        MenuItem fruit = new MenuItem("Fruits");
        MenuItem veg = new MenuItem("Vegetables");
        MenuItem exit = new MenuItem("exit");
           
        freshItem.getItems().addAll(fruit,veg);
           
        mb.getMenus().add(freshItem);
           
        Menu meatFish = new Menu("Meat-Fish");
        MenuItem meat = new MenuItem("Meat");
        MenuItem fish = new MenuItem("Fish");
          
        meatFish.getItems().addAll(meat,fish);
         mb.getMenus().add(meatFish);
           
           Menu beverages = new Menu("Beverages");
           MenuItem cola = new MenuItem("Cola");
           MenuItem health = new MenuItem("Health Drinks");
           
           
           beverages.getItems().addAll(cola,health);
           
           mb.getMenus().add(beverages);
           
          
           
           Menu dairyBakery = new Menu("Dairy-Bakery");
           MenuItem dairy = new MenuItem("Dairy");
           MenuItem bakery = new MenuItem("Bakery");
           dairyBakery.getItems().addAll(dairy, bakery);
           
           mb.getMenus().add(dairyBakery);
           
           EventHandler<ActionEvent> MEHandler = new EventHandler<ActionEvent>() {
               
            @Override
            public void handle(ActionEvent event) {
                String name = ((MenuItem)event.getTarget()).getText();
                if(name.equals("Vegetables")){
                    Vegetables veg = new Vegetables();
                    try {
                       veg.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    
                if(name.equals("Fruits")){
                    Fruits f = new Fruits();
                    try {
                       f.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Cola")){
                    Cola c = new Cola();
                    try {
                       c.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Rice")){
                    Rice r = new Rice();
                    try {
                       r.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Oil")){
                    Oil o = new Oil();
                    try {
                       o.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Health Drinks")){
                    HealthDrinks hd = new HealthDrinks();
                    try {
                       hd.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Dairy")){
                    Dairy dai = new Dairy();
                    try {
                       dai.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Bakery")){
                    Bakery bak = new Bakery();
                    try {
                       bak.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Fish")){
                    Fish f = new Fish();
                    try {
                       f.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                if(name.equals("Meat")){
                    Meat m = new Meat();
                    try {
                       m.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
           
           rice.setOnAction(MEHandler);
           oil.setOnAction(MEHandler);
           fruit.setOnAction(MEHandler);
           veg.setOnAction(MEHandler);
           meat.setOnAction(MEHandler);
           fish.setOnAction(MEHandler);
           cola.setOnAction(MEHandler);
           health.setOnAction(MEHandler);
           dairy.setOnAction(MEHandler);
           bakery.setOnAction(MEHandler);
           
           bp.setTop(mb);
           
           Button back = new Button("<<Back");
           bp.setBottom(back);
           back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Login li = new Login();
                try {
                       li.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
           
           Button arrival = new Button();
           bp.setRight(arrival);
           arrival.setText("NEW ARRIVAL");
           arrival.setTextFill(Color.RED);
           
           arrival.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                NewArrival na = new NewArrival();
                try {
                       na.start(primaryStage);
                    } 
                    catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
        });
           
        
        Button calculate = new Button("Calculation");
        bp.setCenter(calculate);
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Calculation cal = new Calculation();
                try {
                       cal.start(primaryStage);
                    } 
                catch (Exception ex) {
                         Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        primaryStage.show();
    }
    
}

