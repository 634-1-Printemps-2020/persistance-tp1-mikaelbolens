package ch.hesge.cours634.counter;

import exception.CounterException;

import static org.junit.Assert.*;

public class UpperLimitedPositiveCounterTest {


    @org.junit.Test
    public void inc() {
    }

    @org.junit.Test (expected = CounterException.class)
    public void add() throws CounterException {
        UpperLimitedPositiveCounter c = new UpperLimitedPositiveCounter(5,5);
        c.inc();
    }
}