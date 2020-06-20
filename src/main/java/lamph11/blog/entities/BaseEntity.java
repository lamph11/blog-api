package lamph11.blog.entities;

import lombok.Data;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.time.Instant;

@MappedSuperclass
@Data
public class BaseEntity implements Serializable {

    protected Instant createdDate;
    protected Instant updatedDate;
    protected String createdBy;
    protected String updatedBy;
}
