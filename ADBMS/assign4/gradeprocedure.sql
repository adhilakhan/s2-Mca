CREATE DEFINER=`root`@`localhost` PROCEDURE `grade`(in mark int)
BEGIN
	declare result varchar(20);
	if(mark >=90)
    then
		set result="S grade ";
    elseif(mark >=80)
	then
        set result="A grade ";
	elseif(mark >=70)
	then
        set result="B grade ";
	elseif(mark >=60)
	then
        set result="c grade ";
	elseif(mark >=50)
	then
        set result="D grade "; 
	else
		set result="Failed "; 
	end if;
    select result;
END