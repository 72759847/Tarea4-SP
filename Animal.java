
public class Animal
{ 
    // Atributos
    String tamanioBoca;
    String numeroOjos;
    String numeroOidos;
    public Animal(String tamanioBoca, String numeroOjos, String numeroOidos){
        this.tamanioBoca = tamanioBoca;
        this.numeroOjos =  numeroOjos;
        this.numeroOidos = numeroOidos;
    }

    public String comer(){
        String c;
        c = "Se comer con mi boca " +tamanioBoca;
        return c;
    }

    public String mirar(){
        String m;
        m = "Miro com mis " + numeroOjos + " ojos el paisaje"; 
        return m;
    }

    public String escuchar(){
        String e;
        e = "Escucho com mis " + numeroOidos + " orejas el sonido del viento";
        return e;
    }

}
