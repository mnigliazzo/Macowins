import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Local {
  private List<Venta> ventas = new ArrayList<>();

  public void agregarVenta(Venta venta){
    ventas.add(venta);
  }
  public double ganancias(Date dia){
    return  ventas.stream().filter(venta -> venta.esVentaDelDia(dia)).mapToDouble(ventasdeEseDia -> ventasdeEseDia.total()).sum();
  }
}
