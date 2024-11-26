public class TransporteDrone implements iTransporte{
    @Override
    public String fazerEnvio() {
        return "*** TRANSPORTE POR DRONE ***" +
                "\n" +
                "Informe o endereço (somente áreas metropolitanas e pequenos pacotes):";
    }
}
