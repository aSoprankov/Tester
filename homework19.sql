create database if not exists homework19;

create table if not exists homework19.students
(
    `id`       int auto_increment,
    `name`     varchar(255) not null,
    `group_id` int          not null,
    `date`     varchar(255) not null,

    constraint id
        primary key (id)
)
    auto_increment = 0;


create table if not exists homework19.points
(
    `id`         int unsigned auto_increment,
    `student_id` int unique   not null,
    `subject_id` int unsigned not null,
    `point`      int unsigned not null,

    constraint id
        primary key (id)
)
    auto_increment = 1000;

create table if not exists homework19.groups
(
    `id`    int,
    `group` varchar(255) not null,

    constraint id
        primary key (id)
);

create table if not exists homework19.subjects
(
    `id`         int unsigned auto_increment,
    `subject`    varchar(255) not null,
    `teacher_id` int unsigned not null,
    `semester`   int unsigned not null,
    `year`       year         not null,

    constraint id
        primary key (id)
)
    auto_increment = 3000;

create table if not exists homework19.teachers
(
    `id`            int unsigned auto_increment,
    `name`          varchar(255) not null,
    `department_id` int unsigned not null,

    constraint id
        primary key (id)
)
    auto_increment = 4000;

create table if not exists homework19.departments
(
    `id`      int unsigned auto_increment,
    `name`    varchar(255) not null,
    `manager` varchar(255) not null,

    constraint id
        primary key (id)
)
    auto_increment = 5000;

alter table homework19.students
    add foreign key (group_id) references homework19.groups (id);

alter table homework19.points
    add foreign key (student_id) references homework19.students (id);

alter table homework19.teachers
    add foreign key (department_id) references homework19.departments (id);

alter table homework19.subjects
    add foreign key (teacher_id) references homework19.teachers (id);

alter table homework19.points
    add foreign key (subject_id) references homework19.subjects (id);

insert into `groups` (id, `group`) value (1, 'group 1');
insert into `groups` (id, `group`) value (2, 'group 2');
insert into `groups` (id, `group`) value (3, 'group 3');

insert into `students` (id, `name`, `group_id`, `date`) value (1, 'Artur', 2, 2020);
insert into `students` (id, `name`, `group_id`, `date`) value (2, 'Ivan', 1, 2019);
insert into `students` (id, `name`, `group_id`, `date`) value (3, 'Artur', 3, 2021);
insert into `students` (id, `name`, `group_id`, `date`) value (4, 'Artem', 2, 2020);
