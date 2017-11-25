package org.radwan.events.dao;
import com.google.inject.ImplementedBy;

import java.util.concurrent.CompletionStage;
import java.util.stream.Stream;

import org.radwan.events.model.Event;

/**
 * This interface provides a non-blocking API for possibly blocking operations.
 */
@ImplementedBy(JPAEventRepository.class)
public interface EventRepository {

    CompletionStage<Stream<Event>> list();
}