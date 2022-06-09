package com.wipro.BookAppFavorite.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteFavouriteResponse {
    private HttpStatus status;
    private String message;
}
