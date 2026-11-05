String price = String.format("%.2f EUR", 3.9);
String code = "#%02X%02X%02X".formatted(227, 6, 19);
System.out.printf("Soup: %s, colour: %s%n", price, code);
