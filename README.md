# SOA_GraphQL
Project SOA_GraphQL
1- run server tomcat
2- open Postman : 
   1- POST : http://localhost:8080/GraphQLLogement/graphql
   1- body : GraphQL
   1- in query :   {

  } getallrendezVous{
        id date
    }
    } 

- send
- mutation : mutation {
    createLogement() {
    reference : Int
    adresse :String
    delegation : String
    gouvernorat :String
    type : Type
    description : String
    prix :Float 
    }
}
