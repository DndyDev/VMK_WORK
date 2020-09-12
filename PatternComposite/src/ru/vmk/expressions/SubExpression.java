package ru.vmk.expressions;

public interface SubExpression {
     Number getValue();

     void add(SubExpression expr);
     void sub(SubExpression expr);
     SubExpression getSubExpression(int index);
}
