public class Main {
    public static void main(String[] args) {
        Cantina cantina = new Cantina();
        cantina.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        s1.nome = "Coxinha";

        Salgado s2 = new Salgado();
        s2.nome = "Pastel";

        Salgado s3 = new Salgado();
        s3.nome = "Esfirra";

        //adicionando os salgados na cantina
        cantina.addSalgado(s1);
        cantina.addSalgado(s2);
        cantina.addSalgado(s3);

        cantina.mostraInfo();
    }
}
