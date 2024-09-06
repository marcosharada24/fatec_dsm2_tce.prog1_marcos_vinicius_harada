package AbstacaoItem;

public class Main {
    public static void main(String[] args) {
        // Criando objetos com diferentes tipos de itens e seus atributos e métodos
        item smartphone = new item("Smartphone", "tecnologia", "tamanho, armazém e conexão", "tirar foto, enviar e-mails");
        item viaLactea = new item("Via Láctea", "ciência", "quantidade de estrelas", "mapear a galáxia");
        item cameraDigital = new item("Câmera Digital", "tecnologia", "foto, resolução", "capturar imagem");
        item elefante = new item("Elefante", "animal", "tamanho, peso", "força em grupo");
        item carro = new item("Carro", "tecnologia", "motor, rodas", "transportar pessoas");
        item motocicleta = new item("Motocicleta", "tecnologia", "andar rápido", "fazer manobras");
        item imperioRomano = new item("Império Romano", "história", "poder militar", "expansão territorial");
        item aviao = new item("Avião", "tecnologia", "velocidade", "voar grandes distâncias");
        item fotossintese = new item("Fotossíntese", "ciência", "plantas", "produzir oxigênio");
        item danca = new item("Dança", "arte", "movimento corporal", "expressar emoções");
        item idadeDoBronze = new item("Idade do Bronze", "história", "metalurgia", "produção de ferramentas");
        item piramidesDoEgito = new item("Pirâmides do Egito", "história", "estruturas antigas", "preservar tumbas");
        item chefDeCozinha = new item("Chef de cozinha", "arte", "habilidade culinária", "preparar refeições gourmet");
        item galaxia = new item("Galáxia", "ciência", "milhares de estrelas", "formar sistemas solares");
        item conservacaoDaEnergia = new item("Conservação da Energia", "ciência", "energia total constante", "realizar trabalho sem perdas");
        item escultura = new item("Escultura", "arte", "uso de formas", "criar arte tridimensional");
        item monitor = new item("Monitor", "tecnologia", "tamanho, resolução", "exibir imagens e vídeos");
        item leao = new item("Leão", "animal", "força, agilidade", "liderar grupos");
        item moeda = new item("Moeda", "história", "valor monetário", "facilitar trocas comerciais");
        item pintor = new item("Pintor", "arte", "criatividade", "criar pinturas artísticas");

        // Exibindo informações
        item[] itens = {smartphone, viaLactea, cameraDigital, elefante, carro, motocicleta, imperioRomano, 
                        aviao, fotossintese, danca, idadeDoBronze, piramidesDoEgito, chefDeCozinha, galaxia, 
                        conservacaoDaEnergia, escultura, monitor, leao, moeda, pintor};

        for (item item : itens) {
            item.exibirInformacoes();
        }
    }
}
