create table product
(
	id			bigint				primary key identity,
	[name]		varchar(255)		not null,
	code		varchar(5)			not null unique,
	price		decimal(12,0)		not null,
	isDeleted	bit					not null default 0
)
go

insert into product([name], code, price) values
('Iphone 14',				'P0001',			18990000),
('Iphone 14 pro',			'P0002',			23000000),
('Iphone 14 pro max',		'P0003',			27000000),
('Oppo A98',				'P0004',			8990000),
('Samsung galaxy S23',		'P0005',			26990000);
go

select * from product;

