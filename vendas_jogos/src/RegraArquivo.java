import java.io.*;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class RegraArquivo {

    public static void escreverArquivo(String nomeJogo) throws IOException {
        String nome = nomeJogo + "\n";
        Files.write(Paths.get("jogosMaisVendidos.txt"), nome.getBytes(), StandardOpenOption.APPEND );
    }

    public InformacoesDosJogos analisarLinha(String[] colunas, Scanner scanner) {
        Calc calc = new Calc();

        int rank = 0;
        String name = "";
        String platform = "";
        int year = 0;
        String genre = "";
        String publisher = "";
        double na_sales = 0.0;
        double eu_sales = 0.0;
        double jp_sales = 0.0;
        double other_sales = 0.0;
        double global_sales = 0.0;

        for (int i = 0; i < colunas.length; i++) {
            if (colunas[i].equals("N/A")) {
                colunas[i] = "0";
            }
        }

        if (colunas.length == 11) {
            rank = Integer.parseInt(colunas[0]);
            name = colunas[1];
            platform = colunas[2];
            year = Integer.parseInt(colunas[3]);
            genre = colunas[4];
            publisher = colunas[5];
            na_sales = Double.parseDouble(colunas[6]);
            eu_sales = Double.parseDouble(colunas[7]);
            jp_sales = Double.parseDouble(colunas[8]);
            other_sales = Double.parseDouble(colunas[9]);
            global_sales = Double.parseDouble(colunas[10]);
            scanner.nextLine();
        } else if (colunas.length == 12) {
            if (colunas[1].charAt(0) == '"') {
                name = colunas[1] + ", " + colunas[2];
                platform = colunas[3];
                year = Integer.parseInt(colunas[4]);
                genre = colunas[5];
                publisher = colunas[6];
                na_sales = Double.parseDouble(colunas[7]);
                eu_sales = Double.parseDouble(colunas[8]);
                jp_sales = Double.parseDouble(colunas[9]);
                other_sales = Double.parseDouble(colunas[10]);
                global_sales = Double.parseDouble(colunas[11]);

            } else {
                if (colunas[5].charAt(0) == '"') {
                    rank = Integer.parseInt(colunas[0]);
                    name = colunas[1];
                    platform = colunas[2];
                    year = Integer.parseInt(colunas[3]);
                    genre = colunas[4];
                    publisher = colunas[5] + " ," + colunas[6];
                    na_sales = Double.parseDouble(colunas[7]);
                    eu_sales = Double.parseDouble(colunas[8]);
                    jp_sales = Double.parseDouble(colunas[9]);
                    other_sales = Double.parseDouble(colunas[10]);
                    global_sales = Double.parseDouble(colunas[11]);

                }

            }

            scanner.nextLine();
        } else if (colunas.length == 13) {
            rank = Integer.parseInt(colunas[0]);
            name = colunas[1] + ", " + colunas[2] + "," + colunas[3];
            platform = colunas[4];
            year = Integer.parseInt(colunas[5]);
            genre = colunas[6];
            publisher = colunas[7];
            na_sales = Double.parseDouble(colunas[8]);
            eu_sales = Double.parseDouble(colunas[9]);
            jp_sales = Double.parseDouble(colunas[10]);
            other_sales =Double.parseDouble(colunas[11]);
            global_sales =Double.parseDouble(colunas[12]);

            scanner.nextLine();
        } else if (colunas.length == 14) {
            rank = Integer.parseInt(colunas[0]);
            name = colunas[1] + ", " + colunas[2] + "," + colunas[3] + ", " + colunas[4];
            platform = colunas[5];
            year = Integer.parseInt(colunas[6]);
            genre = colunas[7];
            publisher = colunas[8];
            na_sales = Double.parseDouble(colunas[9]);
            eu_sales = Double.parseDouble(colunas[10]);
            jp_sales = Double.parseDouble(colunas[11]);
            other_sales =Double.parseDouble(colunas[12]);
            global_sales = Double.parseDouble(colunas[13]);
            scanner.nextLine();
        }
        InformacoesDosJogos jogo = new InformacoesDosJogos(rank, name, platform, year, genre, publisher, na_sales, eu_sales, jp_sales, other_sales, global_sales);
        return jogo;
    }


}

