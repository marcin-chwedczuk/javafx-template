package pl.marcinchwedczuk.template.domain;

public class Util {
    private Util() { }

    public static String quote(String s) {
        return String.format("'%s'", s);
    }
}
