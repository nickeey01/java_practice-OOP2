public class Decision {
    int age;
    public Decision(int age) {
        this.age = age;
    }
        void checkAge() {
            if (age < 18) {
                System.out.println("No alcohol for underage persons");
            } else {
                System.out.println("Consume alcohol at your own risk");
            }
        }
            public static void main(String[]args){
            Decision person = new Decision(17);
            person.checkAge();
        }



    }