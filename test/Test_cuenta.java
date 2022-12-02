
import ejercicioDeLaWeb.Cuenta;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */

/**
 * Creamos el primer test, esto lo indicamos con @Test y luego creamos un método, 
 * allí vamos a crear un objeto, una cuentade Fernanda con -500.
 */
public class Test_cuenta {
    
    public Test_cuenta() {
    }
    @Test
    public void testCreacionCuenta(){
        Cuenta c =new Cuenta ("fernanda",-500);
        
 /**
  * Iniciamos el método asserEquals() nos va a comparar doscampos,
  * el primero es lo que esperamos y el segundo lo que llega,
  * como el ejercicio decía que si la cantidad en la cuentaes negativa pasa a ser 0,
  * ponemos 0 y en el segundo camponos llega el objeto con el método cantidad.
  */
        assertEquals(0, c.getCantidad(), 0);
        
  /**
   * Hacemos la validacion con nuevos datos positivo para el objeto cuenta.
   */      
        Cuenta c1= new Cuenta ("matias", 500);
        assertEquals(500, c1.getCantidad(), 0);
    }
    
/**
 * Creamos otro test, en este creamos solo un objeto y le implementamos el método ingresar,
 * con el asserEquals()miramos si son iguales.
 */
    @Test
    public void testIngresar(){
        Cuenta c =new Cuenta ("fernanda",500);
        c.ingresar(1000);
        assertEquals(1500, c.getCantidad(), 0 );
    /**
     * Intentamos ingresando un valor negativo pero nos da error ya que no se resto
     * debido a que en el ejercicio dice que si se ingresa un valor negativo no se hará nada.
     */
        c.ingresar(-1000);
        assertEquals(1500, c.getCantidad(), 0 );
    }
    
/**
 * Creamos un test para probar ahora el método de retirar.
 */
    @Test
    public void testRetirar(){
        Cuenta c =new Cuenta ("fernanda",500);
        c.retirar(200);
        assertEquals(300, c.getCantidad(), 0 );
/**
 * Todo correcto ya que si la cuenta la creamos con 500 y retiramos 200 quedan 300.
 */

/**
 * Ahora como el ejercicio nos dice si a la cuenta se le retiraun valor mayor al que tiene,
 * quedara en 0, entonces lo probamos.
 */
        c.retirar(500);
        assertEquals(0, c.getCantidad(), 0 );

/**
 * Vamos a probar que pasa si al retirar ponemos el valor ennegativo para eso le ingresamos 1000 y le retiramos -500.
 */        
        c.ingresar(1000);
        c.retirar(-500);
        assertEquals(500, c.getCantidad(), 0 );
        
/**
 * Nos sale error y es algo que no se especifica en el ejercicio,así que el error esta en el código y no en el test,
 * en la información del error nos dice que esperábamos 500 perorecibimos 1500 así que aumento.
 */

/**
 * Miramos en la clase cuenta y podemos ver que el error esdebido a que cantidad –= (-cantidad) es como hacer una suma.
 * * utilizandola función Math.abs() resolvemos el problema
 * public void retirar(double cantidad)
        if (this.cantidad - Math.abs(cantidad) < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= Math.abs(cantidad); 


* Ahora ejecutamos el test y podemos ver que esta correcto,así debería ser siempre,
* un error en el test significa que elcódigo tiene un error que debemos solucionar.
      
 */

    }
    
}   
