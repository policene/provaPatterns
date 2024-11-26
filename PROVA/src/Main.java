import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        TransporteContext context = new TransporteContext(new TransporteTerrestre());

        boolean isWorking = true;
        Scanner scanner = new Scanner(System.in);

        while (isWorking == true){
            System.out.println();
            System.out.println("*** - MENU DE ENTREGAS");
            System.out.println();
            System.out.println("" +
                    "1. Transporte Terrestre.\n" +
                    "2. Transporte Aéreo.\n" +
                    "3. Transporte Marítimo.\n" +
                    "4. Transporte por Drone.\n" +
                    "5. Confirmar Envio.\n" +
                    "0. Sair.\n");

            int opcao = scanner.nextInt();

            switch (opcao){
                case 0:
                    isWorking = false;
                    break;
                case 1:
                    context.setTransporte(new TransporteTerrestre());
                    break;
                case 2:
                    context.setTransporte(new TransporteAereo());
                    break;
                case 3:
                    context.setTransporte(new TransporteMaritimo());
                    break;
                case 4:
                    context.setTransporte(new TransporteDrone());
                    break;
                case 5:
                    System.out.println(context.prosseguirEntrega());
                    isWorking = false;
                    break;
            }
        }
    }
}