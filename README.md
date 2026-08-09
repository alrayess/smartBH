Smart BH Analytics Platform

Smart BH Analytics is a Java business analytics and decision support platform designed to help small businesses, retailers, resellers, and entrepreneurs make smarter decisions using their own business data.

The platform brings together pricing analysis, profitability calculations, inventory management, sales analytics, forecasting, competitor comparison, discount analysis, business health evaluation, and decision-support tools in one interactive console application.

Rather than building a program that performs only one calculation, I wanted Smart BH Analytics to behave like a small business intelligence system. A user can launch the application, select the business problem they want help with, enter their data, and receive calculated results and decision-support insights.

The project contains 30 interactive tools and more than 2,500 lines of Java code, organized into reusable methods, data models, validation utilities, analytics functions, and menu-driven workflows.

⸻

Why I Built This Project

Smart BH Analytics is a personal project that I developed independently from the original concept through the implementation.

It was not created as a required class assignment. I wanted to build something connected to a real problem that interests me: using software and data to make better business decisions.

As someone interested in both technology and business, I wanted to explore a simple question:

How can software turn everyday business numbers into useful decisions?

A business owner may know the cost of a product, its selling price, competitor prices, inventory quantity, shipping expenses, and monthly sales. However, having numbers is different from knowing what decision to make from those numbers.

Smart BH Analytics was created to help bridge that gap.

For example, the platform can help answer questions such as:

* What price should I charge for this product?
* Am I actually making money after all costs?
* How does my price compare with competitors?
* How much can I discount a product without losing money?
* How many units must I sell to break even?
* When should I reorder inventory?
* Which products have the strongest profit margins?
* What happens if my supplier increases its prices?
* Could increasing my selling price improve overall profit?
* How much additional sales volume would I need after offering a discount?
* What could next month’s revenue look like based on previous performance?
* Does a new product appear financially attractive?

The goal was to create software that does more than display numbers. Smart BH Analytics attempts to turn those numbers into actionable business information.

⸻

Project Overview

Smart BH Analytics is currently implemented as a Java console application.

When the program starts, the user is introduced to the platform and can optionally load sample business data.

The main dashboard then provides access to 30 different business analytics features.

==============================================================================
                          SMART BH ANALYTICS PLATFORM
             Business Pricing • Inventory • Profit • Decision Support
==============================================================================
 1. Smart Pricing Support
 2. Profit & Margin Calculator
 3. Break-Even Analysis
 4. Competitor Price Analyzer
 5. Discount & Promotion Analyzer
 6. Inventory Manager
 7. Inventory Valuation
 8. Reorder Point Calculator
 9. Sales Record Center
10. Revenue Analytics
11. Product Profitability Ranking
12. Sales Forecasting
13. Target Profit Price Calculator
14. Markup Calculator
15. Margin Calculator
16. Cost Increase Impact Analyzer
17. Price Change Simulator
18. Bundle Pricing Calculator
19. Tax-Inclusive Price Calculator
20. Commission Impact Calculator
21. Shipping Cost Impact Analyzer
22. Business Health Score
23. Demand Scenario Analyzer
24. Product Decision Assistant
25. Text Data Visualization
26. Product Dashboard
27. Generate Business Report
28. Learn Business Analytics Terms
29. Run Demo Scenario
30. Clear All Stored Data
 0. Exit

Each feature represents a different business problem and guides the user through the information required to analyze it.

⸻

Core Features

1. Smart Pricing Support

The Smart Pricing Support system is one of the main components of the platform.

The user provides information including:

* Product name
* Purchase cost
* Shipping cost
* Additional unit costs
* Desired profit margin
* Marketplace/payment processing fees
* Competitor prices
* Estimated product demand

The system calculates the product’s total unit cost and determines several useful pricing metrics.

It calculates:

* Total unit cost
* Economic floor price
* Margin-based target price
* Fee-adjusted target price
* Average competitor price
* Lowest competitor price
* Highest competitor price
* Demand-adjusted price
* Recommended selling price
* Expected profit per unit
* Expected profit margin

