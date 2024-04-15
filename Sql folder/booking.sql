drop table if exists booking;
create table booking(
book_code int primary key NOT NULL auto_increment,
book_date date NOT NULL,
mem_code varchar(255) NOT NULL,
medi_name varchar(255) NOT NULL,
medi_count int NOT NULL,
book_status CHAR(1) NOT NULL
)ENGINE=INNODB;