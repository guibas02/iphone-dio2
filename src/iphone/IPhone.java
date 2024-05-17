package iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {


    public static void main(String[] args) {
        IPhone meuIPhone = new IPhone();

        meuIPhone.selecionarMusica("Preciso me Encontrar - Cartola");
        meuIPhone.tocar();
        meuIPhone.pausar();

        meuIPhone.ligar("34987654321");
        meuIPhone.inciarCorreiVoz();
        meuIPhone.atender();

        meuIPhone.exibirPagina("www.vasco.com");
        meuIPhone.atualiarPagina();
        meuIPhone.adicionarNovaAba();

    }

    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);

    }

    @Override
    public void atender() {
        System.out.println("atendendo...");

    }

    @Override
    public void inciarCorreiVoz() {
        System.out.println("iniciando conversa");

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("acessando: " +url);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba");

    }

    @Override
    public void atualiarPagina() {
        System.out.println("atualizaando pagina");

    }

    @Override
    public void tocar() {
        System.out.println("tocando");

    }

    @Override
    public void pausar() {
        System.out.println("pausando");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("reproduzindo: " + musica);

    }
}
