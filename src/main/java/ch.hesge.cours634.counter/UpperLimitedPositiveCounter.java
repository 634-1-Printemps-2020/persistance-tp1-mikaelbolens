package ch.hesge.cours634.counter;

import exception.CounterException;

public class UpperLimitedPositiveCounter extends Counter {
    private int valMax;
    private int valueMin;

    public UpperLimitedPositiveCounter(int valueMin, int valMax) throws CounterException{
        super();
        if (valueMin >= 0){
            super.setVal(valueMin);
            this.valueMin = valueMin;
            this.valMax = valMax;
        }
        else {
            throw new CounterException("valeur initial doit être psitif ou égale à 0");
        }

    }
    public UpperLimitedPositiveCounter(int valMax) {
        super();
        this.valueMin = 0;
        this.valMax = valMax;
    }
    public UpperLimitedPositiveCounter() {
        super();
        this.valueMin = 0;
        this.valMax = 10;
    }

    @Override
    public void inc() throws CounterException {
        if (getValue() < valMax){
        super.inc();}
        else {
            throw new CounterException("val max dépassé");
        }
    }

    @Override
    public void add(int step) throws CounterException {
        if (super.getValue() + step <= valMax){
            if (step >= 0){
                super.add(step);
            }
            else { throw new CounterException("val négatif pas autorisé");}
        }
        else {
            throw new CounterException("val max dépassé");
        }
    }
}
