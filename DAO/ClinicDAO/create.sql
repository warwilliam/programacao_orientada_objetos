DROP TABLE IF EXISTS address;
CREATE TABLE IF NOT EXISTS address (
    id int auto_increment primary key,
    street VARCHAR(64),
    number VARCHAR(64),
    city VARCHAR(64),
    neighborhood VARCHAR(64)
);