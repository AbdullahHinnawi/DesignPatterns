public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter(new LineAfterEveryItem());
        ListConverterStrategy lineAfterEveryOtherItem = new LineAfterEveryOtherItem();
        ListConverterStrategy lineAfterEveryThirdItem = new LineAfterEveryThirdItem();

        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        converter.add(numbers);
        converter.print();

        converter.setStrategy(lineAfterEveryOtherItem);
        converter.print();

        converter.setStrategy(lineAfterEveryThirdItem);
        converter.print();

    }
}
