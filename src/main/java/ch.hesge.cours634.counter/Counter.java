package ch.hesge.cours634.counter;
import exception.CounterException;

public class Counter implements ICounter {

    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public Counter(int val) {
        this.counter = val;
    }

    @java.lang.Override
    public void inc() throws CounterException {
        this.counter += 1;
    }

    @java.lang.Override
    public void add(int step) throws CounterException {
        this.counter += step;
    }

    @java.lang.Override
    public int getValue() {
        return counter;
    }

    public void setVal(int val){this.counter = val;}
}