The recommendation combines the company’s internal economics with information about the external market.

This creates a simple rule-based pricing model instead of relying on one formula alone.

The system also prevents the recommendation from falling below its calculated economic floor.

⸻

2. Profit & Margin Calculator

This feature determines how profitable an individual sale actually is.

The user enters:

* Product cost
* Selling price
* Selling/payment fees
* Other costs

Smart BH calculates:

* Total costs
* Fees
* Net profit per unit
* Profit margin
* Markup

It then classifies the transaction as:

* Profitable
* Break-even
* Loss-making

This feature also demonstrates an important business concept: profit margin and markup are different calculations.

⸻

3. Break-Even Analysis

The Break-Even Analysis tool determines how many units a business needs to sell before its contribution profit covers its fixed expenses.

Inputs include:

* Monthly fixed costs
* Selling price per unit
* Variable cost per unit

The system calculates:

Contribution Margin

Contribution Margin = Selling Price - Variable Cost

and then:

Break-Even Units = Fixed Costs / Contribution Margin

The platform displays:

* Contribution margin per unit
* Break-even units
* Break-even revenue
* Rounded minimum number of units required

The system also detects situations where the selling price does not exceed the variable cost and warns the user that break-even cannot be reached under those assumptions.

⸻

4. Competitor Price Analyzer

Businesses rarely make pricing decisions in isolation.

This feature allows the user to enter their current selling price and multiple competitor prices.

The platform calculates:

* Competitor average
* Competitor median
* Lowest competitor price
* Highest competitor price
* Difference from the market average
* Percentage difference from the market
* Number of competitors priced below the business
* Number priced above the business
* Number offering the same price

The product is then classified into a market position such as:

* Lowest-price player
* Below market average
* At market average
* Above market average
* Premium price

This helps transform raw competitor pricing information into an understandable market position.

⸻

5. Discount & Promotion Analyzer

Discounting can increase sales while simultaneously destroying margins.

This feature analyzes the financial effect of a proposed promotion.

The user provides:

* Regular price
* Product cost
* Proposed discount percentage

The program calculates:

* Discounted selling price
* Normal profit per unit
* Promotional profit per unit
* Promotional profit margin

One of the most useful calculations determines approximately how much additional sales volume would be required to generate the same total profit after lowering the price.

This demonstrates that a relatively small discount can sometimes require a much larger increase in unit sales.

⸻

Inventory Management

6. Inventory Manager

Smart BH includes an interactive inventory management system.

Users can:

* Add products
* View all products
* Update quantities
* Update selling prices
* Remove products
* Search for products
* Identify low-stock products
* Identify out-of-stock products

Each stored product contains:

* Product name
* Purchase cost
* Selling price
* Inventory quantity
* Shipping cost
* Other unit costs

Products are represented using a dedicated Java Product class and stored using an ArrayList<Product>.

This allowed me to practice object-oriented programming and dynamic collections instead of managing unrelated variables individually.

⸻

7. Inventory Valuation

This tool analyzes the financial value of the entire stored inventory.

It calculates:

* Number of product types
* Total inventory units
* Total inventory acquisition cost
* Potential retail value
* Potential gross profit
* Potential inventory ROI

This gives the user a higher-level view of how much capital is currently represented by inventory.

⸻

8. Reorder Point Calculator

Running out of inventory can result in lost sales.

The Reorder Point Calculator uses:

* Average daily sales
* Supplier lead time
* Safety stock

The calculation is:

Reorder Point =
(Average Daily Sales × Supplier Lead Time)
+ Safety Stock

The user can also compare the calculated reorder point against a product already stored in Smart BH.

The platform then recommends whether the business should reorder the product.

⸻

Sales & Revenue Analytics

9. Sales Record Center

Smart BH contains a separate system for recording sales.

Users can:

* Manually record a sale
* Record a sale from an existing inventory product
* View sales history
* Clear sales history

When a saved product is sold, Smart BH automatically decreases its inventory quantity.

Each sale is represented by a SaleRecord object containing information such as:

