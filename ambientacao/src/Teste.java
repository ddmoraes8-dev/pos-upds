import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        ItemCardapio item1 = new ItemCardapio(
                1l,
                "Refresco do Chaves",
                "Suco de limão que parece tamarindo e tem gosto de groselha.",
                2.99,
                4);

        ItemCardapio item2 = new ItemCardapio(
                2L,
                "Sanduíche de Preseunto do Chaves",
                "Sanduíche de preseunto simples, mas feito com muito amor.",
                3.50,
                2);

        ItemCardapio item3 = new ItemCardapio(
                3L,
                "Torta de Frango da Dona Florinda",
                "Torta de frango com recheio cremoso e massa crocante.",
                12.99,
                2);

        ItemCardapio item4 = new ItemCardapio(
                4L,
                "Pipoca do Quico",
                "Balde de pipoca preparado com carinho pelo Quico.",
                4.99,
                2);

        ItemCardapio item5 = new ItemCardapio(
                5L,
                "Água de Jamaica",
                "Água aromatizada com hibisco e toque de açúcar.",
                2.50,
                4);

        ItemCardapio item6 = new ItemCardapio(
                6L,
                "Churros do Chaves",
                "Churros recheados com doce de leite, clássicos e irresistiveis.",
                4.99,
                3);

        ItemCardapio item7 = new ItemCardapio(
                7L,
                "Tacos de Carnitas",
                "Tacos recehados com carne tenra.",
                25.90,
                2);

        item2.definePromocao(2.99);
        item3.definePromocao(10.99);
        item4.definePromocao(3.99);
        item5.definePromocao(2.00);
        item6.definePromocao(3.99);

        List<ItemCardapio> cardapio = new ArrayList<ItemCardapio>();
        cardapio.add(item1);
        cardapio.add(item2);
        cardapio.add(item3);
        cardapio.add(item4);
        cardapio.add(item5);
        cardapio.add(item6);
        cardapio.add(item7);

        for (ItemCardapio item : cardapio) {
            System.out.println("Nome: " + item.nome);
            System.out.println("Em promocao: " + item.emPromocao);

            if (item.emPromocao) {
                System.out.println("Preco com desconto: " + item.precoComDesconto);
            }

            System.out.println("Porcentagem de desconto: " + item.preco);
            System.out.println(item.emPromocao ? "Preço de: " + item.preco + " por: " + item.precoComDesconto : "Preço: " + item.preco);
            System.out.println("Categoria: " + item.obtemNomeCategoria(item.categoria));

            System.out.println("--------------------");
        }
    }
}
