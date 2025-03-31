package Interface;

public class Main {
    public static void main(String[] args) {
        Autenticador autenticador = new Autenticador();

        Autenticacao email = new CredencialEmail("email@email.com", "123456");
        boolean isAutenticado = autenticador.autenticar(email);

        Autenticacao usuario = new CredencialLogin("userName", "password");
        boolean isAutenticadoUsuario = autenticador.autenticar(usuario);

        Autenticacao biometria = new CredencialBiometrica(new byte[1]);
        boolean isBiometriaAutenticado = autenticador.autenticar(biometria);
    }
}
