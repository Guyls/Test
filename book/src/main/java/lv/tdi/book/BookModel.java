package lv.tdi.book;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
    @JsonProperty
    @Id
    Long ID;

    @JsonProperty
    String author;

    @JsonProperty
    String name;

    @JsonProperty
    int copies;

}
