public class TransporteTerrestre implements iTransporte{
    @Override
    public String fazerEnvio() {
        return "*** ENVIO TERRESTE ***" +
                "\n" +
                "Informe o nome da transportadora:";
    }
}
