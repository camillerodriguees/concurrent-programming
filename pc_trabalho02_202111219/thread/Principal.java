/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 12/03/2023
Ultima alteracao: 24/03/2023
Nome: Principal.java
Funcao: Responsável por inicializar a aplicação e configurar a janela principal.
****************************************************************/

import controle.Controller;
import controle.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// Classe que representa a aplicação principal
public class Principal extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {

    // Carrega a interface gráfica (FXML) usando um objeto FXMLLoader
    Parent root = FXMLLoader.load(getClass().getResource("/visao/Controller.fxml"));
    // Cria uma nova cena a partir do root e define como cena do palco principal
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show(); // Mostra o palco principal
  }

  public static void main(String[] args) { // Método principal que inicia a aplicação
    launch(args);
  }
}
