package pildoras.es.AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pildoras.es.AOP.DAO.ClienteDAO;
import pildoras.es.AOP.DAO.ClienteVipDAO;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		//Leer la configuración de Sring
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Configuracion.class);
		//Obtener el bean del contenedor de Spring
		ClienteDAO elCliente=context.getBean("clienteDAO",ClienteDAO.class);
		ClienteVipDAO elClienteVip=context.getBean("clienteVipDAO",ClienteVipDAO.class);
		//Llamar al metodo
		elCliente.insertaCliente(new Cliente());
		elClienteVip.insertaCliente();
		
		elCliente.getCodigoClienteNormal();
		elCliente.getValoracionClienteNormal();
		elCliente.setCodigoClienteNormal("");
		elCliente.setValoracionClienteNormal("");
		//Cerrar el contexto
		context.close();
	}

}
