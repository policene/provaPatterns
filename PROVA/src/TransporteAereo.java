public class TransporteAereo implements iTransporte{
    @Override
    public String fazerEnvio() {
        return "*** TRANSPORTE AÉREO ***" +
                "\n" +
                "Informe o peso e dimensões da encomenda:";
    }
}
