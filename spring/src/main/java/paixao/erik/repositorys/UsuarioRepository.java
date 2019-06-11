package paixao.erik.repositorys;

import org.springframework.data.mongodb.repository.MongoRepository;
import paixao.erik.entitys.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
