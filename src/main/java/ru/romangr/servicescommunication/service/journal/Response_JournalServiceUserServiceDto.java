package ru.romangr.servicescommunication.service.journal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.journal.Response_JournalServiceUserServiceDto.Response_JournalServiceUserServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = Response_JournalServiceUserServiceDtoBuilder.class)
class Response_JournalServiceUserServiceDto {

  @NonNull
  Integer id;

  @NonNull
  LocalDate validUntil;

  @JsonPOJOBuilder(withPrefix = "")
  static class Response_JournalServiceUserServiceDtoBuilder {

  }

}
