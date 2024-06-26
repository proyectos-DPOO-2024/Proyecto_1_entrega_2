package galeria.modelo.inventario;

public class Video extends Pieza
{

	private float duracion;
	private Boolean color;
	private double memoria;

	public Video(String nombrePieza, String nombreArtista, String loginPropietario,
			float duracion, Boolean color, double memoria)
	{
		super(nombrePieza, nombreArtista, Pieza.VIDEO, loginPropietario);
		this.duracion = duracion;
		this.color = color;
		this.memoria = memoria;
	}
	
	//Este constructor copia otro video
	public Video(Video otroVideo) {
		super(otroVideo);
		duracion = otroVideo.duracion;
		color = otroVideo.color;
		memoria = otroVideo.memoria;
	}
	
	//Este constructor se debe usar únicamente en la carga y en las pruebas
	public Video(String nombrePieza, String nombreArtista, String loginPropietario, String fechaTerminoConsignacion,
			long precioVentaDirecta, long precioInicioSubasta, long precioMinimoSubasta, 
			long precioUltimaVenta, boolean bloqueada, boolean enSubasta, boolean enBodega, boolean enPosesion, 
			float duracion, Boolean color, double memoria)
	{
		super(nombrePieza, nombreArtista, Pieza.VIDEO, loginPropietario, fechaTerminoConsignacion, precioVentaDirecta,
				precioInicioSubasta, precioMinimoSubasta, precioUltimaVenta, bloqueada, enSubasta, enBodega, enPosesion);
		this.duracion = duracion;
		this.color = color;
		this.memoria = memoria;
	}
	

	public float getDuracion() {
		return duracion;
	}

	public Boolean isColor() {
		return color;
	}

	public double getMemoria() {
		return memoria;
	}

}
