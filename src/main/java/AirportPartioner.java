import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartioner extends Partitioner<AirportKey, Text> {
    public int getPartition(AirportKey key, Text value, int numReduceTasks) {
    return (key. & Integer.MAX_VALUE) % numReduceTasks; }
}