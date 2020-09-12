package ru.vmk.expressions;

public class IntegerValue implements  SubExpression {
    private int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    @Override
    public void add(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sub(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Number getValue() {
        return value;
    }
}


