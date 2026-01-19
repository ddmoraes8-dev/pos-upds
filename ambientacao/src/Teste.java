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
                3);

        var porcentagemDesconto = item1.calculaPorcentagemDesconto(item1.preco, item1.precoComDesconto);
        item1.definePromocao(porcentagemDesconto);

        List<ItemCardapio> cardapio = new ArrayList<ItemCardapio>();
        cardapio.add(item1);
        cardapio.add(item2);

        for (ItemCardapio item : cardapio) {

            System.out.println(item.emPromocao);
            System.out.println(item.preco);
            System.out.println(item.precoComDesconto);
            System.out.println(item.obtemNomeCategoria(item.categoria));
        }
    }
}
