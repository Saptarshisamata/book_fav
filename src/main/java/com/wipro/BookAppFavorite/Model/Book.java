package com.wipro.BookAppFavorite.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("favourite_list")
public class Book {
    @Id
    private String _id;
    private String email;
    private List<String> author;
    private String title;
    private String year;
    private String cover;
}
