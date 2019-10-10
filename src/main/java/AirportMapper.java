

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.util.StringTokenizer;


public class AirportMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String columns[] = value.toString().split(",");
        AirportKey airKey = new AirportKey(0, Integer.parseInt(columns[0]));
        Text description = new Text(columns[1]);
        context.write(airKey,description);
    }
}