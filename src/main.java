public class main {
public static void main(String[]agr){
    cuenta c1=new cuenta();
    
    c1.ingresarCantidad(45000);
    System.out.println( "la cantidad ingresada es:"+c1.getCantidad());
    c1.retiroCantidad(c1.getCantidad(),46000);

}
}
