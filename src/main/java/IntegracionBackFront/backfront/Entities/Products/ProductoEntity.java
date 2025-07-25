package IntegracionBackFront.backfront.Entities.Products;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter @Setter
@ToString @EqualsAndHashCode
@Table(name = "PRODUCTOS")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_producto_id")
    @SequenceGenerator(sequenceName = "seq_producto_id", name = "seq_producto_id", allocationSize = 1)
    @Column(name = "PRODUCTO_ID")
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PRECIO")
    private double precio;
    @Column(name = "STOCK")
    private int stock;
    @Column(name = "FECHA_LANZAMIENTO")
    private LocalDate fechaLanzamiento;
    @Column(name = "CATEGORIA_ID")
    private Long categoriaId;
    @Column(name = "USUARIO_REGISTRO")
    private int usuarioId; //Usuario que lo registro
    @Column(name = "USUARIO_ULTIMA_MODIFICACION")
    private int usuarioId_ultimaModificacion; // Usuario que modifico el producto por ultima vez
    @Column(name = "FECHA_ULTIMA_MODIFICACION")
    private LocalDate fechaModificacion; //Fecha de la ultima modificacion
    @Column(name = "ESPECIFICACIONES")
    private String especificaciones;
    @Column(name = "ESTADO")
    private String estado;
}
