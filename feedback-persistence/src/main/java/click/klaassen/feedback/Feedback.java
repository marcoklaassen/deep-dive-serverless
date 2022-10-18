package click.klaassen.feedback;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

@Builder
@Entity
@Cacheable
@NoArgsConstructor
@AllArgsConstructor
public class Feedback extends PanacheEntity {
    @Column public Integer rating;
}
