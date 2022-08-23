package microservices.book.multiplication.domain;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Multiplication {

    // 인수
    private int factorA;
    private int factorB;

    // A * B 의 결과
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }
}
