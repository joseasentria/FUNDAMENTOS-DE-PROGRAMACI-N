public class Persona {
  private String nombre;
  private int edad;
  
  private Direccion dirección;
  
  public Persona(String nombre, int edad) {
    super();
    this.nombre = nombre;
    this.edad = edad;
  }
  public Direccion getDirección() {
    return dirección;
  }
  public void setDirección(Direccion dirección) {
    this.dirección = dirección;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public int getEdad() {
    return edad;
  }
  public void setEdad(int edad) {
    this.edad = edad;
  }
  
  
}

public class Empresa {
  private String cif;
  private Direccion dirección;
  
  public Direccion getDirección() {
    return dirección;
  }
  public void setDirección(Direccion dirección) {
    this.dirección = dirección;
  }
  public String getCif() {
    return cif;
  }
  public void setCif(String cif) {
    this.cif = cif;
  }
  
}

public class Direccion {
  private String calle;
  private int numero;
  
  public String getCalle() {
    return calle;
  }
  public void setCalle(String calle) {
    this.calle = calle;
  }
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public Direccion(String calle, int numero) {
    super();
    this.calle = calle;
    this.numero = numero;
  }
  
}


public class Principal {
  public static void main(String[] args) {
    
    Direccion d1= new Direccion("calle A",3);
    Direccion d2= new Direccion("calle B",7);
    Persona p= new Persona("pepe",20);
    p.setDirección(d1);
    Empresa e= new Empresa();
    e.setCif("1A");
    e.setDirección(d2);
    
    System.out.println(p.getDirección().getCalle());
    System.out.println(e.getDirección().getCalle());
  }
}