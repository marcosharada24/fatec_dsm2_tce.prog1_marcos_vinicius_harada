package TreinoAbstracao;

public class ImperioRomano {
    public String historico;
    public String exercito;
    public String local;
    
 
    public ImperioRomano(String historicoVar, String exercitoVar, String localVar){
        this.historico = historicoVar; 
        this.exercito = exercitoVar;
        this.local = localVar;
    }
    
    public void definirTerritorio(){
        System.out.println("Definindo local...");
        System.out.println("Local definido.");
    }
}
