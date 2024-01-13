/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 28/05/2023
Ultima alteracao: 06/06/2023
Nome: Candy.java
Funcao: Responsável por fazer as movimentações de um dos carros
****************************************************************/


import javafx.application.Platform;

public class CandyCar extends Thread {
    private Controller controller;
    private boolean running;

    public CandyCar(Controller controller) {
        this.controller = controller;
        this.running = true;
    }

    public boolean cont = true;
    double eixoX;
    double eixoY;

    public void stopAnimation() {
        this.running = false;
    }

    @Override
    public void run() {
        boolean dentroRegiaoCritica = false;

        while (running) {
            try {
                moveCandy();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void moveCandy() throws InterruptedException{
        if(cont){
            controller.semaforo10.acquire();
            controller.juntinhoTafy_Can2.acquire();
            cont=false;
        }


        controller.candyImageView.setVisible(true);
        //controller.candyImageView.setLayoutX(116);
       // controller.candyImageView.setLayoutY(69);
        
        candyDesce(180);
        controller.semaforo11.acquire();
        controller.semaforo44.acquire();
        controller.semaforo69.acquire();
        candyDesce(294);
        controller.semaforo69.release();
        controller.juntinhoTafy_Can2.release();
        controller.semaforo10.release();
        controller.juntinhoTafy_Can.acquire();
        controller.semaforo11.release();
        controller.semaforo12.acquire();
        candyDesce(400);
        controller.semaforo44.release();
        candyDesce(508);
        controller.juntinhoFelix_Can.acquire();
        controller.semaforo12.release();
        controller.semaforo13.acquire();
        controller.semaforo32.acquire();
        candyDesce(558);
        candyDireita(168);
        controller.juntinhoCan_Sty.acquire();
        candyDireita(266);
        controller.semaforo13.release();
        controller.semaforo32.release();
        controller.semaforo14.acquire();
        controller.semaforo56.acquire();
        candyDireita(318);
        candySobe(508);
        controller.juntinhoTafy_Felix.release();
        controller.juntinhoTafy_Can.release();
        controller.semaforo14.release();
        candySobe(400);
        controller.juntinhoFelix_Can.release();
        controller.juntinhoCan_Sty.release();
        controller.semaforo56.release();
        controller.juntinhoCan_Sty2.acquire();
        controller.juntinhoFelix_Can2.acquire();
        candySobe(294);
        controller.ponto.acquire();
        controller.semaforo15.acquire();
        controller.semaforo16.acquire();
        candySobe(180);
        controller.ponto.release();
        controller.juntinhoFelix_Can2.release();
        controller.juntinhoCan_Sty2.release();
        controller.semaforo15.release();
        //controller.semaforo16.acquire();
        candySobe(69);
        
        controller.semaforo3.acquire();
        controller.juntinhoTafy_Can2.acquire();
        controller.semaforo48.acquire();
        candySobe(18);
        candyEsquerda(266);
        //controller.semaforo48.acquire();
        controller.semaforo16.release();
        candyEsquerda(115);
        candyDesce(69);
        controller.semaforo48.release();
        controller.semaforo3.release();
        controller.semaforo10.acquire();
    }

    public void candyEsquerda(double x) {
        eixoX = controller.candyImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeCandy());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.candyImageView.setLayoutX(eixoX);
            });
            eixoX--;
        }
    }

    public void candyDireita(double x) {
        eixoX = controller.candyImageView.getLayoutX();
        while (eixoX != x) {
            try {
                sleep(controller.getVelocidadeCandy());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.candyImageView.setLayoutX(eixoX);
            });
            eixoX++;
        }
    }

    public void candySobe(double y) {
        eixoY = controller.candyImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeCandy());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.candyImageView.setLayoutY(eixoY);
            });
            eixoY--;
        }
    }

    public void candyDesce(double y) {
        eixoY = controller.candyImageView.getLayoutY();
        while (eixoY != y) {
            try {
                sleep(controller.getVelocidadeCandy());
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Platform.runLater(() -> {
                controller.candyImageView.setLayoutY(eixoY);
            });
            eixoY++;
        }
    }
}
