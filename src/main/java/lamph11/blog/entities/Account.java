package lamph11.blog.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    private Long id;
    private String username;
    private String password;
    private Boolean enable;
    @ManyToMany(mappedBy = "accounts")
    private Set<Role> roles;
}
