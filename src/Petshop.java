public class Petshop {
    private String nome;
    private double distancia;
    private double precoDiaSemanaP;
    private double precoDiaSemanaG;
    private double precoFinalSemanaP;
    private double precoFinalSemanaG;
    private double precoFinal;
    
    public Petshop(String nome,double distancia,double precoDiaSemanaP,double precoDiaSemanaG,double precoFinalSemanaP,double precoFinalSemanaG){
        this.nome = nome;
        this.distancia = distancia;
        this.precoDiaSemanaP = precoDiaSemanaP;
        this.precoDiaSemanaG = precoDiaSemanaG;
        this.precoFinalSemanaP = precoFinalSemanaP;
        this.precoFinalSemanaG = precoFinalSemanaG;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getDistancia() {
        return distancia;
    }
    
    public void setPrecoFinal(double pequeno,double grande, boolean verificaFinalDeSemana){
        if(verificaFinalDeSemana){
            this.precoFinal = (pequeno*this.precoFinalSemanaP) + (grande*this.precoFinalSemanaG);
        } else {
            this.precoFinal = (pequeno*this.precoDiaSemanaP) + (grande*this.precoDiaSemanaG);
        }
    }    
}
