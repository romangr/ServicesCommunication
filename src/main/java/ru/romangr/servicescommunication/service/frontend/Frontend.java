package ru.romangr.servicescommunication.service.frontend;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.romangr.servicescommunication.service.book.BookService;


@RequiredArgsConstructor
public class Frontend {

  private final ObjectMapper objectMapper;
  private final BookService bookService;

  @SneakyThrows
  public void showBooks() {
    Request_FrontendBookServiceDto requestDto = Request_FrontendBookServiceDto.builder()
        .pageNum(0)
        .pageSize(10)
        .build();
    String request = objectMapper.writeValueAsString(requestDto);
    String response = bookService.getBooks(request);

    Response_FrontendBookServiceDto responseDto =
        objectMapper.readValue(response, Response_FrontendBookServiceDto.class);

    String parsedResponse
        = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(responseDto);
    System.out.println(parsedResponse);
  }

  @SneakyThrows
  public void showJournals() {
    Request_FrontendJournalServiceDto requestDto = Request_FrontendJournalServiceDto.builder()
        .pageNum(0)
        .pageSize(10)
        .build();
    String request = objectMapper.writeValueAsString(requestDto);
    String response = bookService.getBooks(request);

    Response_FrontendJournalServiceDto responseDto =
        objectMapper.readValue(response, Response_FrontendJournalServiceDto.class);

    String parsedResponse
        = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(responseDto);
    System.out.println(parsedResponse);
  }
}
