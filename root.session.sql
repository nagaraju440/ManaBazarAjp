-- CREATE TABLE FarmersData
-- ( name varchar(250) NOT NULL,
--   address varchar(250) NOT NULL,
--   user_name varchar(250) NOT NULL,
--   password varchar(250),
--   mandalPinCode INT(250) NOT NULL,
--   mobile_number varchar(250) NOT NULL
-- );
-- CREATE TABLE CustomersData
-- ( name varchar(250) NOT NULL,
--   address varchar(250) NOT NULL,
--   user_name varchar(250) NOT NULL,
--   password varchar(250),
--   mandalPinCode INT(250) NOT NULL,
--   mobile_number varchar(250) NOT NULL
-- );
-- DROP TABLE items
CREATE TABLE items
(
    item_name VARCHAR(250) NOT NULL,
    category VARCHAR(250)  NOT NULL,
    Cost VARCHAR(250) NOT NULL,
    MOBILE_NUMBER VARCHAR(250)  NOT NULL,
    QUANTITY VARCHAR(250) NOT NULL,
    IMG_PATH VARCHAR(250) NOT NULL,
    mandalPinCode VARCHAR(250) NOT NULL,
    isTaken INT(190) NOT NULL,
    isDeleted  INT(190) NOT NULL,
    currentTime VARCHAR(250)  NOT NULL,
    currentDate VARCHAR(250)  NOT NULL
 );
--  CREATE TABLE AdminItems(
--       englishName VARCHAR(250) NOT NULL,
--     teluguName VARCHAR(250)  NOT NULL,
--     yourCost VARCHAR(250) NOT NULL,
--     otherCost VARCHAR(250)  NOT NULL,
--     Stock INT(10) NOT NULL,
--     pinCode VARCHAR(250) NOT NULL
--  )