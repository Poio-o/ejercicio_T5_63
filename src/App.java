public class App {
    public static void main(String[] args) throws Exception {
        int altura1 = Integer.parseInt(System.console().readLine("Introduzca la altura de la primera pirámide: "));
        int altura2 = Integer.parseInt(System.console().readLine("Introduzca la altura de la segunda pirámide: "));

        int alturamayor = (altura1 > altura2) ? altura1 : altura2;

        for (int i = 1; i <= alturamayor; i++) {
            int filaPrimera = altura1 - (alturamayor - i);

            if (filaPrimera > 0) {
                for (int j = 0; j < altura1 - filaPrimera; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < filaPrimera * 2 - 1; j++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            } else {
                for (int j = 0; j < altura1; j++) {
                    System.out.print(" ");
                }
            }

            int filaSegunda = altura2 - (alturamayor - i);

            if (filaSegunda > 0) {
                for (int j = 0; j < altura2 - filaSegunda; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < filaSegunda * 2 - 1; j++) {
                        System.out.print("*");

                }
            }

            System.out.println("");

            //ARREGLAR
        }

    }
}