package alumno.proyecto.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Table(name="usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UsuariosEntity {
    @Id
    private String primer_nom;
    private String seg_nom;
    private String pri_apellido;
    private String seg_apellido;
    private Integer rut;
    private String contrasena;
    private Boolean estado;
    private Integer telefono;
    private String calle;
    private Integer numero;
    private String comuna;
    private String mail;
    private String id;

}
