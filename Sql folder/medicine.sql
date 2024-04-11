drop table if exists medicine;

create table medicine
(
    m_code varchar(255) not null primary key,
    m_name varchar(255),
    m_component varchar(255),
    m_effect varchar(255),
    m_side_effect varchar(255),
    m_amount int(255),
    m_strong varchar(10)
);