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
### Prueba Postman (POST = http://localhost:8081/api/save/employee)
```
{
    "firstName": "Andrew",
    "lastName": "Ramirez",
    "typeDocument": "Cedula de ciudadania",
    "numDocument": "1.151.958..723",
    "birthdayDate": "{{birthdatInput}}",
    "dateJoiningCompany": "{{companyDayInput}}",
    "jobTitle": "Developer",
    "salary": "{{salary}}"
}
```
- Configuración pre-request script
```
pm.environment.set('birthdatInput', "2013-10-25");
pm.environment.set('companyDayInput', "2021-02-22");
pm.environment.set('salary', 3.645);
```
