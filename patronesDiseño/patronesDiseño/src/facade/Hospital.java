package facade;

class Hospital {

    private Doctores doctores;
    private Pago pago;
    private Envio envio;

    public Hospital() {
        this.doctores = new Doctores();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void sistemaHospital() {
        doctores.buscarDoctor();
        doctores.reservarDoctor();
        pago.cobrar();
        envio.enviar();
    }

}