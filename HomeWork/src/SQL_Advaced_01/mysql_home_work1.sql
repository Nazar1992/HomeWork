create table shop(id int auto_increment primary key, shop_name varchar(30),
description varchar(200));

create table commodity(id int auto_increment primary key, commodity_name varchar(30),
price dec(10,2));

create table seller(id int auto_increment primary key, first_name varchar(30),
second_name varchar(30), age int, id_shop int);

create table customer(id int auto_increment primary key, first_name varchar(30),
second_name varchar(30), age int, money dec(10,2));

alter table seller add constraint foreign key(id_shop) references shop(id);

create table commodity_shop(id_commodity int, id_shop int);

alter table commodity_shop add constraint FK_id_commodity foreign key(id_commodity)
references commodity(id);

alter table commodity_shop add constraint FK_id_shop foreign key(id_shop)
references shop(id);

create table shop_customer(id_shop int, id_customer int);

alter table shop_customer add constraint FK_shop_customer_id_shop foreign key(id_shop)
references shop(id);

alter table shop_customer add constraint FK_id_customer foreign key(id_customer)
references customer(id);

insert into shop(shop_name, description) values ('comfy','recomended'),
('rozetka','recomended'),
('magaz','amazing');

insert into commodity(commodity_name, price) values ('potato', 4.30),
('orange', 23.80),
('garlic', 6.50),
('phone', 1111.50),
('TV', 2300.30),
('laptop', 12000),
('guitar', 1200),
('oil', 35.90);

insert into customer(first_name, second_name, age, money) values ('vova', 'bigun', 23, 1000.13),
('anton', 'ivanov', 28, 10300),
('jora', 'sokol', 16, 100.235),
('masha', 'malikov', 53, 10324),
('julia', 'cmirnov', 54, 104.3),
('ivan', 'razin', 13, 112453);

insert into seller(first_name, second_name, age, id_shop) values ('mila', 'lubava',24, 1),
('antonina', 'rid',42, 2),
('roza', 'mukina',43, 3),
('ira', 'mizur',31, 2),
('galja', 'kisla',54, 2),
('luda', 'nilkina',19, 1),
('tanja', 'bogatobor',78, 1);

insert into commodity_shop(id_commodity, id_shop) values (5,2),
(6,2),
(1,1),
(2,1),
(3,1),
(4,3),
(7,3),
(8,3),
(1,3);