use mbasic;
create table join_userban(
no int not null auto_increment primary key,
name varchar(20) not null,
ban char(2));
desc join_userban;

insert into join_userban(name, ban) values ('first', 'A');
insert into join_userban(name, ban) values ('second', 'B');
insert into join_userban(name, ban) values ('third', 'A');
insert into join_userban(name, ban) values ('fourth', 'C');
insert into join_userban(name, ban) values ('fifth', 'B');
insert into join_userban(name, ban) values ('sixth', 'C');
insert into join_userban(name, ban) values ('fifth', 'B');
insert into join_userban(name, ban) values ('sixth', 'C');
select * from join_userban;

update join_userban set ban='D' where no >= 7;

delete from join_userban where no >= 7;

select ban, count(*) `학생 수`
from join_userban
group by ban;