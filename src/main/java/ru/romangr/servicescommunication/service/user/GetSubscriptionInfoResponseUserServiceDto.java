package ru.romangr.servicescommunication.service.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Value;
import ru.romangr.servicescommunication.service.user.GetSubscriptionInfoResponseUserServiceDto.GetSubscriptionInfoResponseUserServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = GetSubscriptionInfoResponseUserServiceDtoBuilder.class)
class GetSubscriptionInfoResponseUserServiceDto {

  Integer id;
  LocalDate validUntil;

  @JsonPOJOBuilder(withPrefix = "")
  static class GetSubscriptionInfoResponseUserServiceDtoBuilder {

  }
}
