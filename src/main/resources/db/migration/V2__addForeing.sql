ALTER TABLE docente
    ADD COLUMN departamento_id INT;

ALTER TABLE docente
    ADD FOREIGN KEY (departamento_id) REFERENCES departamento(id);
