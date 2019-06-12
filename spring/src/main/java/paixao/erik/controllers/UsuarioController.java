package paixao.erik.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import paixao.erik.entitys.Usuario;
import paixao.erik.services.UsuarioService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
@Api(value = "Usuario", description = "Endpoint de buscar usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    @ApiOperation(value = "Busca todos os usuários")
    public List<Usuario> findAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Busca o usuário pelo id")
    public ResponseEntity getById(@PathVariable String id) {
        try {
            return new ResponseEntity<>(usuarioService.getById(id), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PostMapping()
    @ApiOperation(value = "Salva o usuário com validacao dos campos")
    public ResponseEntity save(@Valid @RequestBody Usuario usuario) {
        try {
            return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PutMapping()
    @ApiOperation(value = "Atualiza o usuário com validacao dos campos")
    public ResponseEntity update(@Valid @RequestBody Usuario usuario) {
        try {
            return new ResponseEntity<>(usuarioService.save(usuario), HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Deleta o usuário passando o id")
    public ResponseEntity delete(@PathVariable String id) {
        try {
            usuarioService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }


}
