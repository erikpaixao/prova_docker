package paixao.erik.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import paixao.erik.services.UsuarioService;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;


}
