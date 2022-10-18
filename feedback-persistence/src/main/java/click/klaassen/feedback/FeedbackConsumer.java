package click.klaassen.feedback;

import io.quarkus.hibernate.reactive.panache.Panache;
import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.smallrye.mutiny.Uni;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.control.ActivateRequestContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/feedback")
@ApplicationScoped
@Slf4j
public class FeedbackConsumer {

    @Incoming("feedback-topic-in")
    @ReactiveTransactional
    @ActivateRequestContext
    public Uni<Feedback> consume(Integer rating) {
        var feedback = Feedback.builder().rating(rating).build();
        return Panache.withTransaction(feedback::persist);
    }

    @GET
    public Uni<List<Feedback>> get() {
        return Feedback.listAll();
    }
}