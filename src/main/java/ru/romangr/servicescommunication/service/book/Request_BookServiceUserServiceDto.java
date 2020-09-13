package ru.romangr.servicescommunication.service.book;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.book.Request_BookServiceUserServiceDto.Request_BookServiceUserServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = Request_BookServiceUserServiceDtoBuilder.class)
class Request_BookServiceUserServiceDto {

  @NonNull
  UUID userId;

  @JsonPOJOBuilder(withPrefix = "")
  static class Request_BookServiceUserServiceDtoBuilder {

  }

}
