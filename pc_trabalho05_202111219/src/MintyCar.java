/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Minty.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class MintyCar extends Thread {

    private Controller controller;

    public MintyCar(Controller controller) {
        this.controller = controller;

    }

    private volatile boolean running = true;
    public boolean cont = true;
    double eixoX;
    double eixoY;

    public void stopAnimation() {
        running = false;
    }

    public void run() {

        while (running) {

            try {
                moveMinty();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public void moveMinty() throws InterruptedException {
        controller.mintyImageView.setVisible(true);
       // controller.mintyImageView.setLayoutX(266);
       // controller.mintyImageView.setLayoutY(453);
        if (cont) {

        }

        controller.semaforo44.acquire();
        mintyEsquerda(218);
        mintySobe(400);
        controller.semaforo45.acquire();
        mintySobe(344);
        mintyEsquerda(168);
        controller.semaforo9.acquire();
        mintyEsquerda(116);
        mintySobe(294);
        controller.semaforo45.release();
        mintySobe(236);
        mintyEsquerda(63);
        controller.semaforo44.release();
        controller.semaforo1.acquire();
        mintyEsquerda(12);
        mintySobe(180);
        controller.semaforo9.release();
        mintySobe(69);
        mintySobe(18);
        mintyDireita(63);
        controller.semaforo48.acquire();
        controller.semaforo50.acquire();
        mintyDireita(168);
        controller.semaforo63.acquire();
        controller.semaforo1.release();
        mintyDireita(218);
        mintyDesce(69);
        controller.semaforo63.release();
        controller.semaforo50.release();
        mintyDesce(127);
        mintyDireita(266);
        controller.semaforo70.acquire();
        //controller.semaforo7.acquire();
        controller.semaforo15.acquire();
        controller.semaforo49.acquire();
        mintyDireita(318);
        mintyDesce(180);
        controller.semaforo68.acquire();
        controller.semaforo62.acquire();
        controller.semaforo48.release();
        controller.semaforo58.acquire();
        mintyDesce(236);
        mintyDireita(369);
        controller.semaforo70.release();
        controller.semaforo68.release();
        controller.semaforo62.release();
        controller.semaforo53.acquire();
        controller.semaforo49.release();
        controller.semaforo15.release();
        controller.semaforo52.acquire();
        mintyDireita(422);
        mintyDesce(294);
        controller.semaforo58.release();
       // controller.semaforo7.release();
        mintyDesce(344);
        mintyDireita(473);
        controller.semaforo54.acquire();
        controller.semaforo52.release();
        mintyDireita(523);
        mintyDesce(400);
        mintyDesce(508);
        controller.semaforo54.release();
        controller.semaforo53.release();
        controller.semaforo34.acquire();
        controller.semaforo35.acquire();
        mintyDesce(558);
        controller.semaforo34.release();
        mintyEsquerda(473);
        controller.semaforo65.acquire();
        controller.semaforo56.acquire();
        mintyEsquerda(369);
        controller.semaforo35.release();
        mintyEsquerda(318);
        mintySobe(508);
        controller.semaforo65.release();
        mintySobe(453);
        mintyEsquerda(266);
        controller.semaforo56.release();
    }

    public void mintyEsquerda(double x) {
        eixoX = controller.mintyImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeMinty());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.mintyImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void mintyDireita(double x) {
        eixoX = controller.mintyImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeMinty());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.mintyImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void mintySobe(double y) {
        eixoY = controller.mintyImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeMinty());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.mintyImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void mintyDesce(double y) {
        eixoY = controller.mintyImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeMinty());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.mintyImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }
}
