package TreinoAbstracao;

public class Leao {
    public Double juba;
    public double pelo;
    public String rugido;
    
    public Leao(Double comprimentoJuba, Double comprimentoPelo, String tomDoRugido) {
        this.juba = comprimentoJuba;
        this.pelo = comprimentoPelo;
        this.rugido = tomDoRugido;
    }

    public void dominar() {
        System.out.println("Território Dominado!");
    }

    public void batalhar() {
        System.out.println("Batalha vencida");
    }

    public void liderar() {
        System.out.println("Bando liderado");
    }
}
