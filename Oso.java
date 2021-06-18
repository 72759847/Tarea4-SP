
public class Oso extends Animal
{
    // Atribotos
    String color;
    // Constructor
    public Oso(String tamanioBoca, String numeroOjos, String numeroOidos){
        super(tamanioBoca, numeroOjos, numeroOidos);
    }
    // Metodos
    public String colorOso (String color){
        this.color = color;
        String c; 
        c = "Mi color de pelo es " + color;
        return c;
    }
}
