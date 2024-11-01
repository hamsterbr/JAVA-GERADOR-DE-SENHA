import java.security.SecureRandom;

public class SenhaLetrasMinusculas implements GeradorDeSenha {
    @Override
    public String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        String letras = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder senha = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            senha.append(letras.charAt(random.nextInt(letras.length())));
        }
        return senha.toString();
    }
}
