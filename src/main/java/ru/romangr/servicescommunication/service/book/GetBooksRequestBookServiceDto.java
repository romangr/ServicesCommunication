package ru.romangr.servicescommunication.service.book;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import ru.romangr.servicescommunication.service.book.GetBooksRequestBookServiceDto.GetBooksRequestBookServiceDtoBuilder;

@Builder
@Value
@JsonDeserialize(builder = GetBooksRequestBookServiceDtoBuilder.class)
class GetBooksRequestBookServiceDto {
  @NonNull
  Integer pageNum;

  @NonNull
  Integer pageSize;

  @JsonPOJOBuilder(withPrefix = "")
  static class GetBooksRequestBookServiceDtoBuilder {

  }
}
