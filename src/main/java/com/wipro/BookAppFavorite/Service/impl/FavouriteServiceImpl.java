package com.wipro.BookAppFavorite.Service.impl;

import com.wipro.BookAppFavorite.Model.*;
import com.wipro.BookAppFavorite.Repository.FavouriteRepository;
import com.wipro.BookAppFavorite.Service.AuthenticationService;
import com.wipro.BookAppFavorite.Service.FavouriteService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteServiceImpl implements FavouriteService {

    private final String URL = "http://localhost:3009/api/v1/auth/authenticate";

    AuthenticationService authenticationService;

    FavouriteRepository favouriteRepository;

    public FavouriteServiceImpl( FavouriteRepository favouriteRepository,AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
        this.favouriteRepository = favouriteRepository;
    }

    @Override
    public AddToFavouriteResponse addToFavourites(Book book, String token) {
        AuthenticatedResponse response = authenticationService.Authenticate(token);
//        System.out.println(response.getEmail());
        book.setEmail(response.getEmail());
        favouriteRepository.save(book);
        return new AddToFavouriteResponse(HttpStatus.CREATED,"added_to_favourite");
    }
    @Override
    public GetAllFavouritesResponse getAllFavourites(String token) {
        AuthenticatedResponse response = authenticationService.Authenticate(token);
        List<Book> books = favouriteRepository.findByEmail(response.getEmail());
        return new GetAllFavouritesResponse(HttpStatus.OK,"favourite_list",books);
    }

    @Override
    public DeleteFavouriteResponse deleteFavourite(String book_id,String  token) {
        AuthenticatedResponse response = authenticationService.Authenticate(token);
        favouriteRepository.deleteById(book_id);
        return new DeleteFavouriteResponse(HttpStatus.OK,"deleted");
    }
}
