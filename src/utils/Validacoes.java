package utils;

public class Validacoes {

    public Validacoes() {}

    public static boolean validarNome(String nome) {
        return (nome != null && !nome.trim().isEmpty() && !nome.matches(".*\\d+.*"));
    }

    public static boolean validarIdade(int idade) {
        return (idade >= 0 && idade <= 150);
    }

    public static boolean validarAltura(double altura){
        return (altura > 0 && altura < 3);
    }
}
