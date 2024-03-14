create database Store;
use Store;
create table Product 
( Pdtid int primary key,
Pname varchar(30),
Price float,
Quantity int);

call Insertproduct(101,'Coffee',45,10);
call Insertproduct(102,'Tea',40,20);
call Insertproduct(103,'Chocolate',150,20);
call Insertproduct(104,'Milk',42,50);