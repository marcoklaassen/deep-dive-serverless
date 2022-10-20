create table Feedback (id bigint not null, rating integer, primary key (id)) engine=InnoDB;
create sequence feedback_id_seq start with 1 increment by 1;