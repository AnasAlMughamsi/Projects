create database ecomwebapp_sportyshoes_webapp;

use ecomwebapp_sportyshoes_webapp;

create table eproduct( id int(11) NOT NULL AUTO_INCREMENT, name varchar(100) ,price decimal(10,2),dateAdded timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP, primary key(`id`) );

insert into eproduct(id,name,price) values (1,'Nike Shoes',1050.23);
insert into eproduct(id,name,price) values (2,'Adidas Shoes',4700.23);
insert into eproduct(id,name,price) values (3,'Avia Shoes',2700.00);
insert into eproduct(id,name,price) values (4,'Campus Shoes',9700.73);

create table euser( id int(11) NOT NULL AUTO_INCREMENT, username varchar(100) ,password varchar(100),role varchar(100),dateAdded timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP, primary key(`id`) );

insert into euser(id,username,password,role) values (1,'anushka@gmail.com','@nushka123','customer');
insert into euser(id,username,password,role) values (2,'anu@gmail.com','@nu123','customer');
insert into euser(id,username,password,role) values (3,'nancy@gmail.com','n@ncy123','customer');
insert into euser(id,username,password,role) values (4,'rishika@gmail.com','rishi','customer');