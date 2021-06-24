package Vehiculo;

public abstract class Vehiculo implements AccionVehiculo {
    protected String tipoVehiculo;
    protected String combustible;
    protected int galonesGasolina;
    protected int cantidadPasajeros;
    protected int velocidadMaxima;
    protected double aceleracionBase;

    public Vehiculo(String tipoVehiculo, String combustible, int galonesGasolina, int cantidadPasajeros, int velocidadMaxima, double aceleracionBase) {
        this.tipoVehiculo = tipoVehiculo;
        this.combustible = combustible;
        this.galonesGasolina = galonesGasolina;
        this.cantidadPasajeros = cantidadPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
    }



    @Override
    public String toString() {
        return
                "Tipo de Vehiculo " + tipoVehiculo +
                "Combustible: ->" + combustible +
                ", Galones de Gasolina:" + galonesGasolina +
                ", Velocidad Maxima=" + velocidadMaxima +
                ", Aceleracion Base=" + aceleracionBase + "\n";
    }
}
