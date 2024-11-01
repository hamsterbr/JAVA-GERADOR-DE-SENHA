import java.security.SecureRandom;

public class SenhaLetrasMaiusculasMinusculasNumeros implements GeradorDeSenha {
    @Override
    public String gerarSenha(int tamanho) {
        SecureRandom random = new SecureRandom();
        String letrasMaiusculasMinusculasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder senha = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            senha.append(letrasMaiusculasMinusculasNumeros.charAt(random.nextInt(letrasMaiusculasMinusculasNumeros.length())));
        }
        return senha.toString();
    }
}
