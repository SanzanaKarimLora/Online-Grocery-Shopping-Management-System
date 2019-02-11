
package online_grocery_shopping;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public class HealthDrinks extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    public int ahr;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Rice");
        

        FlowPane fp = new FlowPane(10, 10);
        Scene myScene = new Scene(fp,1000,600);
        
        Label lhr = new Label("Enter quantity");
        TextField thr = new TextField();
        lhr.setVisible(false);
        thr.setVisible(false);
        Image hri = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/horlicks.jpg",160,130,true,true);
        ImageView hriv = new ImageView(hri);
        CheckBox hr = new CheckBox("Horlicks 400gm 450 BDT");
        
        fp.getChildren().addAll(hriv, hr,lhr,thr);
        hr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(hr.isSelected()){
                   lhr.setVisible(true);
                   thr.setVisible(true);
                   /*thr.setOnAction(new EventHandler<ActionEvent>() {
                       @Override
                       public void handle(ActionEvent event) {
                           ahr = Integer.parseInt(thr.getText());
                          
                       }
                   });*/
                }
                else{
                    lhr.setVisible(false);
                    thr.setVisible(false);
                }
            }
        });
        
        Label lbs = new Label("Enter quantity");
        TextField tbs = new TextField();
        lbs.setVisible(false);
        tbs.setVisible(false);
        Image bsi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/boost.jpg",160,130,true,true);
        ImageView bsiv = new ImageView(bsi);
        CheckBox bs = new CheckBox("Boost 400gm 500 BDT");
        fp.getChildren().addAll(bsiv, bs,lbs,tbs);
        bs.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(bs.isSelected()){
                   lbs.setVisible(true);
                   tbs.setVisible(true);
                }
                else{
                    lbs.setVisible(false);
                    tbs.setVisible(false);
                }
            }
        });
        
        
        Label lovi = new Label("Enter quantity");
        TextField tovi = new TextField();
        lovi.setVisible(false);
        tovi.setVisible(false);
        Image ovi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/ovaltine.jpg",160,130,true,true);
        ImageView oviv = new ImageView(ovi);
        CheckBox ov = new CheckBox("Ovaltine 500gm 550 BDT");
        fp.getChildren().addAll(oviv, ov,lovi,tovi);
        ov.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(ov.isSelected()){
                   lovi.setVisible(true);
                   tovi.setVisible(true);
                }
                else{
                    lovi.setVisible(false);
                    tovi.setVisible(false);
                }
            }
        });
        
        
        Label lcmp = new Label("Enter quantity");
        TextField tcmp = new TextField();
        lcmp.setVisible(false);
        tcmp.setVisible(false);
        Image cmpi = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/complan.jpg",160,130,true,true);
        ImageView cmpiv = new ImageView(cmpi);
        CheckBox cmp = new CheckBox("Complan 500gm 550 BDT");
        cmp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cmp.isSelected()){
                   lcmp.setVisible(true);
                   tcmp.setVisible(true);
                }
                else{
                    lcmp.setVisible(false);
                    tcmp.setVisible(false);
                }
            }
        });
        
        fp.getChildren().addAll(cmpiv, cmp, lcmp, tcmp);
        
        
        Label lmt = new Label("Enter quantity");
        TextField tmt = new TextField();
        lmt.setVisible(false);
        tmt.setVisible(false);
        Image mti = new Image("file:///E:/2nd year-1st semester/Software Development 2/images/maltova.jpg",160,130,true,true);
        ImageView mtiv = new ImageView(mti);
        CheckBox mt = new CheckBox("Maltova 400gm 500 BDT");
        fp.getChildren().addAll(mtiv, mt,lmt,tmt);
        mt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(mt.isSelected()){
                   lmt.setVisible(true);
                   tmt.setVisible(true);
                }
                else{
                    lmt.setVisible(false);
                    tmt.setVisible(false);
                }
            }
        });
        
        
        Button back = new Button("<<Back");
        
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
        
        Button add = new Button("Add");
        
        fp.getChildren().add(add);
        
        add.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {

			int content = Integer.parseInt(thr.getText())*450;
                        ahr = Integer.parseInt(thr.getText());
			FileWriter fw = new FileWriter("E:\\r.txt");
			 BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
                        bw.close();
			fw.close();
		} catch (IOException e) {

			 System.out.println(e);

		} 
            }
        });
        
        primaryStage.setScene(myScene);
        primaryStage.show();
    }
}
