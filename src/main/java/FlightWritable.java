import org.apache.hadoop.io.*;

import java.io.DataInput;
import java.io.IOException;

public class FlightWritable implements Writable {
    private LongWritable YEAR, QUARTER, MONTH, DAY_OF_MONTH,
            DAY_OF_WEEK, AIRLINE_ID, FL_NUM, ORIGIN_AIRPORT_ID, ORIGIN_AIRPORT_SEQ_ID,
            ORIGIN_CITY_MARKET_ID, DEST_AIRPORT_ID, WHEELS_ON, ARR_TIME;
    private FloatWritable ARR_DELAY, ARR_DELAY_NEW, CANCELLED, AIR_TIME, DISTANCE;
    private Text FL_DATE, UNIQUE_CARRIER, CARRIER, TAIL_NUM, CANCELLATION_CODE;
    void readFiles(DataInput in) throws IOException{
        
    }
}
