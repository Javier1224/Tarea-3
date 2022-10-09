public class Main {
    public static void main(String[] args) {
        persona carlos = new persona();
        carlos.setEdad(20);
        carlos.setNombre("Carlos");
        carlos.setNumero(4544844);
        System.out.println("El la edad es: "+carlos.getEdad());
        System.out.println("El nombre es: "+carlos.getNombre());
        System.out.println("El nuemro es: "+carlos.getNumero());
    }

}
class persona {
    private int edad;
    private String nombre;
    private int numero;
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumero() {
        return numero;
    }
}