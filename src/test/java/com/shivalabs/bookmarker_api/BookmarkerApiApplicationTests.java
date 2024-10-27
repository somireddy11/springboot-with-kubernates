/*
package com.shivalabs.bookmarker_api;

import com.shivalabs.bookmarker_api.entity.BookMarks;
import com.shivalabs.bookmarker_api.repository.BookmarkRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.shaded.org.hamcrest.CoreMatchers;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@TestPropertySource(properties = {
	"spring.datasource.url=jdbc:tc:postgresql:14-alpine:///databasename"
})
class BookmarkerApiApplicationTests {

	@Autowired
	private  MockMvc mockMvc;

	@Autowired
	private
	BookmarkRepository bookmarkRepository;

	@BeforeEach
	public void setup(){
		bookmarkRepository.deleteAll ();
		bookmarkRepository.saveAll( Arrays.asList (
			new BookMarks(null, "Siva Labs", "https://shivalabs.in", Instant.now ( )),
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

	@Test
	void contextLoads() throws Exception {

		 mockMvc.perform ( MockMvcRequestBuilders.get ( "/api/bookmarks" ) )
			.andExpect ( status ( ).isOk ( ) );
			//.andExpect ( jsonPath ( "$.totalElements" , CoreMatchers.equalTo ( 10 ) ) );
	}

}
*/
