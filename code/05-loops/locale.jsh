// printf and String.format use the default locale of your computer
String.format("%.2f", 2.35)
String.format(java.util.Locale.GERMANY, "%.2f", 2.35)
String.format(java.util.Locale.ROOT, "%.2f", 2.35)
