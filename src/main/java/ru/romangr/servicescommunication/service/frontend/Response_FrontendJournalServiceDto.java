package ru.romangr.servicescommunication.service.frontend;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@Builder
@Value
@JsonDeserialize(builder = Response_FrontendJournalServiceDto.Response_FrontendJournalServiceDtoBuilder.class)
class Response_FrontendJournalServiceDto {

  List<Response_FrontendJournalServiceBookDto> books;
  Response_FrontendJournalServiceSubscriptionDto subscriptionInfo;

  @JsonPOJOBuilder(withPrefix = "")
  static class Response_FrontendJournalServiceDtoBuilder {

  }

  @Builder
  @Value
  @JsonDeserialize(builder = Response_FrontendJournalServiceBookDto.Response_FrontendJournalServiceBookDtoBuilder.class)
  static class Response_FrontendJournalServiceBookDto {

    @NonNull
    String title;

    @JsonPOJOBuilder(withPrefix = "")
    static class Response_FrontendJournalServiceBookDtoBuilder {

    }

  }

  @Builder
  @Value
  @JsonDeserialize(builder = Response_FrontendJournalServiceSubscriptionDto.Response_FrontendJournalServiceSubscriptionDtoBuilder.class)
  static class Response_FrontendJournalServiceSubscriptionDto {

    @NonNull
    Integer id;

    @NonNull
    LocalDate validUntil;

    @JsonPOJOBuilder(withPrefix = "")
    static class Response_FrontendJournalServiceSubscriptionDtoBuilder {

    }
  }
}
