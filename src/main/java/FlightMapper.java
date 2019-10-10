

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import java.util.StringTokenizer;


public class FlightMapper extends Mapper<AirportKey, Text, FlightWritable, Text> {
    @Override
    protected void map(AirportKey key, Text value, Context context) throws IOException, InterruptedException {
        String columns[] = value.toString().split(",");
        AirportKey flKey = new AirportKey(1,String.Parsecolumns[14]);
        ServiceCall call = new ServiceCall(value);
        context.write(new TextPair(call.getSystemA().toString(),"1"), new Text(call.toString()));
    } }