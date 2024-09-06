package TreinoAbstracao;

public class ViaLacta {
    public int quantidade;
    public double tamanho;
    public double densidade;
    
    public ViaLacta(int sistemaSolar, double anosLuz, double densidade) {
        this.quantidade = sistemaSolar;
        this.tamanho = anosLuz;
        this.densidade = densidade;
    }

    public void terVida() {
        System.out.println("Possui Vida");
    }
}
