create database productsales;
use productsales;
create table Product (
Product_id int primary key,
Product_name varchar(50),
Price decimal(8,2),
Quantity_in_stock int);
create table Sale(
sales_id int primary key,
delivery_address text);
create table Sale_item(
sale_id int,
product_id int,
quantity int,
Primary key (sale_id,product_id),
foreign key (sale_id) references Sale(sales_id),
foreign key (product_id) references Product(Product_id));  


create trigger Update_Available_Quantity 
After insert on Sale_item for each row
update Product set Quantity_in_stock =Product.Quantity_in_stock - new.quantity where Product_id=new.product_id;


insert into sale_item values(4,104,2);