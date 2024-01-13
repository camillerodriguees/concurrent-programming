/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Candy.java
Funcao: Responsável por integrar a interface com o codigo
****************************************************************/

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.Semaphore;

public class Controller implements Initializable {

    @FXML
    public ImageView vanelopeImageView;

    @FXML
    public ImageView candyImageView;

    @FXML
    public ImageView ralphImageView;

    @FXML
    public ImageView felixImageView;

    @FXML
    public ImageView jubilenaImageView;

    @FXML
    public ImageView tafytaImageView;

    @FXML
    public ImageView stickyImageView;

    @FXML
    public ImageView mintyImageView;

    @FXML
    private Button startButton;

  //  @FXML
   // private Button restartButton;

    @FXML
    private Slider sliderVanelope;

    @FXML
    private Slider sliderTafyta;

    @FXML
    private Slider sliderCandy;

    @FXML
    private Slider sliderSticky;

    @FXML
    private Slider sliderFelix;

    @FXML
    private Slider sliderJubilena;

    @FXML
    private Slider sliderMinty;

    @FXML
    private Slider sliderRalp;

    @FXML
    private Button pauseVanelope;

    @FXML
    private Button resumeVanelope;

    @FXML
    private Button pauseTafyta;

    @FXML
    private Button resumeTafyta;

    @FXML
    private Button pauseCandy;

    @FXML
    private Button resumeCandy;

    @FXML
    private Button pauseRalph;

    @FXML
    private Button resumeRalph;

    @FXML
    private Button pauseSticky;

    @FXML
    private Button resumeSticky;

    @FXML
    private Button pauseFelix;

    @FXML
    private Button resumeFelix;

    @FXML
    private Button pauseJubilena;

    @FXML
    private Button resumeJubilena;

    @FXML
    private Button pauseMinty;

    @FXML
    private Button resumeMinty;


    public Semaphore vanelopeSemaphore = new Semaphore(1);
    public Semaphore candySemaphore = new Semaphore(1);
    public int cont = 1;

