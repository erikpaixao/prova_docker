package paixao.erik.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document
@NoArgsConstructor
public class Usuario {

    @Id
    private String id;

    private String nome;

    private String email;

    private String cep;

    private String banco;

    private String conta;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date modified;

    @CreatedBy
    private String createdUser;

    @LastModifiedBy
    private String lastModifiedUser;
}
