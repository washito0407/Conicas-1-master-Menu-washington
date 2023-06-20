package conicas2;

public class circunferencia_grupo2 {

    private float radio_cir; //El radio del circulo
    private float angulo_central; //Angulo central de la circunferencia
    private double pi= 3.1416; //Variable para guardar el valor de PI


    //Constructor

    public circunferencia_grupo2(float radio_cir, float angulo_central) {
        this.radio_cir = radio_cir;
        this.angulo_central = angulo_central;
    }



    //Getters y setters

    private float getAngulo_central() {
        return angulo_central;
    }

    public void setAngulo_central(float angulo_central) {
        this.angulo_central = angulo_central;
    }

    private float getRadio_cir() {
        return radio_cir;
    }

    private void setRadio_cir(float radio_cir) {
        this.radio_cir = radio_cir;
    }


    //Metodo para calcular el perimetro/circunferencia teniendo el radio declarado, sea en constructor, getter o setter
    public double perimetro_cir(){
        double aux = pi*2;
        return aux*getRadio_cir();
    }

    //Metodo para calcular el area de circunferencia teniendo declarado el radio
    public double area_cir(){
        double aux = getRadio_cir()*getRadio_cir();
        return pi*aux;
    }

    //Metodo para calcular angulo inscrito teniendo el angulo central declarado
    public double angulo_inscrito_cir(){
        return (getAngulo_central()/2);
    }

    public void imprimir_Datos(){
        System.out.println("\nEl perimetro de la circunferencia es " + perimetro_cir());
        System.out.println("El area de la circunferencia es " + area_cir());
        System.out.println("El angulo inscrito es " + angulo_inscrito_cir());
    }

}
