#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
*Copyright 2017 Pallav Nandi Chaudhuri@Knc Solutions Private Limited

*Licensed under the Apache License, Version 2.0 (the "License");
*you may not use this file except in compliance with the License.
*You may obtain a copy of the License at

* http://www.apache.org/licenses/LICENSE-2.0

*Unless required by applicable law or agreed to in writing, software
*distributed under the License is distributed on an "AS IS" BASIS,
*WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*See the License for the specific language governing permissions and
*limitations under the License.
*/
package ${package};
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.*;
/**
* 
*
*/
public class StartPage{
  private StackPane bg;
  private GridPane root;
  public Button demo,wthPass,exit;
  private HBox hb;
  private Scene scene,scene_popup;
/**
*@param preDefined: is true then the program will start in default mode. Otherwise you have to design your own settings.
*/
  
  public StartPage(boolean preDefined,Stage stage){    
    if(preDefined){
	   bg=new StackPane();
	   bg.setPadding(new Insets(2, 2, 2, 2));
	   root = new GridPane();
      root.setAlignment(Pos.CENTER);
      root.setHgap(10);
      root.setVgap(10);
      root.setPadding(new Insets(25, 25, 25, 25));
	  
	  
	   demo = new Button("Demo");
	   demo.setPrefWidth(270);
	   demo.setPrefHeight(70);
	  
	   wthPass = new Button("Have Password");
	   wthPass.setPrefWidth(270);
	   wthPass.setPrefHeight(70);
	  
	   exit = new Button("Exit");
	   exit.setPrefWidth(270);
	   exit.setPrefHeight(70);
	   root.add(demo,0,0);
	   root.add(wthPass,0,1);
	   root.add(exit,0,2);
	   root.setStyle("-fx-background-color: BEIGE;");
	   bg.getChildren().add(root);
	   scene=new Scene(bg, 150, 135);
	}
	else{
	  design();
	}
  }
 /**
 *
 */
 private void design(){
   //implemnt your design
 }
 /**
 *
 */
 public Scene getScene(){
   return scene;
 }
 /**
*@param message:the warning message.
*/
public  void warn(String message){
  Alert alert = new Alert(AlertType.INFORMATION);
  alert.setTitle("Warning!!");
  alert.setHeaderText(null);
  alert.setContentText(message);
  alert.showAndWait();
}
}