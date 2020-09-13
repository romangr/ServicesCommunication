package ru.romangr.servicescommunication.service.frontend;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.frontend.Request_FrontendBookServiceDto.Request_FrontendBookServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = Request_FrontendBookServiceDtoBuilder.class)
class Request_FrontendBookServiceDto {

  @NonNull
  Integer pageNum;

  @NonNull
  Integer pageSize;

  @JsonPOJOBuilder(withPrefix = "")
  static class Request_FrontendBookServiceDtoBuilder {

  }
}
