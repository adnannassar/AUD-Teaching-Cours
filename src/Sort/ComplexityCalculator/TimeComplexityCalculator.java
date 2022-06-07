package Sort.ComplexityCalculator;

public class TimeComplexityCalculator {
    private long start, end;

    public void start() {
        this.start = System.nanoTime();
    }

    public void end() {
        this.end = System.nanoTime();
    }

    public long getDuration() {
        return end - start;
    }


}
