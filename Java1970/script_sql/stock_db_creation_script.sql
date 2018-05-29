CREATE DATABASE stock;

USE stock;

CREATE TABLE produit (
    label VARCHAR(64), 
    price DOUBLE,
    unit VARCHAR(32),
    description VARCHAR(128)
);