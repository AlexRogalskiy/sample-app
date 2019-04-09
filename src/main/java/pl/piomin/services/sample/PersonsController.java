package pl.piomin.services.sample;

import java.util.List;

import javax.inject.Inject;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/persons")
public class PersonsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonsController.class);

    @Inject
    PersonRepository repository;

    @Post
    public Person add(@Body Person person) {
        LOGGER.info("Person add: {}", person);
        return repository.add(person);
    }

    @Get("/{id}")
    public Person findById(Integer id) {
        LOGGER.info("Person find: id={}", id);
        return repository.findById(id);
    }

    @Get
    public List<Person> findAll() {
        LOGGER.info("Person find");
        return repository.findAll();
    }

}
