package rvt;

public class atributu_masinas2 {

    int attalums = 250;
    String krasa = "zila";
    String modelis = "BMW";
    int degviela = 10;
    int degvielas_patere = 5;

    public void brauc(int attalums) {
        degviela = degviela - (attalums * degvielas_patere / 55);
        System.out.println("Mašīna nobrauca " + attalums + " km un patērēja degvielu. Palika: " + degviela + " litri.");
    }

    public void piepildas() {
        degviela = degviela + 55;
        System.out.println("Mašīna piepildīja " + degviela + " litrus degvielas.");
    }

    public void parada_info() {
        System.out.println("Mašīna nobrauca " + attalums + " km. Krāsa: " + krasa + ". Modelis: " + modelis + ".");
    }

    public static void main(String[] args) {
        atributu_masinas2 Opel = new atributu_masinas2();
        atributu_masinas2 BMW = new atributu_masinas2();
        atributu_masinas2 Audi = new atributu_masinas2();

        Opel.brauc(250);
        Audi.piepildas();
        BMW.parada_info();
    }
}


