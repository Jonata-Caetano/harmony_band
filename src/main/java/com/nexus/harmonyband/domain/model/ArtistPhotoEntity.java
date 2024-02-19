package com.nexus.harmonyband.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Table(name = "artist_photo")
public class ArtistPhotoEntity extends Auditable {

    @Id
    @EqualsAndHashCode.Include
    @Column(name = "artist_id")
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private  ArtistEntity artist;
    private String name;
    private String description;
    @Column(name = "content_type")
    private String contentType;
    private Long fileSize;

}
