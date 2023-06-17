# Blogging App( Spring boot )

## Development

### Database Setup


1. Create a database
2. Create a user
3. Create a password
4. Grant access to created database to user.

Usually when you setup a database on your local it gives access to all databases to root user.

#### Postgres

```postgres
create database blog;
create user blogadmin with encrypted password 'blogpass';
grant all privileges on database blog to blogadmin;
```

### MySQL

```mysql
create database blog;
create user 'blogadmin'@'localhost' idntified by 'blogpass';
grant all privileges on blog.* to 'blogadmin'@'localhost''
```


