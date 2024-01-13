/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Felix.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class FelixCar extends Thread {

    private Controller controller;

    public FelixCar(Controller controller) {
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
                moveFelix();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void moveFelix() throws InterruptedException {
        controller.felixImageView.setVisible(true);
        //controller.felixImageView.setLayoutX(523);
       // controller.felixImageView.setLayoutY(72);
        if (cont) {
            controller.semaforo5.acquire();
            cont = false;
        }

        felixDesce(180);
        // controller.semaforo24.acquire();
        controller.semaforo57.acquire();
        felixDesce(294);
        controller.semaforo54.acquire();
        felixDesce(400);
        controller.semaforo57.release();
        controller.semaforo5.release();
        // controller.semaforo24.release();
        controller.semaforo34.acquire();
        felixDesce(508);
        controller.semaforo54.release();
        controller.semaforo34.release();
        controller.semaforo35.acquire();
        felixDesce(558);
        felixEsquerda(473);
        controller.semaforo26.acquire();
        controller.semaforo30.acquire();
        felixEsquerda(369);
        controller.semaforo35.release();
        controller.juntinhoFelix_Can.acquire();
        controller.semaforo27.acquire();
        felixEsquerda(318);
        felixSobe(508);
        controller.semaforo26.release();
        controller.semaforo30.release();
        felixSobe(400);
        controller.juntinhoFelix_Can.release();
        controller.semaforo27.release();
        controller.juntinhoFelix_Can2.acquire();
        controller.semaforo28.acquire();
        controller.semaforo24.acquire();
        controller.semaforo7.acquire();
        felixSobe(294);
        controller.semaforo62.acquire();
        felixSobe(236);
        felixEsquerda(266);
        controller.semaforo62.release();
        controller.juntinhoFelix_Can2.release();
        controller.semaforo28.release();
        controller.semaforo18.acquire();
        controller.semaforo39.acquire();
        // controller.semaforo24.release();
        felixEsquerda(218);
        felixDesce(294);
        controller.semaforo7.release();
        controller.semaforo18.release();
        controller.semaforo19.acquire();
        controller.semaforo44.acquire();
        felixDesce(400);
        controller.semaforo24.release();
        controller.semaforo19.release();
        controller.semaforo39.release();
        controller.semaforo20.acquire();
        controller.semaforo34.acquire();
        felixDesce(508);
        controller.semaforo32.acquire();
        controller.semaforo34.release();
        controller.semaforo44.release();
        felixDesce(558);
        felixEsquerda(168);
        controller.semaforo20.release();
        controller.semaforo40.acquire();
        felixEsquerda(63);
        controller.semaforo32.release();
        felixEsquerda(12);
        felixSobe(508);
        felixSobe(400);
        controller.semaforo40.release();
        controller.semaforo31.acquire();
        felixSobe(294);
        controller.semaforo1.acquire();
        felixSobe(180);
        controller.semaforo31.release();
        felixSobe(69);
        felixSobe(18);
        felixDireita(63);
        controller.semaforo3.acquire();
        controller.semaforo71.acquire();
        //controller.linha1.acquire();
        felixDireita(168);
        controller.semaforo1.release();
        felixDireita(266);
        controller.semaforo42.acquire();
        felixDireita(369);
        controller.semaforo3.release();
        felixDireita(473);
        controller.semaforo5.acquire();
        controller.semaforo71.release();
        //controller.linha1.release();
        // controller.semaforo3.release();
        felixDireita(523);
        felixDesce(69);
        controller.semaforo42.release();

    }

    public void felixEsquerda(double x) {
        eixoX = controller.felixImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeFelix());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.felixImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void felixDireita(double x) {
        eixoX = controller.felixImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeFelix());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.felixImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void felixSobe(double y) {
        eixoY = controller.felixImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeFelix());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.felixImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void felixDesce(double y) {
        eixoY = controller.felixImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeFelix());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.felixImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }
}
