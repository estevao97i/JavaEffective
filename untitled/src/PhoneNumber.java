import exception.JavaEffectiveException;

import java.util.Formattable;
import java.util.Formatter;
import java.util.Objects;

// se tiver muitas propriedades usar um Builder de PhoneNumber
public class PhoneNumber implements Formattable {

    private final int areaCode;

    private final int number;

    protected PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    /** a razão de fazermos o factory method -> of
     * - código defensivo (checar a consistência dos dados -> defender de erros futuros na implementação)
     * - Cache interno de uma instancia PhoneNumber,
     * melhora a performance de memória - dois objetos idênticos são referenciados na mesma memória do cache (flyweight - designPattern)
     * - consegue comparar dois objetos apenas usando o operador ex: | objectA == objectB | -> não precisa usar o equals!
     * - pode retornar qualquer classe que herda PhoneNumber
     * **/
    public static PhoneNumber of(int areaCode, int number) {
        if (areaCode < 1) throw new IllegalArgumentException("areaCode must be greater than 0");
        if (number < 1) throw new IllegalArgumentException("number must be greater than 0");

        return new PhoneNumber(areaCode, number);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj instanceof PhoneNumber other) {
            return this.areaCode == other.areaCode
                    && Objects.equals(this.number, other.number);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.areaCode, this.number);
    }

    @Override
    public void formatTo(Formatter formatter, int flags, int width, int precision) {
        formatter.format("(%d) %d", areaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber: { " +
                "areaCode: " + areaCode +
                ", number: " + number +
                " }";
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }
}

