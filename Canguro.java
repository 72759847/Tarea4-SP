
public class Canguro extends Animal
{
    // Atributos
    String nroPatas;
    // Constructor
    public Canguro(String tamanioBoca, String numeroOjos, String numeroOidos){
        super(tamanioBoca, numeroOjos, numeroOidos);
    }
    // metodo
    public String canguroSaltar( String nroPatas){
        this.nroPatas = nroPatas;
        String salt;
        salt = " Se saltar com mis " + nroPatas + " patas para ir mas rapido";
        return salt;
    }
}
