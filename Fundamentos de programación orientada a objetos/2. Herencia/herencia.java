import javax.*;
import javax.swing.JOptionPane;

public class Mamifero{    
    private int patas;
    private String nombre;
    
    public void imprimirPatas(){
      JOptionPane.showMessageDialog(null," Tiene " + patas + " patas\n", "Mamifero", JOptionPane.INFORMATION_MESSAGE);
    }

    public Mamifero(String nombre, int patas){
      this.nombre = nombre;
      this.patas = patas;
    }
}
  
public class Perro extends Mamifero {
    public Perro(String nombre){
      super(nombre, 4);
    }
}
  
public class Gato extends Mamifero {
    public Gato(String nombre){
      super(nombre, 4);
    }
}
  
public class CrearPerro {
    public static void main(String[] args) {
      Perro perrito = new Perro("Pantaleon");
      perrito.imprimirPatas();   /*Está en la clase mamífero*/
    }
}