#include <stdio.h>

int memo[100]; // adjust the size as needed

int fact(int n) {
    if (n == 1) {
        return 0;
    } else if (n == 2) {
        return 1;
    } else if (memo[n] != 0) {
        return memo[n];
    } else {
        int eq = fact(n - 1) + 2 * fact(n - 2) + 3;
        memo[n] = eq;
        return eq;
    }
}

int main() {
    int n;
    scanf("%d", &n);
    printf("%d\n", n);
    int result = fact(n);
    printf("%d", result);
    return 0;
}