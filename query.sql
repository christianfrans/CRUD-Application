create table goods(
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(200) NOT NULL,
    goods_name varchar(200) NOT NULL,
    category varchar(200) NOT NULL,
    incoming datetime NOT NULL,
    stock int,
    price bigint,
    status varchar(1) DEFAULT '1'
);

create table outcoming(
    id int AUTO_INCREMENT PRIMARY KEY,
    name varchar(200) NOT NULL,
    product_id int,
    FOREIGN KEY (product_id) REFERENCES goods(id),
    address varchar(200),
    total int,
    outcoming date NOT NULL,
    income bigint
);