* Product
* Units sold
* Unit selling price
* Unit cost
* Timestamp

This separates inventory data from transaction data within the application.

⸻

10. Revenue Analytics

Once sales have been recorded, Smart BH can analyze overall business performance.

The system calculates:

* Total revenue
* Total costs
* Total profit
* Total units sold
* Overall profit margin
* Average revenue per unit
* Highest-revenue product

A Java HashMap is used to aggregate revenue according to product.

This feature gave me experience with data aggregation and Java collection structures.

⸻

11. Product Profitability Ranking

Not every product contributes equally to a business.

This feature compares all stored products and ranks them according to profit per unit.

For every product, the platform displays:

* Ranking
* Product name
* Profit per unit
* Profit margin

The products are dynamically sorted from highest to lowest profitability.

This can help identify products that deserve greater attention and products whose pricing or costs may need improvement.

⸻

Forecasting & Modeling

12. Sales Forecasting

Smart BH includes a basic forecasting engine that allows users to enter historical monthly revenue.

The application calculates:

* Historical average
* Revenue growth trend
* Average monthly growth
* Trend-based forecast
* Weighted moving forecast
* Combined forecast

The weighted forecast places more importance on recent performance.

For three recent periods, the weighting is:

Most Recent Month: 50%
Previous Month:    30%
Third Month:       20%

The system then combines the trend and weighted forecasts to generate another estimate.

Finally, the expected direction is classified as:

* Growth
* Decline
* Stable

This is an educational forecasting model and is not intended to replace professional financial forecasting software.

⸻

13. Target Profit Price Calculator

This feature answers:

If I know how much profit I want to make per unit, how much should I charge?

The calculation considers:

* Total unit cost
* Desired dollar profit
* Marketplace/payment fees

The result is the minimum selling price needed to target that profit under the provided assumptions.

⸻

14. Markup Calculator

The Markup Calculator allows a business to enter:

* Cost
* Desired markup percentage

The system calculates:

* Selling price
* Dollar profit
* Resulting profit margin

This also helps demonstrate the difference between markup and margin.

⸻

15. Margin Calculator

Instead of beginning with markup, this feature starts with the business’s desired profit margin.

Using the cost and target margin, Smart BH determines the required selling price.

The calculation is based on:

Selling Price = Cost / (1 - Desired Margin)

The tool then displays the expected dollar profit per unit.

⸻

Risk & Scenario Analysis

16. Cost Increase Impact Analyzer

Supplier costs can change unexpectedly.

This feature models what happens when a supplier increases the product’s cost.

Smart BH calculates:

* New product cost
* Previous profit per unit
* New profit per unit
* Previous margin
* New margin
* Selling price required to restore the original margin

This can help a business determine whether a supplier price increase should result in a customer price increase.

⸻

17. Price Change Simulator

Changing a price can affect both margin and customer demand.

This tool allows the user to model:

* Current selling price
* Product cost
* Current monthly units sold
* Proposed percentage price change
* Expected percentage demand change

The system calculates:

* New selling price
* Expected new sales volume
* Previous revenue
* New revenue
* Previous profit
* New profit
* Dollar change in profit

The scenario is then classified as:

* Improved profit
* Lower profit
* No profit change

This provides a simple way to explore what-if business scenarios.

⸻

18. Bundle Pricing Calculator

Businesses often combine multiple products into one discounted package.

This tool accepts multiple products and calculates:

* Combined regular selling price
* Combined product cost
* Proposed bundle discount
* Final bundle price
* Bundle profit
* Bundle margin

This helps determine whether a bundle promotion remains financially attractive.

⸻

19. Tax-Inclusive Price Calculator

This utility calculates the customer’s final price after applying a specified tax rate.

It displays:

* Pre-tax price
* Tax amount
* Final customer total

⸻

20. Commission Impact Calculator

Businesses may pay commissions to salespeople, affiliates, marketplaces, or other partners.

This feature analyzes:

* Selling price
* Product cost
* Commission percentage
* Additional platform/payment fees

It calculates:

* Commission expense
* Additional fees
* Net profit
* Net profit margin

