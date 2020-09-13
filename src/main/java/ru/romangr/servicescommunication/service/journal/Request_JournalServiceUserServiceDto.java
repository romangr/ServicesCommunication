package ru.romangr.servicescommunication.service.journal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = Request_JournalServiceUserServiceDto.Request_JournalServiceUserServiceDtoBuilder.class)
class Request_JournalServiceUserServiceDto {

  @NonNull
  UUID userId;

  @JsonPOJOBuilder(withPrefix = "")
  static class Request_JournalServiceUserServiceDtoBuilder {

  }

}
