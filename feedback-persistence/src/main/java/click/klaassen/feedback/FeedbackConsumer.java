package click.klaassen.feedback;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import static click.klaassen.feedback.Feedback.*;

@Path("/feedback")
@ApplicationScoped
@Slf4j
public class FeedbackConsumer {

    @Inject
    EntityManager em;

    @Incoming("feedback-topic-in")
    @Transactional
    public void consume(Integer rating) {
        em.persist(builder().rating(rating).build());
    }

    @GET
    public String get() {
        return em.createNamedQuery("Feedback.findAll", Feedback.class)
                .getResultList().toString();
    }
}