# Motorbike Manufacturers Sales Data

## Overview

This Java program manages and displays sales data for five motorbike manufacturers across the first three quarters of the year. It calculates total sales for each brand and assigns a status of "Gold" or "Silver" based on their performance.

## Features

- Displays sales data in a clear, formatted table.
- Calculates total sales for each brand.
- Assigns status based on total sales:
  - **Gold**: Total sales >= 300
  - **Silver**: Total sales < 300

## Brands Included

- Triumph
- Honda
- Suzuki
- Yamaha
- Ducati

## Sales Data Structure

The sales data is stored in a 2D array where each row corresponds to a brand, and each column represents sales for a quarter.

## Usage

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd <project-directory>
   ```

3. Compile and run the program:
   ```bash
   javac MotorbikeManufacturers.java
   java MotorbikeManufacturers
   ```

## Output Example

```
BRAND       QUARTER 1   QUARTER 2   QUARTER 3   TOTAL   STATUS
---------------------------------------------------------------
Triumph     500         100         500         1100    Gold
Honda       70          80          200         350     Gold
Suzuki      100         100         200         400     Gold
Yamaha      100         70          50          220     Silver
Ducati      100         100         500         700     Gold
```

## Contributing

Feel free to submit issues or pull requests for improvements!

## License

This project is licensed under the MIT License.
