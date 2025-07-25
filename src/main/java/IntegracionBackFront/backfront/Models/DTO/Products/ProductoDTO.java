package IntegracionBackFront.backfront.Models.DTO.Products;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ProductoDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private LocalDate fechaLanzamiento;
    private Long categoriaId;
    private int usuarioId; //Usuario que lo registro
    private int usuarioId_ultimaModificacion; // Usuario que modifico el producto por ultima vez
    private LocalDate fechaModificacion; //Fecha de la ultima modificacion
    private String especificaciones;
    private String estado;
}
