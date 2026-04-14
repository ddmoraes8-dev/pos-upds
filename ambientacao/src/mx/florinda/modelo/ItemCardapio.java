package mx.florinda.modelo;

public class ItemCardapio {

    // atributos
    private long id;
    private String nome;
    private String descricao;
    private boolean emPromocao;
    private double preco;
    private double precoComDesconto;
    private CategoriaCardapio categoria;

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

    public void setPromocao(double precoComDesconto) {
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


    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEmPromocao() {
        return emPromocao;
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoComDesconto() {
        return precoComDesconto;
    }

    public CategoriaCardapio getCategoria() {
        return categoria;
    }
}