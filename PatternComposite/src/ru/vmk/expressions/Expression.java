package ru.vmk.expressions;

import java.util.ArrayList;
import java.util.List;

// Выражение - контейнер
public class Expression implements SubExpression {

    private final List<SubExpression> expressions;

    public Expression(List <SubExpression> expressions) {
        this.expressions = new ArrayList<SubExpression>();
        for (SubExpression expression: expressions) {
            this.expressions.add(expression);
        }
    }


    public void add(SubExpression expression) {
        expressions.add(expression);
    }


    public void sub(SubExpression expression) {
        if (expression instanceof IntegerValue) {
            expressions.add(new IntegerValue(-1*expression.getValue().intValue()));
        } else {
            expressions.add(new FloatValue(-1*expression.getValue().floatValue()));
        }

    }


    public SubExpression getSubExpression(int index) {
        return expressions.get(index);
    }

    @Override
    public Number getValue() {
        Number result = (float) 0;

        for (SubExpression expression: expressions) {
            result = result.floatValue() + expression.getValue().floatValue();
        }

        return result;
    }
}
