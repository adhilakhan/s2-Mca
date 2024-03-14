CREATE DEFINER=`root`@`localhost` PROCEDURE `Number`(in num int)
BEGIN
	declare result varchar(20);
	if(num >0)
    then
		set result="Number is Positive ";
    elseif(num <0)
	then
        set result="Number is Negative ";
	else
		set result="Number is Zero "; 
	end if;
    select result;
END