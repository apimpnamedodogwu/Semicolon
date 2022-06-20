package bankingAppOriginal;

public class Customer {
    private static int bvnCount = 1;
    private int BVN;
    private String name;
    private int age;

    private Gender gender;

    public Customer(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.BVN = bvnCount;
        bvnCount++;
    }

    public int getBVN() {
        return BVN;
    }


    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return
                "BVN=" + BVN +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender;
    }

    public static void resetId() {
        bvnCount = 1;
    }
}
