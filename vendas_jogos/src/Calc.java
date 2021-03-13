import java.util.ArrayList;

public class Calc {

    public static double calcularMedia(ArrayList<InformacoesDosJogos> jogos) {
        double total = 0;
        for (InformacoesDosJogos s : jogos) {
            total += s.getGlobal_Sales();
        }
        double media = total / jogos.size();
        return media;
    }
    public static double converterNumero(double valor){
        double valorMilhao = valor * 1000000;
        return valorMilhao;
    }

    public static double calcularDesvio(double media, ArrayList<InformacoesDosJogos> jogos) {
        double desvio = 0;
        double dp = 0;
        double dp2 = 0;
        double dp3 = 0;
        for (int i = 0; i < jogos.size(); i++) {
            dp = (jogos.get(i).getGlobal_Sales() - media) * (jogos.get(i).getGlobal_Sales() - media);
            dp2 += dp;
        }
        dp3 = dp2 / jogos.size();
        desvio = Math.sqrt(dp3);
        return desvio;
    }
}
