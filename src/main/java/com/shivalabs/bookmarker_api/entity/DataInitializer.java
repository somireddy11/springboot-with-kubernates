package com.shivalabs.bookmarker_api.entity;

import com.shivalabs.bookmarker_api.repository.BookmarkRepository;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Arrays;

@Component
@RequiredArgsConstructor
public
class DataInitializer implements CommandLineRunner {

    private final
    BookmarkRepository bookmarkRepository;
    @Override
    public
    void run ( String... args ) throws Exception {
        bookmarkRepository.saveAll( Arrays.asList (
            new BookMarks(null, "Siva Labs", "https://shivalabs.in", Instant.now()),
            new BookMarks(null, "Google", "https://www.google.com", Instant.now()),
            new BookMarks(null, "GitHub", "https://github.com", Instant.now()),
            new BookMarks(null, "Stack Overflow", "https://stackoverflow.com", Instant.now()),
            new BookMarks(null, "Spring", "https://spring.io", Instant.now()),
            new BookMarks(null, "Wikipedia", "https://www.wikipedia.org", Instant.now()),
            new BookMarks(null, "OpenAI", "https://www.openai.com", Instant.now()),
            new BookMarks(null, "LinkedIn", "https://www.linkedin.com", Instant.now()),
            new BookMarks(null, "Twitter", "https://twitter.com", Instant.now()),
            new BookMarks(null, "YouTube", "https://www.youtube.com", Instant.now())
                                                  ));
    }
}
