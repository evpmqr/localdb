# A small example of setting up an in-memory h2 database with Hibernate functionality
## hibernate.cfg.xml file
You need this file to configure Hibernate.  
I will now be explaining the file    


You don't need to worry about this part
```
<?xml version="1.0" encoding="utf-8"?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
```

You should pay attention to some of the stuff in here though
```
<session-factory>
        <property name="hibernate.bytecode.use_reflection_optimizer">false</property>
        <property name="hibernate.connection.driver_class">org.h2.Driver</property>
        <property name="hibernate.connection.url">jdbc:h2:~/test</property>
        <property name="hibernate.connection.username">sa</property>
        <property name="hibernate.connection.password">sa</property>
        <property name="hibernate.dialect">org.hibernate.dialect.H2Dialect</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
        <property name="show_sql">true</property>
        <mapping class="com.evpmqr.db.model.Person"></mapping>
        <mapping class="com.evpmqr.db.model.Employee"></mapping>
</session-factory>
```
<br />
<br />
<br />
Ignore. You don't even need this

```
<property name="hibernate.bytecode.use_reflection_optimizer">false</property>
```
<br />
<br />
<br />
This is important. Since we are using an h2 databse, we need to specify the driver. If you want to change the 
databse to something like mysql, you will have to change the driver as well.

```
<property name="hibernate.connection.driver_class">org.h2.Driver</property>
```

<br />
<br />
<br />
This is the conection url. The ~/test is important here because it's the location and name of the db file
that will  be created. Right now it's being stored in your home directory: C:\Users\YOUR_USER named something like 
test.mv.db.

```
<property name="hibernate.connection.url">jdbc:h2:~/test</property>
```

<br />
<br />
<br />
Since we are using a local connection, just leave this as the default username and password. 
In the future you will be setting these to whatever your username and password is.

```
<property name="hibernate.connection.username">sa</property>
<property name="hibernate.connection.password">sa</property>
```

<br />
<br />
<br />
This is to specify the dialect. It changes depending on which databse you use. Since we are using h2, we specify that
we are using the H2Dialect.

```
<property name="hibernate.dialect">org.hibernate.dialect.H2Dialect</property>
```

<br />
<br />
<br />
Refer to [link](https://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#configurations-hbmddl)

```
<property name="hibernate.hbm2ddl.auto">update</property>
```

<br />
<br />
<br />
This is an optional option that shows the sql query. You don't need to know it

```
<property name="show_sql">true</property>
```

<br />
<br />
<br />
Depending on how many models you have, this will change. In this case however, I have two classes.
They are both tables within my database.

```
<mapping class="com.evpmqr.db.model.Person"></mapping>
<mapping class="com.evpmqr.db.model.Employee"></mapping>
```

# Model Objects
todo