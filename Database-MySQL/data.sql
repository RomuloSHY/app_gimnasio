BEGIN;

INSERT INTO membresia(tipo, precio, duracion_meses)
VALUES
('mensual', 100.0, 1),
('anual', 1000.0, 12),
('bimestral', 190.0, 2);

INSERT INTO alumno(nombre, apellido, dni, telefono, fecha_registro, estado, membresia_id) 
VALUES
('Luis', 'Ruiz', '72453622', '987656884', '2026-01-02', 'activo', 1),
('Mario', 'Castillo', '75412658', '998564112', '2026-05-02', 'activo', 2),
('Andrea', 'Alvarez', '23568495', '912254468', '2026-02-01', 'activo', 3);

COMMIT;