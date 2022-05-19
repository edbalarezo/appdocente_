CREATE TABLE IF NOT EXISTS departamento (
  id SERIAL,
  area VARCHAR  NOT NULL,
  PRIMARY KEY (id)
  );

CREATE TABLE IF NOT EXISTS docente (
  id SERIAL,
  nombre VARCHAR (100) NOT NULL,
  cedula INT,
  edad INT,
  telefono INT,
  departamento_id INT,
  proyecto_id INT,
  PRIMARY KEY (id),
  FOREIGN KEY (departamento_id) REFERENCES departamento (id)
  );


 CREATE TABLE IF NOT EXISTS proyecto (
 id SERIAL,
 tema VARCHAR (100) NOT NULL,
 objetivos VARCHAR (100) NOT NULL,
 docente_id INT,
 PRIMARY KEY (id),
 FOREIGN KEY (docente_id) REFERENCES docente (id)
    );