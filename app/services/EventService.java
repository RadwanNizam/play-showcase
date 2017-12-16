package services;

import static play.libs.Json.toJson;

import java.util.concurrent.CompletionStage;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.radwan.events.dao.EventRepository;
import org.radwan.events.model.Event;

import play.mvc.Result;

@Singleton
public class EventService {
	@Inject
	private EventRepository eventRepository;
	
	    public CompletionStage<Stream<Event>> getEvents() {
	        return eventRepository.list();
	    }		
}
