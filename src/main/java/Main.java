public class Main {

    public static void main(String[] args) {

        ReprodutorMusical.selecionarMusica("Fear of the dark - Iron Maiden");
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();

        AparelhoTelefonico.atender();
        AparelhoTelefonico.ligar("(85) 2702-6662");
        AparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet.adicionarNovaAba();
        NavegadorInternet.exibirPagina("www.google.com.br");
        NavegadorInternet.atualizarPagina();
    }
}