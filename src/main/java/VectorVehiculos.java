import Vehiculo.*;

public class VectorVehiculos {

    public Vehiculo[] listaVehiculos;
    public int iterador;

    public VectorVehiculos(){
        listaVehiculos = new Vehiculo[20];
        llenarArreglo();
        imprimirListaVehiculos();
    }

    public void llenarArreglo(){
        int escogerCarro;

        for (int i = 0; i < listaVehiculos.length; i++) {
            escogerCarro = (int) Math.floor(Math.random() * (3 - 1 + 1) + (1));

            switch (escogerCarro){
                case 1:
                    listaVehiculos[i] = new VehiculoCarga("Vehiculo de Carga","Deisel",100,0,120, 20);
                    break;
                case 2:
                    listaVehiculos[i] = new Camioneta("Camioneta","Deisel",100,0,150, 30);
                    break;
                case 3:
                    listaVehiculos[i] = new VehiculoCarrera("Vehiculo de Carreras","Gasolina", 120, 0, 300, 60);
                    break;
            }
        }
    }

    public void imprimirListaVehiculos(){
        for (int i = 0; i < listaVehiculos.length; i++) {
            int contador = i+1;
            System.out.println(contador + ". " + listaVehiculos[i].toString());
        }
    }

}
