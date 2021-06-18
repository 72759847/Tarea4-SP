
public class León extends Animal
{
    // Atributos
    int velocidad;
    // Constructor
    public León(String tamanioBoca, String numeroOjos, String numeroOidos){
        super(tamanioBoca, numeroOjos, numeroOidos);

    }
    // Metodos
    public String velocidadLeón(int velocidad){
        this.velocidad = velocidad;
        String c;
        c = "Se correr a " + velocidad + " Kilometros por hora para atrapar a mi presa";
        return c;
    }
}
