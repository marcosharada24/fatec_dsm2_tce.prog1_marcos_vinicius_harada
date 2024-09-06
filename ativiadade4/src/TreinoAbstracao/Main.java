package TreinoAbstracao;

public class Main {
    public static void main(String[] args) {
        // Criando objetos de diferentes classes
        Carro carro = new Carro("V8", "4 rodas", "Sim");
        Motocicleta moto = new Motocicleta("2 rodas", "Sim", "Sim");
        Elefante elefante = new Elefante(2.5, 5000, 3.0);
        CameraDigital camera = new CameraDigital(35.0, 12.0, "colorida");
        Escultura escultura = new Escultura(45.0, "Mármore", "Cinzel");
        ImperioRomano imperio = new ImperioRomano("Grande Império", "Legiões", "Roma");
        Moeda moeda = new Moeda("Ouro", 500.0, "Roma");
        Monitor monitor = new Monitor(27.0, 1080.0, "Preto");
        Pintor pintor = new Pintor("Expressionista", "Pincel largo", 40.0);
        SmartPhone smartphone = new SmartPhone("iPhone", 6.5, 12.0);

        // Chamando métodos de cada objeto para demonstrar seus comportamentos
        System.out.println("Classe Carro:");
        carro.locomover();
        carro.tocarRadio();
        carro.carregarCarga();
        System.out.println();

        System.out.println("Classe Motocicleta:");
        moto.darPartida();
        moto.empinarMoto();
        moto.usarBau();
        System.out.println();

        System.out.println("Classe Elefante:");
        elefante.agarrarTromba();
        elefante.usarMarfim();
        System.out.println();

        System.out.println("Classe CameraDigital:");
        camera.darZoom();
        camera.tirarFoto();
        camera.gravar();
        System.out.println();

        System.out.println("Classe Escultura:");
        escultura.decorar();
        escultura.representarHistoria();
        escultura.esculpir();
        System.out.println();

        System.out.println("Classe ImperioRomano:");
        imperio.definirTerritorio();
        System.out.println();

        System.out.println("Classe Moeda:");
        moeda.troca();
        moeda.compra();
        moeda.inflacao();
        System.out.println();

        System.out.println("Classe Monitor:");
        monitor.exibirImagem();
        monitor.ajustarBrilho();
        System.out.println();

        System.out.println("Classe Pintor:");
        pintor.Pintar();
        pintor.Expressar();
        pintor.Trabalhar();
        System.out.println();

        System.out.println("Classe SmartPhone:");
        smartphone.tirarFoto();
        smartphone.acessarInternet();
        smartphone.manipularFoto();
        System.out.println();
    }
}
