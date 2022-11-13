public class Main {
    public static void main(String[] args) {
        System.out.println("Suma tres parametros: ");
        int param1 =20; // first parameter 4bytes
        int param2 =40; // Second parameter 4bytes
        int param3 =50; // third parameter 4bytes
        var valor  = suma(param1, param2, param3);

        System.out.println(valor);
        System.out.println("********");



        Coche miCoche = new Coche();
        System.out.print("Puertas iniciales : ");
        System.out.println(miCoche.puertas);

        miCoche.sumaPuertas();
        System.out.print("Puertas finales : ");
        System.out.println(miCoche.puertas);
        System.out.println("********");


           }





    public static int suma(int a, int b, int c){
        return a + b + c;

    }


}