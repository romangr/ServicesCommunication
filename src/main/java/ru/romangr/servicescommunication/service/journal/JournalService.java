package ru.romangr.servicescommunication.service.journal;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.tools.javac.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import ru.romangr.servicescommunication.service.journal.GetJournalsResponseJournalServiceDto.JournalJournalServiceDto;
import ru.romangr.servicescommunication.service.journal.GetJournalsResponseJournalServiceDto.SubscriptionInfoJournalServiceDto;
import ru.romangr.servicescommunication.service.user.UserService;

@RequiredArgsConstructor
public class JournalService {

  private final ObjectMapper objectMapper;
  private final UserService userService;

  @SneakyThrows
  public String getJournals(String request) {
    objectMapper.readValue(request, GetJournalsRequestJournalServiceDto.class);

    Request_JournalServiceUserServiceDto subscriptionInfoRequestDto
        = Request_JournalServiceUserServiceDto.builder()
        .userId(UUID.randomUUID())
        .build();
    String subscriptionInfoRequest = objectMapper.writeValueAsString(subscriptionInfoRequestDto);
    String subscriptionInfoResponse = userService.getSubscriptionInfo(subscriptionInfoRequest);

    Response_JournalServiceUserServiceDto subscriptionInfoResponseDto = objectMapper
        .readValue(subscriptionInfoResponse, Response_JournalServiceUserServiceDto.class);

    GetJournalsResponseJournalServiceDto journalsResponseDto = GetJournalsResponseJournalServiceDto
        .builder()
        .books(List.of(
            JournalJournalServiceDto.builder()
                .title("Title")
                .build()
        ))
        .subscriptionInfo(
            SubscriptionInfoJournalServiceDto.builder()
                .id(subscriptionInfoResponseDto.getId())
                .validUntil(subscriptionInfoResponseDto.getValidUntil())
                .build()
        )
        .build();
    return objectMapper.writeValueAsString(journalsResponseDto);
  }
}
