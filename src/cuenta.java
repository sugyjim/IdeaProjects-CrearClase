public class cuenta {
    String titular;
    double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public void ingresarCantidad(double cantidad){
        setCantidad(cantidad);
      //  System.out.println(cantidad);
    }
    public void retiroCantidad(double cantidad,double retiro){
        if((cantidad-retiro)<0) {
            cantidad = 0;
            System.out.println("su saldo es:"+" "+cantidad);
        }else {
                cantidad=cantidad-retiro;
            System.out.println("el valor del retiro es:"+ ""+retiro);

            System.out.println("el saldo es " + "" + cantidad);
        }
    }
    public void sort(){
        int temp;
        int num[]={1,4,5,6,9};
        for (int i=0;i<num.length-1;i++){
            for (int j=0;j<num.length-1;j++)
            if(num[j]<num[j+1]){
                temp=num[j+1];
            }

        }    }
}
