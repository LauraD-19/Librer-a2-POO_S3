import java.util.List;
import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int cantidadD;
    private boolean disponibilidad;
    private int codigo;

    public Libro() {
    }

    public Libro(String titulo, String autor, int cantidadD) {
        contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadD = cantidadD;
        this.disponibilidad = disponibilidad;
        this.codigo = contador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadD() {
        return cantidadD;
    }

    public void setCantidadD(int cantidadD) {
        this.cantidadD = cantidadD;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantidadD=" + cantidadD +
                ", disponibilidad=" + disponibilidad +
                ", codigo=" + codigo +
                '}';
    }

    public String mostrarInfo(){
        return "--Titulo: "+titulo+" --Autor: "+autor+" --Cantidad de ejemplares: "+cantidadD+" --Disponibilidad: "+estado()+ " --Código: "+ codigo;
    }
    private static int contador=0;//contador para el codigo de libros

    public boolean estado(){
        return cantidadD>0;
    }
    public void prestarLibro(){

        if(cantidadD>0){
            cantidadD--;
            System.out.println("Libro prestado ≧◉◡◉≦");
        }else {
            System.out.println("No hay copias disponibles \uD83D\uDC4B≧◉ᴥ◉≦");
        }
    }


}

