package ru.romangr.servicescommunication.service.frontend;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import java.util.List;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.frontend.Response_FrontendBookServiceDto.Response_FrontendBookServiceBookDto.Response_FrontendBookServiceBookDtoBuilder;
import ru.romangr.servicescommunication.service.frontend.Response_FrontendBookServiceDto.Response_FrontendBookServiceDtoBuilder;
import ru.romangr.servicescommunication.service.frontend.Response_FrontendBookServiceDto.Response_FrontendBookServiceSubscriptionDto.Response_FrontendBookServiceSubscriptionDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = Response_FrontendBookServiceDtoBuilder.class)
class Response_FrontendBookServiceDto {

  List<Response_FrontendBookServiceBookDto> books;
  Response_FrontendBookServiceSubscriptionDto subscriptionInfo;

  @JsonPOJOBuilder(withPrefix = "")
  static class Response_FrontendBookServiceDtoBuilder {

  }

  @Builder
  @Value
  @JsonDeserialize(builder = Response_FrontendBookServiceBookDtoBuilder.class)
  static class Response_FrontendBookServiceBookDto {

    @NonNull
    String title;

    @JsonPOJOBuilder(withPrefix = "")
    static class Response_FrontendBookServiceBookDtoBuilder {

    }

  }

  @Builder
  @Value
  @JsonDeserialize(builder = Response_FrontendBookServiceSubscriptionDtoBuilder.class)
  static class Response_FrontendBookServiceSubscriptionDto {

    @NonNull
    Integer id;

    @NonNull
    LocalDate validUntil;

    @JsonPOJOBuilder(withPrefix = "")
    static class Response_FrontendBookServiceSubscriptionDtoBuilder {

    }
  }
}
