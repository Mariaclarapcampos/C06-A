 class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return this.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia) {
        vida -= quantia;
        zumbiAlvo.vida += quantia;
    }
}
    public class Main{
        public static void main(String[] args) {
            Zumbi z1 = new Zumbi();
            z1.nome = "Zumbi 1";
            z1.vida = 100;

            Zumbi z2 = new Zumbi();
            z2.nome = "Zumbi 2";
            z2.vida = 10;

            System.out.println("Antes da transferência:");
            System.out.println("Zumbi 1 tem: " + z1.mostraVida() + " vida");
            System.out.println("Zumbi 2 tem: " + z2.mostraVida() + " vida");

            z1.transfereVida(z2,40);
            System.out.println("Depois da transferência:");
            System.out.println("Zumbi 1 tem: " + z1.mostraVida() + " vida");
            System.out.println("Zumbi 2 tem: " + z2.mostraVida() + " vida");
        }
    }
