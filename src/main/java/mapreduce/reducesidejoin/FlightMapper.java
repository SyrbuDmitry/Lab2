package mapreduce.reducesidejoin;

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.util.StringTokenizer;


public class FlightMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static int DELAY = 17, AIR_ID = 14;

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String columns[] = CsvParser.parseFlightString(value);
        if (CsvParser.checkFlightLine(columns[DELAY]))
            return;
        AirportKey flKey = new AirportKey(CsvParser.getID(columns[AIR_ID]), 1);
        Text delay = new Text(columns[DELAY]);
        context.write(flKey, delay);
    }
}