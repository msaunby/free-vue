# Preparing a database using SQL Server

You can connect to many different databases from a Java application. In this example we will connect to an SQL Server database, such as the free SQL Server Express.

Before we can connect to the database from Java we need to ensure we have enabled TCPIP connections, usually or port 1433, and have database user and
password.  The file setup.sql includes example commands for doing exactly this  you should read the comments too.  Or you might choose to do this through the SQL server admin tool.

Check you can connect via TCP from the CMD terminal window. Like this -

 ``` 
 U:\>sqlcmd -S .\SQLEXPRESS,1433 -U UserName -P PassWord
 1>
```

If that works then connecting from Java should now be easy.  If it didn't you will need to fix this before moving on.

