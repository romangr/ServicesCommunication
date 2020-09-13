package ru.romangr.servicescommunication.service.journal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.Value;
import ru.romangr.servicescommunication.service.journal.GetJournalsResponseJournalServiceDto.GetJournalsResponseJournalServiceDtoBuilder;
import ru.romangr.servicescommunication.service.journal.GetJournalsResponseJournalServiceDto.JournalJournalServiceDto.JournalJournalServiceDtoBuilder;
import ru.romangr.servicescommunication.service.journal.GetJournalsResponseJournalServiceDto.SubscriptionInfoJournalServiceDto.SubscriptionInfoJournalServiceDtoBuilder;

@Value
@Builder
@JsonDeserialize(builder = GetJournalsResponseJournalServiceDtoBuilder.class)
class GetJournalsResponseJournalServiceDto {

  List<JournalJournalServiceDto> books;
  SubscriptionInfoJournalServiceDto subscriptionInfo;

  @JsonPOJOBuilder(withPrefix = "")
  static class GetJournalsResponseJournalServiceDtoBuilder {

  }

  @Value
  @Builder
  @JsonDeserialize(builder = JournalJournalServiceDtoBuilder.class)
  static class JournalJournalServiceDto {

    String title;

    @JsonPOJOBuilder(withPrefix = "")
    static class JournalJournalServiceDtoBuilder {

    }
  }

  @Value
  @Builder
  @JsonDeserialize(builder = SubscriptionInfoJournalServiceDtoBuilder.class)
  static class SubscriptionInfoJournalServiceDto {

    Integer id;
    LocalDate validUntil;

    @JsonPOJOBuilder(withPrefix = "")
    static class SubscriptionInfoJournalServiceDtoBuilder {

    }
  }
}
