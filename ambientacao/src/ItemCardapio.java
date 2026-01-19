public class ItemCardapio {

    String nome;
    String descricao;
    boolean emPromocao;
    double preco;
    double precoComDesconto;
    long id;
    int categoria;

    ItemCardapio(long id, String nome, String descricao, double preco, int categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.id = id;
        this.categoria = categoria;
    }

    double calculaPorcentagemDesconto() {
        return (this.preco - this.precoComDesconto) / preco * 100;
    }

    String obtemNomeCategoria(int categoria) {
        String nomeCategoria = "";
        switch (categoria) {
            case 1:
                nomeCategoria = "Entradas";
                break;
            case 2:
                nomeCategoria = "Pratos Principais";
                break;
            case 3:
                nomeCategoria = "Sobremesas";
                break;
            case 4:
                nomeCategoria = "Bebidas";
                break;
            default:
                nomeCategoria = "Não encontrada...";
                break;
        }
        return nomeCategoria;
    }

    void definePromocao(double precoComDesconto) {
        this.emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }

}