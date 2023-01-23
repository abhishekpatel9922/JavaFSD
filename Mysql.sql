use banksystem;

--create table bankdemo(id int primary key auto_increment,BankName varchar(255) not null,BankLocation text not null);

--insert into bankdemo(BankName,BankLocation) values('Axis','Banglore'),('BOD','delhi');

/*Alter table customer modify customerphno bigint;

insert into customer(customername,customeremail,password,customerphno,customercardno) values('nishanth','nishanth@gmail.com','nishanth@123',8434510178,44437389746),('shreeram','shreeran@gmail.com','shreeram@123',9380853755,5566773322);



insert into account(accountno,accounttype,accountbalance,customerid) values(4567839790,'saving',10000,3),(4567839757,'saving',10000,5),(4567839756,'saving',10000,4);*/

--select customername,customeremail,accountno,accountbalance,accounttype from customer inner join account ON customer.id=account.customerid;
--create table banktable(name varchar(255) not null,address varchar(255) not null, bankcode int not null);
--create table Customertable(CustomerId int primary key auto_increment, CustomerName varchar(255),CustomerEmail varchar(255),CustomerPassword varchar(255),Customerphno bigint,  customercardno bigint);
--create table accounttables(bankid int,customerid int, accountnum bigint, accountbalance bigint, accounttype varchar(255));
--alter table accounttables add constraint bankid foreign key(bankid) references banktable(bankid);
alter table accounttables add constraint customerid foreign key(customerid) references customertable(customerid);

