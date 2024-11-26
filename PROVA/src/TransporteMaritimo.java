public class TransporteMaritimo implements iTransporte{
    @Override
    public String fazerEnvio() {
        return "*** TRANSPORTE MARÍTIMO ***" +
                "\n" +
                "Informe o endereço (somente entregas internacionais):";
    }
}
