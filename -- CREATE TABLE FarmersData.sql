-- CREATE TABLE FarmersData
-- ( name varchar(250) NOT NULL,
--   address varchar(250) NOT NULL,
--   user_name varchar(250) NOT NULL,
--   password varchar(250),
--   mandalPinCode INT(250) NOT NULL,
--   mobile_number varchar(250) NOT NULL
-- );
-- CREATE TABLE CustomersDatatesting
-- ( name varchar(250) NOT NULL,
--   address varchar(250) NOT NULL,
--   user_name varchar(250) NOT NULL,
--   password varchar(250),
--   mandalPinCode INT(250) NOT NULL,
--   mobile_number varchar(250) NOT NULL
-- );
-- drop TABLE items;
CREATE TABLE items
(   item_name VARCHAR(250) NOT NULL,
    category VARCHAR(250)  NOT NULL,
    Cost VARCHAR(250) NOT NULL,
    MOBILE_NUMBER VARCHAR(250)  NOT NULL,
    QUANTITY VARCHAR(250) NOT NULL,
    IMG_PATH VARCHAR(250) NOT NULL,
    mandal_pincode VARCHAR(250) NOT NULL
);
-- CREATE TABLE Items
-- (
--     item_name VARCHAR(250) NOT NULL,
--     category VARCHAR(250)  NOT NULL,
--     Cost VARCHAR(250) NOT NULL,
--     MOBILE_NUMBER VARCHAR(250)  NOT NULL,
--     QUANTITY VARCHAR(250) NOT NULL,
--     IMG_PATH VARCHAR(250) NOT NULL,
-- );