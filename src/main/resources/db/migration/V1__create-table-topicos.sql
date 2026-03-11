CREATE TABLE topicos (
                         id BIGINT NOT NULL AUTO_INCREMENT,
                         titulo VARCHAR(200) NOT NULL UNIQUE,
                         mensaje VARCHAR(500) NOT NULL UNIQUE,
                         fecha_creacion DATETIME NOT NULL,
                         estatus VARCHAR(100) NOT NULL,
                         autor VARCHAR(100) NOT NULL,
                         curso VARCHAR(100) NOT NULL,

                         PRIMARY KEY(id)
);