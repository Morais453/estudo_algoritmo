package Interface;

public class CredencialBiometrica implements Autenticacao {
    private byte[] fotoRosto;

    public CredencialBiometrica(byte[] fotoRosto) {
        this.fotoRosto = fotoRosto;
    }

    @Override
    public String getIdentificacao() {
        return new String(fotoRosto);
    }

    @Override
    public String getSenha() {
        return null;
    }

    @Override
    public boolean isUsaSenha(String identificacao) {
        return false;
    }
}
