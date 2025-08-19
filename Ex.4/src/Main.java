class Zumbi {
    double vida;
    String nome;

    double mostraVida() {
        return this.vida;
    }

    boolean transfereVida(Zumbi zumbiAlvo, double quantia) {
        if(vida > 0){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        } else {
            return false;
        }
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
        
        boolean confere = z1.transfereVida(z2 , 20);
        if(confere == true){
            System.out.println("Transferência feita com sucesso!");
        }else{
            System.out.println("Não é possível realizar a transferência!");
        }
    }
}