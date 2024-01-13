/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Ralph.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class RalphCar extends Thread {

    private Controller controller;

    public RalphCar(Controller controller) {
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
                moveRalph();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

    public void moveRalph() throws InterruptedException {
        controller.ralphImageView.setVisible(true);
        if (cont) {
            cont = false;
        }

      // controller.candyImageView.setLayoutX(12);
      // controller.candyImageView.setLayoutY(400);
        controller.semaforo31.acquire();
        ralphSobe(294);
        //controller.semaforo2.acquire();
        controller.semaforo1.acquire();
        ralphSobe(180);
        controller.semaforo31.release();
        ralphSobe(69);
        ralphSobe(18);
        ralphDireita(63);
        controller.semaforo47.acquire();
        controller.semaforo3.acquire();
        ralphDireita(168);
        controller.semaforo37.acquire();
       // controller.semaforo2.release();
        controller.semaforo1.release();
        ralphDireita(218);
        ralphDesce(69);
        controller.semaforo3.release();
        ralphDesce(127);
        ralphDireita(266);
        controller.semaforo37.release();
        controller.semaforo38.acquire();
        controller.semaforo16.acquire();
        ralphDireita(318);
        ralphSobe(69);
        controller.semaforo47.release();
        controller.semaforo66.acquire();
        controller.semaforo41.acquire();
        //controller.linha1.acquire();
        ralphSobe(18);
        ralphDireita(369);
        controller.semaforo38.release();
        controller.semaforo16.release();
        ralphDireita(473);
        controller.semaforo66.release();
        //controller.linha1.release();
        controller.semaforo5.acquire();
        ralphDireita(523);
        controller.semaforo41.release();
        ralphDesce(69);
        ralphDesce(180);
        controller.semaforo67.acquire();
        ralphDesce(294);
        controller.semaforo54.acquire();
        ralphDesce(400);
        controller.semaforo67.release();
        controller.semaforo5.release();
        ralphDesce(508);
        controller.semaforo54.release();
        controller.semaforo34.acquire();
        ralphDesce(558);
        controller.semaforo34.release();
        controller.semaforo35.acquire();
        ralphEsquerda(473);
        controller.semaforo21.acquire();
        ralphEsquerda(420);
        ralphSobe(508);
        controller.semaforo35.release();
        ralphSobe(400);
        ralphSobe(344);
        ralphEsquerda(369);
        controller.semaforo24.acquire();
        controller.semaforo21.release();
        ralphEsquerda(318);
        ralphSobe(294);
        controller.semaforo68.acquire();
        controller.semaforo7.acquire();
        ralphSobe(236);
        ralphEsquerda(266);
        controller.semaforo68.release();
        controller.semaforo39.acquire();
        controller.semaforo24.release();
        ralphEsquerda(218);
        ralphDesce(294);
        controller.semaforo7.release();
        controller.semaforo45.acquire();
        ralphDesce(344);
        ralphEsquerda(168);
        controller.semaforo39.release();
        ralphEsquerda(116);
        ralphDesce(400);
        controller.semaforo45.release();
        ralphDesce(508);
        controller.semaforo40.acquire();
        ralphDesce(558);
        ralphEsquerda(63);
        ralphEsquerda(12);
        ralphSobe(508);
        ralphSobe(400);
        controller.semaforo40.release();

    }

    public void ralphEsquerda(double x) {
        eixoX = controller.ralphImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeRalph());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.ralphImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void ralphDireita(double x) {
        eixoX = controller.ralphImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeRalph());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.ralphImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void ralphSobe(double y) {
        eixoY = controller.ralphImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeRalph());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.ralphImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void ralphDesce(double y) {
        eixoY = controller.ralphImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeRalph());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.ralphImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }

}
