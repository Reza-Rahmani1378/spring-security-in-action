# Spring Security in Action
A personal practice to cover Spring Security  Based on [this](https://www.amazon.com/Spring-Security-Action-Laurentiu-Spilca/dp/1617297739/ref=sr_1_1?crid=2060OOU6YFSIZ&keywords=Spring+Security+in+action&qid=1659789697&s=books&sprefix=spring+security+in+action%2Cstripbooks-intl-ship%2C274&sr=1-1) book

![image](https://img.fruugo.com/product/8/86/313921868_max.jpg)

## Table of Contents
1. [Security Today](#security_today)
2. [Hello Spring Securiy](#hello_spring_scurity)
3. [Managing users](#managing_users)
4. [Dealing with passwords](#dealing_with_passwords)
5. [Implementing authentication](#implementing_authentication)
6. [Hands-on:A small secured web application](#secured_web)
7. [Configuring authorization: Restricting access](#config_authorization)
8. [Configuring authorization: Applying restrictions](#config_authorization_applying)
9. [Implementing filters](#filters)
10. [Applying CSRF protection and CORS](#CSRF_CORS)
11. [Hands on: A separation of responsibilities](#separation)
12. [How does OAuth2 work?](#oauth)
13. [OAuth2: Implementing the authorization server](#authorization_server)
14. [OAuth2: Implementing the resource server](#resource_server)
15. [OAuth2: Using JWT and cryptographic signatures](#using_jwt)
16. [Global method security:Pre- and postauthorizations](#global_method_postauthorizations)
17. [Global method security:Pre- and postfiltering](#global_method_postfiltering)
18. [Hands-on:An OAuth 2 application](#oauth_application)
19. [Spring Security for reactive apps](#security_reactive)
20. [Spring Security testing](#security_testing)


## Contents to cover in detail
### 1. Security Today <a name="security_today"></a>
- [x] Spring Security: The what and the why
- [ ] What is software security?
- [ ] Why is security important?
- [ ] Common security vulnerabilities in web applications
- [ ] Security applied in various architectures
- [ ] What will you learn in this book?
### 2. Hello Spring Securiy <a name="hello_spring_scurity"></a>
- [ ] Starting with the first project
- [ ] Which are the default configurations?
- [ ] Overriding default configurations
### 3. Managing users  <a name="managing_users"></a>
- [ ] Implementing authentication in Spring Security
- [ ] Describing the user
- [ ] Instructing Spring Security on how to manage users
### 4. Dealing with passwords  <a name="dealing_with_passwords"></a>
- [ ] Understanding the PasswordEncoder contract 
- [ ] More about the Spring Security Crypto module 
### 5. Implementing authentication  <a name="implementing_authentication"></a>
- [ ] Understanding the AuthenticationProvider
- [ ] Using the SecurityContext
- [ ] Understanding HTTP Basic and form-based login authentications 
### 6. Hands-on:A small secured web application <a name="secured_web"></a>
- [ ] Project requirements and setup
- [ ] Implementing user management 
- [ ] Implementing custom authentication logic
- [ ] Implementing the main page 
- [ ] Running and testing the application 
### 7. Configuring authorization: Restricting access <a name="config_authorization"></a>
- [ ] Restricting access based on authorities and roles
### 8. Configuring authorization: Applying restrictions <a name="config_authorization_applying"></a>
- [ ] Using matcher methods to select endpoints 
- [ ] Selecting requests for authorization using MVC matchers 
- [ ] Selecting requests for authorization using Ant matchers
- [ ] Selecting requests for authorization using regex matchers 
### 9. Implementing filters <a name="filters"></a>
- [ ] Implementing filters in the Spring Security architecture 
- [ ] Adding a filter before an existing one in the chain 
- [ ] Adding a filter after an existing one in the chain 
- [ ] Adding a filter at the location of another in the chain 
- [ ] Filter implementations provided by Spring Security 
### 10. Applying CSRF protection and CORS <a name="CSRF_CORS"></a>
- [ ] Applying cross-site request forgery (CSRF) protection in applications  
- [ ] Using cross-origin resource sharing 
### 11. Hands on: A separation of responsibilities <a name="separation"></a>
- [ ] The scenario and requirements of the example 
- [ ] Implementing and using tokens 
- [ ] Implementing the authentication server 
- [ ] Implementing the business logic server
### 12. How does OAuth2 work? <a name="oauth"></a>
- [ ] The OAuth 2 framework 
- [ ] The components of the OAuth 2 authentication architecture
- [ ] Implementation choices with OAuth 2
- [ ] The sins of OAuth 2
- [ ] Implementing a simple single sign-on application
### 13. OAuth2: Implementing the authorization server <a name="authorization_server"></a>
- [ ] Writing your own authorization server implementation
- [ ] Defining user management 
- [ ] Registering clients with the authorization server 
- [ ] Using the password grant type
- [ ] Using the authorization code grant type
- [ ] Using the client credentials grant type
- [ ] Using the refresh token grant type
### 14. OAuth2: Implementing the resource server <a name="resource_server"></a>
- [ ] Implementing a resource server 
- [ ] Checking the token remotely 
- [ ] Implementing blackboarding with a JdbcTokenStore
- [ ] A short comparison of approaches 
### 15. OAuth2: Implementing the resource server <a name="using_jwt"></a>
- [ ] Using tokens signed with symmetric keys with JWT
- [ ] Using tokens signed with asymmetric keys with JWT 
- [ ] Adding custom details to the JWT 
### 16. Global method security:Pre- and postauthorizations <a name="global_method_postauthorizations"></a>
- [ ] Enabling global method security 
- [ ] Applying preauthorization for authorities and roles 
- [ ] Applying postauthorization 
- [ ] Implementing permissions for methods 
### 17. Global method security:Pre- and postfiltering <a name="global_method_postfiltering"></a>
- [ ] Applying prefiltering for method authorization
- [ ] Applying postfiltering for method authorization 
- [ ] Using filtering in Spring Data repositories
### 18. Hands-on:An OAuth 2 application <a name="oauth_application"></a>
- [ ] The application scenario
- [ ] Configuring Keycloak as an authorization server 
- [ ] Implementing the resource server 
- [ ] Testing the application
### 19. Spring Security for reactive apps <a name="security_reactive"></a>
- [ ] What are reactive apps? 
- [ ] User management in reactive apps 
- [ ] Configuring authorization rules in reactive apps 
- [ ] Reactive apps and OAuth 2
### 20. Spring Security testing <a name="security_testing"></a>
- [ ] Using mock users for tests
- [ ] Testing with users from a UserDetailsService 
- [ ] Using custom Authentication objects for testing 
- [ ] Testing method security 
- [ ] Testing authentication 
- [ ] Testing CSRF configurations
- [ ] Testing CORS configurations
- [ ] Testing reactive Spring Security implementations

