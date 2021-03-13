public class InformacoesDosJogos {
    private int Rank;
    private String Name;
    private String Platform;
    private int Year;
    private String Genre;
    private String Publisher;
    private double NA_Sales;
    private double EU_Sales;
    private double JP_Sales;
    private double Other_Sales;
    private double Global_Sales;

    public InformacoesDosJogos(int rank, String name, String platform, int year, String genre, String publisher, double NA_Sales, double EU_Sales, double JP_Sales, double other_Sales, double global_Sales) {
        Rank = rank;
        Name = name;
        Platform = platform;
        Year = year;
        Genre = genre;
        Publisher = publisher;
        this.NA_Sales = NA_Sales;
        this.EU_Sales = EU_Sales;
        this.JP_Sales = JP_Sales;
        Other_Sales = other_Sales;
        Global_Sales = global_Sales;
    }

    public int getRank() {
        return Rank;
    }

    public String getName() {
        return Name;
    }

    public String getPlatform() {
        return Platform;
    }

    public int getYear() {
        return Year;
    }

    public String getGenre() {
        return Genre;
    }

    public String getPublisher() {
        return Publisher;
    }

    public double getNA_Sales() {
        return NA_Sales;
    }

    public double getEU_Sales() {
        return EU_Sales;
    }

    public double getJP_Sales() {
        return JP_Sales;
    }

    public double getOther_Sales() {
        return Other_Sales;
    }

    public double getGlobal_Sales() {
        return Global_Sales;
    }
}
