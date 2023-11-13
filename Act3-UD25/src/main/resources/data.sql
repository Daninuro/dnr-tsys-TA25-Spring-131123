
DROP table IF EXISTS almacen;
DROP table IF EXISTS caja;

CREATE TABLE almacen (
    codigo INT PRIMARY KEY,
    lugar VARCHAR(100),
    capacidad INT
);

CREATE TABLE caja (
    num_referencia CHAR(5) PRIMARY KEY,
    contenido VARCHAR(100),
    valor INT,
    almacen INT,
    FOREIGN KEY (almacen)
        REFERENCES almacen (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);
