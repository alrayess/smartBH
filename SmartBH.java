import java.util.*;

/**
 * SmartBH.java
 * ------------------------------------------------------------
 * Smart BH Analytics Platform
 *
 * A console-based business analytics system designed to help
 * small businesses, stores, resellers, and entrepreneurs make
 * smarter pricing, inventory, sales, profitability, and
 * decision-making choices.
 *
 * This project intentionally uses core Java only so a student
 * can study the logic without needing external libraries.
 *
 * Main areas:
 *  1. Pricing support
 *  2. Profit analysis
 *  3. Inventory analytics
 *  4. Discounts and promotions
 *  5. Break-even analysis
 *  6. Competitor price comparison
 *  7. Sales forecasting
 *  8. Revenue analytics
 *  9. Product ranking
 * 10. Decision support
 * 11. Data visualization using text bars
 * 12. Business health scoring
 *
 * Author: Your Name
 */
public class SmartBH {

    // ============================================================
    // SECTION 1: GLOBAL OBJECTS AND DATA STORAGE
    // ============================================================

    private static final Scanner scanner = new Scanner(System.in);

    // ArrayList is used because products can be added dynamically.
    private static final ArrayList<Product> products = new ArrayList<>();

    // Sales history stores past sales records.
    private static final ArrayList<SaleRecord> salesHistory = new ArrayList<>();

    // A constant used for formatting.
    private static final int LINE_WIDTH = 78;

    // ============================================================
    // SECTION 2: MAIN METHOD
    // ============================================================

