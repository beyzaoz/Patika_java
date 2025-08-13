package Week_5_Projects.InnerClass;

 class Employee {
     private String employee1 = "Ebru Halici";
     private String employee2 = "Savas Ali";
     class ContactInfo{
         private String phone1 = "3465897643";
         private String phone2= "3465696659";
         private String email1 = "patika@gmail.com";
         private String email2 = "Helin@gmail.com";
         void  printInfos(){
             System.out.println(employee1+" "+phone1+" "+email1);
             System.out.println(employee2+ " "+ phone2+ " "+ email2);
         }

    }
}
