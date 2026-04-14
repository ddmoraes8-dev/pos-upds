package mx.florinda.modelo;

public class ItemCardapio {

    // atributos
    public long id;
    public String nome;
    public String descricao;
    public boolean emPromocao;
    public double preco;
    public double precoComDesconto;
    public CategoriaCardapio categoria;

    //construtor
    ItemCardapio(long id, String nome, String descricao, double preco, CategoriaCardapio categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
    }

    //metodos
    public double calculaPorcentagemDesconto() {
        return (preco - precoComDesconto) / preco * 100;
    }

    public CategoriaCardapio obtemNomeCategoria() {
        return categoria;
    }

    public void definePromocao(double precoComDesconto) {
        emPromocao = true;
        this.precoComDesconto = precoComDesconto;
    }

    public double calculaImposto() {

        if (this.emPromocao) {
            return precoComDesconto * 0.1;
        } else {
            return preco * 0.1;
        }
    }

}