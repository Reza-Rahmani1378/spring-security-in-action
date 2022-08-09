# Spring Security in Action
A personal practice to cover Spring Security  based on [this](https://www.amazon.com/Spring-Security-Action-Laurentiu-Spilca/dp/1617297739/ref=sr_1_1?crid=2060OOU6YFSIZ&keywords=Spring+Security+in+action&qid=1659789697&s=books&sprefix=spring+security+in+action%2Cstripbooks-intl-ship%2C274&sr=1-1) book

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
- [ ] Spring Security: The what and the why
- [ ] What is software security?
<<<<<<< HEAD
- [ ] Why is security important?
- [ ] Common security vulnerabilities in web applications
- [ ] Security applied in various architectures
- [ ] What will you learn in this book?
### 2. Complexity Analysis <a name="complexity_analysis"></a>
- [ ] Computational and Asymptotic Complexity
- [ ] Big-O Notation
- [ ] Properties of Big-O Notation
- [ ] Ω and Θ Notations
- [ ] Possible Problems
- [ ] Examples of Complexities
- [ ] Finding Asymptotic Complexity: Examples
- [ ] The Best, Average, and Worst Cases
- [ ] Amortized Complexity
- [ ] NP-Completeness
### 3. Linked Lists  <a name="linked_lists"></a>
- [ ] Singly Linked Lists
- [ ] Doubly Linked Lists
- [ ] Circular Lists
- [ ] Skip Lists
- [ ] Self-Organizing Lists 
- [ ] Sparse Tables 
- [ ] Lists in the Standard Template Library 
- [ ] Concluding Remarks 
- [ ] Case Study: A Library 
### 4. Stacks and Queues  <a name="stacks_and_queues"></a>
- [ ] Stacks 
- [ ] Queues 
- [ ] Priority Queues 
- [ ] Stacks in the Standard Template Library 
- [ ] Queues in the Standard Template Library 
- [ ] Priority Queues in the Standard Template Library 
- [ ] Deques in the Standard Template Library 
- [ ] Case Study: Exiting a Maze
### 5. Recursion  <a name="recursion"></a>
- [ ] Recursive Definitions 
- [ ] Function Calls and Recursion Implementation 
- [ ] Anatomy of a Recursive Call 
- [ ] Tail Recursion 
- [ ] Nontail Recursion 
- [ ] Indirect Recursion 
- [ ] Nested Recursion 
- [ ] Excessive Recursion 
- [ ] Backtracking 
- [ ] Concluding Remarks 
- [ ] Case Study: A Recursive Descent Interpreter 
### 6. Binary Trees <a name="binary_trees"></a>
- [ ] Trees, Binary Trees, and Binary Search Trees 
- [ ] Implementing Binary Trees 
- [ ] Searching a Binary Search Tree 
- [ ] Tree Traversal 
- [ ] Insertion 
- [ ] Deletion 
- [ ] Balancing a Tree 
- [ ] Self-Adjusting Trees 
- [ ] Heaps 
- [ ] Treaps 
- [ ] k-d Trees 
- [ ] Polish Notation and Expression Trees 
- [ ] Case Study: Computing Word Frequencies 
### 7. Multiway Trees <a name="multiway_trees"></a>
- [ ] The Family of B-Trees 
- [ ] Tries
- [ ] Concluding Remarks
- [ ] Case Study: Spell Checker
### 8. Graphs <a name="graphs"></a>
- [ ] Graph Representation 
- [ ] Graph Traversals 
- [ ] Shortest Paths 
- [ ] Cycle Detection 
- [ ] Spanning Trees 
- [ ] Connectivity 
- [ ] Topological Sort 
- [ ] Networks 
- [ ] Matching 
- [ ] Eulerian and Hamiltonian Graphs 
- [ ] Graph Coloring 
- [ ] NP-Complete Problems in Graph Theory 
- [ ] Case Study: Distinct Representatives 
### 9. Sorting <a name="sorting"></a>
- [ ] Elementary Sorting Algorithms 
- [ ] Decision Trees 
- [ ] Efficient Sorting Algorithms 
- [ ] Sorting in the Standard Template Library 
- [ ] Concluding Remarks 
- [ ] Case Study: Adding Polynomials 
### 10. Hashing <a name="hashing"></a>
- [ ] Hash Functions  
- [ ] Collision Resolution 
- [ ] Deletion
- [ ] Perfect Hash Functions 
- [ ] Rehashing
- [ ] Hash Functions for Extendible Files 
- [ ] Case Study: Hashing with Buckets
### 11. Data Compression <a name="data_compression"></a>
- [ ] Conditions for Data Compression 
- [ ] Huffman Coding 
- [ ] Run-Length Encoding 
- [ ] Ziv-Lempel Code 
- [ ] Case Study: Huffman Method with Run-Length Encoding
### 12. Memory Management <a name="memory_management"></a>
- [ ] The Sequential-Fit Methods 
- [ ] The Nonsequential-Fit Methods 
- [ ] Garbage Collection 
- [ ] Concluding Remarks 
- [ ] Case Study: An In-Place Garbage Collector
### 13. String Matching <a name="string_matching"></a>
- [ ] Exact String Matching 
- [ ] Approximate String Matching 
- [ ] Case Study: Longest Common Substring 
=======
- [ ] Overriding default configurations
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
### 15. OAuth2: Using JWT and cryptographic signatures <a name="using_jwt"></a>
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
>>>>>>> ee8d703 (Refactor)
