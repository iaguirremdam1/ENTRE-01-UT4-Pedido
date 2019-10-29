
/**
 *  Representa a un cliente que hace un pedido 
 */
public class Cliente
{
    private String nombre;
    private String direccion;
    private String ciudad;
    private String provincia;

    /**
     * Constructor  
     */
    public Cliente(String nombre, String direccion, String ciudad, String provincia)    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
    }

    /**
     * accesor para el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * accesor para la dirección del cliente
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * accesor para la ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * accesor para la provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * representación textual del cliente
     */
    public String toString() {
        String toStr = "";
          toStr += String.format("%10s","NOMBRE:");
          toStr += String.format("%-10s"," " + nombre);
          toStr += String.format("\n%10s","DIRECCIÓN:");
          toStr += String.format("%-10s"," " + direccion);
          toStr += String.format("\n%10s","CIUDAD:");
          toStr += String.format("%-10s"," " + ciudad);
          toStr += String.format("\n%10s","PROVINCIA:");
          toStr += String.format("%-10s"," " + provincia);
          return toStr;
    }

    /**
     * 
     */
    public void print() {
        System.out.println(this.toString());
    }

}
