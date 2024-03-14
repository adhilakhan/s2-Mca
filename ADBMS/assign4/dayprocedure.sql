CREATE DEFINER=`root`@`localhost` PROCEDURE `day`(in dd date)
BEGIN
	select dayname(dd) as day_of_date;
END