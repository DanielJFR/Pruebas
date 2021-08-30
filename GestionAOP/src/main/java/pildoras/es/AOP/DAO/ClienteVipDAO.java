package pildoras.es.AOP.DAO;

import org.springframework.stereotype.Component;

@Component
public class ClienteVipDAO {
  public void insertaCliente() { 
	  System.out.println("Trabajo realizado OK. Cliente VIP insertado con éxito.");
	  
  }
  
}
