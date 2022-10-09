public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        int res;
        res = suma(4, 5, 6);
        System.out.println(res);

        //Ejercicio 2
        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println(miCoche.puerta);

    }

    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}
 class Coche {
    public int puerta = 2;
    public void addPuerta() {
        this.puerta++;
    }
 }