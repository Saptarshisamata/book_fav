package com.wipro.BookAppFavorite.Service;

import com.wipro.BookAppFavorite.Model.AddToFavouriteResponse;
import com.wipro.BookAppFavorite.Model.Book;
import com.wipro.BookAppFavorite.Model.DeleteFavouriteResponse;
import com.wipro.BookAppFavorite.Model.GetAllFavouritesResponse;

public interface FavouriteService {
    AddToFavouriteResponse addToFavourites(Book book, String token);

    GetAllFavouritesResponse getAllFavourites(String token);

    DeleteFavouriteResponse deleteFavourite(String book_id,String token);
}
