package com.shivalabs.bookmarker_api.service;

import com.shivalabs.bookmarker_api.entity.BookMarks;
import com.shivalabs.bookmarker_api.repository.BookMarkDto;
import com.shivalabs.bookmarker_api.repository.BookMarkMapper;
import com.shivalabs.bookmarker_api.repository.BookMarksDto;
import com.shivalabs.bookmarker_api.repository.BookmarkRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public
class BookMarkService {

    private final BookmarkRepository bookmarkRepository;
   @Transactional
    public
   BookMarkDto getBookMarks ( Integer page ){
       int pageNo=page<1?0:page-1;
       Pageable pageable =PageRequest.of ( pageNo,10, Sort.Direction.DESC,"createAt" );
       Page<BookMarksDto> marksPage = bookmarkRepository.findBookmarksDto ( pageable );
       return new BookMarkDto(marksPage);
   }


}
