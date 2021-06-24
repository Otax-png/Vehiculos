package Vehiculo;

public class VehiculoCarga extends Vehiculo{

    public VehiculoCarga(String tipoVehiculo ,String tipoCombustible, int galonesGasolina, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        super(tipoVehiculo,tipoCombustible, galonesGasolina, cantidadPasajeros, velocidadMaxima, aceleracionBase);
    }

    @Override
    public void girarDerecha() {
        System.out.println("\nGirando cuidadosamente a la Derecha\n");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("\nGirando cuidadosamente a la izquierda\n");
    }
}
