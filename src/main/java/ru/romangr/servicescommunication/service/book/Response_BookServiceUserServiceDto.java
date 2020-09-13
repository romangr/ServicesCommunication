package ru.romangr.servicescommunication.service.book;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.book.Response_BookServiceUserServiceDto.Response_BookServiceUserServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = Response_BookServiceUserServiceDtoBuilder.class)
class Response_BookServiceUserServiceDto {

  @NonNull
  Integer id;

  @NonNull
  LocalDate validUntil;

  @JsonPOJOBuilder(withPrefix = "")
  static class Response_BookServiceUserServiceDtoBuilder {

  }

}
