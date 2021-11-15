public class BicicletaElectrica {
    //tipo de bicicleta
    private String tipoBici;
    //bateria actual de la bicicleta
    private int actualBateria;
    //si esta en movimiento la bicicleta
    private boolean biciMovimiento;
    
    
     public BicicletaElectrica(String tipoDeLaBici, int cantidadActualBateria, boolean biciEnMovimiento) {
        tipoBici = tipoDeLaBici;
        actualBateria = cantidadActualBateria;
        biciMovimiento = biciEnMovimiento;
    }
    
    public String getTipoBici(){
        return tipoBici;
    }
    
    public int getActualBateria(){
        return actualBateria;
    }
    
    public boolean getBiciMovimiento(){
        return biciMovimiento;
    }
    
    public void setTipo(String tipo){
        tipoBici = tipo;
    }
    
    public void cargarBateria( int cargoBateria){ 
        actualBateria += cargoBateria;
    }
    
    public void montarBici(){
        biciMovimiento = !biciMovimiento;
    }
    
    public void imprimirDetallesBici(){
        String movimiento = "";
        if (biciMovimiento == true){
            movimiento = "si";
        }
        else {
            movimiento = "no";
        }
        System.out.println("El tipo de bici es de " + tipoBici + "la carga de la bateria es de " + actualBateria + " y la bici " + movimiento + " esta en  movimiento ");
    }
    
    public String estadoBici(){
        String movimiento = "";
        if (biciMovimiento == true){
            movimiento = "si";
        }
        else {
            movimiento = "no";
        }
        String devolver = "El tipo de bici es de " + tipoBici + "la carga de la bateria es de " + actualBateria + " y la bici " + movimiento +" esta en  movimiento ";
        return devolver;
        
    }
    
    
    
}