/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Sticky.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/

import javafx.application.Platform;

public class StickyCar extends Thread{
    
    private Controller controller;
   

    public StickyCar (Controller controller){
        this.controller = controller;
        
    }

    private volatile boolean running = true;
    private boolean cont = true;
    double eixoX;
    double eixoY;

    public void stopAnimation() {
        running = false;
    }

    public void run(){
        
        while(running){
            try {
                moveSticky();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            
        }
    }

    public void moveSticky() throws InterruptedException{
        
        controller.stickyImageView.setVisible(true);
      //  controller.stickyImageView.setLayoutX(473);
        //controller.stickyImageView.setLayoutY(558);
        if(cont){
            controller.semaforo23.acquire();
            controller.semaforo35.acquire();
            cont = false;
        }

        controller.semaforo33.acquire();
        controller.semaforo13.acquire();
        controller.juntinhosJu_Sty.acquire();
        stickyEsquerda(369);
        controller.juntinhoCan_Sty.acquire();
        controller.semaforo27.acquire();
        controller.semaforo35.release();
        stickyEsquerda(318);
        stickySobe(508);
        controller.semaforo13.release();
        controller.semaforo33.release();
        controller.juntinhosJu_Sty.release();;
        stickySobe(400);
        controller.juntinhoCan_Sty.release();
        controller.semaforo27.release();
        controller.juntinhoCan_Sty2.acquire();
        controller.semaforo28.acquire();
        controller.semaforo49.acquire();
        stickySobe(294);
        controller.semaforo70.acquire();
        stickySobe(180);
        controller.semaforo70.release();
        controller.semaforo28.release();
        controller.juntinhoCan_Sty2.release();
        controller.semaforo16.acquire();
        stickySobe(69);
        controller.semaforo72.acquire();
        controller.semaforo49.release();
        controller.semaforo42.acquire();
       // controller.linha1.acquire();
        stickySobe(18);
        stickyDireita(369);
        controller.semaforo16.release();
        stickyDireita(473);
        controller.semaforo5.acquire();
        stickyDireita(523);
        controller.semaforo42.release();
        //controller.linha1.release();
        stickyDesce(69);
        controller.semaforo72.release();
        stickyDesce(180);
        controller.semaforo62.acquire();
       // controller.semaforo24.acquire();
        stickyDesce(236);
        stickyDesce(294);
        controller.semaforo62.release();
        controller.semaforo54.acquire();
        stickyDesce(400);
        //controller.semaforo24.release();
        controller.semaforo5.release();
        controller.semaforo34.acquire();
        stickyDesce(508);
        controller.semaforo34.release();
        controller.semaforo54.release();
        controller.semaforo35.acquire();
        stickyDesce(558);
        stickyEsquerda(473);
        controller.semaforo23.release();

    }

    public void stickyEsquerda(double x) {
        eixoX = controller.stickyImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeSticky());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.stickyImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void stickyDireita(double x) {
        eixoX = controller.stickyImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeSticky());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.stickyImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void stickySobe(double y) {
        eixoY = controller.stickyImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeSticky());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.stickyImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void stickyDesce(double y) {
        eixoY = controller.stickyImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeSticky());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.stickyImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }
   
}