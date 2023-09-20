package developer;

import java.util.function.IntBinaryOperator;

public enum OperationEnum {
    ADD((x, y) -> x + y),
    SUBTRACT((x, y) -> x - y),
    MULTIPLY((x, y) -> x * y),
    DIVIDE((x, y) -> x / y);

    private final IntBinaryOperator operator;

    OperationEnum(IntBinaryOperator operator) {
        this.operator = operator;
    }

    public int compute(int x, int y) {
        return operator.applyAsInt(x, y);
    }

}
