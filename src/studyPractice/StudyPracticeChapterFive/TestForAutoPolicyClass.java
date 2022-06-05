package studyPractice.StudyPracticeChapterFive;

public class TestForAutoPolicyClass {
    public static void main(String[] args) {

        AutoPolicy policy = new AutoPolicy(22334455, "Toyota Camry", "Abia");
        AutoPolicy policy1 = new AutoPolicy(66778899, "Keke Na pep", "Lagos");

        policyInNoFaultState(policy);
        policyInNoFaultState(policy1);
    }

    public static void  policyInNoFaultState(AutoPolicy policy) {
        System.out.println("The auto policy is");
        System.out.printf("Account: %d; Car: %s;%nstate %s %s is a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
        policy.isNoFaultState() ? "is": "is not");
    }
}
