DROP TABLE IF EXISTS Users;
DROP TABLE IF EXISTS Book;
DROP TABLE IF EXISTS Book_User;
DROP TABLE IF EXISTS Counter_Party;
DROP TABLE IF EXISTS Security;
DROP TABLE IF EXISTS Trade;

CREATE TABLE Users (
userid INT primary key,
name VARCHAR(250) NOT NULL,
email VARCHAR(250),
role VARCHAR(250)
);

CREATE TABLE Book (
bookid INT primary key, 
book_name VARCHAR(250) NOT NULL
);

CREATE TABLE Book_User (
id INT primary key,
bookid INT, 
userid INT,
FOREIGN KEY (bookid) REFERENCES Book(bookid),
FOREIGN KEY (userid) REFERENCES Users(userid)
);

CREATE TABLE Security (
securityid INT primary key, 
isin VARCHAR(250), 
cusip VARCHAR(250), 
issuer VARCHAR(250), 
maturity_date DATE,
coupon FLOAT, 
typeval VARCHAR(250), 
facevalue INT, 
status VARCHAR(250)
);

CREATE TABLE Counter_Party (
counterpartyid INT primary key , 
name  VARCHAR(250) 
);

CREATE TABLE Trade (
tradeid INT primary key, 
bookid INT,
counterpartyid INT,
securityid INT , 
quantity INT,
status VARCHAR(250),
price FLOAT,
buy_sell  VARCHAR(250),
trade_date DATE,
settlement_date DATE,
FOREIGN KEY (bookid) REFERENCES Book(bookid),
FOREIGN KEY (counterpartyid) REFERENCES Counter_Party(counterpartyid),
FOREIGN KEY (securityid) REFERENCES Security(securityid)
);
