
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

public class Rice extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public double rice[] = {55,52,110,105,200};
    public double pricePot = 0;
    public double priceCar = 0;
    public double priceCh = 0;
    public double priceL = 0;
    public double priceG = 0;
    public double priceB = 0;
    public double totalPrice=0;
    public double qa,qt,qf,ql,qb;
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
        
        Label title=new Label("Rice");
        title.setFont(Font.font("Courier New",FontWeight.BOLD, 20));
        title.setEffect(dropShadow);
        GridPane.setHalignment(title, HPos.CENTER);
        gdtop.add(title, 1, 0);
        
        Image najiri = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/najir.jpg",160,130,true,true);
        ImageView najiriv = new ImageView(najiri);
        CheckBox najir = new CheckBox("Najirshail Rice 55/kg BDT");
        gdtop.add(najiriv ,0,1);
        gdtop.add(najir,1,1);
        
        
        Label lpot = new Label("Enter quantity");
        lpot.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(lpot, 2, 1);
        
        TextField tpot = new TextField();
        tpot.setPromptText("Quantity");
        gdtop.add(tpot, 3, 1);
        lpot.setVisible(false);
        tpot.setVisible(false);
        najir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(najir.isSelected()){
                    lpot.setVisible(true);
                    tpot.setVisible(true);
                }
                else{
                    lpot.setVisible(false);
                    tpot.setVisible(false);
                }
            }
        });
        
         
        Image minicatei = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/minicate.jpg",160,130,true,true);
        ImageView minicateiv = new ImageView(minicatei);
        CheckBox minicate = new CheckBox("Minicate Rice 52/kg BDT");
        gdtop.add(minicateiv,0,2);
        gdtop.add(minicate,1,2);
        
        
        Label lcrt = new Label("Enter quantity");
        lcrt.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(lcrt, 2, 2);
        
        TextField tcrt = new TextField();
         tcrt.setPromptText("Quantity");
         gdtop.add(tcrt, 3, 2);
        
        lcrt.setVisible(false);
        tcrt.setVisible(false);
        minicate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(minicate.isSelected()){
                    lcrt.setVisible(true);
                    tcrt.setVisible(true);
                }
                else{
                    lcrt.setVisible(false);
                    tcrt.setVisible(false);
                }
            }
        });
        
        
        Image kalijirai = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/kalijira.jpg",160,130,true,true);
        ImageView kalijiraiv = new ImageView(kalijirai);
        CheckBox kalijira = new CheckBox("Kalijira Rice 110/kg BDT");
        gdtop.add(kalijiraiv,0,3);
        gdtop.add(kalijira ,1,3);
        
        
        Label lchl = new Label("Enter quantity");
        lchl.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(lchl, 2, 3);
        
        TextField tchl = new TextField();
         tchl.setPromptText("Quantity");
         gdtop.add(tchl, 3, 3);
        
        lchl.setVisible(false);
        tchl.setVisible(false);
        kalijira .setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(kalijira .isSelected()){
                    lchl.setVisible(true);
                    tchl.setVisible(true);
                }
                else{
                    lchl.setVisible(false);
                    tchl.setVisible(false);
                }
            }
        });
        
        
        Image chinigurai = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/chinigura.jpg",160,130,true,true);
        ImageView chiniguraiv = new ImageView(chinigurai);
        CheckBox chinigura = new CheckBox("Chinigura Rice 105/kg BDT");
        gdtop.add(chiniguraiv,0,4);
        gdtop.add(chinigura,1,4);
        
        Label ll = new Label("Enter quantity");
        ll.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(ll, 2, 4);
        
         TextField tl = new TextField();
         tl.setPromptText("Quantity");
         gdtop.add(tl, 3, 4);
        
        ll.setVisible(false);
        tl.setVisible(false);
        chinigura.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(chinigura.isSelected()){
                    ll.setVisible(true);
                    tl.setVisible(true);
                }
                else{
                    ll.setVisible(false);
                    tl.setVisible(false);
                }
            }
        });
        
        Image basmatii = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/basmati.jpg",160,130,true,true);
        ImageView basmatiiv = new ImageView(basmatii);
        CheckBox basmati = new CheckBox("Basmati Rice 200/kg BDT");
        gdtop.add(basmatiiv,0,5);
        gdtop.add(basmati,1,5);
        
        Label basl = new Label("Enter quantity");
        basl.setFont(Font.font("Arial",FontWeight.MEDIUM, 16));
        gdtop.add(basl, 2, 5);
        
         TextField tbas = new TextField();
         tbas.setPromptText("Quantity");
         gdtop.add(tbas, 3, 5);
        
        basl.setVisible(false);
        tbas.setVisible(false);
        basmati.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(basmati.isSelected()){
                    basl.setVisible(true);
                    tbas.setVisible(true);
                }
                else{
                     basl.setVisible(false);
                    tbas.setVisible(false);
                }
            }
        });
         
        Button back = new Button("<<Back");
        
        gdtop.add(back,3,6);
        
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
        
        gdtop.add(addBtn,4,6);
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Label lbl = new Label();
                gdtop.add(lbl,3,7);
                try{
                    if(najir.isSelected())
                    qa = Double.parseDouble(tpot.getText());
                pricePot = rice[0]*qa;
                
                if(minicate.isSelected())
                    qf = Double.parseDouble(tcrt.getText());
                priceCar = rice[1]*qf;
                
                if(kalijira.isSelected())
                     qt = Double.parseDouble(tchl.getText());
                priceCh = rice[2]*qt;
                
                if(chinigura.isSelected())
                     ql = Double.parseDouble(tl.getText());
                priceL = rice[3]*ql;
                
                if(basmati.isSelected())
                     qb = Double.parseDouble(tbas.getText());
                priceL = rice[4]*qb;
                
                totalPrice = pricePot+priceCar+priceCh+priceL+priceB;
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
