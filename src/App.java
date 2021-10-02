public class App {

    public static void main(String[] args) {

        String sql;

        // Como era feito antigamente
        sql = "SELECT * FROM tabela\n" + "WHERE condicao";

        System.out.println(sql);

        // Como é feito hj em dia
        sql = """
                SELECT * FROM tabela
                WHERE condicao
                """;

        System.out.println(sql);

        /*
         * Como se fazia para deixar uma linha junta da outra e o resto com quebra de
         * linha
         */

        String texto;

        texto = "Fala dev! isso é um texto para testes que eu criei. \n"
                + "Estou digitando qualquer coisa aleatória para ser um texto relativamente grande.";

        System.out.println(texto);
        // Agora vamos fazer com o text block...

        texto = """
                Fala dev! \
                Isso é um texto para testes que eu criei.
                Estou digitando qualquer coisa aleatória para ser um texto relativamente grande.
                """;

        System.out.println(texto);
    }
}
