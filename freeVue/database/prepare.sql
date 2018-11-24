-- To run this script in VS Code
-- Connect to database. You can do this by pressing CTRL+SHIFT+E in this window
-- or from the command palette CTRL+SHIFT+P
-- 
-- Use this connection string
-- localhost\SQLEXPRESS
-- databaseName [leave empty]
-- SQL login
-- user VueAdmin
-- password fr33$7uE123

-- See https://docs.microsoft.com/en-us/sql/linux/sql-server-linux-develop-use-vscode?view=sql-server-2017


-- Create a new database called 'FREE_VUE'
USE master;
GO
-- Create the new database if it does not exist already
IF NOT EXISTS (
    SELECT name
        FROM sys.databases
        WHERE name = 'FREE_VUE'
)
CREATE DATABASE FREE_VUE;
GO



USE FREE_VUE;
GO

DROP TABLE VENUES;
GO

CREATE TABLE VENUES 
(
    VENUE_ID integer IDENTITY(1,1) PRIMARY KEY,
    NAME varchar(20)
);
GO

DROP TABLE FILMS;
GO

CREATE TABLE FILMS 
(
    FILM_ID integer PRIMARY KEY,
    TITLE varchar(20),
    DURATION INTEGER
);
GO

DROP TABLE SCREENINGS;
GO

CREATE TABLE SCREENINGS 
(
    SCREENING_ID integer IDENTITY(1,1) PRIMARY KEY,
    DATE DATETIME,
    FILM_ID integer,
    VENUE_ID integer
);
GO



-- Check what tables we have
SELECT * FROM information_schema.tables;
GO

-- Show the columns in the reports table
SELECT * FROM VENUES;
GO