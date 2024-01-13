/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Tafyta.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class TafytaCar extends Thread {

    private Controller controller;

    public TafytaCar(Controller controller) {
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
                moveTafyta();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public void moveTafyta() throws InterruptedException {
        controller.tafytaImageView.setVisible(true);
       // controller.tafytaImageView.setLayoutX(422);
       // controller.tafytaImageView.setLayoutY(180);
        if (cont) {
            //controller.juntinhoVan_Tafy.acquire(1);
            controller.juntinhoTafy_Ju2.acquire();
            //controller.semaforo41.acquire();
            cont = false;
        }
        
        tafytaDesce(180);
        controller.juntinhoVan_Tafy.acquire();
        tafytaDesce(236);
        tafytaDireita(473);
        controller.juntinhoTafy_Ju2.release();
        //controller.semaforo41.release();
        //controller.semaforo24.acquire();
        controller.semaforo57.acquire();
        controller.semaforo53.acquire();
        controller.semaforo67.acquire();
        tafytaDireita(523);
        tafytaDesce(294);
        controller.semaforo69.release();
        controller.juntinhoVan_Tafy.release();
        tafytaDesce(344);
        tafytaEsquerda(473);
        controller.semaforo67.release();
        controller.semaforo57.release();
        controller.semaforo21.acquire();
        controller.semaforo24.acquire();
        controller.juntinhoTafy_Ju.acquire();
        tafytaEsquerda(422);
        tafytaDesce(508);
        controller.semaforo53.release();
        controller.semaforo33.acquire();
        controller.semaforo26.acquire();
         tafytaDesce(558);
        tafytaEsquerda(369);
        controller.semaforo24.release();
        controller.semaforo21.release();
        controller.juntinhoTafy_Can.acquire();
        tafytaEsquerda(266);
        controller.semaforo33.release();
        controller.semaforo26.release();
        tafytaEsquerda(168);
        controller.juntinhoTafy_Ju.release();
        tafytaEsquerda(116);
        tafytaSobe(508);
        tafytaSobe(400);
        tafytaSobe(344);
        tafytaEsquerda(63);
        controller.juntinhoTafy_Can.release();
        controller.semaforo31.acquire();
        tafytaEsquerda(12);
        tafytaSobe(294);
        controller.semaforo9.acquire();
        tafytaSobe(236);
        tafytaDireita(63);
        controller.semaforo31.release();
        controller.juntinhoTafy_Can2.acquire();
        controller.semaforo10.acquire();
        tafytaDireita(116);
        tafytaSobe(69);
        controller.semaforo71.acquire();
        controller.semaforo10.release();
        controller.semaforo9.release();
        controller.linha1.acquire();
        controller.semaforo50.acquire();
        tafytaSobe(18);
        tafytaDireita(168);
        controller.juntinhoTafy_Ju2.acquire();
        tafytaDireita(266);
        controller.semaforo66.acquire();
        controller.semaforo50.release();
        tafytaDireita(369);
        //controller.semaforo41.acquire();
        tafytaDireita(422);
        controller.juntinhoTafy_Can2.release();
        tafytaDesce(69);
        controller.semaforo71.release();
        controller.semaforo66.release();
        controller.linha1.release();
        tafytaDesce(180);
    }

    public void tafytaEsquerda(double x) {
        eixoX = controller.tafytaImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeTafyta());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.tafytaImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void tafytaDireita(double x) {
        eixoX = controller.tafytaImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeTafyta());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.tafytaImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void tafytaSobe(double y) {
        eixoY = controller.tafytaImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeTafyta());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.tafytaImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void tafytaDesce(double y) {
        eixoY = controller.tafytaImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeTafyta());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.tafytaImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }
}
