package paixao.erik.entitys;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Document(collection = "users")
@NoArgsConstructor
public class Usuario {

    @Id
    private String id;

    @NotNull
    private String nome;

    @NotNull
    @Indexed(unique = true)
    @Email
    private String email;

    private String cep;

    private String banco;

    private String conta;

    @CreatedDate
    private Date created;

    @LastModifiedDate
    private Date modified;

}
