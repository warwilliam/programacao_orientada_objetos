DROP TABLE IF EXISTS hotel;
CREATE TABLE IF NOT EXISTS hotel (
    id int auto_increment primary key,
    name VARCHAR(64),
    street VARCHAR(64),
    number VARCHAR(64),
    city VARCHAR(64),
    state VARCHAR(64),
    is5stars TINYINT(1)
);