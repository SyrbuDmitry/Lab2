import org.apache.hadoop.io.*;

public class FlightWritable implements Writable {
    private LongWritable YEAR, QUARTER, MONTH, DAY_OF_MONTH,
            DAY_OF_WEEK, AIRLINE_ID, FL_NUM, ORIGIN_AIRPORT_ID, ORIGIN_AIRPORT_SEQ_ID,
            ORIGIN_CITY_MARKET_ID, DEST_AIRPORT_ID, WHEELS_ON, ARR_TIME;
}
