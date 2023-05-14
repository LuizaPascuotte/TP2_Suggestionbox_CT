package br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.api.v1.resources;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.flywaydb.core.api.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fatecararas.f290_dsm_tp2_suggestionbox_ct.model.Suggestion;

@RestController
@RequestMapping("/")
public class FirstRestController {

    @GetMapping
    public ResponseEntity<?> helloApiGet() {
        System.out.println("GET: Passou pelo FirstRestController");
        return ResponseEntity.ok().build();
    }

    @PostMapping
    public ResponseEntity<?> helloApiPost(@RequestBody Suggestion suggestion) {
        System.out.println("POST: Passou pelo FirstRestController");
        System.out.println("Recebido!");
        System.out.println(suggestion);
        return ResponseEntity.created(null).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> helloApiDelete(@PathVariable("id") Integer id) {
        System.out.println("DELETE: Passou pelo FirstRestController");
        System.out.println("Recebido ID: " + id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> helloApiPut(@PathVariable("id") Integer id, @RequestBody Suggestion suggestion) {
        System.out.println("PUT: Passou pelo FirstRestController");
        System.out.println("Recebido ID: " + id);
        System.out.println("Body: " + suggestion);

        if (suggestion.getId().equals(100)) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List<Suggestion>> getAll() {
        List<Suggestion> all = Arrays.asList(
                new Suggestion(1, "First Suggestion", LocalDate.of(2019, 5, 12)),
                new Suggestion(2, "secund Suggestion", LocalDate.of(2020, 6, 20)),
                new Suggestion(3, "third Suggestion", LocalDate.of(2021, 7, 9)),
                new Suggestion(4, "fouth Suggestion", LocalDate.of(2022, 8, 3)),
                new Suggestion(5, "fifth Suggestion", LocalDate.of(2023, 9, 6)));

        return ResponseEntity.ok().body(all);
    }
}
