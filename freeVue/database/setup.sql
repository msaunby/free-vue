-- This might need to be done from a Windows Admin account
USE master;
GO

CREATE LOGIN VueAdmin WITH PASSWORD = 'fr33$7uE123'
GO

IF NOT EXISTS (SELECT * FROM sys.database_principals WHERE name = N'VueAdmin')
BEGIN
    CREATE USER VueAdmin FOR LOGIN VueAdmin
    EXEC sp_addrolemember N'db_owner', N'VueAdmin'
END;
GO

-- This is required to enable the account to login if Window users only were 
-- enabled when SQL Server was installed. This works for SQL Server Express.

-- EXEC xp_instance_regwrite N'HKEY_LOCAL_MACHINE',N'Software\Microsoft\MSSQLServer\MSSQLServer', N'LoginMode', REG_DWORD,2
-- GO

-- Give permissions to everyone, or could just give them to PotholeAdmin.

-- GRANT CREATE DATABASE TO PUBLIC;
-- GRANT CREATE TABLE TO PUBLIC;
-- GO