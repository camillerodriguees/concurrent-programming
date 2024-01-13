/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Jubilena.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class JubilenaCar extends Thread {

    private Controller controller;

    public JubilenaCar(Controller controller) {
        this.controller = controller;

    }

    private volatile boolean running = true;
    private boolean cont = true;
    double eixoX;
    double eixoY;

    public void stopAnimation() {
        running = false;
    }

    public void run() {

        while (running) {
            try {
                moveJubilena();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public void moveJubilena() throws InterruptedException {
        controller.jubilenaImageView.setVisible(true);
       // controller.jubilenaImageView.setLayoutX(218);
       // controller.jubilenaImageView.setLayoutY(69);
        if (cont) {
            controller.semaforo17.acquire();
            //controller.semaforo3.acquire();
            controller.semaforo37.acquire();
            controller.juntinhoTafy_Ju2.acquire();
            controller.semaforo41.acquire();
            controller.semaforo59.acquire();
            controller.semaforo63.acquire();
            cont = false;
        }

        
        //controller.juntinhoTafy_Ju2.release();
        controller.semaforo41.release();
       // controller.semaforo3.release();
       //controller.semaforo59.release();
       jubilenaDesce(69);
       controller.semaforo63.release();
       controller.semaforo59.release();
        jubilenaDesce(180);
        controller.semaforo61.acquire();
        controller.juntinhoTafy_Ju2.release();
        controller.semaforo39.acquire();
        controller.semaforo37.release();
        controller.semaforo17.release();
        controller.semaforo18.acquire();
        jubilenaDesce(294);
        controller.semaforo61.release();
        controller.semaforo18.release();
        controller.semaforo19.acquire();
        controller.semaforo44.acquire();
        jubilenaDesce(400);
        controller.semaforo19.release();
        controller.semaforo39.release();
        controller.semaforo20.acquire();
        jubilenaDesce(508);
        controller.semaforo13.acquire();
        controller.juntinhoTafy_Ju.acquire();
        controller.semaforo44.release();
        jubilenaDesce(558);
        jubilenaDireita(266);
        controller.semaforo20.release();
        controller.semaforo30.acquire();
        controller.semaforo65.acquire();
        controller.juntinhosJu_Sty.acquire();
        jubilenaDireita(369);
        controller.semaforo13.release();
        controller.semaforo21.acquire();
        jubilenaDireita(420);
        jubilenaSobe(508);
        controller.semaforo65.release();
        controller.semaforo30.release();
        jubilenaSobe(400);
        controller.semaforo52.acquire();
        controller.juntinhosJu_Sty.release();
        jubilenaSobe(294);
       // controller.semaforo60.acquire();
        controller.juntinhoTafy_Ju.release();
        controller.juntinhoTafy_Ju2.acquire(); 
        controller.semaforo21.release();
        controller.semaforo22.acquire();
        jubilenaSobe(180);
       // controller.semaforo60.release();
        controller.semaforo52.release();
        jubilenaSobe(69);
        controller.semaforo59.acquire();
        //controller.juntinhoTafy_Ju2.acquire(); 
        controller.semaforo22.release();
        //controller.semaforo3.acquire();
        controller.semaforo41.acquire();
        controller.semaforo42.acquire();
        jubilenaSobe(18);
        jubilenaEsquerda(369);
        controller.semaforo63.acquire();
        controller.semaforo37.acquire();
        jubilenaEsquerda(218);
        controller.semaforo42.release();
       
    

    }

    public void jubilenaEsquerda(double x) {
        eixoX = controller.jubilenaImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeJubilena());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.jubilenaImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void jubilenaDireita(double x) {
        eixoX = controller.jubilenaImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeJubilena());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.jubilenaImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void jubilenaSobe(double y) {
        eixoY = controller.jubilenaImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeJubilena());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.jubilenaImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void jubilenaDesce(double y) {
        eixoY = controller.jubilenaImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeJubilena());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.jubilenaImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }

}
