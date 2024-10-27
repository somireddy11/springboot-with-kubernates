package com.shivalabs.bookmarker_api.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "bookmarks")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookMarks {
    @Id
    @SequenceGenerator ( name = "bm_id_seq_gen",sequenceName ="bm_id_gen" )
    @GeneratedValue(strategy =GenerationType.SEQUENCE,generator = "bm_id_seq_gen")
    private Long id;

    @Column(nullable=false)
    private String title;
    @Column(nullable = false)
    private String url;

    private
    Instant createAt;


}
