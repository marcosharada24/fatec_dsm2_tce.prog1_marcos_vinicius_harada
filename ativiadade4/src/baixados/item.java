package AbstacaoItem;

public class item {
    // Atributos
    public String nome;
    public String tipo;
    public String atributo;
    public String metodo;

    // Construtor
    public item(String nome, String tipo, String atributo, String metodo) {
        this.nome = nome;
        this.tipo = tipo;
        this.atributo = atributo;
        this.metodo = metodo;
    }

    // Método para descrever o item
    public void descricao() {
        switch (tipo.toLowerCase()) {
            case "tecnologia":
                System.out.println("Este é um item tecnológico.");
                break;
            case "animal":
                System.out.println("Este é um animal.");
                break;
            case "história":
                System.out.println("Este item está relacionado à história.");
                break;
            case "arte":
                System.out.println("Este item está relacionado à arte.");
                break;
            case "ciência":
                System.out.println("Este item está relacionado à ciência.");
                break;
            default:
                System.out.println("Tipo desconhecido.");
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        descricao();
        System.out.println("Atributo: " + atributo);
        System.out.println("Método: " + metodo);
        System.out.println("----------------------");
    }
}
