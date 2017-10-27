package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        histogram.increment("gmail.com",1);
        histogram.increment("ulpgc.es",3);
        histogram.increment("hotmail.com",1);
        histogram.increment("ull.es",2);
        new HistogramDisplay(histogram).execute();
    }
    
}