This helps reveal how percentage-based costs affect unit economics.

⸻

21. Shipping Cost Impact Analyzer

Shipping can significantly affect profitability, particularly for online businesses.

This tool compares:

* Product cost
* Selling price
* Actual shipping expense
* Shipping amount charged to the customer

It calculates:

* Total order revenue
* Total order cost
* Net order profit

The program also determines whether the business is:

* Subsidizing shipping
* Breaking even on shipping
* Generating additional revenue through the shipping charge

⸻

Decision Support

22. Business Health Score

The Business Health Score combines several indicators into an educational 100-point scoring model.

It considers:

* Revenue growth
* Profit margin
* Inventory turnover
* Cash reserves
* Customer trend

The resulting score is classified into categories such as:

* Excellent
* Healthy
* Fair / Needs Monitoring
* Weak
* High Risk

The score is intentionally identified as a heuristic decision-support model, not professional accounting or investment advice.

⸻

23. Demand Scenario Analyzer

Businesses cannot know future demand with certainty.

Instead of predicting only one outcome, this feature shows several scenarios.

The platform models:

* 30% demand decline
* 15% demand decline
* Baseline demand
* 15% demand growth
* 30% demand growth

For every scenario, Smart BH calculates:

* Expected units
* Expected revenue
* Expected profit

This demonstrates the use of scenario analysis in decision-making.

⸻

24. Product Decision Assistant

The Product Decision Assistant evaluates whether a potential product appears attractive under the user’s assumptions.

It considers:

* Unit cost
* Expected selling price
* Profit margin
* Demand
* Competition intensity
* Supplier reliability
* Market trend

These variables are converted into a weighted opportunity score.

Possible outputs include:

* Strong Opportunity
* Promising
* Cautious Test
* Higher-Risk Product
* Avoid Unless Pricing/Cost Changes

The goal is not to claim certainty about the future. Instead, the feature demonstrates how multiple variables can be transformed into a structured decision model.

⸻

Data Visualization

25. Text-Based Data Visualization

Because the current version of Smart BH runs entirely in the Java console without external visualization libraries, I developed a text-based visualization system.

The program can generate proportional bars representing:

* Profit per unit
* Inventory quantity

Example:

Wireless Mouse       | ███████████████████████████████
USB-C Hub            | ████████████████████████████████████████
Laptop Stand         | ███████████████████████████
Premium Cable        | ███████████████

The visualization normalizes values relative to the largest value in the dataset and converts them into proportional console bars.

This allowed me to explore the fundamental logic behind data normalization and visualization without relying on an external charting library.

⸻

26. Product Dashboard

The Product Dashboard provides a detailed view of an individual product.

It displays:

* Purchase cost
* Shipping cost
* Other costs
* Total unit cost
* Selling price
* Quantity
* Profit per unit
* Profit margin
* Inventory cost value
* Inventory retail value

It also generates decision signals for:

* Profitability
* Inventory condition

The result behaves like a simplified product-level business intelligence dashboard.

⸻

Reporting

27. Business Report Generator

Smart BH can generate a console-based summary of the business.

The report includes:

Inventory Summary

* Product types
* Units in inventory
* Inventory cost
* Potential retail value
* Potential profit

Sales Summary

* Number of recorded sales
* Units sold
* Revenue
* Profit
* Overall margin

Risk Flags

* Loss-making products
* Out-of-stock products
* Thin-margin products

This feature was designed as a foundation that could later be expanded into exported CSV reports, PDFs, databases, or web dashboards.

⸻

Learning Features

28. Business Analytics Learning Center

I wanted the application to be useful not only for calculations but also for learning.

Smart BH therefore contains definitions for concepts including:

* Revenue
* Cost
* Profit
* Profit margin
* Markup
* Contribution margin
* Break-even point
* Fixed cost
* Variable cost
* Inventory turnover
* Reorder point
* Safety stock
* Average selling price
* Forecasting
* Competitor benchmarking

This allows users who may not have a business background to understand the calculations being performed.

⸻

29. Demo Business Scenario

