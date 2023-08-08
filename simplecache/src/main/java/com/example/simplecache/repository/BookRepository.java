package com.example.simplecache.repository;

import com.example.simplecache.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {


    @Query("UPDATE Book b SET b.name = :name WHERE b.id = :id")
    void updateBookName(@Param("id") long id, @Param("name") String name);
}