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

INSERT INTO book(book_id, book_name, book_author, publication, publication_number, year_of_publication, price)
values (101, 'MyBook', 'Sachin Nirne',  'My Publication', 'ISBN_001_001', 2001, 123.50),
       (102, 'MyBook_B', 'Jeevan Patil',  'My Publication_B', 'ISBN_002_002', 2001, 153.50),
       (103, 'MyBook_C', 'Amit Joshi',  'My Publication_C', 'ISBN_003_003', 2004, 163.50),
       (104, 'MyBook_D', 'Amol Patil',  'My Publication_D', 'ISBN_004_004', 2005, 173.50),
       (105, 'MyBook', 'Jeevan Dhanak',  'My Publication_E', 'ISBN_005_005', 2006, 183.50);

