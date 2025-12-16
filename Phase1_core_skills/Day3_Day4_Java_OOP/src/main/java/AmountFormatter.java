public class AmountFormatter {
    public String formatAmount(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Amount must be Positive");
        }else{
            return String.format("Amount: %.2f", amount);
        }
    }

    public static void main(String[] args) {
        AmountFormatter a = new AmountFormatter();
        String result = a.formatAmount(123.456);
        System.out.println(result);

        try{
            String bad = a.formatAmount(-10.10);
            System.out.println(bad);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
    }
}