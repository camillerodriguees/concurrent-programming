/* ***************************************************************
* Autor............: Camille Rodrigues Costa
* Matricula........: 202111219
* Inicio...........: 08/02/2023
* Ultima alteracao.: 14/02/2023
* Nome.............: Water Calculator
* Funcao...........: O programa serve para calcular quantos litros de agua o usuario precisa ingerir por dia
*************************************************************** */

import controle.MainSceneController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Principal extends Application {

  public static Parent root;
  public static Stage primaryStage = new Stage();

  @Override
  public void start(Stage primaryStage) throws Exception {

    try { // Tratamento de excessao
      root = FXMLLoader.load(getClass().getResource("visao/MainScene.fxml"));
      Scene scene = new Scene(root);
      scene.getStylesheets().add("visao/Style.css");
      primaryStage.setScene(scene);
      primaryStage.initStyle(StageStyle.UNDECORATED);
      primaryStage.show();
    } catch (IOException e) {
      e.printStackTrace();
    } // fim do try-catch
  }

  public static void main(String[] args) {
    launch(args);
  }
}