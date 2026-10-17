public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso: $" + monto + ". Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("El monto a depositar debe ser estrictamente positivo.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
        } else if (monto <= this.saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso: $" + monto + ". Saldo restante: $" + this.saldo);
        } else {
            System.out.println("Fondos insuficientes. Saldo disponible: $" + this.saldo);
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Renzo Gonzalez", 1000.0);

        cuenta.depositar(500.0);
        cuenta.retirar(2000.0); // Intento fallido
        cuenta.retirar(800.0);  // Extracción válida
    }
}