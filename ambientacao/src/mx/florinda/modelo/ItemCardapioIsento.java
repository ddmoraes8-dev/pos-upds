package mx.florinda.modelo;

class ItemCardapioIsento extends ItemCardapio {

     ItemCardapioIsento(long id,
                        String nome,
                        String descricao,
                        double preco,
                        CategoriaCardapio categoria) {
         super(id, nome, descricao, preco, categoria);
     }

     @Override
     public double calculaImposto() {
         return 0.0;
     }
 }
