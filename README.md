# Step to Run
# Create db "test_ptdans" or create yourself and updade the application.properties
# Create "users" table with column : 
# id bigint(20) not null primary key auto_increment;
# email varchar(255);
# password varchar(255);

1. Run UserRepositoryTest (src/test/java/com/example/demo) -> to insert data user
2. Hit Endpoint ("/login")
With request body :
`{
    "email": "dedi@test.user",    
    "password": "password"
}`
3. Use access token to hit endpoint ("/jobs") and ("job/{id}")
