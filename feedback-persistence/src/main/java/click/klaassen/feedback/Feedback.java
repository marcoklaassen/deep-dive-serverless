package click.klaassen.feedback;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "Feedback.findAll", query = "SELECT f FROM Feedback f")
public class Feedback {
    @Id
    @SequenceGenerator(name = "FeedbackSeq", sequenceName = "feedback_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "FeedbackSeq")
    private Long id;
    @Column private Integer rating;
}
