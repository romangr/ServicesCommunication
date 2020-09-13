package ru.romangr.servicescommunication.service;

import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import ru.romangr.servicescommunication.service.book.BookService;
import ru.romangr.servicescommunication.service.frontend.Frontend;
import ru.romangr.servicescommunication.service.user.UserService;

public class Runner {

  public static void main(String[] args) {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    objectMapper.enable(Feature.IGNORE_UNKNOWN);
    objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

    UserService userService = new UserService(objectMapper);
    BookService bookService = new BookService(objectMapper, userService);
    Frontend frontend = new Frontend(objectMapper, bookService);

    frontend.showBooks();
    frontend.showJournals();
  }

}
