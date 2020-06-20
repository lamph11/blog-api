package lamph11.blog.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@Entity
@Table(name = "category")
public class Category extends BaseEntity{

    @Id
    private String id;
    private String name;
    private Integer status;
    @ManyToOne
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private Category parent;
}
