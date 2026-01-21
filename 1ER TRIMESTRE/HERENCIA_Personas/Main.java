public class Main {
    public static void main(String[] args) {
        Trabajador t1 = new Trabajador( "Diego", "20957147F", "Mi casa", null, null); 
        Cliente c1 = new Cliente( "Efren", "12345678P", "Su casa", null, null); 
        Persona p1 = new Persona( "Teresa", "87654321A", "El bus"); 
        Persona p2 = new Trabajador( "Juan", "45362718L", "Su pueblo", null, null); 
        Persona p3 = new Cliente( "Josep", "18273645J", "Castrelón", null, null); 

        Persona [] vector = new Persona[5];
        vector[0] = p1; //Persona persona
        vector[1] = p2; //Persona trabajador
        vector[2] = p3; //Persona cliente
        vector[3] = t1; //Trabajador
        vector[4] = c1; //Cliente

        for (int i = 0; i < vector.length; i++){
            System.out.println(vector[i].toString());
            
        }
    }
}
