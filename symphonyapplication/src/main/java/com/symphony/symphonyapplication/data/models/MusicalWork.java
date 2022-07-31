package com.symphony.symphonyapplication.data.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "musical_work")
public class MusicalWork {

    @Id
    @Column(name = "Music_id")
    private int music_id;

    @Column(name = "Music_type")
    @NotNull
    private String music_type;
}
