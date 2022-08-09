INSERT INTO Users (userid, name, email, role) VALUES (1, 'drake', 'drake@admin.com', 'admin');
INSERT INTO Users (userid, name, email, role) VALUES (2, 'justin', 'justin@user.com', 'user');
INSERT INTO Users (userid, name, email, role) VALUES (3, 'khaled', 'khaled@user.com', 'user');

INSERT INTO Book (bookid, book_name) VALUES (1, 'GoodBook');
INSERT INTO Book (bookid, book_name) VALUES (2, 'ImpressiveBook');

INSERT INTO Book_User (id, bookid, userid) VALUES (1, 1, 2);
INSERT INTO Book_User (id, bookid, userid) VALUES (1, 2, 3);

INSERT INTO Security (securityid, isin, cusip, issuer, maturity_date, coupon, typeval, facevalue, status) VALUES (1, 'US0378331005', '02079K107', 'Google', '2020-10-09', 4.5, 'type1', 10, 'MATURED');
INSERT INTO Security (securityid, isin, cusip, issuer, maturity_date, coupon, typeval, facevalue, status) VALUES (1, 'US0377331005', '13070P107', 'DB', '2023-10-09', 5.6, 'type2', 5, 'UNMATURED');

INSERT INTO Counter_Party (counterpartyid, name) VALUES (1, 'BigCounterParty');
INSERT INTO Counter_Party (counterpartyid, name) VALUES (2, 'LargeCounterParty');

INSERT INTO Trade (tradeid, bookid, counterpartyid, securityid, quantity, status, price, buy_sell, trade_date, settlement_date) VALUES (1, 1, 1, 1, 1, 'CREATED', 20, 'buy', '2021-10-09', '2022-10-09');
INSERT INTO Trade (tradeid, bookid, counterpartyid, securityid, quantity, status, price, buy_sell, trade_date, settlement_date) VALUES (2, 2, 2, 2, 1, 'SETTLED', 10, 'sell', '2021-10-09', '2021-11-11');
