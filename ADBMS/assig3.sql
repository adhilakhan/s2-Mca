create database University;

use University;

create table Student(
Name varchar(30),
student_number int primary key,
class int,
major varchar(30));

create table Course(
course_name varchar(30),
course_number varchar(10) primary key ,
credit_hours int,
department varchar(30));

create table Section(
section_identifier int primary key,
course_number varchar(10),
semester varchar(20),
years int,
instructor varchar(30),
foreign key (course_number) References Course(course_number));

create table Grade_report(
student_number int,
section_identifier int,
grade varchar(2),
foreign key (student_number) References Student(student_number),
foreign key (section_identifier) References Section(section_identifier) 
);
alter table Grade_report Add primary key(student_number,section_identifier);
drop table Grade_report;
create table Prerequisite(
course_number varchar(10) ,
prerequisite_number varchar(10),
foreign key (course_number) References Course(course_number)
);
alter table Prerequisite Add foreign key (prerequisite_number) References Course(course_number);
alter table Prerequisite Add primary key(course_number,prerequisite_number);

SELECT name,course_name,grade from Grade_report inner join Student on Grade_report.student_number=Student.student_number inner join Section on Grade_report.section_identifier=Section.section_identifier inner join Course on Section.course_number=Course.course_number where name="Smith";
select name,grade from student inner join Grade_report on Student.student_number=Grade_report.student_number inner join Section on Grade_report.section_identifier=Section.section_identifier inner join Course on Section.course_number=Course.course_number where semester="Fall" and years=08 and course_name="Database";
select course_name as prerequisite_name,prerequisite_number from Prerequisite inner join Course on Prerequisite.prerequisite_number=Course.course_number where Prerequisite.course_number=(select Course.course_number from Course where Course.course_name="Database") ; 
select name from student where major="CS" and class=4;
select course_name from section inner join Course on section.Course_number=Course.course_number where instructor="King" and years in (07,08);

select course_number,semester,years, instructor,count(student_number) from section inner join Grade_report on Section.section_identifier=Grade_report.section_identifier group by Grade_report.section_identifier having instructor="King";

select name,course.course_number,course_name,credit_hours,semester,years,grade from Student inner join grade_report on Student.student_number = Grade_report.student_number inner join Section on Grade_report.section_identifier=Section.section_identifier inner join course on Section.course_number=Course.course_number where class=4 and major="cs";

insert into Student values( "Jhonson",25,1,"MATH");

Update student set class=2 where name="Smith";

insert into Course values("Knowledge Engineering","CS4390",3,"CS");

delete from student where name="Smith" and student_number=17; 