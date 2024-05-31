package bg.softuni.mobilelele.models.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRole extends BaseEntity {
    @Column
    @Enumerated(EnumType.STRING)
    private Role name;
}
