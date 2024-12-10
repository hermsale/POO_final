package sistemaGaraje;


import modelo.Garaje;

public class GarajeTest {
    public static Garaje cargaDatos() {
        // Crear un garaje
        
        Garaje garaje = new Garaje(100,5,null);

        // Crear vehículos
        garaje.ingresoAuto("AA076UL","Ford" , 136000, 5, 4);
        garaje.ingresoMoto("QRU802", "Honda", 62350, 600, 2);

        return garaje;
    }
}
