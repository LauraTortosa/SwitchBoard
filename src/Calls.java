public class Calls {
  /*  public static final int LLAMADA_LOCAL = 0;
    public static final int LLAMADA_PROV = 1;
    public static final int LOCAL_PRECIO = 15;
    public static final int PROV_1 = 20;
    public static final int PROV_2 = 25;
    public static final int PROV_3 = 30;
*/
    private int numero;
    private String origen, destino;
    private int segundos;
    private int franja;
    private int tipo_llamada;
    private int precio;
    private  int llamada_local = 0;
    private int llamada_prov = 1;
    private int local_precio = 15;
    private int prov_1 = 20;
    private int prov_2 = 25;
    private int prov_3 = 30;

    public Calls(String origen, String destino, int segundos, int franja, int tipo_llamada) {
        this. origen = origen;
        this.destino = destino;
        this.segundos = segundos;
        this.franja = franja;
        this.tipo_llamada = tipo_llamada;

        if (tipo_llamada == llamada_local) {
            precio = segundos * local_precio;
        } else {
            switch (franja) {
                case 1:
                    precio = segundos * prov_1;
                    break;
                case 2:
                    precio = segundos * prov_2;
                    break;
                case 3:
                    precio = segundos * prov_3;
                    break;
                default:
                    precio = segundos * local_precio;
                    break;
            }
        }
    }

   /* public String toString() {
    }*/





}
