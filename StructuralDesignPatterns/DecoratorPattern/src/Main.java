public class Main {
    public static void main(String[] args) {
        ICar scorpio = new Scorpio();
        System.out.println("Total Weight : " + scorpio.getWeight());
        ICar bulletProofScorpio = new BulletProof(scorpio);
        System.out.println("Total Weight : " + bulletProofScorpio.getWeight());
    }
}