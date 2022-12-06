package alumno.proyecto.reposotories.libreria;


import alumno.proyecto.entidades.UsuariosEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface databasedRepository extends CrudRepository<UsuariosEntity,Integer> {

    @Override
    Iterable<UsuariosEntity> findAll();




}

