package com.wipro.BookAppFavorite.Repository;

import com.wipro.BookAppFavorite.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavouriteRepository extends MongoRepository<Book,String > {
    List<Book> findByEmail(String email);
}
