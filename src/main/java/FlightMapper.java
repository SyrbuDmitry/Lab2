

import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import java.util.StringTokenizer;


public class FlightMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String columns[] = value.toString().split(",");
        AirportKey flKey = new AirportKey(columns[14],new Text(1));
        Text delay = new Text(columns[17]);
        context.write(flKey, delay);
    }
}