public class CuentaBancaria {

    private Usuario usuario;
    private double saldo;

    public CuentaBancaria(Usuario usuario, double saldoInicial) {
        this.usuario = usuario;
        this.saldo = saldoInicial;
    }

    public void verInformacionCuenta() {
        System.out.println("=== INFORMACIÓN DE LA CUENTA ===");
        usuario.mostrarDatos();
        System.out.println("Saldo actual: " + saldo + "€");
    }

    public void ingresarDinero(double cantidad) {
        saldo += cantidad;
        System.out.println("Ingreso realizado. Nuevo saldo: " + saldo + "€");
    }

    public void retirarDinero(double cantidad) {

        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retirada realizada. Nuevo saldo: " + saldo + "€");
        }

    }
}