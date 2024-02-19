CREATE TABLE IF NOT EXISTS artist (
  id BIGINT AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  last_modified_date TIMESTAMP,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS album (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  artist_id BIGINT,
  created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  last_modified_date TIMESTAMP,
  FOREIGN KEY(artist_id) REFERENCES artist(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS song (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(100),
  tempo VARCHAR(5),
  album_id BIGINT,
  song_key VARCHAR(10),
  bpm VARCHAR(5),
  time_sig VARCHAR(10),
  status TINYINT DEFAULT 1,
  chart VARCHAR(100),
  song VARCHAR(100),
  playback VARCHAR(100),
  created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  last_modified_date TIMESTAMP,
  FOREIGN KEY(album_id) REFERENCES album(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS artist_photo (
  artist_id BIGINT   NOT NULL,
  name               VARCHAR(100) NOT NULL,
  description        VARCHAR(100) NOT NULL,
  content_type       VARCHAR (80) NOT NULL,
  file_size          INT NOT NULL,
  created_date       TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  last_modified_date TIMESTAMP,
  PRIMARY KEY (artist_id),
  CONSTRAINT fk_artist_photo_artist FOREIGN KEY (artist_id) REFERENCES artist(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE INDEX idx_artist_id ON artist(id);