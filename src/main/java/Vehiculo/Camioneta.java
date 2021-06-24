package Vehiculo;

public class Camioneta extends Vehiculo {

    public Camioneta(String tipoVehiculo, String tipoCombustible, int galonesGasolina, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(tipoVehiculo, tipoCombustible, galonesGasolina, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public void girarDerecha() {
        System.out.println("\nGirando lento a la Derecha\n");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("\nGirando lento a la Izquierda\n");
    }
}
