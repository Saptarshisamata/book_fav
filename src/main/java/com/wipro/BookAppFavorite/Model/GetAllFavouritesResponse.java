package com.wipro.BookAppFavorite.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllFavouritesResponse {
    private HttpStatus status;
    private String message;
    private List<Book> favourite_books;
}
