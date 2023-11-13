DROP table IF EXISTS peliculas;
DROP table IF EXISTS salas;

CREATE TABLE peliculas (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100),
    calificacion_edad INT
);

CREATE TABLE salas (
    codigo INT PRIMARY KEY,
    nombre VARCHAR(100),
    pelicula INT,
    FOREIGN KEY (pelicula)
        REFERENCES peliculas (codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);