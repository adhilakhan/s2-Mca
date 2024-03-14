CREATE DEFINER=`root`@`localhost` PROCEDURE `OddEven`(in num int)
BEGIN
	declare f varchar(20);
	if (num % 2 = 0)
    then
		set f ="Even Number";
	else
		set f ="Odd Number";
	end if;
    select f;
END