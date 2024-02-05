package Test;

public class Contact {
    private String name;
    private String lastName;
    private String email;
    private String telephone;
    private String street;
    private String age;
    private Contact(ContactBuilder contactBuilder){
        this.name = contactBuilder.name;
        this.lastName = contactBuilder.lastName;
        this.email = contactBuilder.email;
        this.telephone = contactBuilder.telephone;
        this.street = contactBuilder.street;
        this.age = contactBuilder.age;
    }
//    public static ContactBuilder builder(){
//        return new ContactBuilder();
//    }
    public static class ContactBuilder{
        private String name;
        private String lastName;
        private String email;
        private String telephone;
        private String street;
        private String age;



        public ContactBuilder withName(String name){
            this.name = name;
            return this;
        }
        public ContactBuilder withAge(String age){
            this.age = age;
            return this;
        }
        public ContactBuilder withEmail(String email){
            this.email = email;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }


    }
}
