package com.shivalabs.bookmarker_api.repository;

import com.shivalabs.bookmarker_api.entity.BookMarks;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public
interface BookmarkRepository extends JpaRepository<BookMarks,Long> {

    @Query("select new com.shivalabs.bookmarker_api.repository.BookMarksDto(b.id,b.title,b.url,b.createAt) from BookMarks b")
    public
    Page<BookMarksDto> findBookmarksDto ( Pageable pageable );

}
