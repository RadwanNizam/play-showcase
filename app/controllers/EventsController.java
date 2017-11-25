package controllers;

import static play.libs.Json.toJson;

import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.radwan.events.dao.EventRepository;

import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * The controller keeps all database operations behind the repository, and uses
 * {@link play.libs.concurrent.HttpExecutionContext} to provide access to the
 * {@link play.mvc.Http.Context} methods like {@code request()} and {@code flash()}.
 */
@Singleton
public class EventsController extends Controller {

    private final FormFactory formFactory;
    private final EventRepository eventRepository;
    private final HttpExecutionContext ec;

    @Inject
    public EventsController(FormFactory formFactory, EventRepository personRepository, HttpExecutionContext ec) {
        this.formFactory = formFactory;
        this.eventRepository = personRepository;
        this.ec = ec;
    }

    public CompletionStage<Result> getEvents() {
        return eventRepository.list().thenApplyAsync(personStream -> {
            return ok(toJson(personStream.collect(Collectors.toList())));
        }, ec.current());
    }

}