    public Semaphore semaforo1 = new Semaphore(1);
    public Semaphore semaforo2 = new Semaphore(1);
    public Semaphore semaforo3 = new Semaphore(1);
    public Semaphore semaforo4 = new Semaphore(1);
    public Semaphore semaforo5 = new Semaphore(1);
    public Semaphore semaforo6 = new Semaphore(1);
    public Semaphore semaforo7 = new Semaphore(1);
    public Semaphore semaforo8 = new Semaphore(1);
    public Semaphore semaforo9 = new Semaphore(1);
    public Semaphore semaforo10 = new Semaphore(1);
    public Semaphore semaforo11 = new Semaphore(1);
    public Semaphore semaforo12 = new Semaphore(1);
    public Semaphore semaforo13 = new Semaphore(1);
    public Semaphore semaforo14 = new Semaphore(1);
    public Semaphore semaforo15 = new Semaphore(1);
    public Semaphore semaforo16 = new Semaphore(1);
    public Semaphore semaforo17 = new Semaphore(1);
    public Semaphore semaforo18 = new Semaphore(1);
    public Semaphore semaforo19 = new Semaphore(1);
    public Semaphore semaforo20 = new Semaphore(1);
    public Semaphore semaforo21 = new Semaphore(1);
    public Semaphore semaforo22 = new Semaphore(1);
    public Semaphore semaforo23 = new Semaphore(1);
    public Semaphore semaforo24 = new Semaphore(1);
    public Semaphore semaforo25 = new Semaphore(1);
    public Semaphore semaforo26 = new Semaphore(1);
    public Semaphore semaforo27 = new Semaphore(1);
    public Semaphore semaforo28 = new Semaphore(1);
    public Semaphore semaforo29 = new Semaphore(1);
    public Semaphore semaforo30 = new Semaphore(1);
    public Semaphore semaforo31 = new Semaphore(1);
    public Semaphore semaforo32 = new Semaphore(1);
    public Semaphore semaforo33 = new Semaphore(1);
    public Semaphore semaforo34 = new Semaphore(1);
    public Semaphore semaforo35 = new Semaphore(1);
    public Semaphore semaforo36 = new Semaphore(1);
    public Semaphore semaforo37 = new Semaphore(1);
    public Semaphore semaforo38 = new Semaphore(1);
    public Semaphore semaforo39 = new Semaphore(1);
    public Semaphore semaforo40 = new Semaphore(1);
    public Semaphore semaforo41 = new Semaphore(1);
    public Semaphore semaforo42 = new Semaphore(1);
    public Semaphore semaforo43 = new Semaphore(1);
    public Semaphore semaforo44 = new Semaphore(1);
    public Semaphore semaforo45 = new Semaphore(1);
    public Semaphore semaforo46 = new Semaphore(1);
    public Semaphore semaforo47 = new Semaphore(1);
    public Semaphore semaforo48 = new Semaphore(1);
    public Semaphore semaforo49 = new Semaphore(1);
    public Semaphore semaforo50 = new Semaphore(1);
    public Semaphore semaforo52 = new Semaphore(1);
    public Semaphore semaforo53 = new Semaphore(1);
    public Semaphore semaforo54 = new Semaphore(1);
    public Semaphore semaforo55 = new Semaphore(1);
    public Semaphore semaforo56 = new Semaphore(1);
    public Semaphore semaforo57 = new Semaphore(1);
    public Semaphore semaforo58 = new Semaphore(1);
    public Semaphore semaforo59 = new Semaphore(1);
    public Semaphore semaforo60 = new Semaphore(1);
    public Semaphore semaforo61 = new Semaphore(1);
    public Semaphore semaforo62 = new Semaphore(1);
    public Semaphore semaforo63 = new Semaphore(1);
    public Semaphore semaforo64 = new Semaphore(1);
    public Semaphore semaforo65 = new Semaphore(1);
    public Semaphore semaforo66 = new Semaphore(1);
    public Semaphore semaforo67 = new Semaphore(1);
    public Semaphore semaforo68 = new Semaphore(1);
    public Semaphore semaforo69 = new Semaphore(1);
    public Semaphore semaforo70 = new Semaphore(1);
    public Semaphore semaforo71 = new Semaphore(1);
    public Semaphore semaforo72 = new Semaphore(1);
    public Semaphore ponto = new Semaphore(1);
    public Semaphore juntinhosJu_Sty = new Semaphore(1);
    public Semaphore juntinhoCan_Sty = new Semaphore(1);
    public Semaphore juntinhoCan_Sty2 = new Semaphore(1);
    public Semaphore juntinhoVan_Tafy = new Semaphore(1);
    public Semaphore juntinhoTafy_Ju = new Semaphore(1);
    public Semaphore juntinhoTafy_Ju2 = new Semaphore(1);
    public Semaphore juntinhoTafy_Can = new Semaphore(1);
    public Semaphore juntinhoTafy_Can2 = new Semaphore(1);
    public Semaphore juntinhoTafy_Felix = new Semaphore(1);
    public Semaphore juntinhoFelix_Can = new Semaphore(1);
    public Semaphore juntinhoFelix_Can2 = new Semaphore(1);
    public Semaphore linha1 = new Semaphore(1);


    private VanelopeCar vanelopeThread = new VanelopeCar(this);
    private FelixCar felixThread = new FelixCar(this);
    private StickyCar stickyThread = new StickyCar(this);
    private RalphCar ralphThread = new RalphCar(this);
    private TafytaCar tafytaThread = new TafytaCar(this);
    private CandyCar candyThread = new CandyCar(this);
    private JubilenaCar jubilenaThread = new JubilenaCar(this);
    private MintyCar mintyThread = new MintyCar(this);

    private long velocidadeVanelope = 5;
    private long velocidadeTafyta = 5;
    private long velocidadeCandy = 5;
    private long velocidadeRalph = 5;
    private long velocidadeSticky = 5;
    private long velocidadeFelix = 5;
    private long velocidadeJubilena = 5;
    private long velocidadeMinty = 5;
    

    public long getVelocidadeVanelope() {
        return velocidadeVanelope;
    }

    public void setVelocidadeVanelope(long velocidadeVanelope) {
        this.velocidadeVanelope = velocidadeVanelope;
    }

    public long getVelocidadeTafyta() {
        return velocidadeTafyta;
    }

    public void setVelocidadeTafyta(long velocidadeTafyta) {
        this.velocidadeTafyta = velocidadeTafyta;
    }

    public long getVelocidadeCandy() {
        return velocidadeCandy;
    }

    public void setVelocidadeCandy(long velocidadeCandy) {
        this.velocidadeCandy = velocidadeCandy;
    }

    public long getVelocidadeSticky() {
        return velocidadeSticky;
    }

    public void setVelocidadeSticky(long velocidadeSticky) {
        this.velocidadeSticky = velocidadeSticky;
    }

    public long getVelocidadeFelix() {
        return velocidadeFelix;
    }

