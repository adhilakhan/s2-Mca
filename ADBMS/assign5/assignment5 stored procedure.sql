CREATE DEFINER=`root`@`localhost` PROCEDURE `Insertproduct`( in barcode int,in productname varchar(30),in price float,in quantityinstock int)
BEGIN
		if(price>0 && quantityinstock>=0)
		then
			insert into Product values(barcode,productname,price,quantityinstock);
		end if;
END