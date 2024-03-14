CREATE DEFINER=`root`@`localhost` PROCEDURE `factorial`(in n int,out f int)
BEGIN
	set f =1;
    while n > 0
    do
		set f = f * n;
        set n = n - 1;
	end while;
END