import java.security.SecureRandom;

public class SenhaCompleta implements GeradorDeSenha {
    @Override
    public String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789$&#!@_";
        StringBuilder senha = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            senha.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return senha.toString();
    }
}