    public static void main(String[] args) {
        showStartupBanner();
        seedOptionalDemoData();

        boolean running = true;

        while (running) {
            showMainMenu();
            int choice = readInt("Choose an option: ", 0, 30);

            switch (choice) {
                case 1:
                    pricingSupportCenter();
                    break;
                case 2:
                    profitMarginCalculator();
                    break;
                case 3:
                    breakEvenAnalysis();
                    break;
                case 4:
                    competitorPriceAnalyzer();
                    break;
                case 5:
                    discountAnalyzer();
                    break;
                case 6:
                    inventoryManager();
                    break;
                case 7:
                    inventoryValuation();
                    break;
                case 8:
                    reorderPointCalculator();
                    break;
                case 9:
                    salesRecordCenter();
                    break;
                case 10:
                    revenueAnalytics();
                    break;
                case 11:
                    productProfitabilityRanking();
                    break;
                case 12:
                    salesForecasting();
                    break;
                case 13:
                    targetProfitPriceCalculator();
                    break;
                case 14:
                    markupCalculator();
                    break;
                case 15:
                    marginCalculator();
                    break;
                case 16:
                    costIncreaseImpactAnalyzer();
                    break;
                case 17:
                    priceChangeSimulator();
                    break;
                case 18:
                    bundlePricingCalculator();
                    break;
                case 19:
                    taxInclusivePriceCalculator();
                    break;
                case 20:
                    commissionImpactCalculator();
                    break;
                case 21:
                    shippingCostImpactAnalyzer();
                    break;
                case 22:
                    businessHealthScore();
                    break;
                case 23:
                    demandScenarioAnalyzer();
                    break;
                case 24:
                    productDecisionAssistant();
                    break;
                case 25:
                    textDataVisualization();
                    break;
                case 26:
                    productDashboard();
                    break;
                case 27:
                    exportLikeReport();
                    break;
                case 28:
                    educationalDefinitions();
                    break;
                case 29:
                    runDemoScenario();
                    break;
                case 30:
                    clearAllData();
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            if (running) {
                pause();
            }
        }

        printLine();
        System.out.println("Thank you for using Smart BH Analytics Platform.");
        System.out.println("Make data-driven decisions. Protect margin. Grow smarter.");
        printLine();
    }

    // ============================================================
    // SECTION 3: STARTUP / MENUS
    // ============================================================

    private static void showStartupBanner() {
        printLine();
        System.out.println(center("SMART BH ANALYTICS PLATFORM"));
        System.out.println(center("Business Pricing • Inventory • Profit • Decision Support"));
        printLine();

        System.out.println("This platform is built for businesses that sell products or services.");
        System.out.println("It can help you analyze pricing, costs, competitors, inventory,");
        System.out.println("discounts, profits, revenue, sales trends, and business decisions.");
        System.out.println();

        System.out.println("Examples of questions Smart BH can help answer:");
        System.out.println("• What should I charge for a product?");
        System.out.println("• What is the lowest price I can sell at without losing money?");
        System.out.println("• How much profit am I actually making?");
        System.out.println("• Is a discount safe?");
        System.out.println("• When should I reorder inventory?");
        System.out.println("• Which products are making the most money?");
        System.out.println("• How could a price increase affect profit?");
        System.out.println("• What happens if my supplier raises my costs?");
        printLine();
    }

    private static void showMainMenu() {
        System.out.println();
        printLine();
        System.out.println(center("MAIN MENU"));
        printLine();

        System.out.println(" 1. Smart Pricing Support");
        System.out.println(" 2. Profit & Margin Calculator");
        System.out.println(" 3. Break-Even Analysis");
        System.out.println(" 4. Competitor Price Analyzer");
        System.out.println(" 5. Discount & Promotion Analyzer");
        System.out.println(" 6. Inventory Manager");
        System.out.println(" 7. Inventory Valuation");
        System.out.println(" 8. Reorder Point Calculator");
        System.out.println(" 9. Sales Record Center");
        System.out.println("10. Revenue Analytics");
        System.out.println("11. Product Profitability Ranking");
        System.out.println("12. Sales Forecasting");
        System.out.println("13. Target Profit Price Calculator");
        System.out.println("14. Markup Calculator");
        System.out.println("15. Margin Calculator");
        System.out.println("16. Cost Increase Impact Analyzer");
        System.out.println("17. Price Change Simulator");
        System.out.println("18. Bundle Pricing Calculator");
        System.out.println("19. Tax-Inclusive Price Calculator");
        System.out.println("20. Commission Impact Calculator");
        System.out.println("21. Shipping Cost Impact Analyzer");
        System.out.println("22. Business Health Score");
        System.out.println("23. Demand Scenario Analyzer");
        System.out.println("24. Product Decision Assistant");
        System.out.println("25. Text Data Visualization");
        System.out.println("26. Product Dashboard");
        System.out.println("27. Generate Business Report");
        System.out.println("28. Learn Business Analytics Terms");
        System.out.println("29. Run Demo Scenario");
        System.out.println("30. Clear All Stored Data");
        System.out.println(" 0. Exit");

        printLine();
    }

    // ============================================================
    // SECTION 4: FEATURE 1 - SMART PRICING SUPPORT
    // ============================================================

    private static void pricingSupportCenter() {
        printLine();
        System.out.println(center("SMART PRICING SUPPORT"));
        printLine();

        System.out.println("This feature recommends a selling price using:");
        System.out.println("• Your cost");
        System.out.println("• Desired margin");
        System.out.println("• Competitor prices");
        System.out.println("• Marketplace fees");
        System.out.println("• Shipping");
        System.out.println("• Demand estimate");
        System.out.println();

        int itemCount = readInt("How many items/products do you want to analyze? ", 1, 100);

        for (int i = 1; i <= itemCount; i++) {
            System.out.println();
            System.out.println("Product " + i + " of " + itemCount);
            printSmallLine();

            String name = readNonEmptyString("Product name: ");
            double purchaseCost = readDouble("Purchase/unit cost: $", 0, Double.MAX_VALUE);
            double shipping = readDouble("Shipping/handling cost per unit: $", 0, Double.MAX_VALUE);
            double additionalCost = readDouble("Other cost per unit: $", 0, Double.MAX_VALUE);
            double desiredMargin = readDouble("Desired profit margin (%): ", 0, 95);
            double marketplaceFee = readDouble("Marketplace/payment fee (%): ", 0, 50);

            int competitorCount = readInt("How many competitor prices do you know? ", 0, 20);
            ArrayList<Double> competitorPrices = new ArrayList<>();

            for (int j = 1; j <= competitorCount; j++) {
                competitorPrices.add(
                        readDouble("Competitor " + j + " price: $", 0.01, Double.MAX_VALUE)
                );
            }

            int demandScore = readInt(
                    "Estimated demand (1=Very Low, 2=Low, 3=Medium, 4=High, 5=Very High): ",
                    1,
                    5
            );

            double totalUnitCost = purchaseCost + shipping + additionalCost;

            // Price before percentage fees.
            double marginTargetPrice = totalUnitCost / (1.0 - desiredMargin / 100.0);

            // Adjust price to cover marketplace fee.
            double feeAdjustedPrice = marginTargetPrice / (1.0 - marketplaceFee / 100.0);

            double competitorAverage = competitorPrices.isEmpty()
                    ? feeAdjustedPrice
                    : average(competitorPrices);

            double competitorMin = competitorPrices.isEmpty()
                    ? feeAdjustedPrice
                    : Collections.min(competitorPrices);

            double competitorMax = competitorPrices.isEmpty()
                    ? feeAdjustedPrice
                    : Collections.max(competitorPrices);

            double demandAdjustment;

            switch (demandScore) {
                case 1:
                    demandAdjustment = 0.94;
                    break;
                case 2:
                    demandAdjustment = 0.97;
                    break;
                case 3:
                    demandAdjustment = 1.00;
                    break;
                case 4:
                    demandAdjustment = 1.04;
                    break;
                case 5:
                    demandAdjustment = 1.08;
                    break;
                default:
                    demandAdjustment = 1.00;
            }

            double demandAdjustedPrice = feeAdjustedPrice * demandAdjustment;

            double recommendedPrice;

            if (competitorPrices.isEmpty()) {
                recommendedPrice = demandAdjustedPrice;
            } else {
                // Weighted model:
                // 60% internal economics + 40% market average.
                recommendedPrice =
                        demandAdjustedPrice * 0.60 +
                        competitorAverage * 0.40;
            }

            // Never recommend below the economic floor.
            double economicFloor =
                    totalUnitCost / (1.0 - marketplaceFee / 100.0);

            recommendedPrice = Math.max(recommendedPrice, economicFloor);

            System.out.println();
            System.out.println("ANALYSIS FOR: " + name.toUpperCase());
            printSmallLine();
            System.out.printf("Total unit cost:               $%.2f%n", totalUnitCost);
            System.out.printf("Economic floor price:         $%.2f%n", economicFloor);
            System.out.printf("Margin-based target price:    $%.2f%n", marginTargetPrice);
            System.out.printf("Fee-adjusted target price:    $%.2f%n", feeAdjustedPrice);

            if (!competitorPrices.isEmpty()) {
                System.out.printf("Competitor average:           $%.2f%n", competitorAverage);
                System.out.printf("Competitor lowest:            $%.2f%n", competitorMin);
                System.out.printf("Competitor highest:           $%.2f%n", competitorMax);
            }

            System.out.printf("Recommended selling price:    $%.2f%n", recommendedPrice);

            double netRevenue =
                    recommendedPrice * (1.0 - marketplaceFee / 100.0);

            double profitPerUnit = netRevenue - totalUnitCost;

            double actualMargin =
                    recommendedPrice == 0
                            ? 0
                            : (profitPerUnit / recommendedPrice) * 100.0;

            System.out.printf("Estimated profit per unit:    $%.2f%n", profitPerUnit);
            System.out.printf("Estimated margin:              %.2f%%%n", actualMargin);

            System.out.println();
            System.out.println("Decision notes:");

            if (!competitorPrices.isEmpty()) {
                if (recommendedPrice < competitorMin) {
                    System.out.println("• Your recommended price is below all listed competitors.");
                    System.out.println("• You may have room to raise price and improve profit.");
                } else if (recommendedPrice > competitorMax) {
                    System.out.println("• Your recommended price is above all listed competitors.");
                    System.out.println("• Make sure your product offers enough extra value.");
                } else {
                    System.out.println("• Your recommended price is within the competitor range.");
                }
            }

            if (profitPerUnit <= 0) {
                System.out.println("• WARNING: This price may not generate positive profit.");
            } else {
                System.out.println("• The projected unit economics are profitable.");
            }

            if (askYesNo("Would you like to save this product to inventory? (yes/no): ")) {
                int quantity = readInt("Current inventory quantity: ", 0, 1_000_000);

                Product product = new Product(
                        name,
                        purchaseCost,
                        recommendedPrice,
                        quantity,
                        shipping,
                        additionalCost
                );

                products.add(product);
                System.out.println("Product saved.");
            }
        }
    }

    // ============================================================
    // SECTION 5: FEATURE 2 - PROFIT & MARGIN CALCULATOR
    // ============================================================

    private static void profitMarginCalculator() {
        printLine();
        System.out.println(center("PROFIT & MARGIN CALCULATOR"));
        printLine();

        double cost = readDouble("Unit cost: $", 0, Double.MAX_VALUE);
        double sellingPrice = readDouble("Selling price: $", 0, Double.MAX_VALUE);
        double feesPercent = readDouble("Selling/payment fees (%): ", 0, 100);
        double otherCost = readDouble("Other cost per sale: $", 0, Double.MAX_VALUE);

        double fees = sellingPrice * feesPercent / 100.0;
        double totalCost = cost + fees + otherCost;
        double profit = sellingPrice - totalCost;

        double profitMargin =
                sellingPrice == 0
                        ? 0
                        : profit / sellingPrice * 100.0;

        double markup =
                cost == 0
                        ? 0
                        : profit / cost * 100.0;

        System.out.println();
        System.out.printf("Selling price:        $%.2f%n", sellingPrice);
        System.out.printf("Product cost:         $%.2f%n", cost);
        System.out.printf("Fees:                 $%.2f%n", fees);
        System.out.printf("Other cost:           $%.2f%n", otherCost);
        System.out.printf("Net profit/unit:      $%.2f%n", profit);
        System.out.printf("Profit margin:         %.2f%%%n", profitMargin);
        System.out.printf("Profit markup:         %.2f%%%n", markup);

        if (profit < 0) {
            System.out.println("Result: LOSS");
        } else if (profit == 0) {
            System.out.println("Result: BREAK EVEN");
        } else {
            System.out.println("Result: PROFITABLE");
        }
    }

    // ============================================================
    // SECTION 6: FEATURE 3 - BREAK-EVEN ANALYSIS
    // ============================================================

    private static void breakEvenAnalysis() {
        printLine();
        System.out.println(center("BREAK-EVEN ANALYSIS"));
        printLine();

        double fixedCosts = readDouble(
                "Monthly fixed business costs (rent, software, salaries, etc.): $",
                0,
                Double.MAX_VALUE
        );

        double sellingPrice = readDouble("Selling price per unit: $", 0.01, Double.MAX_VALUE);
        double variableCost = readDouble("Variable cost per unit: $", 0, Double.MAX_VALUE);

        double contributionMargin = sellingPrice - variableCost;

        if (contributionMargin <= 0) {
            System.out.println();
            System.out.println("Break-even cannot be reached.");
            System.out.println("Your selling price must exceed the variable cost per unit.");
            return;
        }

        double units = fixedCosts / contributionMargin;
        double revenue = units * sellingPrice;

        System.out.printf("%nContribution margin/unit: $%.2f%n", contributionMargin);
        System.out.printf("Break-even units:          %.2f units%n", units);
        System.out.printf("Break-even revenue:        $%.2f%n", revenue);
        System.out.printf("Rounded units required:    %d units%n", (int) Math.ceil(units));
    }

    // ============================================================
    // SECTION 7: FEATURE 4 - COMPETITOR PRICE ANALYZER
    // ============================================================

    private static void competitorPriceAnalyzer() {
        printLine();
        System.out.println(center("COMPETITOR PRICE ANALYZER"));
        printLine();

        String productName = readNonEmptyString("Product name: ");
        double yourPrice = readDouble("Your current price: $", 0, Double.MAX_VALUE);
        int count = readInt("Number of competitors: ", 1, 50);

        ArrayList<Double> competitorPrices = new ArrayList<>();

        for (int i = 1; i <= count; i++) {
            competitorPrices.add(
                    readDouble("Competitor " + i + " price: $", 0, Double.MAX_VALUE)
            );
        }

        double avg = average(competitorPrices);
        double min = Collections.min(competitorPrices);
        double max = Collections.max(competitorPrices);
        double median = median(competitorPrices);

        int cheaperCount = 0;
        int moreExpensiveCount = 0;
        int sameCount = 0;

        for (double price : competitorPrices) {
            if (price < yourPrice) {
                cheaperCount++;
            } else if (price > yourPrice) {
                moreExpensiveCount++;
            } else {
                sameCount++;
            }
        }

        System.out.println();
        System.out.println("MARKET POSITION FOR " + productName.toUpperCase());
        printSmallLine();
        System.out.printf("Your price:                 $%.2f%n", yourPrice);
        System.out.printf("Competitor average:         $%.2f%n", avg);
        System.out.printf("Competitor median:          $%.2f%n", median);
        System.out.printf("Lowest competitor:          $%.2f%n", min);
        System.out.printf("Highest competitor:         $%.2f%n", max);

        double diffFromAverage = yourPrice - avg;
        double pctDiff =
                avg == 0
                        ? 0
                        : diffFromAverage / avg * 100.0;

        System.out.printf("Difference from average:    $%.2f (%.2f%%)%n",
                diffFromAverage,
                pctDiff
        );

        System.out.println();
        System.out.println("Competitors cheaper than you: " + cheaperCount);
        System.out.println("Competitors more expensive:   " + moreExpensiveCount);
        System.out.println("Competitors same price:       " + sameCount);

        System.out.println();
        if (yourPrice < min) {
            System.out.println("Position: LOWEST-PRICE PLAYER");
            System.out.println("You may be underpricing if customers would pay more.");
        } else if (yourPrice > max) {
            System.out.println("Position: PREMIUM PRICE");
            System.out.println("Your brand/value must justify your premium.");
        } else if (yourPrice < avg) {
            System.out.println("Position: BELOW MARKET AVERAGE");
        } else if (yourPrice > avg) {
            System.out.println("Position: ABOVE MARKET AVERAGE");
        } else {
            System.out.println("Position: AT MARKET AVERAGE");
        }
    }

    // ============================================================
    // SECTION 8: FEATURE 5 - DISCOUNT ANALYZER
    // ============================================================

    private static void discountAnalyzer() {
        printLine();
        System.out.println(center("DISCOUNT & PROMOTION ANALYZER"));
        printLine();

        double regularPrice = readDouble("Regular selling price: $", 0, Double.MAX_VALUE);
        double unitCost = readDouble("Unit cost: $", 0, Double.MAX_VALUE);
        double discountPct = readDouble("Proposed discount (%): ", 0, 100);

        double salePrice = regularPrice * (1 - discountPct / 100.0);
        double normalProfit = regularPrice - unitCost;
        double saleProfit = salePrice - unitCost;

        double margin =
                salePrice == 0
                        ? 0
                        : saleProfit / salePrice * 100.0;

        System.out.printf("%nSale price:           $%.2f%n", salePrice);
        System.out.printf("Normal profit/unit:   $%.2f%n", normalProfit);
        System.out.printf("Sale profit/unit:     $%.2f%n", saleProfit);
        System.out.printf("Sale profit margin:    %.2f%%%n", margin);

        if (saleProfit < 0) {
            System.out.println("WARNING: This discount causes a loss per unit.");
        } else if (saleProfit == 0) {
            System.out.println("This discount puts you exactly at break-even per unit.");
        } else {
            System.out.println("The promotion still generates a positive unit profit.");
        }

        if (normalProfit > 0 && saleProfit > 0) {
            double requiredVolumeIncrease =
                    (normalProfit / saleProfit - 1) * 100.0;

            System.out.printf(
                    "To earn the SAME total profit as before, you need approximately %.2f%% more unit sales.%n",
                    requiredVolumeIncrease
            );
        }
    }

    // ============================================================
    // SECTION 9: FEATURE 6 - INVENTORY MANAGER
    // ============================================================

    private static void inventoryManager() {
        boolean back = false;

        while (!back) {
            printLine();
            System.out.println(center("INVENTORY MANAGER"));
            printLine();

            System.out.println("1. Add product");
            System.out.println("2. View products");
            System.out.println("3. Update quantity");
            System.out.println("4. Update price");
            System.out.println("5. Remove product");
            System.out.println("6. Search product");
            System.out.println("7. Show low-stock products");
            System.out.println("8. Show out-of-stock products");
            System.out.println("0. Back");

            int choice = readInt("Choose: ", 0, 8);

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    updateProductQuantity();
                    break;
                case 4:
                    updateProductPrice();
                    break;
                case 5:
                    removeProduct();
                    break;
                case 6:
                    searchProduct();
                    break;
                case 7:
                    showLowStockProducts();
                    break;
                case 8:
                    showOutOfStockProducts();
                    break;
                case 0:
                    back = true;
                    break;
            }

            if (!back) {
                pause();
            }
        }
    }

