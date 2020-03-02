package ch.hesge.cours634.counter;

import exception.CounterException;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CounterTest {

    @org.junit.Test
    public void inc() throws CounterException {
        Counter c = new Counter(0);
        c.inc();
        Assert.assertEquals(1, c.getValue());

    }

    @org.junit.Test
    public void add() throws CounterException {
        Counter c = new Counter(0);
        c.add(5);
        Assert.assertEquals(5, c.getValue());

    }

    @org.junit.Test
    public void getValue() {
        Counter c = new Counter(10);
        Assert.assertEquals(10, c.getValue());

    }

}