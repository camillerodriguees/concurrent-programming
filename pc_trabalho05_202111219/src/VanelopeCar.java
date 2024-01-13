/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Vanelope.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class VanelopeCar extends Thread {
    private Controller controller;
    private boolean running;

    public VanelopeCar(Controller controller) {
        this.controller = controller;
        this.running = true;
    }

    public boolean cont = true;

    public void stopAnimation() {
        running = false;
        
    }

    double eixoX;
    double eixoY;

    @Override
    public void run() {
        

        while (running) {
            
            
            try {
                moveVanelope();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           //semafaro1
           
        }
    }

    public void moveVanelope() throws InterruptedException{
        controller.vanelopeImageView.setVisible(true);
        //controller.vanelopeImageView.setLayoutX(59);
       // controller.vanelopeImageView.setLayoutY(236);
        if(cont){
            controller.semaforo1.acquire();
            controller.semaforo9.acquire();
            cont=false;
        }

       // controller.semaforo2.acquire();
        vanelopeEsquerda(12);
        vanelopeSobe(180);
        controller.semaforo9.release();
        vanelopeSobe(15);
        vanelopeDireita(63);
        controller.linha1.acquire();
        controller.semaforo3.acquire();
        vanelopeDireita(168);
        controller.semaforo59.acquire();
       // controller.semaforo2.release();
        controller.semaforo1.release();
        vanelopeDireita(369);
        controller.semaforo72.acquire();
        controller.semaforo4.acquire();
        vanelopeDireita(473);
        controller.semaforo59.release();
        controller.linha1.release();
        controller.semaforo3.release();
        controller.semaforo4.release();
        controller.semaforo5.acquire();
        vanelopeDireita(523);
        vanelopeDesce(69);
        controller.semaforo72.release();
        vanelopeDesce(180);
        controller.juntinhoVan_Tafy.acquire();
        vanelopeDesce(236);
        vanelopeEsquerda(473);
        controller.semaforo5.release();
        controller.semaforo6.acquire();
        controller.semaforo7.acquire();
        controller.semaforo58.acquire();
        controller.semaforo60.acquire();
        vanelopeEsquerda(369);
        controller.semaforo60.release();
        controller.juntinhoVan_Tafy.release();
        controller.semaforo6.release();
        controller.ponto.acquire();
        vanelopeEsquerda(266);
        controller.semaforo61.acquire();
        controller.ponto.release();
        controller.semaforo8.acquire();
        controller.semaforo58.release();
        vanelopeEsquerda(168);
        controller.semaforo61.release();
        controller.semaforo7.release();
        controller.semaforo8.release();
        controller.semaforo9.acquire();
        controller.semaforo69.acquire();
        vanelopeEsquerda(63);
        controller.semaforo69.release();
        controller.semaforo1.acquire();
        
    }

    public void vanelopeEsquerda(double x) {
        eixoX = controller.vanelopeImageView.getLayoutX();
        while (eixoX != x) {
            
            try {
                sleep(controller.getVelocidadeVanelope());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.vanelopeImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void vanelopeDireita(double x) {
        eixoX = controller.vanelopeImageView.getLayoutX();
        while (eixoX != x) {
            
            try {
                sleep(controller.getVelocidadeVanelope());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.vanelopeImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void vanelopeSobe(double y) {
        eixoY = controller.vanelopeImageView.getLayoutY();
        while (eixoY != y) {
            
            try {
                sleep(controller.getVelocidadeVanelope());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.vanelopeImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void vanelopeDesce(double y) {
        eixoY = controller.vanelopeImageView.getLayoutY();
        while (eixoY != y) {
            
            try {
                sleep(controller.getVelocidadeVanelope());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.vanelopeImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }
}