create table product_category ( 
	p_cat_id INT(100) PRIMARY KEY auto_increment, 
	p_cat_code varchar(255) unique,
	dt_create TIMESTAMP DEFAULT CURRENT_TIMESTAMP, 
	dt_modify TIMESTAMP DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP, 
	category_name VARCHAR(255),
	is_active INT(10) DEFAULT 1 
);
drop table product_category;


insert into product_category (p_cat_code,category_name) values ('CT1', 'Tax');
insert into product_category (p_cat_code,category_name) values ('CT2', 'Legal');
insert into product_category (p_cat_code,category_name) values ('CT3', 'Valuation');



insert into product_category (p_cat_code,category_name) values ('CT4', 'Property');
insert into product_category (p_cat_code,category_name) values ('CT5', 'Loan');
insert into product_category (p_cat_code,category_name) values ('CT6', 'Insvestment');
insert into product_category (p_cat_code,category_name) values ('CT7', 'Insurance');

select
*
from product_category
;


insert into product_category (p_cat_code,category_name) values ('CT4', 'Property');
insert into product_category (p_cat_code,category_name) values ('CT5', 'Loan');
insert into product_category (p_cat_code,category_name) values ('CT6', 'Insvestment');
insert into product_category (p_cat_code,category_name) values ('CT7', 'Insurance');

drop table product_category;
insert into product_category (p_cat_code,category_name) values ('CT4', 'Property');
insert into product_category (p_cat_code,category_name) values ('CT5', 'Loan');
insert into product_category (p_cat_code,category_name) values ('CT6', 'Insvestment');
insert into product_category (p_cat_code,category_name) values ('CT7', 'Insurance');