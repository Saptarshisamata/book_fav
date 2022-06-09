package com.wipro.BookAppFavorite.Service;

import com.wipro.BookAppFavorite.Model.AddToFavouriteResponse;
import com.wipro.BookAppFavorite.Model.Book;
import com.wipro.BookAppFavorite.Model.DeleteFavouriteResponse;
import com.wipro.BookAppFavorite.Model.GetAllFavouritesResponse;

import java.util.List;

public interface FavouriteService {
    public AddToFavouriteResponse addToFavourites(Book book, String token);

    public GetAllFavouritesResponse getAllFavourites(String token);

    DeleteFavouriteResponse deleteFavourite(String book_id,String token);
}
