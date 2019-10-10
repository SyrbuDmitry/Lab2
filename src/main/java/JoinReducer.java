

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;

public class JoinReducer extends Reducer<AirportKey, Text, Text, Text> {
    @Override
    protected void reduce(AirportKey key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        Text ID = new Text(iter.next());
        while (iter.hasNext()) {
            Text delay = iter.next();

            //context.write(key.getFirst(), outValue);
        }
    }
}