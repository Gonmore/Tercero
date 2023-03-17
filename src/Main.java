public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(18);
        System.out.println(persona1.getEdad());
        persona1.setNombre("Francis");
        System.out.println(persona1.getNombre());
        persona1.setNumero(79669696);
        System.out.println(persona1.getNumero());
    }
}
    class Persona{
        private int edad;
        private String nombre;
        private int numero;
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }
        public void setNumero(int numero){
            this.numero = numero;
        }
        public int getNumero(){
            return this.numero;
        }

    }
