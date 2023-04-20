# Step to Run

1. Run UserRepositoryTest (src/test/java/com/example/demo) -> to insert data user
2. Hit Endpoint ("/login")
With request body :
`{
    "email": "dedi@test.user",    
    "password": "password"
}`
3. Use access token to hit endpoint ("/jobs") and ("job/{id}")
