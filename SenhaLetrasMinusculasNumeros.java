import java.security.SecureRandom;

public class SenhaLetrasMinusculasNumeros implements GeradorDeSenha {
    @Override
    public String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        String letrasNumeros = "abcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder senha = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            senha.append(letrasNumeros.charAt(random.nextInt(letrasNumeros.length())));
        }
        return senha.toString();
    }
}
