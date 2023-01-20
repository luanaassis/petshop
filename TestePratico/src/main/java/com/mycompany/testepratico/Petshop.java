package com.mycompany.testepratico;

public class Petshop {
    private String nome;
    private double distancia;
    private double diaSemanaP;
    private double diaSemanaG;
    private double diaFSemanaP;
    private double diaFSemanaG;
    
    public Petshop(String nome,double distancia,double diaSemanaP,double diaSemanaG,double diaFSemanaP,double diaFSemanaG){
        this.nome = nome;
        this.distancia = distancia;
        this.diaSemanaP = diaSemanaP;
        this.diaSemanaG = diaSemanaG;
        this.diaFSemanaP = diaFSemanaP;
        this.diaFSemanaG = diaFSemanaG;
    }
    
    public double precoSemana(double pequeno, double grande){
        double preco = (pequeno*this.diaSemanaP) + (grande*this.diaSemanaG);
        return preco;
    }
    public double precoFds(double pequeno,double grande){
        double preco = (pequeno*this.diaFSemanaP) + (grande*this.diaFSemanaG);
        return preco;
    }
}
