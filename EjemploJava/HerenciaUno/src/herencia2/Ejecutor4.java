/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia2;
import herencia1.EstudiantePresencial;
import herencia1.EstudianteDistancia;
/**
 *
 * @author Usuario
 */
public class Ejecutor4 {
    public static void main(String[] args) {
    
    EstudiantePresencial e1 = new EstudiantePresencial();
        
        e1.establecerNombresEstudiante("René Rolando");
        e1.establecerApellidoEstudiante("Elizalde Solano");
        e1.establecerIdentificacionEstudiante("1104111111");
        e1.establecerEdadEstudiante(38);
        e1.establecerNumeroCreditos(30);
        e1.establecerCostoCredito(15);
        e1.calcularMatriculaPresencial();
        
        System.out.printf("%s\n ", e1);    
    }
}

