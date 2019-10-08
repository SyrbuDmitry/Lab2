

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.Text;
import java.io.IOException;
import java.util.StringTokenizer;


public class WordMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override protected
    void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
      StringTokenizer itr = new StringTokenizer(value.toString()," \t\n\r,.-;:!?*()\"—//”#$%1234567890=[]»…«„");
      while (itr.hasMoreTokens()) {
        context.write(new Text(itr.nextToken()), new IntWritable(1));
      }
    }
}
