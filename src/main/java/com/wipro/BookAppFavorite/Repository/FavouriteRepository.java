package com.wipro.BookAppFavorite.Repository;

import com.wipro.BookAppFavorite.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FavouriteRepository extends MongoRepository<Book,String > {
    List<Book> findByEmail(String email);
}
