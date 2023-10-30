DROP TABLE IF EXISTS address;
CREATE TABLE IF NOT EXISTS address (
    id int auto_increment primary key,
    street VARCHAR(64),
    number VARCHAR(64),
    city VARCHAR(64),
    neighborhood VARCHAR(64),
    state VARCHAR(2)
);

DROP TABLE IF EXISTS dentist;
CREATE TABLE IF NOT EXISTS dentist (
    id INT auto_increment PRIMARY KEY,
    name VARCHAR(64),
    lastName VARCHAR(64),
    registration INT,
    isAgreement BOOLEAN
);