The platform includes a built-in example business scenario.

It demonstrates how purchase cost, shipping expenses, selling price, payment fees, and monthly unit sales interact to produce:

* Unit profit
* Profit margin
* Monthly revenue
* Monthly profit

The scenario emphasizes one of the most important concepts in business analytics:

Revenue is not the same as profit.

A company can generate significant revenue while still producing weak profits if its costs are too high.

⸻

30. Data Reset

The final feature allows the user to clear the products and sales records stored during the current application session.

A confirmation step is required before the information is removed.

This reduces the possibility of accidentally deleting the application’s current in-memory data.

⸻

Technical Design

Smart BH Analytics was developed using Java and focuses heavily on core programming concepts.

Some of the concepts demonstrated throughout the project include:

* Object-Oriented Programming
* Classes and objects
* Constructors
* Methods
* Encapsulation
* ArrayLists
* HashMaps
* Arrays
* Loops
* Conditional logic
* Switch statements
* Exception handling
* Input validation
* Sorting
* Searching
* Data aggregation
* Mathematical modeling
* Basic statistics
* Forecasting
* Data normalization
* Console visualization
* Menu-driven application architecture
* Reusable utility methods

⸻

Object-Oriented Architecture

Two primary data models are currently used.

Product

The Product class represents an inventory item.

Each product contains information such as:

private String name;
private double purchaseCost;
private double sellingPrice;
private int quantity;
private double shippingCost;
private double otherCost;

The class also contains methods responsible for product calculations, including:

getTotalUnitCost()
getProfitPerUnit()
getProfitMarginPercent()
getMarkupPercent()
getInventoryCostValue()
getInventoryRetailValue()
getPotentialInventoryProfit()

Keeping product data and product-related behavior together makes the application easier to understand and maintain.

⸻

SaleRecord

The SaleRecord class represents a sales transaction.

It stores:

private String productName;
private int units;
private double unitPrice;
private double unitCost;
private Date timestamp;

It also calculates:

getRevenue()
getTotalCost()
getProfit()
getMarginPercent()

Separating products from transactions creates a cleaner data model and allows sales analytics to operate independently from inventory analytics.

⸻

Input Validation & Reliability

A major focus of the project was preventing common user-input errors from immediately terminating the application.

Instead of assuming every input will be correct, Smart BH validates information before accepting it.

Reusable methods include:

readInt()
readDouble()
readNonEmptyString()
askYesNo()

The application uses Java exception handling to detect invalid numerical input.

For example, if the program expects:

25

but the user enters:

hello

the program catches the invalid conversion and asks the user to try again rather than immediately terminating.

Range validation is also implemented for many inputs.

This makes the console interface more resilient and demonstrates defensive programming practices.

⸻

Business Logic

One of my main goals was to keep the calculations understandable.

For example, Smart BH distinguishes between markup and margin.

Markup

Markup = Profit / Cost

Margin

Margin = Profit / Selling Price

These values can appear similar but represent different business concepts.

The pricing system also accounts for costs beyond the purchase price, including shipping, additional expenses, marketplace fees, commissions, and other transaction costs.

This is important because using purchase cost alone can overestimate actual profitability.

⸻

Why This Project Matters to Me

Smart BH Analytics represents the type of software I enjoy building: technology connected to a practical problem.

I wanted to challenge myself to go beyond writing isolated exercises and instead think about how multiple pieces of software could work together as one larger system.

Building the project required me to think about questions beyond syntax:

* How should the program be organized?
* How should data be represented?
* How should invalid input be handled?
* Which calculations belong to a Product?
* Which calculations belong to a SaleRecord?
* How can one menu provide access to many independent features?
* How can business data be converted into understandable recommendations?
* How should a program communicate risk rather than simply display numbers?
* How can repeated code be replaced with reusable methods?
* How can the application remain understandable as it becomes larger?

Those questions made this project valuable to me as a learning experience.

⸻

Current Limitations

Smart BH Analytics is an evolving project and the current version has several intentional limitations.

The current application:

