package com.kodilla.rest.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import com.kodilla.rest.service.BookService;
import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.BeforeEach;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import com.kodilla.rest.domain.BookDto;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.when;
import org.hamcrest.Matchers;
import org.springframework.http.HttpStatus;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import io.restassured.http.ContentType;

@ExtendWith(MockitoExtension.class)
public class BookControllerRestAssuredTest {

    @Mock
    private BookService bookService;

    @InjectMocks
    private BookController bookController;

    @BeforeEach
    public void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(bookController);

    }

    @Test
    void shouldFetchBooks() {

        // given
        Mockito.when(bookService.getBooks())
                .thenReturn(List.of(
                        new BookDto("Title 1", "Author 2"),
                        new BookDto("Title 2", "Author 2"))
                );

        // when & then
        when()
                .get("/books")
                .then()
                .body("$.size()", Matchers.equalTo(2))
                .body("[0].title", Matchers.equalTo("Title 1"))
                .body("[0].author", Matchers.equalTo("Author 2"))
                .body("[1].title", Matchers.equalTo("Title 2"))
                .body("[1].author", Matchers.equalTo("Author 2"))
                .status(HttpStatus.OK);
    }

    @Test
    void shouldAddBook() {
        BookDto bookDto = new BookDto("Title 3", "Author 3");
        given()
                .contentType(ContentType.JSON)
                .body(bookDto).
                when()
                .post("/books").
                then()
                .status(HttpStatus.OK);
        Mockito.verify(bookService).addBook(bookDto);

    }
}
