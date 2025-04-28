 /*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import javax.swing.*;

public class Aluno extends Pessoa {

    public static final String curso = "Sistemas de Informação";

    public String getCurso() {
        return curso;
    }

    @Override
    public String getNomeFormatado() {
        String nome = super.getNome();
        nome = nome.toUpperCase();
        return nome;
    }

    @Override
    public void lerDados() {
        super.lerDados();
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nCurso: %s\n", getNomeFormatado(), super.getIdade(), getCurso());
    }

    @Override
    public void imprimeDados() {
        String dados = toString();
        JOptionPane.showMessageDialog(null, dados);
    }
}
