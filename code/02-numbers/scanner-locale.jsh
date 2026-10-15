import java.util.Scanner;
import java.util.Locale;
new Scanner("3.5").useLocale(Locale.US).nextDouble()
new Scanner("3,5").useLocale(Locale.GERMANY).nextDouble()
new Scanner("3,5").useLocale(Locale.US).hasNextDouble()
new Scanner("3.500").useLocale(Locale.GERMANY).nextDouble()
new Scanner("3.5").useLocale(Locale.ROOT).nextDouble()
