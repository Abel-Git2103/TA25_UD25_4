DROP table IF EXISTS Sala;
DROP table IF EXISTS Pelicula;

create table Pelicula (
	Codigo int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nombre nvarchar(100) DEFAULT NULL,
    Calificacion_edad int DEFAULT NULL
    );
    
create table Sala (
    codigo int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nombre nvarchar(100) DEFAULT NULL,
    Pelicula int DEFAULT NULL,
    FOREIGN KEY (Pelicula) REFERENCES Pelicula (codigo) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Pelicula (Nombre, Calificacion_edad) VALUES ('SCREAM',18);
insert into Sala (Nombre, Pelicula) VALUES ('SALA 01',1);
