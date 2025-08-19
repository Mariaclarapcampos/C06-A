class Arma {
    String nome;
    int poder;
    int resistencia;
    String descricao;

    void mostraInfoArma() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Poder: " + this.poder);
        System.out.println("Resistencia: " + this.resistencia);
        System.out.println("Descrição: " + this.descricao);
    }
}
class Personagem{
    String nome;
    int pontos;
    int vida;
    Arma arma;

    void usarArma(){
        arma.resistencia = arma.resistencia - 2;
        System.out.println("Você perdeu -2 pontos de resitência");
    }

    void tomarDano(){
        vida = vida -5;
        System.out.println("Você perdeu -5 pontos de vida");
    }
}

public class Main{
    public static void main(String[] args) {
        Personagem p = new Personagem();
        p.nome = "Maria";
        p.pontos = 100;
        p.vida = 100;

        Arma a = new Arma();
        a.nome = "arma";
        a.poder = 10;
        a.resistencia = 50;
        a.descricao = "É uma arma";
        //fazendo a e p.arma guardarem referencia para on mesmo lugar
        p.arma = a;

        //chamando as funções
        a.mostraInfoArma(); // == p.arma.mostraInfoArma();
        p.usarArma();
        System.out.println("Sua resistência agora é de: " + a.resistencia );
        p.tomarDano();
        System.out.println("Sua vida agora é de: " + p.vida );
    }
}