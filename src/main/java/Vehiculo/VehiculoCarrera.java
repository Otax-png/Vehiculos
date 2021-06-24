package Vehiculo;

public class VehiculoCarrera extends Vehiculo{
    public VehiculoCarrera(String tipoVehiculo,String tipoCombustible1, int galonesGasolina, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(tipoVehiculo,tipoCombustible1, galonesGasolina, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public void girarDerecha() {
        System.out.println("\nGirando rapidamente a la Derecha\n");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("\nGirando rapidamente a la izquierda\n");
    }
}