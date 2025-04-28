/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author laispaivaportela
 */
/*
Crie um novo projeto na IDE com a classe Pessoa e seus atributos nome do tipo String e
idade inteiro. Crie os construtores com e sem parâmetros, get's e set's. Os métodos de leitura
e imprimir os dados devem usar JOptionPane para exibir os dados.
Crie as subclasses de pessoa chamada Aluno e Professor. A classe Aluno deve possui o atributo curso do tipo
String e a classe Professor os atributos salario do tipo double e título do tipo String.
Sobrescreva e reaproveite os métodos de leitura e imprimir nas classes Aluno e Professor.
Crie o método abstrato getNomeFormatado() em Pessoa que retorna String. Na classe
professor retorna uma concatenação do título com o nome. Na classe aluno retorna o nome
em maiúsculo.
Crie uma constante estática(static final) para armazenar um valor default para o título de
professor ("Doutor") e uma outra constante em Aluno para armazenar o curso ("Sistema de
Informação"). Estes valores default serão utilizados no preenchimento dos dados no método
leitura.
Crie o programa principal para testar as classe Aluno e Professor. Lembre-se de organizar as
classe em pacotes.
*/
import javax.swing.JOptionPane;
import model.Pessoa;
import model.Aluno;
import model.Professor;

public class Principal {

    public static void main(String[] args) {
        Pessoa pessoa;
        while (true) {
            String[] opcoes = {"Aluno", "Professor", "Sair"};
            int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha o tipo de pessoa:",
                    "Cadastro",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
            );

            if (escolha == 2) {
                System.exit(0);
            } else {
                if (escolha == 0) {
                    pessoa = new Aluno();
                    pessoa.lerDados();
                    pessoa.imprimeDados();
                } else if (escolha == 1) {
                    pessoa = new Professor();
                    pessoa.lerDados();
                    pessoa.imprimeDados();
                }
            }
        }
    }
}
