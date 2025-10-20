package dev.trucanh.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.md_5.bungee.api.ChatColor;

public class ColorUtils {
   private static final Pattern HEX_PATTERN = Pattern.compile("#([A-Fa-f0-9]{6})");

   public static String color(String input) {
      if (input == null) {
         return "";
      } else {
         Matcher matcher = HEX_PATTERN.matcher(input);
         StringBuffer buffer = new StringBuffer();

         while(matcher.find()) {
            String hex = matcher.group(1);
            matcher.appendReplacement(buffer, ChatColor.of("#" + hex).toString());
         }

         matcher.appendTail(buffer);
         return ChatColor.translateAlternateColorCodes('&', buffer.toString());
      }
   }
}
