public class ItemCardapio {

    String nome;
    String descricao;
    boolean emPromocao;
    double preco;
    double precoComDesconto;
    long id;
    int categoria;

    ItemCardapio(String nome, String descricao, boolean emPromocao, double preco, double precoComDesconto, long id, int categoria) {
        this.nome = nome;
        this.descricao = descricao;
        this.emPromocao = emPromocao;
        this.preco = preco;
        this.precoComDesconto = precoComDesconto;
        this.id = id;
        this.categoria = categoria;
    }


    double calculaPorcentagemDesconto(double preco, double precoComDesconto) {
        return (preco - precoComDesconto) / preco;
    }
}