package controle;

/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 12/03/2023
Ultima alteracao: 24/03/2023
Nome: Controller.java
Funcao: Essa classe é um controlador para uma interface gráfica do usuário.
****************************************************************/

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import modelo.ArvoreGenealogica;

public class Controller implements Initializable {

    @FXML
    private ImageView imagePai = new ImageView();

    @FXML
    private ImageView imageBisneto = new ImageView();

    @FXML
    private ImageView imageFilho1 = new ImageView();

    @FXML
    private ImageView imageFilho2 = new ImageView();

    @FXML
    private ImageView imageFilho3 = new ImageView();

    @FXML
    private ImageView imageNeto1 = new ImageView();

    @FXML
    private ImageView imageNeto2 = new ImageView();

    @FXML
    private Label text;

    @FXML
    private Label labelPai;

    @FXML
    private Button startButton;

    // Método chamado quando o botão startButton é pressionado
    @FXML
    private void startSimulation() {
        AudioClip audioClip = new AudioClip(new File("Tema2.mp3").toURI().toString());

        // Toca a música
        audioClip.play();

        // Cria um objeto da classe ArvoreGenealogica, passando os parâmetros
        // necessários
        ArvoreGenealogica pai = new ArvoreGenealogica("Pai", 0, null, 1);
        pai.setController(this); // Define o controlador atual como o controlador da árvore genealógica
        pai.start(); // Inicia a simulação

    }

    // Método chamado pela classe ArvoreGenealogica para atualizar a imagem de um
    // elemento da GUI
    public void mudarImagem(Image imagem, String pessoa) {

        // Usa um switch para determinar qual imagem deve ser atualizada
        switch (pessoa) {
            case "pai":
                imagePai.setImage(imagem);
                break;

            case "filho1":
                imageFilho1.setImage(imagem);
                break;

            case "filho2":
                imageFilho2.setImage(imagem);
                break;

            case "filho3":
                imageFilho3.setImage(imagem);
                break;
            case "neto1":
                imageNeto1.setImage(imagem);
                break;
            case "neto2":
                imageNeto2.setImage(imagem);
                break;

            case "bisneto": {
                imageBisneto.setImage(imagem);
                break;
            }

        }
    }

    public void Tempo(int tempo) {
        Platform.runLater(() -> {
            text.setText("Tempo:  " + tempo);
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
