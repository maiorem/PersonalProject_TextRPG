
create table player (
    pname varchar2(20),
    plevel number(10) not null,
    php number(10) not null,
    pattack number(10) not null,
    pdefense number(10) not null,
    pgold number(38) not null,
    pex number(38) not null,
    
    constraint P_NAME_PK primary key(pname)
);

desc player;