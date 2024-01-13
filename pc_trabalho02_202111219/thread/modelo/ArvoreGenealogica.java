package modelo;

/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 12/03/2023
Ultima alteracao: 24/03/2023
Nome: Controller.java
Funcao: Simula uma arvore genealogica usando thread.
****************************************************************/

import controle.Controller;
import javafx.application.Platform;
import javafx.scene.image.Image;

public class ArvoreGenealogica extends Thread {

  private String nome;
  private int idade;
  private ArvoreGenealogica pai;
  private int geracao;
  private boolean vivo;
  private Image imagem;

  private Controller controller;

  // método para setar o controlador
  public void setController(Controller controller) {
    this.controller = controller;
  }

  // construtor padrão
  public ArvoreGenealogica(String nome, int idade, ArvoreGenealogica pai, int geracao) {
    this.nome = nome;
    this.idade = idade;
    this.pai = pai;
    this.geracao = geracao;
    this.vivo = true;
  }

  // construtor que recebe imagem
  public ArvoreGenealogica(String nome, int idade, ArvoreGenealogica pai, int geracao, Image imagem) {
    this.nome = nome;
    this.idade = idade;
    this.pai = pai;
    this.geracao = geracao;
    this.vivo = true;
    this.imagem = imagem;

  }

  // método principal que executa as ações da thread
  public void run() {

    while (vivo) {
      try {

        Thread.sleep(1000); // 1 ano

        idade++; // incrementa a idade em 1

        // verificação de idade do pai para eventos da árvore genealógica

        // Nasce o pai
        if (nome.equals("Pai") && idade == 1) {
          Image imagemPai = new Image("modelo/Nene1.png");
          controller.mudarImagem(imagemPai, "pai");
          System.out.println("Nasceu o pai");
        }

        // O pai tem o primeiro filho aos 22 anos
        if (nome.equals("Pai") && idade == 22) {
          Image imagemFilho1 = new Image("modelo/Agostinho1.png");
          ArvoreGenealogica filho1 = new ArvoreGenealogica("Filho1", 0, this, geracao + 1);
          controller.mudarImagem(imagemFilho1, "filho1");
          filho1.start();
          System.out.println("Nasceu o Filho 1");

        }

        // O pai tem o segundo filho aos 25 anos
        if (nome.equals("Pai") && idade == 25) {
          Image imagemFilho2 = new Image("modelo/Tuco1.png");
          ArvoreGenealogica filho2 = new ArvoreGenealogica("Filho2", 0, this, geracao + 1);
          controller.mudarImagem(imagemFilho2, "filho2");
          filho2.start();
          System.out.println("Nasceu o Filho 2");
        }

        // O pai é avô (primeiro filho) aos 38 anos
        if (nome.equals("Pai") && idade == 38) {
          Image imagemNeto1 = new Image("modelo/Marilda1.png");
          ArvoreGenealogica neto1 = new ArvoreGenealogica("Neto1", 0, null, geracao + 2);
          controller.mudarImagem(imagemNeto1, "neto1");
          neto1.start();
          System.out.println("Nasceu o Neto 1");
        }

        // O pai é avô (segundo filho) aos 45 anos
        if (nome.equals("Pai") && idade == 45) {
          Image imagemNeto2 = new Image("modelo/Bebel1.png");
          ArvoreGenealogica neto2 = new ArvoreGenealogica("Neto2", 0, null, geracao + 2);
          controller.mudarImagem(imagemNeto2, "neto2");
          neto2.start();
          System.out.println("Nasceu o Neto 2");

        }

        // O pai tem o terceiro filho aos 32 anos
        if (nome.equals("Pai") && idade == 32) {
          Image Filho3 = new Image("modelo/Paulao1.png");
          ArvoreGenealogica filho3 = new ArvoreGenealogica("Filho3", 0, this, geracao + 1);
          controller.mudarImagem(Filho3, "filho3");
          filho3.start();
          System.out.println("Nasceu o filho 3");
        }

        // O pai é bisavô (primeiro filho) aos 68 anos
        if (nome.equals("Pai") && idade == 68) {
          Image Bisneto = new Image("modelo/Florianinho1.png");
          ArvoreGenealogica bisneto = new ArvoreGenealogica("Bisneto", 0, null, geracao + 3);
          controller.mudarImagem(Bisneto, "bisneto");
          bisneto.start();
          System.out.println("Nasce o bisneto");
        }

        // O primeiro filho morre aos 61 anos e finaliza a thread do primeiro filho
        if (nome.equals("Filho1") && idade == 61) {
          vivo = false;
          System.out.println("Filho 1 morreu");
        }

        // O segundo filho morre aos 61 anos e finaliza a thread do primeiro filho
        if (nome.equals("Filho2") && idade == 55) {
          vivo = false;
          System.out.println("Filho 2 morreu");
        }

        // O terceiro filho morre aos 61 anos e finaliza a thread do primeiro filho
        if (nome.equals("Filho3") && idade == 55) {
          vivo = false;
          System.out.println("Filho 3 morreu");
        }

        // O primeiro neto morre aos 35 anos e finaliza a thread do primeiro neto
        if (nome.equals("Neto1") && idade == 35) {
          vivo = false;
          System.out.println("Neto 1 morreu");
        }

        // O segundo neto morre aos 33 anos e finaliza a thread do segundo neto
        if (nome.equals("Neto2") && idade == 33) {
          vivo = false;
          System.out.println("Neto 2 morreu");
        }

        // O bisneto morre aos 12 anos e finaliza a thread do bisneto
        if (nome.equals("Bisneto") && idade == 12) {
          vivo = false;
          System.out.println("Bisneto morreu");
        }

        // O pai morre aos 90 anos
        if (nome.equals("Pai") && idade == 90) {
          vivo = false;
          System.out.println("Pai morreu");
        }

        if (nome.equals("Pai") && idade == 15) {
          Image imagemPai = new Image("modelo/Nene2.png");
          controller.mudarImagem(imagemPai, "pai");
        }

        if (nome.equals("Pai") && idade == 35) {
          Image imagemPai = new Image("modelo/Nene3.png");
          controller.mudarImagem(imagemPai, "pai");
        }

        if (nome.equals("Pai") && idade == 60) {
          Image imagemPai = new Image("modelo/Nene4.png");
          controller.mudarImagem(imagemPai, "pai");
        }

        if (nome.equals("Pai") && idade == 90) {
          Image imagemPai = new Image("modelo/tv.png");
          controller.mudarImagem(imagemPai, "pai");
        }

        if (nome.equals("Pai") && idade == 37) {
          Image imagemFilho1 = new Image("modelo/Agostinho2.png");
          controller.mudarImagem(imagemFilho1, "filho1");
        }

        if (nome.equals("Pai") && idade == 57) {
          Image imagemFilho1 = new Image("modelo/Agostinho3.png");
          controller.mudarImagem(imagemFilho1, "filho1");
        }

        if (nome.equals("Pai") && idade == 83) {
          Image imagemFilho1 = new Image("modelo/tv.png");
          controller.mudarImagem(imagemFilho1, "filho1");
        }

        if (nome.equals("Pai") && idade == 42) {
          Image imagemFilho2 = new Image("modelo/Tuco2.png");
          controller.mudarImagem(imagemFilho2, "filho2");
        }

        if (nome.equals("Pai") && idade == 60) {
          Image imagemFilho2 = new Image("modelo/Tuco3.png");
          controller.mudarImagem(imagemFilho2, "filho2");
        }

        if (nome.equals("Pai") && idade == 80) {
          Image imagemFilho2 = new Image("modelo/tv.png");
          controller.mudarImagem(imagemFilho2, "filho2");
        }

        if (nome.equals("Pai") && idade == 49) {
          Image imagemFilho3 = new Image("modelo/Paulao2.png");
          controller.mudarImagem(imagemFilho3, "filho3");
        }

        if (nome.equals("Pai") && idade == 67) {
          Image imagemFilho3 = new Image("modelo/Paulao3.png");
          controller.mudarImagem(imagemFilho3, "filho3");
        }

        if (nome.equals("Pai") && idade == 87) {
          Image imagemFilho3 = new Image("modelo/tv.png");
          controller.mudarImagem(imagemFilho3, "filho3");
        }

        if (nome.equals("Pai") && idade == 47) {
          Image imagemNeto1 = new Image("modelo/Marilda2.png");
          controller.mudarImagem(imagemNeto1, "neto1");
        }

        if (nome.equals("Pai") && idade == 63) {
          Image imagemNeto1 = new Image("modelo/Marilda3.png");
          controller.mudarImagem(imagemNeto1, "neto1");
        }

        if (nome.equals("Pai") && idade == 73) {
          Image imagemNeto1 = new Image("modelo/tv.png");
          controller.mudarImagem(imagemNeto1, "neto1");
        }

        if (nome.equals("Pai") && idade == 62) {
          Image imagemNeto2 = new Image("modelo/Bebel2.png");
          controller.mudarImagem(imagemNeto2, "neto2");
        }

        if (nome.equals("Pai") && idade == 65) {
          Image imagemNeto2 = new Image("modelo/Bebel3.png");
          controller.mudarImagem(imagemNeto2, "neto2");
        }

        if (nome.equals("Pai") && idade == 78) {
          Image imagemNeto2 = new Image("modelo/tv.png");
          controller.mudarImagem(imagemNeto2, "neto2");
        }

        if (nome.equals("Pai") && idade == 78) {
          Image imagemBisneto = new Image("modelo/Florianinho2.png");
          controller.mudarImagem(imagemBisneto, "bisneto");
        }

        if (nome.equals("Pai") && idade == 80) {
          Image imagemBisneto = new Image("modelo/tv.png");
          controller.mudarImagem(imagemBisneto, "bisneto");
        }

        if (controller != null) {
          controller.Tempo(idade);
        }

      } catch (InterruptedException e) {
        e.printStackTrace();
      }

    }

  }

  public static void main(String[] args) {
    ArvoreGenealogica pai = new ArvoreGenealogica("Pai", 0, null, 1);
    pai.start();
  }
}