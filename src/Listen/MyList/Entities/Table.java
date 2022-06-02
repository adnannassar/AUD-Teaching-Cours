package Listen.MyList.Entities;

public class Table implements Comparable<Table> {
    String marke;
    int width;
    int height;

    public Table(String marke) {
        this.marke = marke;
    }

    @Override
    public int compareTo(Table o) {
        return marke.compareTo(o.marke);
    }
}
