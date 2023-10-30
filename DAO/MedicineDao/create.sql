CREATE TABLE IF NOT EXISTS medicine (
    id INT auto_increment PRIMARY KEY,
    name VARCHAR(64),
    laboratory VARCHAR(64),
    quantity INT,
    price DOUBLE
);