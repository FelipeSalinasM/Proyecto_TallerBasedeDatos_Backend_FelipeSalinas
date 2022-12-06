package alumno.proyecto.controllers.usuarios;

import alumno.proyecto.entidades.UsuariosEntity;
import alumno.proyecto.reposotories.libreria.databasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class controllers {
    @Autowired
    databasedRepository DatabasedRepository;
    @Autowired
    private alumno.proyecto.servicies.usuariosServicies usuariosServicies;
    private UsuariosEntity usuario_nuevo;

    @GetMapping("/usuarios/getall/{num}")
    public Iterable<UsuariosEntity> getAll(@PathVariable(value = "num")Integer numero){
        return usuariosServicies.getAll();
    }

    @PostMapping("usuarios/create")
    public UsuariosEntity crear(@RequestBody UsuariosEntity usuario_nuevo) {

        UsuariosEntity obj = usuariosServicies.guardar(usuario_nuevo);
        return obj;
    }
}
