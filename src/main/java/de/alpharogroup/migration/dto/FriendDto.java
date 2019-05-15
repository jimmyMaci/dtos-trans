package de.alpharogroup.migration.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FriendDto {

    String firstname;
    String lastname;
    String city;

}