show databases;
use person;
create database springSecurity;
use springSecurity;

create table user ( 
id INT NOT NULL AUTO_INCREMENT primary key,
active boolean,
password varchar(20),
roles varchar(10),
user_name varchar(20));

insert into user values (1,true, 'pass', 'ROLE_USER', 'user');
insert into user values (2,true, 'pass', 'ROLE_ADMIN', 'admin');

select * from user;
