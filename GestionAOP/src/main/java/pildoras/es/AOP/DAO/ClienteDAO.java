package pildoras.es.AOP.DAO;

import org.springframework.stereotype.Component;

import pildoras.es.AOP.Cliente;

@Component
public class ClienteDAO {
  public void insertaCliente(Cliente cliente) {
	  System.out.println("Trabajo realizado OK. Cliente insertado con éxito.");
	  
  }
  
  private String valoracionClienteNormal;
  private String codigoClienteNormal;
  
	public String getValoracionClienteNormal() {
		System.out.println("Obteniendo valoracion del cliente");
		return valoracionClienteNormal;
	}
	public void setValoracionClienteNormal(String valoracionClienteNormal) {
		System.out.println("Estableciendo Valoracion del cliente");
		this.valoracionClienteNormal = valoracionClienteNormal;
	}
	public String getCodigoClienteNormal() {
		System.out.println("Obteniendo codigo del cliente");
		return codigoClienteNormal;
	}
	public void setCodigoClienteNormal(String codigoClienteNormal) {
		System.out.println("Estableciendo codigo del cliente");
		this.codigoClienteNormal = codigoClienteNormal;
	}
  
  
  
}
