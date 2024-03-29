package cc.clutch.eagle.utils;

import org.apache.commons.lang.StringEscapeUtils;
import org.bukkit.ChatColor;

public class C {

    public static final String BLUE = ChatColor.BLUE.toString();
    public static final String AQUA = ChatColor.AQUA.toString();
    public static final String YELLOW = ChatColor.YELLOW.toString();
    public static final String RED = ChatColor.RED.toString();
    public static final String GRAY = ChatColor.GRAY.toString();
    public static final String GOLD = ChatColor.GOLD.toString();
    public static final String GREEN = ChatColor.GREEN.toString();
    public static final String WHITE = ChatColor.WHITE.toString();
    public static final String BLACK = ChatColor.BLACK.toString();
    public static final String BOLD = ChatColor.BOLD.toString();
    public static final String ITALIC = ChatColor.ITALIC.toString();
    public static final String UNDER_LINE = ChatColor.UNDERLINE.toString();
    public static final String STRIKE_THROUGH = ChatColor.STRIKETHROUGH.toString();
    public static final String RESET = ChatColor.RESET.toString();
    public static final String MAGIC = ChatColor.MAGIC.toString();
    public static final String DARK_BLUE = ChatColor.DARK_BLUE.toString();
    public static final String DARK_AQUA = ChatColor.DARK_AQUA.toString();
    public static final String DARK_GRAY = ChatColor.DARK_GRAY.toString();
    public static final String DARK_GREEN = ChatColor.DARK_GREEN.toString();
    public static final String DARK_PURPLE = ChatColor.DARK_PURPLE.toString();
    public static final String DARK_RED = ChatColor.DARK_RED.toString();
    public static final String PINK = ChatColor.LIGHT_PURPLE.toString();
    public static final String BLANK_LINE = "§a §b §c §d §e §f §0 §r";
    public static final String BORDER_LINE_SCOREBOARD = C.GRAY + C.STRIKE_THROUGH + "----------------------";
    public static final String UNICODE_VERTICAL_BAR = C.GRAY + StringEscapeUtils.unescapeJava("\u2503");
    public static final String UNICODE_CAUTION = StringEscapeUtils.unescapeJava("\u26a0");
    public static final String UNICODE_ARROW_LEFT = StringEscapeUtils.unescapeJava("\u25C0");
    public static final String UNICODE_ARROW_RIGHT = StringEscapeUtils.unescapeJava("\u25B6");
    public static final String UNICODE_ARROWS_LEFT = StringEscapeUtils.unescapeJava("\u00AB");
    public static final String UNICODE_ARROWS_RIGHT = StringEscapeUtils.unescapeJava("\u00BB");
    public static final String UNICODE_HEART = StringEscapeUtils.unescapeJava("\u2764");
    private static final String MAX_LENGTH = "11111111111111111111111111111111111111111111111111111";

    private C() {
        throw new RuntimeException("Cannot instantiate a utility class.");
    }

    public static String strip(String in) {
        return ChatColor.stripColor(translate(in));
    }

    public static String translate(String in) {
        return ChatColor.translateAlternateColorCodes('&', in);
    }
}