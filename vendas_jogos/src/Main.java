import java.io.File;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Calc calc = new Calc();
        RegraArquivo regra = new RegraArquivo();
        Scanner scanner = new Scanner(new File("vgsales.csv"));
        ArrayList<InformacoesDosJogos> jogo = new ArrayList<>();

        //pular linha do cabeçalho
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] colunas = linha.split(",");
            InformacoesDosJogos novoJogo = regra.analisarLinha(colunas, scanner);
            jogo.add(novoJogo);

            //armazerar nome do jogo no arquivo
            if (novoJogo.getGlobal_Sales() > 2.0 && novoJogo.getYear() > 2000) {
                regra.escreverArquivo(novoJogo.getName());
            }
        }
        scanner.close();
        double media = calc.calcularMedia(jogo);
        double desvio = calc.calcularDesvio(media, jogo);


        String valorMedio = new DecimalFormat("#.##").format(media);
        String valorDescio = new DecimalFormat("#.##").format(desvio);


        System.out.println("Média: " + valorMedio + " Desvio padrão: " + valorDescio);
    }
}
