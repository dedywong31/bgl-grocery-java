import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Order {
    static List<PackagingOption> bundles = Arrays.asList(
            new PackagingOption("CE",1,5.95d),
            new PackagingOption("CE",3,14.95d),
            new PackagingOption("CE",5,20.95d),
            new PackagingOption("HM",1,7.95d),
            new PackagingOption("HM",2,13.95d),
            new PackagingOption("HM",5,29.95d),
            new PackagingOption("HM",8,40.95d),
            new PackagingOption("SS",1,11.95d));

    public static List<PackagingOption> filterAndSortList(String code){
        Predicate<PackagingOption> byCode = packop -> packop.getCode().equals(code);

        List<PackagingOption> filteredByCodeAndSortedListByQty = bundles.stream()
                .filter(byCode)
                .sorted(Comparator.comparing(PackagingOption::getCode)
                        .thenComparingInt(PackagingOption::getQty)
                        .reversed())
                .collect(Collectors.toList());
        return filteredByCodeAndSortedListByQty;
    }

    public static ArrayList<String> orderCalculation(String code, int qty) {
        List<PackagingOption> bundles = filterAndSortList(code);
        int remaining_qty = qty;
        ArrayList<String> breakdowns = new ArrayList<>();
        for(int i = 0; i < bundles.size(); i++){
            int bundle_qty = bundles.get(i).getQty();
            double bundle_price = bundles.get(i).getPrice();
            int division = Math.floorDiv(remaining_qty, bundle_qty);
            if(division > 0){
                breakdowns.add(division + ((division > 1) ? " packages": " package") + " of " + bundle_qty + ((bundle_qty > 1)? " items": " item") +" ($"+ bundle_price +" each)");
            }
            remaining_qty =  remaining_qty % bundle_qty;
            if(remaining_qty == 0){
                break;
            }
        }

        return breakdowns;
    }

    public static void main(String[] args) {
        System.out.println(orderCalculation("HM",14));
    }
}
