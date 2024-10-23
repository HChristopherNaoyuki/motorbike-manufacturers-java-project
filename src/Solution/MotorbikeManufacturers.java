package Solution;

// Class to manage and display motorbike manufacturers' sales data
public class MotorbikeManufacturers 
{
    public static void main(String[] args) 
    {
        // Array of motorbike brands
        String[] BRANDS = {
            "Triumph",  // Brand 1
            "Honda",    // Brand 2
            "Suzuki",   // Brand 3
            "Yamaha",   // Brand 4
            "Ducati"    // Brand 5
        };
        
        // 2D array representing sales data for each brand over the first 3 quarters of the year
        int QUARTERS[][] = {
            {500, 100, 500}, // Sales for Triumph in Q1, Q2, Q3
            {70, 80, 200},   // Sales for Honda in Q1, Q2, Q3
            {100, 100, 200}, // Sales for Suzuki in Q1, Q2, Q3
            {100, 70, 50},   // Sales for Yamaha in Q1, Q2, Q3
            {100, 100, 500}  // Sales for Ducati in Q1, Q2, Q3
        };
        
        // Print the header for the output table
        System.out.println("BRAND \t\tQUARTER 1\tQUARTER 2\tQUARTER 3\tTOTAL\tSTATUS");
        System.out.println("------------------------------------------------------------------------------");
        
        // Loop through each brand to calculate total sales and status
        for (int i = 0; i < BRANDS.length; i++) 
        {
            // Print the brand name
            System.out.print(BRANDS[i]);
            
            int total = 0; // Initialize total sales for the current brand
            
            // Loop through each quarter's sales for the current brand
            for (int j = 0; j < QUARTERS[i].length; j++) 
            {
                total += QUARTERS[i][j]; // Accumulate sales to the total
                // Print sales for the current quarter
                System.out.print("\t\t" + QUARTERS[i][j]);
            }
            
            // Determine the status based on the total sales
            String STATUS = (total >= 300) ? "Gold" : "Silver"; // Gold if total sales >= 300, otherwise Silver
            
            // Print total sales and status
            System.out.print("\t\t" + total); // Print the total sales for the brand
            System.out.print("\t" + STATUS);   // Print the status based on total sales
            System.out.println(); // Move to the next line for the next brand
        }
        
        System.out.println(); // Print an empty line after the table
    }
}
