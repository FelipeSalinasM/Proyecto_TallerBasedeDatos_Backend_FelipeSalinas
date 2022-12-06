package alumno.proyecto.servicies;

import alumno.proyecto.entidades.UsuariosEntity;
import alumno.proyecto.reposotories.libreria.databasedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class usuariosServicies {
    @Autowired
    databasedRepository DatabasedRepository;

    public UsuariosEntity guardar(UsuariosEntity nuevo_usuario){
        return DatabasedRepository.save(nuevo_usuario);
    }

    public Iterable<UsuariosEntity> getAll(){
        Iterable<UsuariosEntity> all= DatabasedRepository.findAll();
        List<UsuariosEntity> salida = new LinkedList<>();
        for(UsuariosEntity registro: all){
            salida.add(registro);

        }
        return salida;
    }
}
