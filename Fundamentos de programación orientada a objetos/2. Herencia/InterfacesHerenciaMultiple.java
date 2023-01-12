// Interfaz A
package com.fundamentos;

public interface A {
  public void metodoA() ;
}
// Interfaz B
package com.fundamentos;

public interface B {
  public void metodoB();
}
// Herencia Multiple
package com.fundamentos;
public class HerenciaMultiple extends X implements A, B {
  @Override
  public void metodoA() {
    
    System.out.println("Ejecutado metodo A");
  }
  @Override
  public void metodoB() {
    
    System.out.println("Ejecutado metodo B");
  }
}
