package example.micronaut;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.Map;

@JsonDeserialize
public class HelloRequest {
    private final String firstName;
    private final String lastName;

    @JsonCreator
    public HelloRequest(@JsonProperty("firstName") String firstName,
                         @JsonProperty("lastName") String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @JsonGetter
    public String getFirstName() {
        return firstName;
    }

    @JsonGetter
    public String getLastName() {
        return lastName;
    }

}
