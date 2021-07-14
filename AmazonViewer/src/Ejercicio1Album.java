import java.util.ArrayList;

public class Ejercicio1Album {
	private class Song{
		private String nombre;
		private String artista;
	}
	private ArrayList<Song> canciones;
	private String nombreAlbum;
	
	public void Album(ArrayList<Song> canciones, String Album) 
	{
		this.canciones = canciones;
		this.nombreAlbum = Album;
	}

}
