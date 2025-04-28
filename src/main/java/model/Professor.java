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

public class Professor extends Pessoa {

    public double salario;
    public static final String titulo = "Doutor";

    public Professor() {
        this.salario = 0.00;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void lerDados() {
        super.lerDados();
        setSalario(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: ")));
    }

    @Override
    public String getNomeFormatado() {
        return String.format("%s %s", getTitulo(), super.getNome());
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nIdade: %d\nSalario = R$%.2f\n", getNomeFormatado(), super.getIdade(), getSalario());
    }

    @Override
    public void imprimeDados() {
        String dados = toString();
        JOptionPane.showMessageDialog(null, dados);
    }
}
