package pildoras.es.AOP.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoginConAspecto {
	//@Pointcut("execution(public * inserta*(..))")
	
	//poincuts para todos los metodos publicos de un determinado paquete
	@Pointcut("execution(public * pildoras.es.AOP.DAO.*.*(..))")
	private void paraClientes()
	{};
	
	//pointcut para getters
	@Pointcut("execution(public * pildoras.es.AOP.DAO.*.get*(..))")
	private void paraGetters()
	{};
	
	//pointcut para setters
	@Pointcut("execution(public * pildoras.es.AOP.DAO.*.set*(..))")
	private void paraSetters()
	{};
	
	@Pointcut("paraClientes()&& !(paraGetters()||paraSetters())")
	private void paqueteExceptoGettersSetters() {};
	
	
   @Before("paqueteExceptoGettersSetters()")	
   public void antesInsertarCliente() {
	  System.out.println("El usuario esta logueado"); 
	  System.out.println("El perfil para insertar clientes es correcto");
   }
   
   @Before("paqueteExceptoGettersSetters()")
   public void requisitosCliente() {
	   System.out.println("El cliente cumple los requisitos para ser agregado a la BBDD");	   
   }
   
   @Before("paqueteExceptoGettersSetters()")
   public void requisitosTabla() {
	   System.out.println("Hay menos de 3000 registros en la tabla puedes insertar el nuevo cliente");
	   
   }
}
