package ru.romangr.servicescommunication.service.book;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.javac.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.romangr.servicescommunication.service.user.UserService;
import ru.romangr.servicescommunication.service.book.GetBooksResponseBookServiceDto.BookBookServiceDto;
import ru.romangr.servicescommunication.service.book.GetBooksResponseBookServiceDto.SubscriptionInfoBookServiceDto;

@RequiredArgsConstructor
public class BookService {

  private final ObjectMapper objectMapper;
  private final UserService userService;

  @SneakyThrows
  public String getBooks(String request) {
    objectMapper.readValue(request, GetBooksRequestBookServiceDto.class);

    Request_BookServiceUserServiceDto subscriptionInfoRequestDto
        = Request_BookServiceUserServiceDto.builder()
        .userId(UUID.randomUUID())
        .build();
    String subscriptionInfoRequest = objectMapper.writeValueAsString(subscriptionInfoRequestDto);
    String subscriptionInfoResponse = userService.getSubscriptionInfo(subscriptionInfoRequest);

    Response_BookServiceUserServiceDto subscriptionInfoResponseDto = objectMapper
        .readValue(subscriptionInfoResponse, Response_BookServiceUserServiceDto.class);

    GetBooksResponseBookServiceDto booksResponse = GetBooksResponseBookServiceDto.builder()
        .books(List.of(
            BookBookServiceDto.builder()
                .title("Title")
                .build()
        ))
        .subscriptionInfo(
            SubscriptionInfoBookServiceDto.builder()
                .id(subscriptionInfoResponseDto.getId())
                .validUntil(subscriptionInfoResponseDto.getValidUntil())
                .build()
        )
        .build();
    return objectMapper.writeValueAsString(booksResponse);
  }
}
