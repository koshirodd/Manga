create table if not exists manga(
	id int auto_increment,
	title varchar(100) primary key,
	author varchar(200),
	rate double
	
);