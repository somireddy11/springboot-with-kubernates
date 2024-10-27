package com.shivalabs.bookmarker_api.repository;


import com.shivalabs.bookmarker_api.entity.BookMarks;
import org.springframework.stereotype.Component;

@Component
public class BookMarkMapper {
    
    public BookMarksDto toDto( BookMarks bookMarks ) {
        BookMarksDto bookMarksDto = new BookMarksDto ( );
        bookMarksDto.setId ( bookMarks.getId ( ) );
        bookMarksDto.setTitle ( bookMarks.getTitle () );
        bookMarksDto.setUrl ( bookMarks.getUrl ( ) );
        bookMarksDto.setCreateAt ( bookMarks.getCreateAt () );

        return  bookMarksDto;
    }

}
