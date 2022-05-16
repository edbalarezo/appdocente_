CREATE TABLE IF NOT EXISTS docente (
  id SERIAL,
  nombre VARCHAR (100) NOT NULL,
  cedula INT,
  edad INT,
  telefono INT,
  PRIMARY KEY (id)
  );

CREATE TABLE IF NOT EXISTS departamento (
  id SERIAL,
  area VARCHAR  NOT NULL,
  PRIMARY KEY (id)
  );

 CREATE TABLE IF NOT EXISTS proyecto (
 id SERIAL,
 tema VARCHAR (100) NOT NULL,
 objetivos VARCHAR (100) NOT NULL,
 PRIMARY KEY (id)
    );