    public void setVelocidadeFelix(long velocidadeFelix) {
        this.velocidadeFelix = velocidadeFelix;
    }

    public long getVelocidadeJubilena() {
        return velocidadeJubilena;
    }

    public void setVelocidadeJubilena(long velocidadeJubilena) {
        this.velocidadeJubilena = velocidadeJubilena;
    }

    public long getVelocidadeMinty() {
        return velocidadeMinty;
    }

    public void setVelocidadeMinty(long velocidadeMinty) {
        this.velocidadeMinty = velocidadeMinty;
    }

    public long getVelocidadeRalph() {
        return velocidadeRalph;
    }

    public void setVelocidadeRalph(long velocidadeRalph) {
        this.velocidadeRalph = velocidadeRalph;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

      

        sliderVanelope.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeVanelope = 10 - newValue.longValue();
        });
        sliderTafyta.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeTafyta = 10 - newValue.longValue();
        });
        sliderCandy.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeCandy = 10 - newValue.longValue();
        });
        sliderSticky.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeSticky = 10 - newValue.longValue();
        });
        sliderFelix.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeFelix = 10 - newValue.longValue();
        });
        sliderJubilena.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeJubilena = 10 - newValue.longValue();
        });
        sliderMinty.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeMinty = 10 - newValue.longValue();
        });
        sliderRalp.valueProperty().addListener((observable, oldValue, newValue) -> {
            velocidadeRalph = 10 - newValue.longValue();
        });
    }

    public void startAnimation() throws InterruptedException {
        vanelopeThread = new VanelopeCar(this);
        vanelopeThread.start();
        felixThread.start();
        stickyThread.start();
        ralphThread.start();
        tafytaThread.start();
        candyThread.start();
        jubilenaThread.start();
        mintyThread = new MintyCar(this);
        mintyThread.start();

    }

   /* public void restartAnimation() throws InterruptedException {
        vanelopeThread.stop();
        vanelopeThread = new VanelopeCar(this);
        vanelopeThread.start();
        mintyThread.stop();
        mintyThread = new MintyCar(this);
        mintyThread.start();
        felixThread.stop();
        felixThread = new FelixCar(this);
        felixThread.start();
        jubilenaThread.stop();
        jubilenaThread = new JubilenaCar(this);
        jubilenaThread.start();
        ralphThread.stop();
        ralphThread = new RalphCar(this);
        ralphThread.start();
        stickyThread.stop();
        stickyThread = new StickyCar(this);
        stickyThread.start();
        candyThread.stop();
        candyThread = new CandyCar(this);
        candyThread.start();
        tafytaThread.stop();
        tafytaThread = new TafytaCar(this);
        tafytaThread.start();

        resetImagePositions();
    }
    */

    @FXML
    public void startButtonClicked(ActionEvent event) throws InterruptedException {
        if (startButton.getText().equals("Iniciar")) {
            startAnimation();
            startButton.setDisable(true); // Torna o botão invisível
           // restartButton.setVisible(true);
            //restartButton.setDisable(false);
        } else {
           // stopAnimation();
        }
    }
