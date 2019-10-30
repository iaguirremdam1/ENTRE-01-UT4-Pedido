
/**
 * Modela un pedido realizado por un cliente en una determinada fecha
 * El pedido incluye dos líneas de pedido que describen a cada uno de los dos
 * productos comprados en el pedido
 */
public class Pedido
{
    private final double IVA = 0.21;  // iva a aplicar
    private Fecha fecha;
    private Cliente cliente;
    private LineaPedido linea1;
    private LineaPedido linea2;

    /**
     * Constructor  
     */
    public Pedido(Fecha fecha, Cliente cliente,
    LineaPedido linea1, LineaPedido linea2)  {
        this.fecha = fecha;
        this.cliente = cliente;
        this.linea1 = linea1;
        this.linea2 = linea2;
    }

    /**
     * accesor para la fecha del pedido
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * accesor para el cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * calcular y devolver el importe total del pedido sin Iva
     */
    public double getImporteAntesIva() {
        return Producto.getPrecio();
    }

    /**
     * calcular y devolver el iva a aplicar
     */
    public double getIva() {
        return getImporteAntesIva() * IVA;
    }

    /**
     * calcular y devolver el importe total del pedido con Iva
     */
    public double getImporteTotal() {
        return getImporteAntesIva() + getIva();
    }

    /**
     * Representación textual del pedido
     * (ver enunciado)
     */
    public String toString() {
        String toStr = "";
        toStr += String.format("FECHA PEDIDO: ", getFecha()); 
        toStr += String.format("DATOS DEL CLIENTE");
        toStr += cliente.toString();
        
        toStr += String.format("**** Artículos en el pedido ****");
        
        toStr += LineaPedido.toString();
        
        toStr += String.format("**** A pagar ****");
        
        toStr += String.format("%20s", "IMPORTE SIN IVA: ",
                 "%8s", getImporteAntesIva());
        toStr += String.format("%20s", "IVA: ",
                 "%8s", getIva());
        toStr += String.format("%20s", "IMPORTE TOTAL: ",
                 "%8s", getImporteTotal());
        return toStr;
    }

    /**
     * devuelve true si el pedido actual es más antiguo que el recibido 
     * como parámetro
     */
    public boolean masAntiguoQue(Pedido otro) {
        return fecha.antesQue(otro.getFecha());
    }

    // /**
     // * devuelve una referencia al pedido actual
     // */
    // public  getPedidoActual() {
        
    // }

}
