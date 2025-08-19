class Piloto {
    String nome;
    boolean vilao;

    void soltaSuperPoder(){
        if(this.vilao != false){
            System.out.println("Solta super poderes");
        }else{
            System.out.println("Não solta super poderes");
        }
    }
}
class Motor{
    String cilindradas;
    float velocidadeMaxima;
    void mostrainfo(){
        System.out.println("Cilindradas: " + this.cilindradas);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
    }
}
class Kart{
    String nome;
    Piloto piloto;
    Motor motor;

    void pular(){
        System.out.println("Você pulou!");
    }

    void soltaTurbo() {
        System.out.println("Você soltou turbo!");
    }

    void fazerDrift() {
        System.out.println("Você fez drift!");
    }
    public Kart(){
           motor = new Motor();
    }
}
public class Main{
    public static void main(String[] args) {
        Piloto p1 = new Piloto();
        p1.nome = "Mario";
        p1.vilao = false;

        Piloto p2 = new Piloto();
        p2.nome = "Wario";
        p2.vilao = true;

        Piloto p3 = new Piloto();
        p3.nome = "Luigi";
        p3.vilao = false;

        Kart k1 = new Kart();
        k1.nome = "Mario Kart";
        k1.piloto = p1;

        Kart k2 = new Kart();
        k2.nome = "Wario Kart";
        k2.piloto = p2;

        Kart k3 = new Kart();
        k3.nome = "Luigi Kart";
        k3.piloto = p3;

        Motor m1 = new Motor();
        m1.cilindradas = "50";
        m1.velocidadeMaxima = 150;
        System.out.println("Informações do motor do Mario:");
        m1.mostrainfo();

        Motor m2 = new Motor();
        m2.cilindradas = "150";
        m2.velocidadeMaxima = 100;
        System.out.println("Informações do motor do Wario:");
        m2.mostrainfo();

        Motor m3 = new Motor();
        m3.cilindradas = "100";
        m3.velocidadeMaxima = 50;
        System.out.println("Informações do motor do Luigi:");
        m3.mostrainfo();
    }
}