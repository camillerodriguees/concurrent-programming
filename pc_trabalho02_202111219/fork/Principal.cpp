/* ****************************************************************
Autor: Camille Rodrigues Costa
Matricula: 202111219
Inicio: 12/03/2023
Ultima alteracao: 12/03/2023
Nome: Principal.cpp
Funcao:Simular uma árvore genealógica, através do comando fork ().
****************************************************************/

#include <iostream>
#include <unistd.h>
#include <sys/types.h>
#include <cstdlib>

using namespace std;

int main()
{
  
  // Tempo de espera de cada processo
  int pai_sleep = 22;
  int filho1_sleep = 16;
  int neto1_sleep = 30;
  int bisneto1_sleep = 12;
  int neto1_morre_sleep = 5;
  int filho1_morre_sleep = 45;
  int filho2_sleep = 20;
  int neto2_sleep = 33;
  int filho2_morre_sleep = 35;
  int filho3_sleep = 7;
  int filho3_morre_sleep = 55;
  int pai_morre = 58;

  // Mensagem de início do programa
  cout << "Nasce o pai, ID: " << getpid() << ", pai ID: "<< getppid() << endl;

  pid_t idProcesso;
  idProcesso = fork();

  // Processo principal "dorme" por 22 segundos
  sleep(pai_sleep);

  // Nasce o primeiro filho
  switch (idProcesso)
  {
  case -1: // Se ocorrer um erro no fork(), encerra o programa
    cout << "Erro no fork() do primeiro filho." << endl;
    exit(1);
  case 0: // Processo do primeiro filho
    // Mensagem do primeiro filho
    cout << "O pai tem o primeiro filho aos 22 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;
    sleep(filho1_sleep); // Processo dorme por 16 segundos;

    // Processo do primeiro neto
    switch (idProcesso)
    {
    case -1: // Se ocorrer um erro no fork(), encerra o programa
      cout << "Erro no fork() do primeiro neto." << endl;
      exit(1);
    case 0: // Processo do primeiro neto
      // Mensagem do primeiro neto
      cout << "O pai é avô (primeiro filho) aos 38 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;
      sleep(neto1_sleep); // Processo dorme por 30 segundos;

      // Processo do primeiro bisneto
      switch (idProcesso)
      {
      case -1: // Se ocorrer um erro no fork(), encerra o programa
        cout << "Erro no fork() do primeiro bisneto." << endl;
        exit(1);
      case 0: // Processo do primeiro bisneto
        // Mensagem do primeiro bisneto
        cout << "O pai é bisavô (primeiro filho) aos 68 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;  
        sleep(bisneto1_sleep);

        // Mensagem do bisneto morre
        cout << "O Bisneto morre aos 12 anos, ID: "  << getpid() << ", pai ID: "<< getppid() << endl;
        break;
      default: // Volta para o processo do primeiro neto
        sleep(neto1_morre_sleep);
        // Mensagem do primeiro neto morre
        cout << "O primeiro neto morre aos 35 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;  
        break;
      }
      break;
    default: // Volta para o processo do primeiro filho
      sleep(filho1_morre_sleep);
      // Mensagem do primeiro filho morre
      cout << "O primeiro filho morre aos 61 anos, ID  " << getpid() << ", pai ID: "<< getppid() << endl; 
      break;
    }
    break;
  default: // Volta para o processo do pai
    sleep(3);

    // Nasce o segundo filho
    switch (idProcesso)
    {
    case -1: // Se ocorrer um erro no fork(), encerra o programa
      cout << "Erro no fork() do segundo filho." << endl;
      exit(1);
    case 0: // Processo do segundo filho
      // Mensagem do segundo filho
      cout << "O pai tem o segundo filho aos 25 anos, ID: "  << getpid() << ", pai ID: "<< getppid() << endl;
      sleep(filho2_sleep);

      // Processo do segundo neto
      switch (idProcesso)
      {
      case -1: // Se ocorrer um erro no fork(), encerra o programa
        cout << "Erro no fork() do segundo neto." << endl;
        exit(1);
      case 0: // Processo do segundo neto
        // Mensagem do segundo neto
        cout << "O pai é avô (segundo filho) aos 45 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl; 
        sleep(neto2_sleep);
        cout << "O segundo neto morre aos 33 anos, ID: "  << getpid() << ", pai ID: "<< getppid() << endl;
        break;
      default: // Volta para o processo do segundo filho
        sleep(filho2_morre_sleep);
        cout << "O segundo filho morre aos 55 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;
        break;
      }
      break;
    default: // Volta para o processo pai
      sleep(filho3_sleep);

      // Nasce o terceiro filho
      switch (idProcesso)
      {
      case -1: // Se ocorrer um erro no fork(), encerra o programa
        cout << "Erro no fork() do terceiro filho." << endl;
        exit(1);
      case 0: // Processo do terceiro filho
        // Mensagem do terceiro filho
        cout << "O pai tem o terceiro filho aos 32 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;
        sleep(filho3_morre_sleep);
        cout << "O terceiro filho morre aos 55 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;
        break;
      default: // Volta para o processo pai
        sleep(pai_morre);
        // Mensagem do pai morre
        cout << "O pai morre aos 90 anos, ID: " << getpid() << ", pai ID: "<< getppid() << endl;
        break;
      }
      break;
    }
    break;
  }
}
