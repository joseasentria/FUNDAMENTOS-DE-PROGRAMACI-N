public class Factura {
  private int numero;
  private String concepto;
  private double importe;
  
  
  public int getNumero() {
    return numero;
  }
  public void setNumero(int numero) {
    this.numero = numero;
  }
  public String getConcepto() {
    return concepto;
  }
  public void setConcepto(String concepto) {
    this.concepto = concepto;
  }
  public double getImporte() {
    return importe;
  }
  public void setImporte(double importe) {
    this.importe = importe;
  }
  public Factura(int numero, String concepto, double importe) {
    super();
    this.numero = numero;
    this.concepto = concepto;
    this.importe = importe;
  }
  
  
}

public class ServicioValidacion {
  public boolean validarFactura(Factura f) {
    
    if (f.getImporte()<100) {
      System.out.println("factura valida");
      return true;
    }else {
      return false;
    }
  }
}

public class ServicioPago {
  public ServicioValidacion servicioValidacion;
  
  
  public ServicioPago(ServicioValidacion servicioValidacion) {
    super();
    this.servicioValidacion = servicioValidacion;
  }
  public void pagarFactura(Factura f, String cuenta) {
    
    if (servicioValidacion.validarFactura(f)) {
      
      System.out.println("pago en cuenta:"+ cuenta);
      System.out.println("importe a pagar"+ f.getImporte());
    }
    
  
  }
}


public class ServicioCorreo {
  
  public void enviarMensaje(String email,String mensaje) {
    
    System.out.println("enviando correo a :"+ email);
    System.out.println("el mensaje es:"+ mensaje);
  }
}

public class ServicioFacturacion {
  
  private ServicioValidacion servicioValidacion;
  private ServicioCorreo servicioCorreo;
  private ServicioPago servicioPago;
  
  public ServicioFacturacion(ServicioValidacion servicioValidacion, ServicioCorreo servicioCorreo,
      ServicioPago servicioPago) {
    super();
    this.servicioValidacion = servicioValidacion;
    this.servicioCorreo = servicioCorreo;
    this.servicioPago = servicioPago;
  }
  
  
  public void procesarFactura(Factura f , String email) {
    
    servicioValidacion.validarFactura(f);
    servicioPago.pagarFactura(f, "111-111-111");
    servicioCorreo.enviarMensaje(email, "su factura con numero:"+ f.getNumero()+ "ha sido pagada");
  }
  
  
}