/*
    public void resetImagePositions() {
        vanelopeImageView.setLayoutX(59);
        vanelopeImageView.setLayoutY(236);
        mintyImageView.setLayoutX(318);
        mintyImageView.setLayoutY(180);
        felixImageView.setLayoutX(523);
        felixImageView.setLayoutY(72);
        jubilenaImageView.setLayoutX(218);
        jubilenaImageView.setLayoutY(69);
        ralphImageView.setLayoutX(12);
        ralphImageView.setLayoutY(69);
        stickyImageView.setLayoutX(367);
        stickyImageView.setLayoutY(558);
        candyImageView.setLayoutX(116);
        candyImageView.setLayoutY(69);
        tafytaImageView.setLayoutX(422);
        tafytaImageView.setLayoutY(180);
    }

    public void stopAnimation() {
        // Interrompa a execução das threads de animação
        vanelopeThread.stopAnimation();
       /* felixThread.stopAnimation();
        stickyThread.stopAnimation();
        ralphThread.stopAnimation();
        tafytaThread.stopAnimation();
        candyThread.stopAnimation();
        jubilenaThread.stopAnimation();
        mintyThread.stopAnimation();

        // Aguarde até que todas as threads terminem
        try {
            vanelopeThread.join();
            /*felixThread.join();
            stickyThread.join();
            ralphThread.join();
            tafytaThread.join();
            candyThread.join();
            jubilenaThread.join();
            mintyThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Restaure as posições iniciais das imagens, se necessário
        resetImagePositions();

        // Defina o texto do botão para "Start" novamente
        startButton.setText("Iniciar");
    }
*/
    @FXML
    void pauseVanelope(ActionEvent event) {
        vanelopeThread.suspend();
        pauseVanelope.setVisible(false);
        pauseVanelope.setDisable(true);
        resumeVanelope.setVisible(true);
        resumeVanelope.setDisable(false);
    }

    @FXML
    void resumeVanelope(ActionEvent event) {
        vanelopeThread.resume();
        resumeVanelope.setVisible(false);
        resumeVanelope.setDisable(true);
        pauseVanelope.setVisible(true);
        pauseVanelope.setDisable(false);

    }

    @FXML
    void pauseTafyta(ActionEvent event) {
        tafytaThread.suspend();
        pauseTafyta.setVisible(false);
        pauseTafyta.setDisable(true);
        resumeTafyta.setVisible(true);
        resumeTafyta.setDisable(false);
    }

    @FXML
    void resumeTafyta(ActionEvent event) {
        tafytaThread.resume();
        resumeTafyta.setVisible(false);
        resumeTafyta.setDisable(true);
        pauseTafyta.setVisible(true);
        pauseTafyta.setDisable(false);

    }

    @FXML
    void pauseCandy(ActionEvent event) {
        candyThread.suspend();
        pauseCandy.setVisible(false);
        pauseCandy.setDisable(true);
        resumeCandy.setVisible(true);
        resumeCandy.setDisable(false);
    }

    @FXML
    void resumeCandy(ActionEvent event) {
        candyThread.resume();
        resumeCandy.setVisible(false);
        resumeCandy.setDisable(true);
        pauseCandy.setVisible(true);
        pauseCandy.setDisable(false);

    }

    @FXML
    void pauseRalph(ActionEvent event) {
        ralphThread.suspend();
        pauseRalph.setVisible(false);
        pauseRalph.setDisable(true);
        resumeRalph.setVisible(true);
        resumeRalph.setDisable(false);
    }

    @FXML
    void resumeRalph(ActionEvent event) {
        ralphThread.resume();
        resumeRalph.setVisible(false);
        resumeRalph.setDisable(true);
        pauseRalph.setVisible(true);
        pauseRalph.setDisable(false);

    }

    @FXML
    void pauseSticky(ActionEvent event) {
        stickyThread.suspend();
        pauseSticky.setVisible(false);
        pauseSticky.setDisable(true);
        resumeSticky.setVisible(true);
        resumeSticky.setDisable(false);
    }

    @FXML
    void resumeSticky(ActionEvent event) {
        stickyThread.resume();
        resumeSticky.setVisible(false);
        resumeSticky.setDisable(true);
        pauseSticky.setVisible(true);
        pauseSticky.setDisable(false);

    }

    @FXML
    void pauseFelix(ActionEvent event) {
        felixThread.suspend();
        pauseFelix.setVisible(false);
        pauseFelix.setDisable(true);
        resumeFelix.setVisible(true);
        resumeFelix.setDisable(false);
    }

    @FXML
    void resumeFelix(ActionEvent event) {
        felixThread.resume();
        resumeFelix.setVisible(false);
        resumeFelix.setDisable(true);
        pauseFelix.setVisible(true);
        pauseFelix.setDisable(false);

    }

    @FXML
    void pauseJubilena(ActionEvent event) {
        jubilenaThread.suspend();
        pauseJubilena.setVisible(false);
        pauseJubilena.setDisable(true);
        resumeJubilena.setVisible(true);
        resumeJubilena.setDisable(false);
    }

    @FXML
    void resumeJubilena(ActionEvent event) {
        jubilenaThread.resume();
        resumeJubilena.setVisible(false);
        resumeJubilena.setDisable(true);
        pauseJubilena.setVisible(true);
        pauseJubilena.setDisable(false);

    }

    @FXML
    void pauseMinty(ActionEvent event) {
        mintyThread.suspend();
        pauseMinty.setVisible(false);
        pauseMinty.setDisable(true);
        resumeMinty.setVisible(true);
        resumeMinty.setDisable(false);
    }

    @FXML
    void resumeMinty(ActionEvent event) {
        mintyThread.resume();
        resumeMinty.setVisible(false);
        resumeMinty.setDisable(true);
        pauseMinty.setVisible(true);
        pauseMinty.setDisable(false);

    }

}