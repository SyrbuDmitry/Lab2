package mapreduce.reducesidejoin;

import org.apache.hadoop.io.Text;

public class CsvParser {

    public static String[] parseFlightString(Text value) {
        return value.toString().split(",");
    }

    public static String[] parseIDString(Text value) {
        return value.toString().split(",(?=\")");
    }

    public static boolean checkFlightLine(String v) {
        return (v.equals("") || v.equals("\"ARR_DELAY\""));
    }

    public static boolean checAirportLine(String v) {
        return v.equals("Code,Description");
    }

    public static int getID(String value) {
        return Integer.parseInt(value.replace("\"", ""));
    }
}
