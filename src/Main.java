public class Main {
    public static void main(String[] args) {
        var resultado = suma(20,30,40);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.maspuertas();
        
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche{
    public int puertas = 4;

    public void maspuertas(){
        this.puertas++;
    }
}