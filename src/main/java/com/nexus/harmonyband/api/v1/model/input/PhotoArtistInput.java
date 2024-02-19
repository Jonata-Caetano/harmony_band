package com.nexus.harmonyband.api.v1.model.input;

import com.nexus.harmonyband.core.validation.FileContentType;
import com.nexus.harmonyband.core.validation.FileSize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.MediaType;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
public class PhotoArtistInput {

    @NotNull
    @FileSize(max = "500KB")
    @FileContentType(allowed = {MediaType.IMAGE_JPEG_VALUE,MediaType.IMAGE_PNG_VALUE})
    private MultipartFile file;
    @NotBlank
    private String description;

}
