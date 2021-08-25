DROP TABLE IF EXISTS book;

CREATE TABLE book (
  book_id BIGINT AUTO_INCREMENT  PRIMARY KEY,
  book_name VARCHAR(250) NOT NULL,
  book_author VARCHAR(250) DEFAULT NULL,
  publication VARCHAR(250) DEFAULT NULL,
  publication_number VARCHAR(250) DEFAULT NULL,
  year_of_publication INT DEFAULT NULL,
  price decimal(4,2) DEFAULT NULL
);