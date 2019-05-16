package de.alpharogroup.migration.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BroDto {

	Integer id;
	String city;
	String firstname;
	String lastname;

}