package org.example.practise3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AbstractEval extends Abstract {

    private int val;

    public AbstractEval(int value) {
        super(value);
    }

    @Override
    int test() {
        return 0;
    }

    @Override
    void test1() {

    }

    public static void main(String[] args) {
        Abstract abstractEval = new AbstractEval(10);
        System.out.println(abstractEval.getValue());
    }
}
