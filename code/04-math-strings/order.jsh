import java.text.Collator;
import java.util.Locale;
"Erfurt".compareTo("Weimar")
"Weimar".compareTo("Weimar")
"weimar".compareTo("Weimar")
"weimar".compareToIgnoreCase("Weimar")
"Ärzte".compareTo("Zoo")
Collator.getInstance(Locale.GERMAN).compare("Ärzte", "Zoo")
