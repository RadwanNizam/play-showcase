package org.radwan.events.dao;
import play.db.jpa.JPAApi;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.radwan.events.model.Event;
import org.radwan.events.services.DatabaseExecutionContext;

import java.util.List;
import java.util.concurrent.CompletionStage;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Provide JPA operations running inside of a thread pool sized to the connection pool
 */
public class JPAEventRepository implements EventRepository {

    private final JPAApi jpaApi;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public JPAEventRepository(JPAApi jpaApi, DatabaseExecutionContext executionContext) {
        this.jpaApi = jpaApi;
        this.executionContext = executionContext;
    }

    @Override
    public CompletionStage<Stream<Event>> list() {
        return supplyAsync(() -> wrap(em -> list(em)), executionContext);
    }

    private <T> T wrap(Function<EntityManager, T> function) {
        return jpaApi.withTransaction(function);
    }

    private Stream<Event> list(EntityManager em) {
        List<Event> persons = em.createQuery("select e from Event e where id in (115422142487279,127018777965664,127973077883231,130224890960464,132510417453240,133460380715501,142697206454649)", Event.class).getResultList();
        return persons.stream();
    }
}