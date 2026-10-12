import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class movie {

	private final List<String> movies = List.of(
			"Inception",
			"The Matrix",
			"Interstellar",
			"The Dark Knight",
			"Toy Story");

	public static void main(String[] args) {
		SpringApplication.run(movie.class, args);
	}

	@GetMapping("/movies")
	public List<String> searchMovies(@RequestParam(defaultValue = "") String search) {
		String query = search.toLowerCase(Locale.ROOT);
		return movies.stream()
				.filter(title -> title.toLowerCase(Locale.ROOT).contains(query))
				.collect(Collectors.toList());
	}
}