    private static void addProduct() {
        System.out.println();
        String name = readNonEmptyString("Product name: ");
        double cost = readDouble("Purchase cost: $", 0, Double.MAX_VALUE);
        double price = readDouble("Selling price: $", 0, Double.MAX_VALUE);
        int quantity = readInt("Quantity: ", 0, 1_000_000);
        double shipping = readDouble("Shipping cost/unit: $", 0, Double.MAX_VALUE);
        double other = readDouble("Other cost/unit: $", 0, Double.MAX_VALUE);

        Product product =
                new Product(name, cost, price, quantity, shipping, other);

        products.add(product);
        System.out.println("Product added successfully.");
    }

    private static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products are stored.");
            return;
        }

        System.out.println();
        System.out.printf(
                "%-5s %-22s %10s %10s %10s %12s%n",
                "ID",
                "Product",
                "Cost",
                "Price",
                "Qty",
                "Profit/Unit"
        );

        printSmallLine();

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            System.out.printf(
                    "%-5d %-22s $%9.2f $%9.2f %10d $%11.2f%n",
                    i + 1,
                    truncate(p.name, 22),
                    p.getTotalUnitCost(),
                    p.sellingPrice,
                    p.quantity,
                    p.getProfitPerUnit()
            );
        }
    }

    private static void updateProductQuantity() {
        Product p = selectProduct();

        if (p == null) {
            return;
        }

        System.out.println("Current quantity: " + p.quantity);
        int newQuantity = readInt("New quantity: ", 0, 1_000_000);
        p.quantity = newQuantity;

        System.out.println("Quantity updated.");
    }

    private static void updateProductPrice() {
        Product p = selectProduct();

        if (p == null) {
            return;
        }

        System.out.printf("Current selling price: $%.2f%n", p.sellingPrice);
        double newPrice = readDouble("New price: $", 0, Double.MAX_VALUE);
        p.sellingPrice = newPrice;

        System.out.println("Price updated.");
    }

    private static void removeProduct() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        displayProducts();
        int index = readInt("Product ID to remove: ", 1, products.size()) - 1;

        Product removed = products.remove(index);
        System.out.println(removed.name + " removed.");
    }

    private static void searchProduct() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        String term = readNonEmptyString("Search name: ").toLowerCase();

        boolean found = false;

        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);

            if (p.name.toLowerCase().contains(term)) {
                found = true;
                System.out.println();
                System.out.println("ID: " + (i + 1));
                showProductDetails(p);
            }
        }

        if (!found) {
            System.out.println("No matching products found.");
        }
    }

    private static void showLowStockProducts() {
        int threshold = readInt("Low-stock threshold: ", 0, 1_000_000);

        boolean found = false;

        for (Product p : products) {
            if (p.quantity > 0 && p.quantity <= threshold) {
                System.out.printf("%-25s Quantity: %d%n", p.name, p.quantity);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No low-stock products found.");
        }
    }

    private static void showOutOfStockProducts() {
        boolean found = false;

        for (Product p : products) {
            if (p.quantity == 0) {
                System.out.println(p.name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products are out of stock.");
        }
    }

    // ============================================================
    // SECTION 10: FEATURE 7 - INVENTORY VALUATION
    // ============================================================

    private static void inventoryValuation() {
        printLine();
        System.out.println(center("INVENTORY VALUATION"));
        printLine();

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        double totalCostValue = 0;
        double totalRetailValue = 0;
        double expectedGrossProfit = 0;
        int totalUnits = 0;

        for (Product p : products) {
            totalUnits += p.quantity;
            totalCostValue += p.getTotalUnitCost() * p.quantity;
            totalRetailValue += p.sellingPrice * p.quantity;
            expectedGrossProfit += p.getProfitPerUnit() * p.quantity;
        }

        System.out.println("Total product types:       " + products.size());
        System.out.println("Total units in inventory: " + totalUnits);
        System.out.printf("Inventory cost value:     $%.2f%n", totalCostValue);
        System.out.printf("Potential retail value:   $%.2f%n", totalRetailValue);
        System.out.printf("Potential gross profit:   $%.2f%n", expectedGrossProfit);

        double roi =
                totalCostValue == 0
                        ? 0
                        : expectedGrossProfit / totalCostValue * 100.0;

        System.out.printf("Potential inventory ROI:   %.2f%%%n", roi);
    }

    // ============================================================
    // SECTION 11: FEATURE 8 - REORDER POINT CALCULATOR
    // ============================================================

    private static void reorderPointCalculator() {
        printLine();
        System.out.println(center("REORDER POINT CALCULATOR"));
        printLine();

        double averageDailySales = readDouble(
                "Average units sold per day: ",
                0,
                Double.MAX_VALUE
        );

        double leadTimeDays = readDouble(
                "Supplier lead time in days: ",
                0,
                Double.MAX_VALUE
        );

        double safetyStock = readDouble(
                "Desired safety stock units: ",
                0,
                Double.MAX_VALUE
        );

        double reorderPoint =
                averageDailySales * leadTimeDays + safetyStock;

        System.out.printf("%nRecommended reorder point: %.2f units%n", reorderPoint);

        if (askYesNo("Check this against a saved product? (yes/no): ")) {
            Product p = selectProduct();

            if (p != null) {
                System.out.println("Current stock: " + p.quantity);

                if (p.quantity <= reorderPoint) {
                    System.out.println("ACTION: REORDER NOW.");
                } else {
                    System.out.println("Current stock is above the reorder point.");
                }
            }
        }
    }

    // ============================================================
    // SECTION 12: FEATURE 9 - SALES RECORD CENTER
    // ============================================================

    private static void salesRecordCenter() {
        boolean back = false;

        while (!back) {
            printLine();
            System.out.println(center("SALES RECORD CENTER"));
            printLine();

            System.out.println("1. Add a sale record");
            System.out.println("2. View sales history");
            System.out.println("3. Record sale from saved product");
            System.out.println("4. Clear sales history");
            System.out.println("0. Back");

            int choice = readInt("Choose: ", 0, 4);

            switch (choice) {
                case 1:
                    addManualSaleRecord();
                    break;
                case 2:
                    displaySalesHistory();
                    break;
                case 3:
                    recordSavedProductSale();
                    break;
                case 4:
                    if (askYesNo("Clear all sales history? (yes/no): ")) {
                        salesHistory.clear();
                        System.out.println("Sales history cleared.");
                    }
                    break;
                case 0:
                    back = true;
                    break;
            }

            if (!back) {
                pause();
            }
        }
    }

    private static void addManualSaleRecord() {
        String productName = readNonEmptyString("Product name: ");
        int units = readInt("Units sold: ", 1, 1_000_000);
        double unitPrice = readDouble("Selling price per unit: $", 0, Double.MAX_VALUE);
        double unitCost = readDouble("Total cost per unit: $", 0, Double.MAX_VALUE);

        SaleRecord record =
                new SaleRecord(
                        productName,
                        units,
                        unitPrice,
                        unitCost,
                        new Date()
                );

        salesHistory.add(record);
        System.out.println("Sale recorded.");
    }

    private static void recordSavedProductSale() {
        Product p = selectProduct();

        if (p == null) {
            return;
        }

        if (p.quantity <= 0) {
            System.out.println("This product is out of stock.");
            return;
        }

        int units = readInt("Units sold: ", 1, p.quantity);

        p.quantity -= units;

        SaleRecord record =
                new SaleRecord(
                        p.name,
                        units,
                        p.sellingPrice,
                        p.getTotalUnitCost(),
                        new Date()
                );

        salesHistory.add(record);

        System.out.println("Sale recorded and inventory updated.");
        System.out.println("Remaining quantity: " + p.quantity);
    }

    private static void displaySalesHistory() {
        if (salesHistory.isEmpty()) {
            System.out.println("No sales records available.");
            return;
        }

        System.out.printf(
                "%-5s %-22s %8s %12s %12s %12s%n",
                "ID",
                "Product",
                "Units",
                "Revenue",
                "Profit",
                "Margin"
        );

        printSmallLine();

        for (int i = 0; i < salesHistory.size(); i++) {
            SaleRecord s = salesHistory.get(i);

            System.out.printf(
                    "%-5d %-22s %8d $%11.2f $%11.2f %11.2f%%%n",
                    i + 1,
                    truncate(s.productName, 22),
                    s.units,
                    s.getRevenue(),
                    s.getProfit(),
                    s.getMarginPercent()
            );
        }
    }

    // ============================================================
    // SECTION 13: FEATURE 10 - REVENUE ANALYTICS
    // ============================================================

    private static void revenueAnalytics() {
        printLine();
        System.out.println(center("REVENUE ANALYTICS"));
        printLine();

        if (salesHistory.isEmpty()) {
            System.out.println("No sales records available.");
            return;
        }

        double totalRevenue = 0;
        double totalProfit = 0;
        double totalCost = 0;
        int totalUnits = 0;

        for (SaleRecord s : salesHistory) {
            totalRevenue += s.getRevenue();
            totalProfit += s.getProfit();
            totalCost += s.getTotalCost();
            totalUnits += s.units;
        }

        double overallMargin =
                totalRevenue == 0
                        ? 0
                        : totalProfit / totalRevenue * 100.0;

        double avgRevenuePerUnit =
                totalUnits == 0
                        ? 0
                        : totalRevenue / totalUnits;

        System.out.printf("Total revenue:           $%.2f%n", totalRevenue);
        System.out.printf("Total costs:             $%.2f%n", totalCost);
        System.out.printf("Total profit:            $%.2f%n", totalProfit);
        System.out.println("Total units sold:         " + totalUnits);
        System.out.printf("Overall profit margin:    %.2f%%%n", overallMargin);
        System.out.printf("Avg revenue per unit:    $%.2f%n", avgRevenuePerUnit);

        // Product-based grouping.
        HashMap<String, Double> revenueByProduct = new HashMap<>();

        for (SaleRecord s : salesHistory) {
            revenueByProduct.put(
                    s.productName,
                    revenueByProduct.getOrDefault(s.productName, 0.0) + s.getRevenue()
            );
        }

        String topProduct = null;
        double topRevenue = -1;

        for (Map.Entry<String, Double> entry : revenueByProduct.entrySet()) {
            if (entry.getValue() > topRevenue) {
                topRevenue = entry.getValue();
                topProduct = entry.getKey();
            }
        }

        if (topProduct != null) {
            System.out.println("Top revenue product:      " + topProduct);
            System.out.printf("Top product revenue:     $%.2f%n", topRevenue);
        }
    }

    // ============================================================
    // SECTION 14: FEATURE 11 - PRODUCT PROFITABILITY RANKING
    // ============================================================

    private static void productProfitabilityRanking() {
        printLine();
        System.out.println(center("PRODUCT PROFITABILITY RANKING"));
        printLine();

        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        ArrayList<Product> copy = new ArrayList<>(products);

        copy.sort(
                (a, b) -> Double.compare(
                        b.getProfitPerUnit(),
                        a.getProfitPerUnit()
                )
        );

        System.out.printf(
                "%-5s %-24s %14s %12s%n",
                "Rank",
                "Product",
                "Profit/Unit",
                "Margin"
        );

        printSmallLine();

        for (int i = 0; i < copy.size(); i++) {
            Product p = copy.get(i);

            System.out.printf(
                    "%-5d %-24s $%13.2f %11.2f%%%n",
                    i + 1,
                    truncate(p.name, 24),
                    p.getProfitPerUnit(),
                    p.getProfitMarginPercent()
            );
        }
    }

    // ============================================================
    // SECTION 15: FEATURE 12 - SALES FORECASTING
    // ============================================================

    private static void salesForecasting() {
        printLine();
        System.out.println(center("SALES FORECASTING"));
        printLine();

        int months = readInt(
                "How many historical months do you have? ",
                2,
                36
        );

        double[] sales = new double[months];

        for (int i = 0; i < months; i++) {
            sales[i] = readDouble(
                    "Revenue for month " + (i + 1) + ": $",
                    0,
                    Double.MAX_VALUE
            );
        }

        double average = 0;

        for (double value : sales) {
            average += value;
        }

        average /= sales.length;

        double lastMonth = sales[sales.length - 1];
        double firstMonth = sales[0];

        double simpleGrowthRate =
                firstMonth == 0
                        ? 0
                        : (lastMonth - firstMonth) / firstMonth;

        double averageMonthlyGrowth =
                simpleGrowthRate / (months - 1);

        double nextMonthTrendForecast =
                lastMonth * (1 + averageMonthlyGrowth);

        double weightedForecast;

        if (months >= 3) {
            double m1 = sales[months - 1];
            double m2 = sales[months - 2];
            double m3 = sales[months - 3];

            weightedForecast =
                    m1 * 0.50 +
                    m2 * 0.30 +
                    m3 * 0.20;
        } else {
            weightedForecast = average;
        }

        System.out.printf("%nHistorical average:          $%.2f%n", average);
        System.out.printf("Trend-based next forecast:  $%.2f%n", nextMonthTrendForecast);
        System.out.printf("Weighted moving forecast:   $%.2f%n", weightedForecast);

        double combined =
                nextMonthTrendForecast * 0.50 +
                weightedForecast * 0.50;

        System.out.printf("Combined forecast:          $%.2f%n", combined);

        if (combined > lastMonth) {
            System.out.println("Forecast direction: GROWTH");
        } else if (combined < lastMonth) {
            System.out.println("Forecast direction: DECLINE");
        } else {
            System.out.println("Forecast direction: STABLE");
        }
    }

    // ============================================================
    // SECTION 16: FEATURE 13 - TARGET PROFIT PRICE CALCULATOR
    // ============================================================

    private static void targetProfitPriceCalculator() {
        printLine();
        System.out.println(center("TARGET PROFIT PRICE CALCULATOR"));
        printLine();

        double cost = readDouble("Total cost per unit: $", 0, Double.MAX_VALUE);
        double targetProfit = readDouble("Desired profit per unit: $", 0, Double.MAX_VALUE);
        double feePercent = readDouble("Selling/payment fee (%): ", 0, 99);

        double requiredNetRevenue = cost + targetProfit;
        double requiredPrice =
                requiredNetRevenue / (1 - feePercent / 100.0);

        System.out.printf(
                "%nYou should charge at least $%.2f to target $%.2f profit/unit.%n",
                requiredPrice,
                targetProfit
        );
    }

    // ============================================================
    // SECTION 17: FEATURE 14 - MARKUP CALCULATOR
    // ============================================================

    private static void markupCalculator() {
        printLine();
        System.out.println(center("MARKUP CALCULATOR"));
        printLine();

        double cost = readDouble("Cost: $", 0, Double.MAX_VALUE);
        double markupPercent = readDouble("Desired markup (%): ", 0, 10_000);

        double price =
                cost * (1 + markupPercent / 100.0);

        System.out.printf("%nSelling price: $%.2f%n", price);
        System.out.printf("Profit/unit:   $%.2f%n", price - cost);

        double margin =
                price == 0
                        ? 0
                        : (price - cost) / price * 100.0;

        System.out.printf("Resulting margin: %.2f%%%n", margin);
    }

    // ============================================================
    // SECTION 18: FEATURE 15 - MARGIN CALCULATOR
    // ============================================================

    private static void marginCalculator() {
        printLine();
        System.out.println(center("MARGIN CALCULATOR"));
        printLine();

        double cost = readDouble("Cost: $", 0, Double.MAX_VALUE);
        double marginPercent = readDouble("Desired margin (%): ", 0, 99.99);

        double sellingPrice =
                cost / (1 - marginPercent / 100.0);

        double profit = sellingPrice - cost;

        System.out.printf("%nRequired selling price: $%.2f%n", sellingPrice);
        System.out.printf("Profit per unit:        $%.2f%n", profit);
    }

    // ============================================================
    // SECTION 19: FEATURE 16 - COST INCREASE IMPACT ANALYZER
    // ============================================================

    private static void costIncreaseImpactAnalyzer() {
        printLine();
        System.out.println(center("COST INCREASE IMPACT ANALYZER"));
        printLine();

        double currentCost = readDouble("Current unit cost: $", 0, Double.MAX_VALUE);
        double currentPrice = readDouble("Current selling price: $", 0, Double.MAX_VALUE);
        double increasePct = readDouble("Supplier cost increase (%): ", 0, 10_000);

        double newCost =
                currentCost * (1 + increasePct / 100.0);

        double oldProfit =
                currentPrice - currentCost;

        double newProfit =
                currentPrice - newCost;

        double oldMargin =
                currentPrice == 0
                        ? 0
                        : oldProfit / currentPrice * 100.0;

        double newMargin =
                currentPrice == 0
                        ? 0
                        : newProfit / currentPrice * 100.0;

        System.out.printf("%nNew cost:              $%.2f%n", newCost);
        System.out.printf("Old profit/unit:       $%.2f%n", oldProfit);
        System.out.printf("New profit/unit:       $%.2f%n", newProfit);
        System.out.printf("Old margin:             %.2f%%%n", oldMargin);
        System.out.printf("New margin:             %.2f%%%n", newMargin);

        double oldMarginDecimal = oldMargin / 100.0;

        if (oldMarginDecimal < 1) {
            double priceToRestoreMargin =
                    newCost / (1 - oldMarginDecimal);

            System.out.printf(
                    "Price needed to restore old margin: $%.2f%n",
                    priceToRestoreMargin
            );
        }
    }

    // ============================================================
    // SECTION 20: FEATURE 17 - PRICE CHANGE SIMULATOR
    // ============================================================

    private static void priceChangeSimulator() {
        printLine();
        System.out.println(center("PRICE CHANGE SIMULATOR"));
        printLine();

        double currentPrice = readDouble("Current price: $", 0, Double.MAX_VALUE);
        double unitCost = readDouble("Unit cost: $", 0, Double.MAX_VALUE);
        int currentMonthlyUnits = readInt("Current monthly units sold: ", 0, 1_000_000);
        double priceChangePct = readDouble(
                "Proposed price change (%; negative for discount): ",
                -99,
                10_000
        );

        double expectedDemandChangePct = readDouble(
                "Expected demand change (%; negative means fewer units): ",
                -100,
                10_000
        );

        double newPrice =
                currentPrice * (1 + priceChangePct / 100.0);

        double newUnits =
                currentMonthlyUnits * (1 + expectedDemandChangePct / 100.0);

        if (newUnits < 0) {
            newUnits = 0;
        }

        double oldRevenue =
                currentPrice * currentMonthlyUnits;

        double oldProfit =
                (currentPrice - unitCost) * currentMonthlyUnits;

        double newRevenue =
                newPrice * newUnits;

        double newProfit =
                (newPrice - unitCost) * newUnits;

        System.out.printf("%nNew price:                 $%.2f%n", newPrice);
        System.out.printf("Expected new units:         %.2f%n", newUnits);
        System.out.printf("Old monthly revenue:       $%.2f%n", oldRevenue);
        System.out.printf("New monthly revenue:       $%.2f%n", newRevenue);
        System.out.printf("Old monthly profit:        $%.2f%n", oldProfit);
        System.out.printf("New monthly profit:        $%.2f%n", newProfit);
        System.out.printf("Profit change:             $%.2f%n", newProfit - oldProfit);

        if (newProfit > oldProfit) {
            System.out.println("Scenario result: IMPROVED PROFIT");
        } else if (newProfit < oldProfit) {
            System.out.println("Scenario result: LOWER PROFIT");
        } else {
            System.out.println("Scenario result: NO PROFIT CHANGE");
        }
    }

    // ============================================================
    // SECTION 21: FEATURE 18 - BUNDLE PRICING
    // ============================================================

    private static void bundlePricingCalculator() {
        printLine();
        System.out.println(center("BUNDLE PRICING CALCULATOR"));
        printLine();

        int itemCount = readInt("How many products are in the bundle? ", 2, 50);

        double totalNormalPrice = 0;
        double totalCost = 0;

        for (int i = 1; i <= itemCount; i++) {
            System.out.println();
            System.out.println("Bundle item " + i);

            double price = readDouble("Normal selling price: $", 0, Double.MAX_VALUE);
            double cost = readDouble("Unit cost: $", 0, Double.MAX_VALUE);

            totalNormalPrice += price;
            totalCost += cost;
        }

        double bundleDiscount = readDouble(
                "Bundle discount from normal combined price (%): ",
                0,
                100
        );

        double bundlePrice =
                totalNormalPrice * (1 - bundleDiscount / 100.0);

        double bundleProfit =
                bundlePrice - totalCost;

        double bundleMargin =
                bundlePrice == 0
                        ? 0
                        : bundleProfit / bundlePrice * 100.0;

        System.out.printf("%nCombined normal price: $%.2f%n", totalNormalPrice);
        System.out.printf("Bundle selling price:  $%.2f%n", bundlePrice);
        System.out.printf("Bundle total cost:     $%.2f%n", totalCost);
        System.out.printf("Bundle profit:         $%.2f%n", bundleProfit);
        System.out.printf("Bundle margin:          %.2f%%%n", bundleMargin);
    }

    // ============================================================
    // SECTION 22: FEATURE 19 - TAX-INCLUSIVE PRICE
    // ============================================================

    private static void taxInclusivePriceCalculator() {
        printLine();
        System.out.println(center("TAX-INCLUSIVE PRICE CALCULATOR"));
        printLine();

        double preTaxPrice = readDouble("Price before tax: $", 0, Double.MAX_VALUE);
        double taxRate = readDouble("Tax rate (%): ", 0, 100);

        double taxAmount =
                preTaxPrice * taxRate / 100.0;

        double finalPrice =
                preTaxPrice + taxAmount;

        System.out.printf("%nTax amount:      $%.2f%n", taxAmount);
        System.out.printf("Customer total:  $%.2f%n", finalPrice);
    }

    // ============================================================
    // SECTION 23: FEATURE 20 - COMMISSION IMPACT
    // ============================================================

    private static void commissionImpactCalculator() {
        printLine();
        System.out.println(center("COMMISSION IMPACT CALCULATOR"));
        printLine();

        double sellingPrice = readDouble("Selling price: $", 0, Double.MAX_VALUE);
        double cost = readDouble("Product cost: $", 0, Double.MAX_VALUE);
        double commissionPct = readDouble("Sales commission (%): ", 0, 100);
        double otherFeesPct = readDouble("Other platform/payment fees (%): ", 0, 100);

        double commission =
                sellingPrice * commissionPct / 100.0;

        double otherFees =
                sellingPrice * otherFeesPct / 100.0;

        double netProfit =
                sellingPrice - cost - commission - otherFees;

        System.out.printf("%nCommission:       $%.2f%n", commission);
        System.out.printf("Other fees:       $%.2f%n", otherFees);
        System.out.printf("Net profit/unit:  $%.2f%n", netProfit);

        double margin =
                sellingPrice == 0
                        ? 0
                        : netProfit / sellingPrice * 100.0;

        System.out.printf("Net margin:        %.2f%%%n", margin);
    }

    // ============================================================
    // SECTION 24: FEATURE 21 - SHIPPING COST IMPACT
    // ============================================================

    private static void shippingCostImpactAnalyzer() {
        printLine();
        System.out.println(center("SHIPPING COST IMPACT ANALYZER"));
        printLine();

        double productCost = readDouble("Product cost: $", 0, Double.MAX_VALUE);
        double sellingPrice = readDouble("Selling price: $", 0, Double.MAX_VALUE);
        double shippingCost = readDouble("Shipping cost paid by business: $", 0, Double.MAX_VALUE);
        double customerShippingCharge = readDouble(
                "Shipping amount charged to customer: $",
                0,
                Double.MAX_VALUE
        );

        double revenue =
                sellingPrice + customerShippingCharge;

        double totalCost =
                productCost + shippingCost;

        double profit =
                revenue - totalCost;

        System.out.printf("%nTotal revenue/order: $%.2f%n", revenue);
        System.out.printf("Total cost/order:    $%.2f%n", totalCost);
        System.out.printf("Net profit/order:    $%.2f%n", profit);

        if (customerShippingCharge < shippingCost) {
            System.out.println("You are subsidizing part of the shipping cost.");
        } else if (customerShippingCharge > shippingCost) {
            System.out.println("Your shipping charge contributes additional profit.");
        } else {
            System.out.println("Customer shipping charge exactly covers shipping cost.");
        }
    }

    // ============================================================
    // SECTION 25: FEATURE 22 - BUSINESS HEALTH SCORE
    // ============================================================

    private static void businessHealthScore() {
        printLine();
        System.out.println(center("BUSINESS HEALTH SCORE"));
        printLine();

        double revenueGrowth = readDouble(
                "Revenue growth over last period (%): ",
                -100,
                10_000
        );

        double profitMargin = readDouble(
                "Current net/gross profit margin (%): ",
                -100,
                100
        );

        double inventoryTurnover = readDouble(
                "Estimated inventory turnover per year: ",
                0,
                1_000
        );

        double cashReserveMonths = readDouble(
                "Months of business expenses covered by cash reserves: ",
                0,
                1_000
        );

        int customerTrend = readInt(
                "Customer trend (1=falling badly, 2=falling, 3=stable, 4=growing, 5=growing fast): ",
                1,
                5
        );

        double score = 0;

        // Revenue growth: max 25
        if (revenueGrowth >= 20) {
            score += 25;
        } else if (revenueGrowth >= 10) {
            score += 22;
        } else if (revenueGrowth > 0) {
            score += 18;
        } else if (revenueGrowth == 0) {
            score += 12;
        } else {
            score += 5;
        }

        // Profit margin: max 30
        if (profitMargin >= 30) {
            score += 30;
        } else if (profitMargin >= 20) {
            score += 26;
        } else if (profitMargin >= 10) {
            score += 20;
        } else if (profitMargin > 0) {
            score += 12;
        } else {
            score += 2;
        }

        // Inventory turnover: max 15
        if (inventoryTurnover >= 8) {
            score += 15;
        } else if (inventoryTurnover >= 4) {
            score += 12;
        } else if (inventoryTurnover >= 2) {
            score += 8;
        } else {
            score += 4;
        }

        // Cash reserve: max 20
        if (cashReserveMonths >= 6) {
            score += 20;
        } else if (cashReserveMonths >= 3) {
            score += 15;
        } else if (cashReserveMonths >= 1) {
            score += 8;
        } else {
            score += 2;
        }

        // Customer trend: max 10
        score += customerTrend * 2;

        System.out.printf("%nBusiness Health Score: %.1f / 100%n", score);

        if (score >= 85) {
            System.out.println("Rating: EXCELLENT");
        } else if (score >= 70) {
            System.out.println("Rating: HEALTHY");
        } else if (score >= 55) {
            System.out.println("Rating: FAIR / NEEDS MONITORING");
        } else if (score >= 40) {
            System.out.println("Rating: WEAK");
        } else {
            System.out.println("Rating: HIGH RISK");
        }

        System.out.println();
        System.out.println("Important: This score is an educational heuristic,");
        System.out.println("not a professional accounting or investment opinion.");
    }

    // ============================================================
    // SECTION 26: FEATURE 23 - DEMAND SCENARIO ANALYZER
    // ============================================================

    private static void demandScenarioAnalyzer() {
        printLine();
        System.out.println(center("DEMAND SCENARIO ANALYZER"));
        printLine();

        double price = readDouble("Selling price per unit: $", 0, Double.MAX_VALUE);
        double cost = readDouble("Cost per unit: $", 0, Double.MAX_VALUE);
        int baselineUnits = readInt("Expected baseline monthly units: ", 0, 1_000_000);

        double[] scenarioChanges = {-30, -15, 0, 15, 30};

        System.out.println();
        System.out.printf(
                "%-18s %12s %15s %15s%n",
                "Demand Scenario",
                "Units",
                "Revenue",
                "Profit"
        );

        printSmallLine();

        for (double change : scenarioChanges) {
            double units =
                    baselineUnits * (1 + change / 100.0);

            double revenue =
                    units * price;

            double profit =
                    units * (price - cost);

            String label =
                    (change > 0 ? "+" : "") + String.format("%.0f%%", change);

            System.out.printf(
                    "%-18s %12.2f $%14.2f $%14.2f%n",
                    label,
                    units,
                    revenue,
                    profit
            );
        }
    }

    // ============================================================
    // SECTION 27: FEATURE 24 - PRODUCT DECISION ASSISTANT
    // ============================================================

    private static void productDecisionAssistant() {
        printLine();
        System.out.println(center("PRODUCT DECISION ASSISTANT"));
        printLine();

        System.out.println("This tool helps decide whether a product looks attractive.");
        System.out.println("It considers margin, demand, competition, and inventory risk.");
        System.out.println();

        double cost = readDouble("Unit cost: $", 0, Double.MAX_VALUE);
        double expectedPrice = readDouble("Expected selling price: $", 0, Double.MAX_VALUE);
        int demand = readInt("Demand score (1-5): ", 1, 5);
        int competition = readInt(
                "Competition intensity (1=low, 5=very high): ",
                1,
                5
        );
        int supplyReliability = readInt(
                "Supplier reliability (1=poor, 5=excellent): ",
                1,
                5
        );
        int trend = readInt(
                "Market trend (1=declining, 3=stable, 5=fast growth): ",
                1,
                5
        );

        double profit = expectedPrice - cost;

        double margin =
                expectedPrice == 0
                        ? 0
                        : profit / expectedPrice * 100.0;

        double score = 0;

        if (margin >= 40) {
            score += 30;
        } else if (margin >= 25) {
            score += 25;
        } else if (margin >= 15) {
            score += 18;
        } else if (margin > 0) {
            score += 10;
        }

        score += demand * 6;                 // Max 30
        score += (6 - competition) * 3;      // Max 15
        score += supplyReliability * 3;      // Max 15
        score += trend * 2;                  // Max 10

        System.out.printf("%nEstimated profit/unit: $%.2f%n", profit);
        System.out.printf("Estimated margin:       %.2f%%%n", margin);
        System.out.printf("Opportunity score:      %.1f / 100%n", score);

        if (profit <= 0) {
            System.out.println("Decision: AVOID unless pricing/cost changes.");
        } else if (score >= 80) {
            System.out.println("Decision: STRONG OPPORTUNITY");
        } else if (score >= 65) {
            System.out.println("Decision: PROMISING");
        } else if (score >= 50) {
            System.out.println("Decision: CAUTIOUS TEST");
        } else {
            System.out.println("Decision: HIGHER-RISK PRODUCT");
        }
    }

    // ============================================================
    // SECTION 28: FEATURE 25 - TEXT DATA VISUALIZATION
    // ============================================================

    private static void textDataVisualization() {
        printLine();
        System.out.println(center("TEXT DATA VISUALIZATION"));
        printLine();

        if (products.isEmpty()) {
            System.out.println("No products are stored.");
            return;
        }

        System.out.println("Profit per unit by product:");
        System.out.println();

        double maxProfit = 0;

        for (Product p : products) {
            maxProfit = Math.max(maxProfit, Math.max(0, p.getProfitPerUnit()));
        }

        if (maxProfit == 0) {
            maxProfit = 1;
        }

        for (Product p : products) {
            double positiveProfit =
                    Math.max(0, p.getProfitPerUnit());

            int barLength =
                    (int) Math.round(positiveProfit / maxProfit * 40);

            String bar = repeat("█", barLength);

            System.out.printf(
                    "%-20s | %-40s $%.2f%n",
                    truncate(p.name, 20),
                    bar,
                    p.getProfitPerUnit()
            );
        }

        System.out.println();
        System.out.println("Inventory quantity visualization:");

        int maxQty = 0;

        for (Product p : products) {
            maxQty = Math.max(maxQty, p.quantity);
        }

        if (maxQty == 0) {
            maxQty = 1;
        }

        for (Product p : products) {
            int barLength =
                    (int) Math.round((double) p.quantity / maxQty * 40);

            String bar = repeat("▓", barLength);

            System.out.printf(
                    "%-20s | %-40s %d%n",
                    truncate(p.name, 20),
                    bar,
                    p.quantity
            );
        }
    }

    // ============================================================
    // SECTION 29: FEATURE 26 - PRODUCT DASHBOARD
    // ============================================================

    private static void productDashboard() {
        printLine();
        System.out.println(center("PRODUCT DASHBOARD"));
        printLine();

        Product p = selectProduct();

        if (p == null) {
            return;
        }

        showProductDetails(p);

        System.out.println();
        System.out.println("Decision Signals:");
        printSmallLine();

        double margin = p.getProfitMarginPercent();

        if (p.getProfitPerUnit() <= 0) {
            System.out.println("• Profitability: RED - product loses money.");
        } else if (margin < 10) {
            System.out.println("• Profitability: ORANGE - very thin margin.");
        } else if (margin < 20) {
            System.out.println("• Profitability: YELLOW - moderate margin.");
        } else {
            System.out.println("• Profitability: GREEN - healthy gross margin.");
        }

        if (p.quantity == 0) {
            System.out.println("• Inventory: RED - out of stock.");
        } else if (p.quantity <= 5) {
            System.out.println("• Inventory: ORANGE - very low stock.");
        } else if (p.quantity <= 20) {
            System.out.println("• Inventory: YELLOW - monitor stock.");
        } else {
            System.out.println("• Inventory: GREEN - stock available.");
        }
    }

    // ============================================================
    // SECTION 30: FEATURE 27 - GENERATE BUSINESS REPORT
    // ============================================================

    private static void exportLikeReport() {
        printLine();
        System.out.println(center("SMART BH BUSINESS REPORT"));
        printLine();

        System.out.println("Generated: " + new Date());
        System.out.println();

        System.out.println("INVENTORY SUMMARY");
        printSmallLine();

        if (products.isEmpty()) {
            System.out.println("No products stored.");
        } else {
            double inventoryCost = 0;
            double inventoryRetail = 0;
            double inventoryProfitPotential = 0;
            int units = 0;

            for (Product p : products) {
                units += p.quantity;
                inventoryCost += p.getTotalUnitCost() * p.quantity;
                inventoryRetail += p.sellingPrice * p.quantity;
                inventoryProfitPotential += p.getProfitPerUnit() * p.quantity;
            }

            System.out.println("Product types: " + products.size());
            System.out.println("Units in stock: " + units);
            System.out.printf("Inventory cost: $%.2f%n", inventoryCost);
            System.out.printf("Retail value:   $%.2f%n", inventoryRetail);
            System.out.printf("Potential profit: $%.2f%n", inventoryProfitPotential);
        }

        System.out.println();
        System.out.println("SALES SUMMARY");
        printSmallLine();

        if (salesHistory.isEmpty()) {
            System.out.println("No sales recorded.");
        } else {
            double revenue = 0;
            double profit = 0;
            int units = 0;

            for (SaleRecord s : salesHistory) {
                revenue += s.getRevenue();
                profit += s.getProfit();
                units += s.units;
            }

            System.out.println("Recorded sale entries: " + salesHistory.size());
            System.out.println("Units sold: " + units);
            System.out.printf("Revenue: $%.2f%n", revenue);
            System.out.printf("Profit:  $%.2f%n", profit);

            double margin =
                    revenue == 0
                            ? 0
                            : profit / revenue * 100.0;

            System.out.printf("Margin:  %.2f%%%n", margin);
        }

        System.out.println();
        System.out.println("RISK FLAGS");
        printSmallLine();

        int lossProducts = 0;
        int outOfStock = 0;
        int thinMarginProducts = 0;

        for (Product p : products) {
            if (p.getProfitPerUnit() < 0) {
                lossProducts++;
            }

            if (p.quantity == 0) {
                outOfStock++;
            }

            if (p.getProfitMarginPercent() > 0 &&
                    p.getProfitMarginPercent() < 10) {
                thinMarginProducts++;
            }
        }

        System.out.println("Loss-making products:    " + lossProducts);
        System.out.println("Out-of-stock products:   " + outOfStock);
        System.out.println("Thin-margin products:    " + thinMarginProducts);

        System.out.println();
        System.out.println("This console report can later be upgraded to CSV, PDF,");
        System.out.println("database storage, charts, web dashboards, or cloud analytics.");
    }

    // ============================================================
    // SECTION 31: FEATURE 28 - EDUCATIONAL DEFINITIONS
    // ============================================================

    private static void educationalDefinitions() {
        printLine();
        System.out.println(center("BUSINESS ANALYTICS LEARNING CENTER"));
        printLine();

        System.out.println("1. Revenue");
        System.out.println("   Money received from sales before subtracting costs.");
        System.out.println();

        System.out.println("2. Cost");
        System.out.println("   Money the business spends to obtain or create a product/service.");
        System.out.println();

        System.out.println("3. Profit");
        System.out.println("   Revenue minus costs.");
        System.out.println();

        System.out.println("4. Profit Margin");
        System.out.println("   Profit divided by selling price, expressed as a percentage.");
        System.out.println();

        System.out.println("5. Markup");
        System.out.println("   Profit relative to cost, not selling price.");
        System.out.println();

        System.out.println("6. Contribution Margin");
        System.out.println("   Selling price minus variable cost.");
        System.out.println();

        System.out.println("7. Break-Even Point");
        System.out.println("   Sales level at which total profit is zero.");
        System.out.println();

        System.out.println("8. Fixed Cost");
        System.out.println("   Cost that does not directly change with each unit sold.");
        System.out.println();

        System.out.println("9. Variable Cost");
        System.out.println("   Cost that rises or falls with units sold.");
        System.out.println();

        System.out.println("10. Inventory Turnover");
        System.out.println("    How frequently inventory is sold/replaced over a period.");
        System.out.println();

        System.out.println("11. Reorder Point");
        System.out.println("    Inventory level at which you should order more stock.");
        System.out.println();

        System.out.println("12. Safety Stock");
        System.out.println("    Extra inventory held to reduce stockout risk.");
        System.out.println();

        System.out.println("13. Average Selling Price");
        System.out.println("    Total sales revenue divided by units sold.");
        System.out.println();

        System.out.println("14. Forecast");
        System.out.println("    A data-based estimate of future performance.");
        System.out.println();

        System.out.println("15. Competitor Benchmark");
        System.out.println("    Comparing your price/performance against competitors.");
    }

    // ============================================================
    // SECTION 32: FEATURE 29 - DEMO SCENARIO
    // ============================================================

    private static void runDemoScenario() {
        printLine();
        System.out.println(center("DEMO BUSINESS SCENARIO"));
        printLine();

        double productCost = 20;
        double shipping = 3;
        double sellingPrice = 39.99;
        double feePct = 3;
        int monthlyUnits = 150;

        double totalCost =
                productCost + shipping;

        double fee =
                sellingPrice * feePct / 100.0;

        double unitProfit =
                sellingPrice - totalCost - fee;

        double monthlyRevenue =
                sellingPrice * monthlyUnits;

        double monthlyProfit =
                unitProfit * monthlyUnits;

        double margin =
                unitProfit / sellingPrice * 100.0;

        System.out.println("Example: A business sells a product online.");
        System.out.println();
        System.out.printf("Product purchase cost: $%.2f%n", productCost);
        System.out.printf("Shipping cost:         $%.2f%n", shipping);
        System.out.printf("Selling price:         $%.2f%n", sellingPrice);
        System.out.printf("Payment fee:            %.2f%%%n", feePct);
        System.out.println("Monthly units sold:     " + monthlyUnits);

        System.out.println();
        System.out.printf("Profit per unit:        $%.2f%n", unitProfit);
        System.out.printf("Profit margin:           %.2f%%%n", margin);
        System.out.printf("Monthly revenue:        $%.2f%n", monthlyRevenue);
        System.out.printf("Monthly profit:         $%.2f%n", monthlyProfit);

        System.out.println();
        System.out.println("Learning point:");
        System.out.println("Revenue is NOT the same as profit.");
        System.out.println("A business can have high revenue but weak profit if costs are high.");
    }

    // ============================================================
    // SECTION 33: FEATURE 30 - CLEAR ALL DATA
    // ============================================================

    private static void clearAllData() {
        printLine();
        System.out.println(center("CLEAR ALL DATA"));
        printLine();

        if (askYesNo("Are you sure you want to clear products and sales? (yes/no): ")) {
            products.clear();
            salesHistory.clear();
            System.out.println("All in-memory data has been cleared.");
        } else {
            System.out.println("Clear operation canceled.");
        }
    }

    // ============================================================
    // SECTION 34: PRODUCT HELPER METHODS
    // ============================================================

    private static Product selectProduct() {
        if (products.isEmpty()) {
            System.out.println("No products are stored.");
            return null;
        }

        displayProducts();

        int id =
                readInt(
                        "Choose product ID: ",
                        1,
                        products.size()
                );

        return products.get(id - 1);
    }

    private static void showProductDetails(Product p) {
        printSmallLine();
        System.out.println("Product: " + p.name);
        System.out.printf("Purchase cost:          $%.2f%n", p.purchaseCost);
        System.out.printf("Shipping cost/unit:     $%.2f%n", p.shippingCost);
        System.out.printf("Other cost/unit:        $%.2f%n", p.otherCost);
        System.out.printf("Total unit cost:        $%.2f%n", p.getTotalUnitCost());
        System.out.printf("Selling price:          $%.2f%n", p.sellingPrice);
        System.out.println("Quantity:                " + p.quantity);
        System.out.printf("Profit/unit:            $%.2f%n", p.getProfitPerUnit());
        System.out.printf("Profit margin:           %.2f%%%n", p.getProfitMarginPercent());
        System.out.printf("Inventory cost value:   $%.2f%n", p.getInventoryCostValue());
        System.out.printf("Inventory retail value: $%.2f%n", p.getInventoryRetailValue());
        printSmallLine();
    }

    // ============================================================
    // SECTION 35: OPTIONAL DEMO DATA
    // ============================================================

    private static void seedOptionalDemoData() {
        System.out.println();
        if (askYesNo("Would you like to load sample demo products? (yes/no): ")) {
            products.add(
                    new Product(
                            "Wireless Mouse",
                            12.00,
                            24.99,
                            45,
                            1.50,
                            0.50
                    )
            );

            products.add(
                    new Product(
                            "USB-C Hub",
                            20.00,
                            39.99,
                            18,
                            2.00,
                            1.00
                    )
            );

            products.add(
                    new Product(
                            "Laptop Stand",
                            18.00,
                            34.99,
                            10,
                            2.50,
                            0.75
                    )
            );

            products.add(
                    new Product(
                            "Premium Cable",
                            4.00,
                            12.99,
                            80,
                            0.75,
                            0.25
                    )
            );

            System.out.println("Demo products loaded.");
        }
    }

    // ============================================================
    // SECTION 36: GENERAL MATH / STATISTICS HELPERS
    // ============================================================

    private static double average(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        double total = 0;

        for (double n : numbers) {
            total += n;
        }

        return total / numbers.size();
    }

    private static double median(List<Double> values) {
        if (values == null || values.isEmpty()) {
            return 0;
        }

        ArrayList<Double> sorted = new ArrayList<>(values);
        Collections.sort(sorted);

        int size = sorted.size();

        if (size % 2 == 1) {
            return sorted.get(size / 2);
        }

        return (
                sorted.get(size / 2 - 1) +
                sorted.get(size / 2)
        ) / 2.0;
    }

    // ============================================================
    // SECTION 37: INPUT VALIDATION
    // ============================================================

    /**
     * Reads an integer and keeps asking until the user enters a valid value.
     * This prevents the program from crashing when text is typed.
     */
    private static int readInt(String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                int value = Integer.parseInt(input);

                if (value < min || value > max) {
                    System.out.println(
                            "Please enter a number from " + min + " to " + max + "."
                    );
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    /**
     * Reads a decimal number.
     */
    private static double readDouble(String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            try {
                double value = Double.parseDouble(input);

                if (Double.isNaN(value) || Double.isInfinite(value)) {
                    System.out.println("Please enter a normal numeric value.");
                    continue;
                }

                if (value < min || value > max) {
                    System.out.println(
                            "Please enter a value between " + min + " and " + max + "."
                    );
                    continue;
                }

                return value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
            }
        }
    }

    /**
     * Reads a non-empty string.
     */
    private static String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println("This field cannot be blank.");
        }
    }

    /**
     * Reads yes/no answers safely.
     */
    private static boolean askYesNo(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input =
                    scanner.nextLine()
                            .trim()
                            .toLowerCase();

            if (
                    input.equals("yes") ||
                    input.equals("y")
            ) {
                return true;
            }

            if (
                    input.equals("no") ||
                    input.equals("n")
            ) {
                return false;
            }

            System.out.println("Please type yes or no.");
        }
    }

    // ============================================================
    // SECTION 38: OUTPUT FORMATTING
    // ============================================================

    private static void printLine() {
        System.out.println(repeat("=", LINE_WIDTH));
    }

    private static void printSmallLine() {
        System.out.println(repeat("-", LINE_WIDTH));
    }

    private static String repeat(String text, int count) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            builder.append(text);
        }

        return builder.toString();
    }

    private static String center(String text) {
        if (text.length() >= LINE_WIDTH) {
            return text;
        }

        int totalPadding =
                LINE_WIDTH - text.length();

        int leftPadding =
                totalPadding / 2;

        return repeat(" ", leftPadding) + text;
    }

    private static String truncate(String text, int maxLength) {
        if (text.length() <= maxLength) {
            return text;
        }

        if (maxLength <= 3) {
            return text.substring(0, maxLength);
        }

        return text.substring(0, maxLength - 3) + "...";
    }

    private static void pause() {
        System.out.println();
        System.out.print("Press ENTER to return/continue...");
        scanner.nextLine();
    }

    // ============================================================
    // SECTION 39: PRODUCT DATA MODEL
    // ============================================================

    /**
     * Product is a nested class that represents one inventory item.
     *
     * Why use a class?
     * Because a product contains multiple related values:
     * - name
     * - cost
     * - price
     * - quantity
     * - shipping
     * - other costs
     *
     * Instead of keeping many separate arrays, we keep the values
     * together inside one Product object.
     */
    private static class Product {

        private String name;
        private double purchaseCost;
        private double sellingPrice;
        private int quantity;
        private double shippingCost;
        private double otherCost;

        public Product(
                String name,
                double purchaseCost,
                double sellingPrice,
                int quantity,
                double shippingCost,
                double otherCost
        ) {
            this.name = name;
            this.purchaseCost = purchaseCost;
            this.sellingPrice = sellingPrice;
            this.quantity = quantity;
            this.shippingCost = shippingCost;
            this.otherCost = otherCost;
        }

        public double getTotalUnitCost() {
            return purchaseCost + shippingCost + otherCost;
        }

        public double getProfitPerUnit() {
            return sellingPrice - getTotalUnitCost();
        }

        public double getProfitMarginPercent() {
            if (sellingPrice == 0) {
                return 0;
            }

            return getProfitPerUnit() / sellingPrice * 100.0;
        }

        public double getMarkupPercent() {
            double cost = getTotalUnitCost();

            if (cost == 0) {
                return 0;
            }

            return getProfitPerUnit() / cost * 100.0;
        }

        public double getInventoryCostValue() {
            return getTotalUnitCost() * quantity;
        }

        public double getInventoryRetailValue() {
            return sellingPrice * quantity;
        }

        public double getPotentialInventoryProfit() {
            return getProfitPerUnit() * quantity;
        }
    }

    // ============================================================
    // SECTION 40: SALES RECORD DATA MODEL
    // ============================================================

    /**
     * SaleRecord stores one sales transaction or summarized sale.
     */
    private static class SaleRecord {

        private String productName;
        private int units;
        private double unitPrice;
        private double unitCost;
        private Date timestamp;

        public SaleRecord(
                String productName,
                int units,
                double unitPrice,
                double unitCost,
                Date timestamp
        ) {
            this.productName = productName;
            this.units = units;
            this.unitPrice = unitPrice;
            this.unitCost = unitCost;
            this.timestamp = timestamp;
        }

        public double getRevenue() {
            return unitPrice * units;
        }

        public double getTotalCost() {
            return unitCost * units;
        }

        public double getProfit() {
            return getRevenue() - getTotalCost();
        }

        public double getMarginPercent() {
            double revenue = getRevenue();

            if (revenue == 0) {
                return 0;
            }

            return getProfit() / revenue * 100.0;
        }

        @Override
        public String toString() {
            return "SaleRecord{" +
                    "productName='" + productName + '\'' +
                    ", units=" + units +
                    ", unitPrice=" + unitPrice +
                    ", unitCost=" + unitCost +
                    ", timestamp=" + timestamp +
                    '}';
        }
    }
}
