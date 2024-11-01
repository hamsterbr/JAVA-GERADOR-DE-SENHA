import java.security.SecureRandom;

public class SenhaNumeros implements GeradorDeSenha {
    @Override
    public String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            senha.append(random.nextInt(10)); // números de 0 a 9
        }
        return senha.toString();
    }
}
