public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        //int price = 10_000;
        int price = 5370;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

