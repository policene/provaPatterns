public class TransporteContext {
    private iTransporte transporte;

    public TransporteContext(iTransporte iTransporte) {
        this.transporte = iTransporte;
    }

    public void setTransporte(iTransporte iTransporte) {
        this.transporte = iTransporte;
    }

    public String prosseguirEntrega(){
        return transporte.fazerEnvio();
    }
}
