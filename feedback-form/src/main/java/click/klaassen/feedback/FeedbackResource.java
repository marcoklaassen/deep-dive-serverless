package click.klaassen.feedback;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/feedback")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FeedbackResource {

    @Inject FeedbackService service;

    @POST
    public Feedback add(Feedback feedback) {
        service.publishFeedback(feedback.getRating());
        return feedback;
    }
}