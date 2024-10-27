package com.shivalabs.bookmarker_api.controller;


import com.shivalabs.bookmarker_api.entity.BookMarks;
import com.shivalabs.bookmarker_api.repository.BookMarkDto;
import com.shivalabs.bookmarker_api.service.BookMarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public
class BookMarkController {

    private final
    BookMarkService bookMarkService;


    @GetMapping
    public
    BookMarkDto getBookmarks ( @RequestParam(name ="page" ,defaultValue = "1") Integer page ) {

        return bookMarkService.getBookMarks (page);

    }
}
