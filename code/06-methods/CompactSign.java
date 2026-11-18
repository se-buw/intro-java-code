/** Compact source file: no class, no static. */
void printSign(String text) {
    String bar = "-".repeat(text.length() + 2);
    IO.println("+" + bar + "+");
    IO.println("| " + text + " |");
    IO.println("+" + bar + "+");
}

void main() {
    printSign("weaving");
}
