package br.ufrn.imd;

public class Gerente extends Funcionario{
    
    public enum Nivel{
        JUNIOR, PLENO, SENIOR
    }

    Nivel nivel;

    public Gerente(int chMensal, double hh, Nivel nivel){
        super(chMensal, hh);
        this.nivel = nivel;
    }

    public double calcularSalario(){
        double salario = super.calcularSalario();
        switch (nivel){
            case JUNIOR:
                salario += 1000;
                break;
            case PLENO:
                salario += 2000;
                break;
            case SENIOR:
                salario += 3000;
                break;
        }
        return salario;
    }
}
