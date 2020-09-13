package ru.romangr.servicescommunication.service.user;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.UUID;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.user.GetSubscriptionInfoRequestUserServiceDto.GetSubscriptionInfoRequestUserServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = GetSubscriptionInfoRequestUserServiceDtoBuilder.class)
class GetSubscriptionInfoRequestUserServiceDto {

  @NonNull
  UUID userId;

  @JsonPOJOBuilder(withPrefix = "")
  static class GetSubscriptionInfoRequestUserServiceDtoBuilder {

  }
}
