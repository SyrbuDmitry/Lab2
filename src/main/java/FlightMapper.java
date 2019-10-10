

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import java.util.StringTokenizer;


public class FlightMapper extends Mapper<LongWritable, Text, AirportKey, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String columns[] = value.toString().split(",");
        AirportKey flKey = new AirportKey(1,Integer.parseInt(columns[14]));
        IntWritable delay = new IntWritable(Integer.parseInt(columns[17]));
        context.write(flKey, delay);
    }
}