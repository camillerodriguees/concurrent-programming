/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Principal.java
Funcao: Responsável por inicializar a aplicação e configurar a janela principal.
****************************************************************/


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {

  public static Parent root;
  public static Stage primaryStage = new Stage();
  
  Controller controller = new Controller();

  @Override
  public void start(Stage primaryStage) throws Exception {

    try { // Tratamento de excessao
      root = FXMLLoader.load(getClass().getResource("Teste.fxml"));
      Scene scene = new Scene(root);
     
      primaryStage.setScene(scene);
     
      primaryStage.show();
      
    } catch (IOException e) {
      e.printStackTrace();
    } // fim do try-catch
  }

  public static void main(String[] args) {
    launch(args);
  }
}