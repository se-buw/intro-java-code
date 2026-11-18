long factorial(int n) {
    return n == 1 ? 1 : n * factorial(n - 1);
}
factorial(3)
factorial(0)
// @expect-error
