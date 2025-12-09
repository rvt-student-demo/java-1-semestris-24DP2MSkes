package rvt;

public class atributu_masinas {
    
    int atrums = 200;
    String krasa = "melna"; 
    String modelis = "Mercedes";
    
    public void masinaIesledz(){
        System.out.println("Mašīnu var ieslēgt. Tās modelis: " + modelis + ", krāsa: " + krasa + ", ātrums: " + atrums + " km/h");
    }
     
    public void masinaBrauc(){
        System.out.println("Mašīna brauc pa ceļu.");
    }
    
    public static void main(String[] args) {
        atributu_masinas Mersedes = new atributu_masinas(); 
        atributu_masinas BMW = new atributu_masinas(); 
      
        Mersedes.masinaIesledz();
        BMW.masinaBrauc();
    }
}
