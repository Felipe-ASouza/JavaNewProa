public class Exemplo_Class {




    public static void main(String[] args) {

        Buzao b1 = new Buzao(1, "Partida", "Gramado", 1, 40, 35);
        Buzao b2 = new Buzao(2, "Partida", "Porto de galinhas", 2, 35, 30);
        Buzao b3 = new Buzao(3, "Partida", "São roque", 0, 40, 38);
        System.out.println(b1.getParadas());
        System.out.println(b2.getParadas());
        System.out.println(b3.getParadas());


    }


}