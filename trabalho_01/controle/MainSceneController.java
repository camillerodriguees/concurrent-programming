/* ***************************************************************
* Autor............: Camille Rodrigues Costa
* Matricula........: 202111219
* Inicio...........: 08/02/2023
* Ultima alteracao.: 12/02/2023
* Nome.............: Water Calculator
* Funcao...........: O programa serve para calcular quantos litros de agua o usuario precisa ingerir por dia
*************************************************************** */


package controle;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainSceneController implements Initializable {

  @FXML
  private ChoiceBox<String> ListaIdades; //caixa de escolha das idades

  private String idades[] = { "Ate 17 anos", "18 aos 55 anos", "55 aos 65 anos", "Acima de 66 anos" }; // String com as idades para aparecer na ChoiceBox

  @Override
  public void initialize(URL location, ResourceBundle resources) {

    ListaIdades.getItems().addAll(idades); //adicona os items da classe String 'idades' dentro da ChoiceBox

  }

  @FXML
  private TextField peso; // caixa de texto para o usuario inserir o seu peso

  @FXML
  private Button close; // botao para fechar o programa

  @FXML
  private Text resultado; // caixa de texto para mostrar o resultado do calculo

  @FXML
    private Button minimize; //botao para minimizar tela
  
  @FXML
  void calculeBut(ActionEvent event) {

    double calculoPeso; // valor do peso digitado pelo usuario
    double calculoIdade; //valor de quantos ml precisa ser multiplicado pelo peso

    // os ifs irao selecionar separadamente um item da ChoiceBox e de acordo com cada seleção ira atribuir um valor ao calculoIdade
    if (ListaIdades.getSelectionModel().getSelectedItem() == "Ate 17 anos")
      calculoIdade = 0.040; // fim do if
    else if (ListaIdades.getSelectionModel().getSelectedItem() == "18 aos 55 anos")
      calculoIdade = 0.035; // fim do else if
    else if (ListaIdades.getSelectionModel().getSelectedItem() == "55 aos 65 anos")
      calculoIdade = 0.030; // fim do else if
    else if (ListaIdades.getSelectionModel().getSelectedItem() == "Acima de 66 anos")
      calculoIdade = 0.025; // fim do else if
    else 
      calculoIdade = 0; // fim do else

    try { // Tratamento de excessão
      calculoPeso = Double.parseDouble(peso.getText()); // pega o peso que o usuario digitou e bota na variavel calculoPeso
      if (calculoPeso < 0)
        calculoPeso = 0; // fim do if
    } catch (NumberFormatException e) {
      calculoPeso = 0;
    } // fim do try-catch

    if (calculoIdade == 0 && calculoPeso == 0) //if para o caso do usuario nao tiver digitado o peso e nem a idade
      resultado.setText("Digite seu peso e escolha sua idade"); // fim do if
    else if (calculoIdade == 0) //if para o caso do usuario nao tiver escolhido a idade
      resultado.setText("Escolha sua idade para realizar o calculo"); // fim do else if
    else if (calculoPeso == 0) //if para o caso do usuario nao tiver digitado o peso
      resultado.setText("Digite seu peso para realizar o calculo"); // fim do else if
    else { //if para mostrar o resultado se tiver digitado o peso e a idade certos
      String calculo = String.format("%.2f", calculoPeso * calculoIdade); 
      resultado.setText("Para o seu corpo funcionar perfeitamente voce tera que beber " + calculo +"L de agua");
    } // fim do else

  }

  @FXML
  void close(MouseEvent event) { 
    System.exit(0); //fecha o programa ao apertar o botao
  }

  @FXML
    void minimize(MouseEvent event) {
        Stage stage = (Stage) minimize.getScene().getWindow(); //minimiza a tela ao apertar o botao
        stage.setIconified(true);
    }
}
