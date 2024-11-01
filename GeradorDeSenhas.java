import java.util.Scanner;

public class GeradorDeSenhas {
    private GeradorDeSenha geradorDeSenha;

    public void escolherTipoSenha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de senha:");
        System.out.println("1. Apenas Números");
        System.out.println("2. Apenas Letras Minúsculas");
        System.out.println("3. Letras Minúsculas e Números");
        System.out.println("4. Letras Maiúsculas, Minúsculas e Números");
        System.out.println("5. Letras Maiúsculas, Minúsculas, Números e Símbolos");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                geradorDeSenha = new SenhaNumeros();
                break;
            case 2:
                geradorDeSenha = new SenhaLetrasMinusculas();
                break;
            case 3:
                geradorDeSenha = new SenhaLetrasMinusculasNumeros();
                break;
            case 4:
                geradorDeSenha = new SenhaLetrasMaiusculasMinusculasNumeros();
                break;
            case 5:
                geradorDeSenha = new SenhaCompleta();
                break;
            default:
                System.out.println("Escolha inválida.");
                break;
        }
    }

    public void gerar() {
        if (geradorDeSenha != null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Informe o tamanho da senha: ");
            int tamanho = scanner.nextInt();
            String senha = geradorDeSenha.gerarSenha(tamanho);
            System.out.println("Senha gerada: " + senha);
        } else {
            System.out.println("Nenhum tipo de senha selecionado.");
        }
    }

    public static void main(String[] args) {
        GeradorDeSenhas gerador = new GeradorDeSenhas();
        gerador.escolherTipoSenha();
        gerador.gerar();
    }
}
