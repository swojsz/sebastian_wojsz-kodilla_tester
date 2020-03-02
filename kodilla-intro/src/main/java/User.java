public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        User ola = new User("Ola", 5);
        User janek = new User("Janek", 49);
        User marek = new User("Marek", 8);
        User mateusz = new User("Mateusz", 35);
        User wojtek= new User("Wojtek", 12);
        User anka = new User("Anka", 63);
        User monika = new User("Monika", 74);

        User[] users = {ola, janek, marek, mateusz, wojtek, anka, monika};

        int result = 0;
        for (User user : users) {
            result = result + user.age;
//            System.out.println(user.name);
        }
        int averageOfAge = result / users.length;

        System.out.println("Średnia wieku:" + " " + averageOfAge);
        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageOfAge) {
                System.out.println("Uzytkownik poniżej średniej:" +  users[i].name +" "+ users[i].age);
            } else if (users[i].age == averageOfAge){
                System.out.println("Uzytkownik w wieku średniej wieku:" +  users[i].name +" "+ users[i].age);
            }
            else {
                System.out.println("Uzytkownik powyzej średniej:" +  users[i].name +" "+ users[i].age);
            }
        }
    }
}