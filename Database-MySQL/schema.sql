CREATE TABLE membresia(
	id bigint auto_increment primary key,
	tipo varchar(30) not null,
	precio decimal(10,2) not null,
	duracion_meses int not null
);

CREATE TABLE cliente(
	id bigint auto_increment primary key,
	nombre varchar(50) not null,
	apellido varchar(50) not null,
	dni varchar(8) not null,
	telefono varchar(15) not null,
	fecha_registro date default (current_date),
	estado varchar(20) default 'activo',
	membresia_id bigint not null, 
	
	constraint unique_dni
	unique (dni),
 
	constraint fk_membresia_id 
	foreign key (membresia_id) 
	references membresia(id)
); 