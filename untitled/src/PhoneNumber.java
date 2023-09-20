import exception.JavaEffectiveException;

public class PhoneNumber {

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

        if (areaCode < 50) {
            return new InternationalPhoneNumber(areaCode, number);
        }
        return new PhoneNumber(areaCode, number);
    }
}

class InternationalPhoneNumber extends PhoneNumber {

    public InternationalPhoneNumber(int areaCode, int number) {
        super(areaCode, number);
        of(areaCode, number);
    }
}
