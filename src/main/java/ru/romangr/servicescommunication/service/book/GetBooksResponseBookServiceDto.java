package ru.romangr.servicescommunication.service.book;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Value;
import ru.romangr.servicescommunication.service.book.GetBooksResponseBookServiceDto.BookBookServiceDto.BookBookServiceDtoBuilder;
import ru.romangr.servicescommunication.service.book.GetBooksResponseBookServiceDto.GetBooksBookServiceDtoBuilder;
import ru.romangr.servicescommunication.service.book.GetBooksResponseBookServiceDto.SubscriptionInfoBookServiceDto.UserInfoBookServiceDtoBuilder;

@Value
@Builder
@JsonDeserialize(builder = GetBooksBookServiceDtoBuilder.class)
class GetBooksResponseBookServiceDto {

  List<BookBookServiceDto> books;
  SubscriptionInfoBookServiceDto subscriptionInfo;

  @JsonPOJOBuilder(withPrefix = "")
  static class GetBooksBookServiceDtoBuilder {

  }

  @Value
  @Builder
  @JsonDeserialize(builder = BookBookServiceDtoBuilder.class)
  static class BookBookServiceDto {

    String title;

    @JsonPOJOBuilder(withPrefix = "")
    static class BookBookServiceDtoBuilder {

    }
  }

  @Value
  @Builder
  @JsonDeserialize(builder = UserInfoBookServiceDtoBuilder.class)
  static class SubscriptionInfoBookServiceDto {

    Integer id;
    LocalDate validUntil;

    @JsonPOJOBuilder(withPrefix = "")
    static class UserInfoBookServiceDtoBuilder {

    }
  }
}
