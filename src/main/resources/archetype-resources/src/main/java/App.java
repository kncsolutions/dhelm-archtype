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

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.web.WebEngine;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.concurrent.Worker.State;
import javafx.application.Platform;
/**
 *This class is going to be your entry point towards gui enabled application development. 
 *
 */
public class App extends Application{
  private String URL;  
  public static void main( String[] args ){
    App a=new App();
    a.launch(args);
  }
 /**
 *
 */
  @Override
  public void start(Stage primaryStage) throws Exception {
    topLevel(primaryStage);
   }
  /*
  *
  */
  private void topLevel(Stage primaryStage) throws Exception{   
    StartPage s=new StartPage(true,primaryStage);
	 s.exit.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
            public void handle(ActionEvent event) {               
                primaryStage.close();
              }
            
        });
	s.demo.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
            public void handle(ActionEvent event) {
                s.warn("Not implemented yet...");
              }
            
        });
	s.wthPass.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
            public void handle(ActionEvent event) {
               s.warn("Not implemented yet...");
              }
            
        });
	primaryStage.setTitle("Dhelm");
	primaryStage.resizableProperty().setValue(Boolean.FALSE);
	primaryStage.setWidth(400);
   primaryStage.setHeight(300);
	primaryStage.setScene(s.getScene());
	primaryStage.show();
  }
  }
