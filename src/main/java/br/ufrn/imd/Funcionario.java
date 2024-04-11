package br.ufrn.imd;

public class Funcionario {
    int chMensal;
    double hh;

    public Funcionario(int chMensal, double hh){
        this.chMensal = chMensal;
        this.hh = hh;
    }

    public double calcularSalario(){
        return chMensal * hh;
    }
}
