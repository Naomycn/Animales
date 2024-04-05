package Animales;

public class OperacionMarina {
    public static void realizarAccion(AnimalAcuatico animal) {
        try {
            animal.nadar();
        } catch (NullPointerException e) {
            System.out.println("No se puede realizar la accion: El animal no esta disponible.");
        }
    }

    public static void main(String[] args) {
        AnimalAcuatico delfin = new AnimalAcuatico("Delfin");
        AnimalAcuatico nullAnimal = null;

        OperacionMarina.realizarAccion(delfin); // Realizará la acción de nadar con el delfín
        OperacionMarina.realizarAccion(nullAnimal); // Imprimirá un mensaje sin error
    }
    
}