* Runs in the console
* Stores information in memory during execution
* Does not yet use a permanent database
* Uses educational rule-based decision models
* Uses basic forecasting rather than machine-learning forecasting
* Uses text-based rather than graphical charts
* Is designed primarily around product-based businesses
* Does not replace professional accounting, financial, tax, or investment advice

Documenting these limitations is important because recognizing what a system does not do is part of responsible software development.

⸻

Future Development

There are many directions in which I would like to expand Smart BH Analytics.

Potential future improvements include:

* Graphical user interface
* Web-based dashboard
* Database integration
* Persistent user accounts
* Product categories
* Supplier management
* Customer analytics
* CSV import/export
* Excel integration
* PDF report generation
* Interactive charts
* Historical price tracking
* More advanced forecasting
* Statistical trend detection
* Demand elasticity modeling
* Automated low-stock alerts
* SKU and barcode support
* Multi-location inventory
* Authentication and authorization
* REST API
* Cloud deployment
* Unit testing
* Automated integration testing
* More advanced recommendation models
* Machine-learning experiments using historical sales data

A future version could separate the current single-file architecture into dedicated packages for models, services, analytics, persistence, utilities, and user interfaces.

⸻

Example Use Case

Imagine a retailer purchases a product for $20.

Additional expenses are:

Purchase Cost:       $20.00
Shipping:             $3.00
Additional Cost:      $2.00
Total Unit Cost:     $25.00

The retailer knows that competitors sell similar products for:

Competitor A:        $39.99
Competitor B:        $42.99
Competitor C:        $44.50
Competitor D:        $38.99

Instead of simply choosing one competitor’s price, Smart BH can evaluate the business’s internal cost structure, desired margin, transaction fees, competitor range, and demand assumptions.

The user can then continue using the same platform to:

1. Save the product to inventory.
2. Monitor its quantity.
3. Record sales.
4. Calculate realized revenue.
5. Evaluate profitability.
6. Test discounts.
7. Simulate supplier cost increases.
8. Model price changes.
9. Determine reorder levels.
10. Compare the product against other inventory.
11. Forecast future sales.
12. Generate a business summary.

That connected workflow is the central idea behind Smart BH Analytics.

⸻

What I Learned

Building Smart BH Analytics strengthened my understanding of Java and helped me practice turning a broad idea into a structured software project.

The project gave me hands-on experience with:

* Breaking a large problem into smaller methods
* Designing reusable program components
* Creating Java classes
* Managing collections of objects
* Validating user input
* Handling exceptions
* Writing mathematical algorithms
* Sorting and aggregating data
* Designing interactive console menus
* Building basic analytical models
* Thinking about edge cases
* Separating data from calculations
* Communicating analytical results clearly
* Connecting programming with real-world business problems

Most importantly, the project helped me move from thinking:

“How do I write this piece of Java?”

toward thinking:

“How should I design a system that solves this problem?”

That is the direction I want to continue developing as I grow as a software engineer.

⸻

Running Smart BH Analytics

Requirements

A Java Development Kit (JDK) must be installed.

Compile

javac SmartBH.java

Run

java SmartBH

The program will launch the interactive Smart BH Analytics menu.

⸻

Project Structure

The current version intentionally remains contained in a single Java source file:

SmartBH/
│
├── SmartBH.java
└── README.md

As the project grows, a future version can be refactored into multiple classes and packages.

⸻

Disclaimer

Smart BH Analytics is an educational software project.

Its pricing recommendations, forecasts, opportunity scores, business health scores, and other analytical outputs are based on the information entered by the user and the formulas or heuristics implemented in the application.

The results should not be considered professional financial, accounting, tax, legal, or investment advice.

⸻

About the Project

Smart BH Analytics began as my personal idea for combining my interest in software engineering, analytics, and business decision-making.

I developed the project as an opportunity to challenge myself, strengthen my Java skills, and create something that could be useful beyond a programming exercise.

I plan to continue improving the project as my knowledge of computer science, software engineering, data analytics, and application design grows.

Smart BH Analytics — turning business data into clearer decisions.
