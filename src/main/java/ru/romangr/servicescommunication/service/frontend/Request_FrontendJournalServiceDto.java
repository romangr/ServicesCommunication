package ru.romangr.servicescommunication.service.frontend;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = Request_FrontendJournalServiceDto.Request_FrontendJournalServiceDtoBuilder.class)
class Request_FrontendJournalServiceDto {

  @NonNull
  Integer pageNum;

  @NonNull
  Integer pageSize;

  @JsonPOJOBuilder(withPrefix = "")
  static class Request_FrontendJournalServiceDtoBuilder {

  }
}
