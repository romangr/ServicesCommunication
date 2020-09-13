package ru.romangr.servicescommunication.service.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Clock;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
public class UserService {

  private final ObjectMapper objectMapper;

  @SneakyThrows
  public String getSubscriptionInfo(String subscriptionInfoRequest) {
    objectMapper.readValue(subscriptionInfoRequest, GetSubscriptionInfoRequestUserServiceDto.class);

    GetSubscriptionInfoResponseUserServiceDto responseDto
        = GetSubscriptionInfoResponseUserServiceDto.builder()
        .id(ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE))
        .validUntil(LocalDate.now(Clock.systemUTC()))
        .build();

    return objectMapper.writeValueAsString(responseDto);
  }
}
