# Prueba Junior Parameta
#### Tabla employee
```
create table employee (
	id serial not null,
	first_name varchar(60),
	last_name varchar(60),
	type_document varchar(60),
	num_document varchar(60),
	birthday_date Date,
	date_joining_Company Date,
	job_title varchar(60),
	salary float,
	constraint pk_employee primary key(id)
);
```

- La tabla se creo en PostgreSQl, ya que en el pc de la empresa no tengo MySQL.
