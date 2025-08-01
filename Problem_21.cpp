#include <iostream>
#include <cmath>

int main() {
    double number, result;
    std::cout << "Enter a number: ";
    std::cin >> number;

    if (number < 0) {
        std::cout << "Error: Cannot calculate square root of a negative number." << std::endl;
    } else {
        result = sqrt(number);
        std::cout << "Square root of " << number << " is " << result << std::endl;
    }

    return 0;
}
