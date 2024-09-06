package TreinoAbstracao;

public class Motocicleta { 
    public String rodas;
    public String capacete;
    public String bau;
    
    public Motocicleta(String rodasVar, String capaceteVar, String bauVar){
        this.rodas = rodasVar; 
        this.capacete = capaceteVar;
        this.bau = bauVar;
    }
    
    public void darPartida(){
        System.out.println("Dando partida...");
        System.out.println("Ligado");
    }
    
    public void empinarMoto(){
        System.out.println("Empinando");
    }
    
    public void usarBau(){
        System.out.println("Carregando carga...");
        System.out.println("Carga carregada.");
    }
}
