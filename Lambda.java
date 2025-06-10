// after using the anotation of functinal interface we can not write 2 abstract method in that interface

// functional interface allow only one abstract method in the interface and can have multiple default and static method   

@FunctionalInterface
 interface phone {
    void call(); 
}

// lambda expression is use wen we know the name of method 
// lambda function main aim is to reduce the line of code 
// if the there is one line only in the lambda expresssion there no use of parenthesis allowed


 class Lambda {
    public static void main(String[] args) {
        // arguments are managed in the () 
        phone p =() ->System.out.println("Lambda function");
        p.call();

        // if there is argument for method in the functional interface than the code will be
       /*
         phone p =(int no,float no1) ->System.out.println("Lambda function");
         p.call();
        
        */

        // if there is only the one argument is there than no use of harenthesis also allowed

        /*
          phone p = no ->System.out.println("Lambda function");
          p.call();

         */

    }

    
      
}
