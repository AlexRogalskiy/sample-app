package pl.piomin.services.sample;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
				title = "Persons Management",
				version = "1.0",
				description = "Person API",
				contact = @Contact(url = "https://piotrminkowski.wordpress.com", name = "Piotr Mińkowski", email = "piotr.minkowski@gmail.com")
		)
)
public class SampleApp {

	public static void main(String[] args) {
		Micronaut.run(SampleApp.class);
	}

}
