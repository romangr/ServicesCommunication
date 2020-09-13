package ru.romangr.servicescommunication.service.journal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.journal.GetJournalsRequestJournalServiceDto.GetJournalsRequestJournalServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = GetJournalsRequestJournalServiceDtoBuilder.class)
class GetJournalsRequestJournalServiceDto {
  @NonNull
  Integer pageNum;

  @NonNull
  Integer pageSize;

  @JsonPOJOBuilder(withPrefix = "")
  static class GetJournalsRequestJournalServiceDtoBuilder {

  }
}
