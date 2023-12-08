create database empresa;
use empresa;
drop database empresa;

create table tb_department(
	id bigint primary key not null auto_increment,
    name varchar(50)
);

INSERT INTO tb_department(name) VALUES 
('Gestão'),
('Informática');

desc tb_department;
select * from tb_department;

create table tb_user(
	id int primary key auto_increment not null,
    name varchar(100),
    email varchar(100),
    department_id bigint,
    
    foreign key(department_id) references tb_department(id)
);

INSERT INTO tb_user(name, email, department_id) VALUES
('Maria', 'maria@gmail.com', 1),
('Bob', 'bob@gmail.com', 1),
('Alex', 'alex@gmail.com', 2),
('Ana', 'ana@gmail.com', 2);

describe tb_user;
select * from tb_user;