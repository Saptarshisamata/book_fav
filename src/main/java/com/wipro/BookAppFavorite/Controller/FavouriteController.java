package com.wipro.BookAppFavorite.Controller;

import com.wipro.BookAppFavorite.Model.AddToFavouriteResponse;
import com.wipro.BookAppFavorite.Model.Book;
import com.wipro.BookAppFavorite.Model.GetAllFavouritesResponse;
import com.wipro.BookAppFavorite.Service.FavouriteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/favourite")
@CrossOrigin
public class FavouriteController {

    FavouriteService favouriteService;

    public FavouriteController(FavouriteService favouriteService) {
        this.favouriteService = favouriteService;
    }

    @PostMapping("/add_to_favourite")
    public ResponseEntity<AddToFavouriteResponse> addToFavourite(@RequestBody Book book, @RequestHeader("Authorization") String token){
        AddToFavouriteResponse addToFavouriteResponse =
                favouriteService.addToFavourites(book,token);
        return new ResponseEntity<>(addToFavouriteResponse, HttpStatus.CREATED);
    }

    @GetMapping("/get_all_favourites")
    public ResponseEntity<GetAllFavouritesResponse> getAllFavourite(@RequestHeader("Authorization") String token){
        GetAllFavouritesResponse response = favouriteService.getAllFavourites(token);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

}
