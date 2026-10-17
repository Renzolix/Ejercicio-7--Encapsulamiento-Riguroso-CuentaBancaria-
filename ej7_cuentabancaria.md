# Ejercicio 7: CuentaBancaria

## Explicación Lógica
1. **Encapsulamiento Riguroso:** Los atributos `titular` y `saldo` están definidos como `private` para impedir modificaciones no controladas desde el exterior.
2. **Depósito Seguro:** El método `depositar()` valida que el monto a ingresar sea estrictamente mayor a `0`.
3. **Extracción con Control:** El método `retirar()` evalúa mediante `if (monto <= saldo)` si la cuenta posee fondos suficientes antes de realizar el descuento; caso contrario, notifica la insuficiencia.