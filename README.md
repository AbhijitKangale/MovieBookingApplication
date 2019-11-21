# MovieBookingApplication
This is POC for demonstrating back end application for online movie ticket booking.

Follow below instructions for authorization-server -->
1) First install mysql on your machine.
2) Provide required username/passowrd in application.yml file.
3) Run application from main class. It will create schema and required tables in mysql db.
4) For subsequent application runs, rename data.sql file in src/maini/resource folder to data.txt
5) For movie-service, mysql is required, also after the 1st run, for subsequesnt runs comment spring.jpa.hibernate.ddl-auto=create in application.properties file, run application from main class, use postman to insert data to Theatre and Showtimings and then proceed to add Movie details.
